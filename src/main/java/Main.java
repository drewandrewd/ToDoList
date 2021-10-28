import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List list = new List();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                String line = reader.readLine();
                String command = line.substring(0, line.indexOf(" "));
                if (command.equals("add")) {
                    list.add(line.replace(command, "").trim());
                } else if (command.equals("print")) {
                    list.print(line.replace(command, "").trim());
                } else if (command.equals("toggle")) {
                    list.toggle(Integer.parseInt(line.replace(command, "").trim()));
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
