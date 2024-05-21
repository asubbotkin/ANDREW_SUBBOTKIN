package homework_nr_18;

import java.util.LinkedList;

public class TaskManager {

    protected LinkedList<String> tasksList;

    public TaskManager(LinkedList<String> tasksList) {
        this.tasksList = tasksList;
    }

    public synchronized void addTask(String task) {
        try {
            System.out.println("Adding task: " + task);
            Thread.sleep(100);
            this.tasksList.add(task);
        } catch (InterruptedException e) {
            System.out.println("Error adding task!");
        }
    }

    public synchronized void removeTask(String task) {
        try {
            System.out.println("Removing task: " + task);
            Thread.sleep(100);
            if (!this.tasksList.isEmpty())
                this.tasksList.remove(task);
        } catch (InterruptedException e) {
            System.out.println("Error removing task!");
        }
    }

    public synchronized int getTasksCount() {
        try {
            System.out.println("Getting tasks count...");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Error getting tasks count!");
        }
        return this.tasksList.size();
    }

    public synchronized void getAllTasks() {
        try {
            System.out.println("Getting tasks list...");
            Thread.sleep(30);
            for (String task : tasksList) System.out.println(task);
        } catch (InterruptedException e) {
            System.out.println("Error getting tasks list!");
        }
    }

    public synchronized LinkedList<String> cloneTasksList() {
        try {
            System.out.println("Clone tasks list...");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return (LinkedList<String>) this.tasksList.clone();
    }
}
