package org.examle.todo.commands;

public abstract class CommandMain {
    public abstract String getCommandName();
    public abstract String findId();
    public abstract void process();
}
