import java.util.Stack;

public class day12{
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

       
        for (char ch : s.toCharArray()) {
      
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
       
            else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                
                return false;
            }
        }


        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s)); 
    }
}
