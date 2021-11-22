package org.examle.todo.commands;

import java.util.Scanner;

public abstract class CommandMain {
    public abstract String getCommandName();
    public abstract String findId();
    public abstract void process();
}
