package org.examle.todo;

import org.examle.todo.model.Lists;
import org.examle.todo.parser.CommandParser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Main implements CommandLineRunner {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) {
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
