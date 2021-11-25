package org.examle.todo.commands;

import java.util.ArrayList;
import java.util.Arrays;

public class CommandFactory {
    public static ArrayList<BaseCommand> getCommands(){
        return new ArrayList<>(Arrays.asList(new BaseCommand[]{new AddCommand(), new PrintCommand(), new DeleteCommand(), new EditCommand(), new QuitCommand(),
                new SearchCommand(), new ToggleCommand()}));
    }
}
