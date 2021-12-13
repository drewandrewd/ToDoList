package org.examle.todo.logic.commands;

import org.examle.todo.model.Lists;
import org.examle.todo.Main;
import org.examle.todo.logic.BaseCommand;
import org.examle.todo.model.Task;

public class EditCommand extends BaseCommand {
    @Override
    public String getCommandName() {
        return "edit";
    }

    @Override
    public String findId() {
        return Main.scanner.next();
    }

    public String getLine() {
        return Main.scanner.nextLine();
    }

    @Override
    public void run() {
        int id = Integer.parseInt(findId()) - 1;
        String line = getLine();
        Lists.toDoList.set(id, new Task(line));
        Lists.getLogger().debug( "edit {} {} : {}" , id, Lists.toDoList.get(id), line);
    }
}
