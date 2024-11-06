package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<String> list;
    public void addTask(String task){
        list.add(task);
    }

    public TaskManager() {
        this.list = new ArrayList<>();
    }

    public void removeTask(String task){
        try {
            list.remove(task);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<String> getTasks(){
        return  list;
    }
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        String task1 = "Buy groceries";
        String task2 = "Go to the gym";
        String task3 = "Laundry";
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        List<String> tasks = taskManager.getTasks();
        taskManager.removeTask(task3);
        System.out.println("Tasks: "+tasks);
    }
}
