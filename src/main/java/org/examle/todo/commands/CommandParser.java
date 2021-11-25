package org.examle.todo.commands;

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
        for (BaseCommand command : commands) {
            command.process(line);
        }
    }
}
