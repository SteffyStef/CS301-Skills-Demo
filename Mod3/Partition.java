public class Partition {

    public static void partition(int n, int max, String result) {

        // Base case: a complete partition
        if (n == 0) {
            System.out.println(result.trim());
            return;
        }

        // Try each number from largest to smallest
        for (int i = Math.min(n, max); i >= 1; i--) {
            partition(n - i, i, result + i + " ");
        }
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        partition(n, n, "");
    }
}
