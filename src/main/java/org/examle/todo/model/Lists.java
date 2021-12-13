package org.examle.todo.model;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Lists {

    public static final ArrayList<Task> toDoList = new ArrayList<>();
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(Lists.class);

    public static org.slf4j.Logger getLogger() {
        return logger;
    }
}