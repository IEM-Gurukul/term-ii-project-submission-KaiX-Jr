package commands;

import core.Command;
import java.util.ArrayList;
import java.util.List;

public class TaskCommand implements Command {

    private static final List<String> tasks = new ArrayList<>();

    @Override
    public void execute(String input) {
        try {
            String lower = input.toLowerCase();

            if (lower.startsWith("task add ")) {
                String task = input.substring(9).trim();
                if (task.isEmpty()) {
                    System.out.println("Nova: Task cannot be empty.");
                    return;
                }
                tasks.add(task);
                System.out.println("Nova: Task added ✔");
            }

            else if (lower.equals("task list")) {
                if (tasks.isEmpty()) {
                    System.out.println("Nova: No tasks yet.");
                    return;
                }
                System.out.println("Nova: Your Tasks:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            }

            else if (lower.startsWith("task remove ")) {
                int idx = Integer.parseInt(input.split(" ")[2]) - 1;
                if (idx >= 0 && idx < tasks.size()) {
                    tasks.remove(idx);
                    System.out.println("Nova: Task removed 🗑");
                } else {
                    System.out.println("Nova: Invalid task number.");
                }
            }

            else {
                System.out.println("Nova: Usage → task add <text> | task list | task remove <n>");
            }

        } catch (Exception e) {
            System.out.println("Nova: Invalid task command.");
        }
    }
}