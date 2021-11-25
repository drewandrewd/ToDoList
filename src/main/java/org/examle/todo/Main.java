package org.examle.todo;

import org.examle.todo.model.Lists;
import org.examle.todo.parser.CommandParser;

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
            } catch (Exception e) {
                Lists.getLogger().error("Ошибка ввода идентификатора!", e);
            }
        }
    }
}