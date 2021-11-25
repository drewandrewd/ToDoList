package org.examle.todo.commands;

import org.examle.todo.Lists;
import org.examle.todo.Main;
import org.examle.todo.Task;

public class EditCommand implements CommandMain{
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
    public void process() {
        int id = Integer.parseInt(findId());
        String line = getLine();
        Lists.toDoList.set(id, new Task(line));
        Lists.getLogger().debug( "edit {} {} : {}" , id, Lists.toDoList.get(id), line);
    }
}
