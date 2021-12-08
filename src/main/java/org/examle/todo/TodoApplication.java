package org.examle.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TodoApplication {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
