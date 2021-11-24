package org.examle.todo.commands;

public interface CommandMain {
    String getCommandName();
    String findId();
    void process();
}
