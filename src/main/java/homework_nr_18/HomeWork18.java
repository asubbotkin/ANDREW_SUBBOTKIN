package homework_nr_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HomeWork18 {
    public static void main(String[] args) {
//
        List<String> tasksList = new ArrayList<>(Arrays.asList("Have a coffee", "To go to the job", "To  go to the gym", "Meet friends"));
        TaskManager taskManagerObject = new TaskManager(new LinkedList<>());

        LinkedList<String> clonedList;

        Runnable addTask = () ->  {
            for (String task : tasksList) {
                taskManagerObject.addTask(task);
            }
        };

        Runnable removeTask = () -> {
            taskManagerObject.removeTask(1);
        };

        Runnable getTasksCount = taskManagerObject::getTasksCount;

        Runnable cloneTasksList = () -> {
//            taskManagerObject.cloneTasksList();
        };



        taskManagerObject.getAllTasks();

        System.out.println("-----------------------");
        taskManagerObject.getAllTasks();

        System.out.println("-----------------------");
        taskManagerObject.addTask("Go to job");
        taskManagerObject.getAllTasks();

        System.out.println("-----Cloned---------------");

        for (String task : clonedList) {
            System.out.println(task);
        }

        System.out.println("-----Tasks count---------------");
        System.out.println(taskManagerObject.getTasksCount());


    }
}
