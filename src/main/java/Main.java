import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static String findArgument(String line, String command) {
        String argument = "";
        if (!line.equals(command)) {
            argument = line.replace(command, "").trim();
        }
        return argument;
    }

    public static String commands(String line) {
        String command = "";
        if (line.contains(" ")) {
            command = line.substring(0, line.indexOf(" "));
        } else {
            command = line;
        }
        return command;
    }

    public static void main(String[] args) {
        List list = new List(new Task());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        loop:
            while (true) {
                try {
                    String line = reader.readLine();
                    String command = commands(line);
                    switch (command) {
                        case "add":
                            list.add(findArgument(line, command));
                            break;
                        case "print":
                            list.print(findArgument(line, command));
                            break;
                        case "toggle":
                            list.toggle(Integer.parseInt(findArgument(line, command)));
                            break;
                        case "quit":
                            break loop;
                        default:
                            System.out.println("Неправильная команнда!");
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка ввода идентификатора!");
                }
            }
    }
}
