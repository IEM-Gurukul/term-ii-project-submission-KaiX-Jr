package commands;

import core.Command;

public class HelpCommand implements Command {

    @Override
    public void execute(String input) {

        System.out.println("\n=========== NOVA AI HELP ===========\n");

        System.out.println("⚙️ Basic Commands:");
        System.out.println("  time                 → Show current time");
        System.out.println("  calculate a + b      → Perform calculation");

        System.out.println("\n📝 Tasks:");
        System.out.println("  task add <text>      → Add a task");
        System.out.println("  task list            → Show all tasks");
        System.out.println("  task remove <n>      → Remove a task");

        System.out.println("\n🎉 Fun:");
        System.out.println("  joke                 → Get a random joke");

        System.out.println("\n📊 System:");
        System.out.println("  history              → Show command history");
        System.out.println("  help                 → Show this menu");
        System.out.println("  exit                 → Quit");

        System.out.println("\n====================================\n");
    }
}