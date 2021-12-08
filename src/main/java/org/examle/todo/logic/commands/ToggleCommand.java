package org.examle.todo.logic.commands;

import org.examle.todo.model.Lists;
import org.examle.todo.Main;
import org.examle.todo.logic.BaseCommand;

public class ToggleCommand extends BaseCommand {
    @Override
    public String getCommandName() {
        return "toggle";
    }

    @Override
    public String findId() {
        return Main.scanner.nextLine().trim();
    }

    @Override
    public void run() {
        int id = Integer.parseInt(findId());
        Lists.toDoList.get(id).setDone(!Lists.toDoList.get(id).isDone());
        Lists.getLogger().debug( "toggle {}: {}: {}", id, Lists.toDoList.get(id).isDone(), !Lists.toDoList.get(id).isDone());
    }
}
