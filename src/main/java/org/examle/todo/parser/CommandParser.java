package org.examle.todo.parser;

import org.examle.todo.logic.BaseCommand;
import org.examle.todo.core.CommandFactory;
import org.examle.todo.model.Lists;

import java.util.ArrayList;

public class CommandParser {

    private final ArrayList<BaseCommand> commands = CommandFactory.getCommands();
    private static CommandParser instance;

    public static CommandParser getInstance() {
        if (instance == null)
            instance = new CommandParser();
        return instance;
    }

    public void parser(String line) {
        if (check(line)) {
            for (BaseCommand command : commands) {
                command.process(line);
            }
        } else {
            Lists.getLogger().error("Неправильная команда: {}", line);
        }
    }

    public boolean check(String line) {
        boolean checker = false;
        for (BaseCommand command : commands) {
            if (command.getCommandName().equals(line)) {
                checker = true;
                break;
            }
        }
        return checker;
    }
}
