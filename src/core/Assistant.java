package core;

import java.util.Scanner;

public class Assistant {

    private CommandProcessor processor;
    private Scanner scanner;

    public Assistant() {
        processor = new CommandProcessor();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Nova AI Assistant Started (type 'exit' to quit)");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Nova: Goodbye! 👋");
                break;
            }

            if (input.isEmpty()) {
                System.out.println("Nova: Please enter something.");
                continue;
            }

            String lower = input.toLowerCase();

            if (lower.matches("hi|hello|hey")) {
                System.out.println("Nova: Hey there! 👋 How can I help?");
                continue;
            }

            if (lower.contains("how are you")) {
                System.out.println("Nova: Running smooth as ever 🚀");
                continue;
            }

            if (lower.contains("who are you")) {
                System.out.println("Nova: I’m Nova, your command-line assistant 🤖");
                continue;
            }

            boolean handled = processor.process(input);

            if (!handled) {
                System.out.println("Nova: I didn't get that. Try 'help'.");
            }
        }
    }
}