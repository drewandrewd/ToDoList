public class List {

    private Task toDoList = new Task("");

    public Task getToDoList() {
        return toDoList;
    }

    public void add(String text) {
        getToDoList().setText(text);
    }

    public void toggle(int id) throws Exception {
        if (id == 1)
            toDoList.setDone(!toDoList.isDone());
        else
            throw new Exception();
    }

    public void print(String id) {
        String toggle = "[ ]";
        if (toDoList.isDone() == true) {
            toggle = "[x]";
        }
        System.out.println(1 + ". " + toggle + " " + toDoList.getText().trim());
    }
}
