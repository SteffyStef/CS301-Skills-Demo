
    import java.util.Random;
    import java.util.Arrays;

    public class SAT {
        public static void main(String[] args) {

            int students = 20000;
            int admitted = 5000;
            double mean = 1200;
            double standardDeviation = 100;

            Random random = new Random();
            double[] scores = new double[students];

            for (int i = 0; i < students; i++) {
                scores[i] = mean + standardDeviation * random.nextGaussian();
            }
            Arrays.sort(scores);

            int cutoffIndex = students - admitted;

            double cutoffScore = scores[cutoffIndex];

            System.out.println("Estimated lowest admitted SAT score: "
                    + Math.ceil(cutoffScore));
        }
    }

