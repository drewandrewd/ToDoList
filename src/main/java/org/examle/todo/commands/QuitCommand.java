package org.examle.todo.commands;

public class QuitCommand extends BaseCommand {

    @Override
    String getCommandName() {
        return "quit";
    }

    @Override
    String findId() {
        return null;
    }

    @Override
    void run() {
        System.exit(0);
    }
}
