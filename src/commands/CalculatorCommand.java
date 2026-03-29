package commands;

import core.Command;

public class CalculatorCommand implements Command {

    public void execute(String input) {
        try {
            String expression = input.replace("calculate", "").trim();
            String[] parts = expression.split(" ");

            double num1 = Double.parseDouble(parts[0]);
            String op = parts[1];
            double num2 = Double.parseDouble(parts[2]);

            double result = 0;

            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Nova: Invalid operator");
                    return;
            }

            System.out.println("Nova: Result = " + result);

        } catch (Exception e) {
            System.out.println("Nova: Invalid calculation format");
        }
    }
}