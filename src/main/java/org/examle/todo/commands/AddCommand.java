package org.examle.todo.commands;

import org.examle.todo.Lists;
import org.examle.todo.Main;
import org.examle.todo.Task;

import java.util.Scanner;

public class AddCommand extends CommandMain {

    @Override
    public String getCommandName() {
        return "add";
    }

    @Override
    public String findId() {
        return Main.scanner.nextLine();
    }

    @Override
    public void process() {
        String line = findId();
        Lists.getLogger().debug(getCommandName() + " " + line);
        Lists.toDoList.add(new Task(line));
    }
}
