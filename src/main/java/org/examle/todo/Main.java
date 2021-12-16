package org.examle.todo;

import org.examle.todo.model.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

import static org.examle.todo.MainConfig.getParser;

@SpringBootApplication
public class Main implements CommandLineRunner {

	@Autowired
	public static Scanner scanner;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) {
		while (true) {
			try {
				String command = scanner.next();
				getParser().parser(command);
			} catch (Exception e) {
				Lists.getLogger().error("Ошибка ввода идентификатора!", e);
			}
		}
	}
}
