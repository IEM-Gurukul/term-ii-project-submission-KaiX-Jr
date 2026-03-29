package commands;

import core.Command;
import java.util.Random;

public class JokeCommand implements Command {

    private static final String[] jokes = {
            "Why do programmers prefer dark mode? Because light attracts bugs 🐛",
            "I told my code a joke… it didn’t compile 😂",
            "Why Java? Because it keeps throwing exceptions 💀",
            "I love deadlines… especially the whooshing sound they make 🚀"
    };

    @Override
    public void execute(String input) {
        Random rand = new Random();
        System.out.println("Nova: " + jokes[rand.nextInt(jokes.length)]);
    }
}