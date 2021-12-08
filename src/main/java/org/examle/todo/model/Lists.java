package org.examle.todo.model;

import org.slf4j.LoggerFactory;
import java.util.ArrayList;

public class Lists {

    public static final ArrayList<Task> toDoList = new ArrayList<>();
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(Lists.class);
    private static Lists list;

    public static org.slf4j.Logger getLogger() {
        return logger;
    }

    public static Lists getInstance() {
        if (list == null)
            list = new Lists();
        return list;
    }

    private Lists() {
        toDoList.add(new Task(""));
    }
}