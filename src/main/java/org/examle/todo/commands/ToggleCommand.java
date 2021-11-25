package org.examle.todo.commands;

import org.examle.todo.Lists;
import org.examle.todo.Main;

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
        Lists.getLogger().debug( "toggle " + id +  ": " + Lists.toDoList.get(id).isDone() + ": " + !Lists.toDoList.get(id).isDone());
    }
}
