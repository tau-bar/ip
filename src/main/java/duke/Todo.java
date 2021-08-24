package duke;

public class Todo extends Task {
    /**
     * Constructor for duke.Todo object.
     * @param description Description of duke.Todo.
     */
    public Todo(String description) {
        super(description);
        this.type = TaskType.TODO;
    }

    /**
     * Returns string representation of duke.Todo object.
     * @return String representation of duke.Todo.
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}