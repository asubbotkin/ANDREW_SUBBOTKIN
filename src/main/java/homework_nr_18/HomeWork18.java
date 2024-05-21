package homework_nr_18;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class HomeWork18 {
    public static void main(String[] args) {

        List<String> tasksList = new ArrayList<>(Arrays.asList("task0", "task1", "task2", "task3", "task4"));
        TaskManager taskManagerObject = new TaskManager(new LinkedList<>());
        LinkedList<String> clonedList;

        taskManagerObject.tasksList.addAll(tasksList);

        String addNewTask = "task5";
        String removeOldTask = "task1";

        Runnable addTask = () -> taskManagerObject.addTask(addNewTask);
        Runnable removeTask = () -> taskManagerObject.removeTask(removeOldTask);

        Callable<Integer> tasksCount = taskManagerObject::getTasksCount;
        Callable<LinkedList<String>> cloneTasksList = taskManagerObject::cloneTasksList;
        FutureTask<Integer> getTasksCount = new FutureTask<>(tasksCount);
        FutureTask<LinkedList<String>> getClonedTaskList = new FutureTask<>(cloneTasksList);


        Thread addTaskThread = new Thread(addTask);
        Thread removeTaskThread = new Thread(removeTask);
        Thread getTasksCountThread = new Thread(getTasksCount);
        Thread cloneTasksListThread = new Thread(getClonedTaskList);

        removeTaskThread.start();
        addTaskThread.start();
        getTasksCountThread.start();
        cloneTasksListThread.start();

        try {
            int count = getTasksCount.get();
            System.out.println("------Tasks count-----------");
            System.out.println(count);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Can`t get tasks count!");
        }

        try {
            clonedList = getClonedTaskList.get();
            System.out.println("--------Cloned tasks list-------");
            for (String task : clonedList) {
                System.out.println(task);
            }
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Can`t clone tasks list!");
        }
    }
}
