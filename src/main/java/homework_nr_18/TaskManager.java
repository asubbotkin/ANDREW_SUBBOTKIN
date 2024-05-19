package homework_nr_18;

import java.util.LinkedList;

public class TaskManager {
    private final LinkedList<String> tasksList;

    public TaskManager(LinkedList<String> tasksList) {
        this.tasksList = tasksList;
    }

    public synchronized void addTask(String task){
        this.tasksList.add(task);
    }

    public synchronized void removeTask(int index){
        this.tasksList.remove(index);
    }

    public synchronized int getTasksCount(){
        return this.tasksList.size();
    }
    public void getAllTasks(){
        for (String task : tasksList) System.out.println(task);
    }

    public synchronized LinkedList cloneTasksList(){
        return (LinkedList) this.tasksList.clone();
    }
}
