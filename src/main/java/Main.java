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
                String[] line = reader.readLine().split(" ");
                String command = line[0];
                if (command.equals("add")) {
                    StringBuilder fullText = new StringBuilder();
                    for (int i = 1; i < line.length; i++) {
                        fullText.append(" " + line[i]);
                    }
                    list.add(fullText.toString());
                } else if (command.equals("print")) {
                    list.print(line[1]);
                } else if (command.equals("toggle")) {
                    list.toggle(Integer.parseInt(line[1]));
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
