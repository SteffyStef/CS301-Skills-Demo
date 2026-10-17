public class ROT13 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a string as a command-line argument.");
            return;
        }

        String input = args[0];
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('A' + (ch - 'A' + 13) % 26);
            }
            else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a' + (ch - 'a' + 13) % 26);
            }
            result += ch;
        }
        System.out.println("ROT13: " + result);
    }
}
