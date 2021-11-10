import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Lists {

    private final ArrayList<Task> toDoList;
    public static final Logger logger = (Logger) LoggerFactory.getLogger(Lists.class);

    public Lists(ArrayList<Task> toDoList) {
        this.toDoList = toDoList;
        toDoList.add(new Task(""));
    }

    public void add(String toDo) {
        toDoList.add(new Task(toDo));
    }

    public void toggle(int id) {
        try {
            toDoList.get(id).setDone(!toDoList.get(id).isDone());
        } catch (Exception e) {
            logger.error("Wrong argument " + id, e);
        }
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
            StringBuilder builder = new StringBuilder();
            builder
                    .append(i)
                    .append(". ")
                    .append(toDoList.get(i).getToggle())
                    .append(" ")
                    .append(toDoList.get(i).getText().trim());
            System.out.println(builder);
        }
    }

    public void delete(int id) {
        toDoList.remove(id);
    }

    public void edit(int id, String toDo) {
        toDoList.set(id, new Task(toDo));
    }

    public void search(String subString) {
        ArrayList<String> indexes = new ArrayList<>();
        for (int i = 0; i < toDoList.size(); i++) {
            if (toDoList.get(i).getText().contains(subString.trim())) {
                indexes.add((i) + "");
            }
        }
        for (String index : indexes) {
            print(index);
        }
    }
}
