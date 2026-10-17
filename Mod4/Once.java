import java.util.Scanner;

public class Once {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            int count = 0;

            for (int j = 0; j < input.length(); j++) {
                if (current == input.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("First unique character: " + current);
                return;
            }
        }
        System.out.println("No unique character found.");
        scanner.close();
    }
}