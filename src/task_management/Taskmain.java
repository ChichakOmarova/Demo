package task_management;

import java.util.LinkedList;

public class Taskmain {
    public static void main(String[] args) throws Exception{
        LinkedList<Task> taskQueue = new LinkedList<>();
        taskQueue.add(new Task("Write report", "2023-12-15"));
        taskQueue.add(new Task("Review code", "2023-12-10"));
        taskQueue.add(new Task("Prepare presentation", "2023-12-20"));
        taskQueue.add(new Task("Fix bugs", "2023-12-05"));
        taskQueue.add(new Task("Team meeting", "2023-12-08"));
        taskQueue.addFirst(new Task("Urgent server fix", "2023-12-01"));
        System.out.println("Initial task list with high-priority task:");
        printTasks(taskQueue);

        System.out.println("\nProcessing tasks...");
        while (!taskQueue.isEmpty()) {
            Thread.sleep(5000);
            Task completedTask = taskQueue.removeFirst();
            System.out.println("\nCompleted: " + completedTask);
            System.out.println("Remaining tasks:");
            printTasks(taskQueue);
        }

        System.out.println("\nAll tasks have been completed!");
    }

    private static void printTasks(LinkedList<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks remaining");
        } else {
            for (Task task : tasks) {
                System.out.println(" - " + task);
            }
        }
    }
}
