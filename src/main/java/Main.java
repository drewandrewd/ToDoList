import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String command = scanner.next();
                if (command.equals("add")) {
                    list.add(scanner.nextLine());
                } else if (command.equals("print")) {
                    String id = scanner.next();
                    list.print(id);
                } else if (command.equals("toggle")) {
                    list.toggle(Integer.parseInt(scanner.next()));
                } else if (command.equals("quit")) {
                    break;
                } else {
                    System.out.println("Неправильная команнда!");
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода идентификатора!");
            }
        }
    }
}
