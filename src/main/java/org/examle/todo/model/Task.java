package org.examle.todo.model;

public class Task {

    private String text;
    private boolean done;
    private String toggle;

    public Task(String text) {
        this.text = text;
        this.done = false;
    }

    public String getText() {
        return text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getToggle() {
        if (isDone() == true) {
            toggle = "[x]";
        } else {
            toggle = "[ ]";
        }
        return toggle;
    }
}