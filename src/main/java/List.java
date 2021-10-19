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
        getToDoList().add(0, new Task(toDo));
    }

    public void toggle(int id) {
        getToDoList().get(id - 1).setDone(!getToDoList().get(id - 1).isDone());
    }

    public void print(int id) {
        System.out.println(id + ". " + getToDoList().get(id - 1).getToggle() + " " + getToDoList().get(id - 1).getText());
    }

    public void printAll() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + ". " + getToDoList().get(i).getToggle() + " " + getToDoList().get(i).getText());
        }
    }
}
