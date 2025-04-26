package task_management;
import java.util.LinkedList;

class Task {
    private String taskName;
    private String deadline;

    public Task(String taskName, String deadline) {
        this.taskName = taskName;
        this.deadline = deadline;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task: " + taskName + " (Deadline: " + deadline + ")";
    }
}

