public class List {

    private Task toDoList = new Task("");
    private String toggle = "[ ]";

    public Task getToDoList() {
        return toDoList;
    }

    public void add(String text) {
        getToDoList().setText(text);
    }

    public void toggle(int id) throws Exception {
        if (id == 1 && toggle.equals("[ ]")) {
            toggle = "[x]";
        } else if (id == 1 && toggle.equals("[x]")) {
            toggle = "[ ]";
        } else {
            throw new Exception();
        }
    }

    public void print(String argument) throws Exception {
        String printLine = 1 + ". " + toggle + " " + toDoList.getText().trim();
        if (argument.equals("all") || (argument.equals("") && toggle.equals("[ ]"))) {
            System.out.println(printLine);
        } else if (!argument.equals("all") || !argument.equals("")) {
            throw new Exception();
        }
    }

    public String findArgument(String line, String command) {
        String argument = "";
        if (!line.equals(command)) {
            argument = line.replace(command, "").trim();
        }
        return argument;
    }
}
