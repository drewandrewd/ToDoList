package org.examle.todo;

import org.examle.todo.commands.*;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Lists lists = Lists.getInstance();
        CommandParser commandParser = CommandParser.getInstance();
        while (true) {
            try {
                String command = scanner.next();
                commandParser.parser(command);
//                if (command.equals("add")) {
//                    new AddCommand().process();
//                } else if (command.equals("print")) {
//                    new PrintCommand().process();
//                } else if (command.equals("toggle")) {
//                    new ToggleCommand().process();
//                } else if (command.equals("quit")) {
//                    Lists.getLogger().debug(command);
//                    break;
//                } else if (command.equals("delete")) {
//                    new DeleteCommand().process();
//                } else if (command.equals("edit")) {
//                    new EditCommand().process();
//                } else if (command.equals("search")) {
//                    new SearchCommand().process();
//                } else {
//                    Lists.getLogger().error("Неправильная команнда: " + command);
//                }
            } catch (Exception e) {
                Lists.getLogger().error("Ошибка ввода идентификатора!", e);
            }
        }
    }
}