package org.examle.todo.commands;

import org.examle.todo.Lists;
import org.examle.todo.Main;

public class DeleteCommand implements CommandMain{

    @Override
    public String getCommandName() {
        return "delete";
    }

    @Override
    public String findId() {
        return Main.scanner.next();
    }

    @Override
    public void process() {
        int id = Integer.parseInt(findId());
        Lists.toDoList.remove(id);
        Lists.getLogger().debug( "remove " + id);
    }
}
