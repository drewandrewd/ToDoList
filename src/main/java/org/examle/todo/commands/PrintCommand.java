package org.examle.todo.commands;

import org.examle.todo.Lists;
import org.examle.todo.Main;

public class PrintCommand extends CommandMain {

    private String index;

    @Override
    public String getCommandName() {
        return "print";
    }

    @Override
    public String findId() {
        return Main.scanner.next();
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public void process() {
        String id = "";
        if (index == null)
            id = findId();
        else
            id = index;
        Lists.getLogger().debug(getCommandName() + " " + id);
        int first = 1;
        int last = 0;
        if (id.equals("all")) {
            last = Lists.toDoList.size();
        } else {
            first = Integer.parseInt(id);
            last = first + 1;
        }
        for (int i = first; i < last; i++) {
            StringBuilder builder = new StringBuilder();
            builder
                    .append(i)
                    .append(". ")
                    .append(Lists.toDoList.get(i).getToggle())
                    .append(" ")
                    .append(Lists.toDoList.get(i).getText().trim());
            System.out.println(builder);
        }
    }
}
