package commands;
import java.time.LocalTime;
import core.Command;

public class TimeCommand implements Command {

    public void execute(String input) {
        System.out.println("Nova: Current time is " + LocalTime.now());
    }
}