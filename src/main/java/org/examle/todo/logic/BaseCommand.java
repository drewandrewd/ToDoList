package org.examle.todo.logic;

public abstract class BaseCommand implements CommandMain {

    public abstract  String getCommandName();
    public abstract String findId();

    @Override
    public void process(String line) {
        if (isCommand(line, getCommandName())) {
            run();
        }
    }

    public abstract void run();

    private boolean isCommand(String line, String command) {
        return line.equals(command);
    }
}
