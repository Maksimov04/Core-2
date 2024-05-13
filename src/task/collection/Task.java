package task.collection;

import java.util.List;
import java.util.ArrayList;

public class Task {
    int id;
    String title;
    boolean completed;



    public Task(int id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public static void IncompleteTasks(List<Task> tasks) {
        System.out.println("Незавершенные задачи:");
        for (Task task : tasks) {
            if (!task.completed) {
                System.out.println("ID: " + task.id + ", Заголовок: " + task.title);
            }
        }
    }

    public static List<Task> findTasksByTitle(List<Task> tasks, String searchTitle) {
        List<Task> tasksFound = new ArrayList<>();
        for (Task task : tasks) {
            if (task.title.equalsIgnoreCase(searchTitle)) {
                tasksFound.add(task);
            }
        }
        return tasksFound;
    }

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Сходить в магазиин", false));
        tasks.add(new Task(2, "Помыть машину", true));
        tasks.add(new Task(3, "Приготовить ужин", true));

        IncompleteTasks(tasks);

        String searchTitle = "Приготовить ужин";
        List<Task> tasksFound = findTasksByTitle(tasks, searchTitle);
        if (tasksFound.isEmpty()) {
            System.out.println("Задачей с заголовком '" + searchTitle + "' не найдено.");
        } else {
            System.out.println("Задачи с заголовком '" + searchTitle + ":");
            for (Task task : tasksFound) {
                System.out.println("ID: " + task.id + ", Заголовок: " + task.title + ", Завершена: " + task.completed);
            }
        }
    }
}





