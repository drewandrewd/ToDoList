package org.examle.todo.commands;

import org.examle.todo.Lists;
import org.examle.todo.Main;

public class ToggleCommand implements CommandMain {
    @Override
    public String getCommandName() {
        return "toggle";
    }

    @Override
    public String findId() {
        return Main.scanner.nextLine();
    }

    @Override
    public void process() {
        int id = Integer.parseInt(findId());
        Lists.toDoList.get(id).setDone(!Lists.toDoList.get(id).isDone());
        Lists.getLogger().debug( "toggle " + id +  ": " + Lists.toDoList.get(id).isDone() + ": " + !Lists.toDoList.get(id).isDone());
    }
}
