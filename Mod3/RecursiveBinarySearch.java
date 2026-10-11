public class RecursiveBinarySearch {

    public static boolean search(int[] numbers, int target) {
        return binarySearch(numbers, target, 0, numbers.length - 1);
    }

    public static boolean binarySearch(int[] numbers, int target,
                                       int left, int right) {

        // Base case: target was not found
        if (left > right) {
            return false;
        }

        // Find the middle index
        int mid = left + (right - left) / 2;

        // Base case: target was found
        if (numbers[mid] == target) {
            return true;
        }

        // Search the left half
        if (target < numbers[mid]) {
            return binarySearch(numbers, target, left, mid - 1);
        }

        // Search the right half
        return binarySearch(numbers, target, mid + 1, right);
    }

    public static void main(String[] args) {

        int[] numbers = {3, 8, 12, 17, 21, 35, 48};

        System.out.println(search(numbers, 17));
        System.out.println(search(numbers, 20));
    }
}
