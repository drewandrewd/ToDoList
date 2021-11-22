import java.util.Scanner;

public interface Command {
    String getCommandName();
    public void findCommand(Scanner scanner);
}
