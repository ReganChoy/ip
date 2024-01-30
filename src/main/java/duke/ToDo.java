package duke;

public class ToDo extends Task {
    public ToDo(String Task, String taskType) {
        super(Task,taskType);
    }

    public String announcement() {
        return "New ToDo created!";
    }

    public String toString() {
        return this.getTaskType() + this.getStatus() + " " + this.getTask();
    }

    public String saveString() {
        return this.getTaskTypeSingle() + "|" + this.getStatusBinary() + "|" + this.getTask();
    }
}
