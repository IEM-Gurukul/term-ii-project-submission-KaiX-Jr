package core;

import java.util.HashMap;
import java.util.Map;

import commands.TimeCommand;
import commands.CalculatorCommand;
import commands.HelpCommand;
import commands.TaskCommand;
import commands.JokeCommand;

public class CommandProcessor {

    private Map<String, Command> commands;

    public CommandProcessor() {
        commands = new HashMap<>();

        commands.put("time", new TimeCommand());
        commands.put("calculate", new CalculatorCommand());
        commands.put("help", new HelpCommand());
        commands.put("task", new TaskCommand());
        commands.put("joke", new JokeCommand());
    }

    // returns true if command handled
    public boolean process(String input) {

        String key = input.split(" ")[0].toLowerCase();

        // greeting handling
        if (key.equals("hi") || key.equals("hello")) {
            System.out.println("Nova: Hello! 👋");
            return true;
        }

        if (commands.containsKey(key)) {
            commands.get(key).execute(input);
            return true;
        }

        return false;
    }
}