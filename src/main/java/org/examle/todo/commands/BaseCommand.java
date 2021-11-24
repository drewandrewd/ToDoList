package org.examle.todo.commands;

public abstract class BaseCommand implements CommandMain{
    abstract  String getCommandName();
    abstract String findId();

    @Override
    public void process(String line) {
        if (isCommand(line, getCommandName()))
            run();
    }

    abstract void run();

    private boolean isCommand(String line, String command) {
        return line.equals(command);
    }
}
