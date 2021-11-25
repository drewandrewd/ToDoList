package org.examle.todo.commands;

import org.examle.todo.Lists;
import org.examle.todo.Main;

import java.util.ArrayList;

public class SearchCommand implements CommandMain {

    @Override
    public String getCommandName() {
        return "search";
    }

    @Override
    public String findId() {
        return Main.scanner.nextLine();
    }

    @Override
    public void process() {
        String line = findId();
        ArrayList<String> indexes = new ArrayList<>();

        for (int i = 0; i < Lists.toDoList.size(); i++) {
            if (Lists.toDoList.get(i).getText().contains(line.trim())) {
                indexes.add((i) + "");
            }
        }
        for (String index : indexes) {
            PrintCommand curr = new PrintCommand();
            curr.setIndex(index);
            curr.process();
        }
        Lists.getLogger().debug( "search: {}" , findId());
    }
}
