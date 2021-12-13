package org.examle.todo.logic.commands;

import org.examle.todo.model.Lists;
import org.examle.todo.Main;
import org.examle.todo.logic.BaseCommand;

import java.util.ArrayList;

public class SearchCommand extends BaseCommand {

    @Override
    public String getCommandName() {
        return "search";
    }

    @Override
    public String findId() {
        return Main.scanner.nextLine();
    }

    @Override
    public void run() {
        String line = findId();
        ArrayList<String> indexes = new ArrayList<>();

        for (int i = 0; i < Lists.toDoList.size(); i++) {
            if (Lists.toDoList.get(i).getText().contains(line.trim())) {
                indexes.add((i - 1) + "");
            }
        }
        for (String index : indexes) {
            PrintCommand curr = new PrintCommand();
            curr.setIndex(index);
            curr.run();
        }
        Lists.getLogger().debug( "search: {}" , findId());
    }
}
