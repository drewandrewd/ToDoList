import java.util.ArrayList;

public class List {

    private ArrayList<Task> toDoList;

    public List(ArrayList<Task> toDoList) {
        this.toDoList = toDoList;
    }

    public ArrayList<Task> getToDoList() {
        return toDoList;
    }

    public void setToDoList(ArrayList<Task> toDoList) {
        this.toDoList = toDoList;
    }

    public void add(String toDo) {
        getToDoList().add(new Task(toDo));
    }

    public void toggle(int id) {
        getToDoList().get(id - 1).setDone(!getToDoList().get(id - 1).isDone());
    }

    public void print(String id) {
        int first = 0;
        int last = 0;
        if (id.equals("all")) {
            last = toDoList.size();
        } else {
            first = Integer.parseInt(id) - 1;
            last = first + 1;
        }
        for (int i = first; i < last; i++) {
            System.out.println((i + 1) + ". " + getToDoList().get(i).getToggle() + " " + getToDoList().get(i).getText().trim());
        }
    }

    public void delete(int id) {
        getToDoList().remove(id);
    }

    public void edit(int id, String toDo) {
        getToDoList().set(id - 1, new Task(toDo));
    }

    public void search(String subString) {
        ArrayList<String> indexes = new ArrayList<>();
        for (int i = 0; i < toDoList.size(); i++) {
            if (toDoList.get(i).getText().contains(subString)) {
                indexes.add((i + 1) + "");
            }
        }
        for (String index : indexes) {
            print(index);
        }
    }
}
