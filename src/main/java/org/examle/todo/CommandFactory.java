package org.examle.todo;

import org.examle.todo.commands.CommandMain;

public interface CommandFactory {

    CommandMain getCommand (String command);
}
