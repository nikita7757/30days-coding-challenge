package corejava;

import java.util.Scanner;
import java.util.Stack;


public class day19 {

    public static int evaluatePostfix(String expression) {
        Stack<Double> stack = new Stack<>(); 
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isNumeric(token)) { 
                stack.push(Double.parseDouble(token)); 
            } else {
               
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid expression");
                }

                double b = stack.pop(); 
                double a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                    case "^": 
                        stack.push(Math.pow(a, b));
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown operator: " + token);
                }
            }
        }

       
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }

        return stack.pop().intValue();
    }

  
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        System.out.print("Enter a postfix expression: ");
        String expression = scanner.nextLine();   // Take user input

        try {
            int result = evaluatePostfix(expression);
            System.out.println("The result is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
