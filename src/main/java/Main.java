import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static String findArgument(String line, String command) {
        String argument = "";
        if (command.equals("add")) {
            argument = line.substring(3).trim();
        } else if (!line.equals(command)) {
            argument = line.replace(command, "").trim();
        }
        return argument;
    }

    public static String findCommands(String line) {
        String command = "";
        int spaceIndex = line.indexOf(" ");
        if (spaceIndex >= 0) {
            command = line.substring(0, spaceIndex);
        } else {
            command = line;
        }
        return command;
    }

    public static void main(String[] args) {
        List list = new List();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean loop = true;
        while (loop) {
            try {
                String line = reader.readLine();
                String command = findCommands(line);
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
                        loop = false;
                        break;
                    default:
                        System.out.println("Неправильная команнда!");
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода идентификатора!");
            }
        }
    }
}
