public abstract class Task {

    private boolean done;
    private String toggle;

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setToggle(String toggle) {
        this.toggle = toggle;
    }

    public String getToggle() {
        return toggle;
    }

    public abstract String newToggle();
}
