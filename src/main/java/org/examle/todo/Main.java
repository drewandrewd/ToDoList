package org.examle.todo;

import org.examle.todo.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Lists lists = new Lists();

        while (true) {
            try {
                String command = scanner.next();
                if (command.equals("add")) {
                    String line = scanner.nextLine();
                    lists.add(line);
                    Lists.getLogger().debug(command + " " + line);
                } else if (command.equals("print")) {
                    String id = scanner.next();
                    lists.print(id);
                    Lists.getLogger().debug(command + " " + id);
                } else if (command.equals("toggle")) {
                    String id = scanner.next();
                    lists.toggle(Integer.parseInt(id));
                    Lists.getLogger().debug(command + " " + id);
                } else if (command.equals("quit")) {
                    Lists.getLogger().debug(command);
                    break;
                } else if (command.equals("delete")) {
                    String id = scanner.next();
                    lists.delete(Integer.parseInt(id));
                    Lists.getLogger().debug(command + " " + id);
                } else if (command.equals("edit")) {
                    String id = scanner.next();
                    String line = scanner.nextLine();
                    lists.edit(Integer.parseInt(id), line);
                    Lists.getLogger().debug(command + " " + id + " " + line);
                } else if (command.equals("search")) {
                    String line = scanner.nextLine();
                    lists.search(line);
                    Lists.getLogger().debug(command + " " + line);
                } else {
                    Lists.getLogger().error("Неправильная команнда!");
                }
            } catch (Exception e) {
                Lists.getLogger().error("Ошибка ввода идентификатора!", e);
            }
        }
    }
}