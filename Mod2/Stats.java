public class Stats {
    public static void main (String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] values = new double[n];
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            values[i] = StdIn.readDouble();
            sum += values[i];
        }

        double mean = sum / n;
        double sumSquaredDiffs = 0.0;

        for (int i = 0; i < n; i++) {
            double diff = values[i] - mean;
            sumSquaredDiffs += diff * diff;
        }
        double stdDev = Math.sqrt(sumSquaredDiffs / (n - 1));

        System.out.println("Mean: " + mean);
        System.out.println("Sample standard Deviation: " + stdDev);
    }
}
