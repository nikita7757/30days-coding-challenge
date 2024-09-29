import java.util.Scanner;
import java.util.Stack;

public class day21 {

    public static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insertAtBottom(stack, element);
        stack.push(top);
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverse(stack);
        insertAtBottom(stack, top);
    }

    public static void printStack(Stack<Integer> stack) {
        for (Integer element : stack) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            stack.push(element);
        }

        System.out.println("Original Stack:");
        printStack(stack);

        reverse(stack);

        System.out.println("Reversed Stack:");
        printStack(stack);

        scanner.close();
    }
}
