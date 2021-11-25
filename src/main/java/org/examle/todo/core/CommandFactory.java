package org.examle.todo.core;

import org.examle.todo.logic.BaseCommand;
import org.examle.todo.logic.commands.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CommandFactory {
    public static ArrayList<BaseCommand> getCommands(){
        return new ArrayList<>(Arrays.asList(new BaseCommand[]{new AddCommand(), new PrintCommand(), new DeleteCommand(), new EditCommand(), new QuitCommand(),
                new SearchCommand(), new ToggleCommand()}));
    }
}
