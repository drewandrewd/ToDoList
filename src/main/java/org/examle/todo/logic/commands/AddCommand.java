package org.examle.todo.logic.commands;

import org.examle.todo.model.Lists;
import org.examle.todo.Main;
import org.examle.todo.logic.BaseCommand;
import org.examle.todo.model.Task;

public class AddCommand extends BaseCommand {

    @Override
    public String getCommandName() {
        return "add";
    }

    @Override
    public String findId() {
        return Main.scanner.nextLine();
    }

    @Override
    public void run() {
        String line = findId();
        Lists.getLogger().debug(getCommandName() + " " + line);
        Lists.toDoList.add(new Task(line));
    }
}
