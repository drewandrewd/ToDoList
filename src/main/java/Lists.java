import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class Lists {

    private ArrayList<Task> toDoList;

    public Lists(ArrayList<Task> toDoList) {
        this.toDoList = toDoList;
        getToDoList().add(new Task(""));
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
        getToDoList().get(id).setDone(!getToDoList().get(id).isDone());
    }

    public void print(String id) {
        int first = 1;
        int last = 0;
        if (id.equals("all")) {
            last = toDoList.size();
        } else {
            first = Integer.parseInt(id);
            last = first + 1;
        }
        for (int i = first; i < last; i++) {
            System.out.println((i) + ". " + getToDoList().get(i).getToggle() + " " + getToDoList().get(i).getText().trim());
        }
    }

    public void delete(int id) {
        getToDoList().remove(id);
    }

    public void edit(int id, String toDo) {
        getToDoList().set(id, new Task(toDo));
    }

    public void search(String subString) {
        List tmp = toDoList.stream().filter(e -> e.getText().contains(subString)).collect(Collectors.toList());
        List<Integer> indexes = (List<Integer>) tmp.stream().map(o -> toDoList.indexOf(o)).collect(Collectors.toList());
        Stream stream = indexes.stream();
        stream.forEach(e -> print(e + ""));
    }
}
