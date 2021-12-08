package org.examle.todo.logic.commands;

import org.examle.todo.logic.BaseCommand;

public class QuitCommand extends BaseCommand {

    @Override
    public String getCommandName() {
        return "quit";
    }

    @Override
    public String findId() {
        return null;
    }

    @Override
    public void run() {
        System.exit(0);
    }
}
