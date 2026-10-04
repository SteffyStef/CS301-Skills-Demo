public class MyBeer {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int successes = 0;

        for (int trial = 0; trial < 1000; trial++) {
            int[] drinks = new int[n];

            for (int i = 0; i < n; i++) {
                drinks[i] = i;
            }

            for (int i = 0; i < n; i++) {
                int r = i + (int) (Math.random() * (n - i));

                int temp = drinks[i];
                drinks[i] = drinks[r];
                drinks[r] = temp;
            }

            boolean match = false;
            for (int i = 0; i < n; i++) {
                if (drinks[i] == i) {
                    match = true;
                    break;
                }
            }

            if (match) {
                successes++;
            }
        }

        double fraction = successes / 1000.0;
        System.out.println(fraction);
    }
}
