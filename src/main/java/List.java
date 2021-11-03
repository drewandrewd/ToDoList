public class List {

    private Task toDoList;

    public Task getToDoList() {
        return toDoList;
    }

    public void add(String text) {
        toDoList = new Task();
        getToDoList().setText(text);
    }

    public void toggle(int id) throws Exception {
        if (id == 1 && toDoList.isDone()) {
            toDoList.setDone(!toDoList.isDone());
        } else if (id == 1 && !toDoList.isDone()) {
            toDoList.setDone(!toDoList.isDone());
        } else {
            throw new Exception();
        }
    }

    public void print(String argument) throws Exception {
        String toggle = "[ ]";
        if (toDoList.isDone() == true) {
            toggle = "[x]";
        }
        if (argument.equals("all") || (argument.equals("") && toDoList.isDone() == false)) {
            System.out.println(1 + ". " + toggle + " " + toDoList.getText().trim());
        } else if (argument.equals("") && toDoList.isDone() == true) {
            System.out.println("Все задачи выполнены!");
        } else {
            throw new Exception();
        }
    }
}
