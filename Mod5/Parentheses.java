import java.util.ArrayDeque;
import java.util.Scanner;

public class Parentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter parentheses: ");
        String input = scanner.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean balanced = true;

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }

                char open = stack.pop();

                if ((c == ')' && open != '(') ||
                        (c == ']' && open != '[') ||
                        (c == '}' && open != '{')) {
                    balanced = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            balanced = false;
        }

        System.out.println(balanced);
        scanner.close();

    }
}
