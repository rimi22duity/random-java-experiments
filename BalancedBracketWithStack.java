import java.util.Scanner;
import java.util.Stack;

public class BalancedBracketWithStack {

    static String isBalanced(String s) {
        char [] charArray = s.toCharArray();
        Stack stack = new Stack();

        for (char charValue: charArray) {
            switch (charValue) {
                case '(':
                case '{':
                case '[':
                    stack.push(charValue);
                    break;
                case ')':
                    if(!stack.isEmpty()) {
                        char v = (char)stack.peek();
                        if (v == '(') {
                            stack.pop();
                        } else {
                            return "NO";
                        }
                    } else {
                        return "NO";
                    }
                    System.out.println("Stack : " + stack.toString());
                    break;
                case '}':
                    if(!stack.isEmpty()) {
                        char v = (char)stack.peek();
                        if (v == '{') {
                            stack.pop();
                        } else {
                            return "NO";
                        }
                    } else {
                        return "NO";
                    }
                    System.out.println("Stack : " + stack.toString());
                    break;
                case ']':
                    if(!stack.isEmpty()) {
                        char v = (char)stack.peek();
                        if (v == '[') {
                            stack.pop();
                        } else {
                            return "NO";
                        }
                    } else {
                        return "NO";
                    }
                    System.out.println("Stack : " + stack.toString());
                    break;
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        System.out.println(isBalanced(s));
    }
}