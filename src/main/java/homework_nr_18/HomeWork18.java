package homework_nr_18;

import java.util.LinkedList;
import java.util.List;

public class HomeWork18 {
    public static void main(String[] args) {
//        "Have a coffee", "Go to job", "Go to the gym", "Meet friends"
        List<String> tasksList;
        TaskManager taskManagerObject = new TaskManager(new LinkedList<>());

        taskManagerObject.addTask("");
        taskManagerObject.getAllTasks();

        System.out.println("-----------------------");
        taskManagerObject.removeTask(1);
        taskManagerObject.getAllTasks();

        System.out.println("-----------------------");
        taskManagerObject.addTask("Go to job");
        taskManagerObject.getAllTasks();

        System.out.println("-----Cloned---------------");
        LinkedList<String> clonedList = taskManagerObject.cloneTasksList();

        for (String task : clonedList) {
            System.out.println(task);
        }

        System.out.println("-----Tasks count---------------");
        System.out.println(taskManagerObject.getTasksCount());


    }
}
