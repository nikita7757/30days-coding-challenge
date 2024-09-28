import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

class day20 {
    static void sortedInsert(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp);
    }

    static void sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sortStack(s);
            sortedInsert(s, x);
        }
    }

    static void printStack(Stack<Integer> s) {
        ListIterator<Integer> lt = s.listIterator();
        while (lt.hasNext())
            lt.next();
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        System.out.println("Stack elements before sorting: ");
        printStack(s);

        sortStack(s);

        System.out.println("\n\nStack elements after sorting:");
        printStack(s);

        sc.close();
    }
}
