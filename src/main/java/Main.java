import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lists lists = new Lists(new ArrayList<>());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String command = scanner.next();
                if (command.equals("add")) {
                    lists.add(scanner.nextLine());
                } else if (command.equals("print")) {
                    String id = scanner.next();
                    lists.print(id);
                } else if (command.equals("toggle")) {
                    lists.toggle(Integer.parseInt(scanner.next()));
                } else if (command.equals("quit")) {
                    break;
                } else if (command.equals("delete")) {
                    lists.delete(Integer.parseInt(scanner.next()));
                } else if (command.equals("edit")) {
                    lists.edit(Integer.parseInt(scanner.next()), scanner.nextLine());
                } else if (command.equals("search")) {
                    lists.search(scanner.nextLine());
                } else {
                    System.out.println("Неправильная команнда!");
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода идентификатора!");
            }
        }
    }
}