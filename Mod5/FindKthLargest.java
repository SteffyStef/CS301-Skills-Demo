public class FindKthLargest {
    public static int findKthLargest(int[] a, int k) {
        if (a == null || k < 1 || k > a.length) {
            throw new IllegalArgumentException("Invalid array or k");
        }
        int left = 0;
        int right = a.length - 1;
        int target = a.length - k;

        while (left <= right) {
            int pivotIndex = partition(a, left, right);

            if (pivotIndex == target) {
                return a[pivotIndex];
            } else if (pivotIndex < target) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }

        }
        throw new IllegalStateException("Kth largest element not found");
    }

    private static int partition(int[] a, int left, int right) {
        int randomIndex = left + (int) (Math.random() * (right - left + 1));

        int temp = a[randomIndex];
        a[randomIndex] = a[right];
        a[right] = temp;

        int pivot = a[right];
        int i = left;

        for (int j = left; j < right; j++) {
            if (a[j] < pivot) {
                int swap = a[i];
                a[i] = a[j];
                a[j] = swap;
                i++;
            }
        }

        int swap = a[i];
        a[i] = a[right];
        a[right] = swap;

        return i;
    }

    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 4, 1};

        int k = 2;

        System.out.println("Kth largest: " + findKthLargest(numbers, k));

        int[] numbers2 = {10, 4, 8, 15, 2};

        System.out.println("Largest: " + findKthLargest(numbers2.clone(), 1));
        System.out.println("3rd largest: " + findKthLargest(numbers2.clone(), 3));
        System.out.println("Smallest: " + findKthLargest(numbers2.clone(), 5));
    }
}
