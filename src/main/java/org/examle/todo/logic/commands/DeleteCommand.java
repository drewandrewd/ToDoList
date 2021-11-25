package org.examle.todo.logic.commands;

import org.examle.todo.model.Lists;
import org.examle.todo.Main;
import org.examle.todo.logic.BaseCommand;

public class DeleteCommand extends BaseCommand {

    @Override
    public String getCommandName() {
        return "delete";
    }

    @Override
    public String findId() {
        return Main.scanner.next();
    }

    @Override
    public void run() {
        int id = Integer.parseInt(findId());
        Lists.toDoList.remove(id);
        Lists.getLogger().debug( "remove " + id);
    }
}
