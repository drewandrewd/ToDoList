public class TaskText extends Task{

    private String text;

    public TaskText(String text) {
        this.text = text;
        setDone(false);
    }

    public String getText() {
        return text;
    }

    @Override
    public String newToggle() {
        if (isDone() == true) {
            setToggle("[x]");
        } else {
            setToggle("[ ]");
        }
        return getToggle();
    }
}
