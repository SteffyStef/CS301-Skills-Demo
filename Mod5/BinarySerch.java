public class BinarySerch {

    public static int search(int[] a) {
        int left = 0;
        int right = a.length - 1;


        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (a[mid] == mid) {
                return mid;
            }
            if (a[mid] > mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {-3, -1, 2, 5, 8};

        System.out.println("Matching index: " + search(numbers));


        int[] numbers2 = {3, 5, 7, 9, 11};

        System.out.println("No matching index: " + search(numbers2));
    }
}