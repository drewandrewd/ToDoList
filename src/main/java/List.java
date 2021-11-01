public class List {

    private Task toDoList;

    public List(Task toDoList) {
        this.toDoList = toDoList;
    }

    public Task getToDoList() {
        return toDoList;
    }

    public void add(String text) {
        getToDoList().setText(text);
    }

    public void toggle(int id) throws Exception {
        if (id == 1 && toDoList.isDone() == false) {
            toDoList.setDone(true);
        } else if (id == 1 && toDoList.isDone() == true) {
            toDoList.setDone(false);
        } else {
            throw new Exception();
        }
    }

    public void print(String argument) throws Exception {
        String toggle = "[ ]";
        if (toDoList.isDone() == true) {
            toggle = "[x]";
        }
        String printLine = 1 + ". " + toggle + " " + toDoList.getText().trim();
        if (argument.equals("all") || (argument.equals("") && toDoList.isDone() == false)) {
            System.out.println(printLine);
        } else if (argument.equals("") && toDoList.isDone() == true) {
            System.out.println("Все задачи выполнены!");
        } else {
            throw new Exception();
        }
    }
}
