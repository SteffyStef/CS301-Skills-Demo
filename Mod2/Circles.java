public class Circles {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); //number of circles
        double p = Double.parseDouble(args[1]); //probability of a circle being black
        double min = Double.parseDouble(args[2]); //minimum radius of a circle
        double max = Double.parseDouble(args[3]); //maximum radius of a circle

        for (int i = 0; i < n; i++) {
            double x = Math.random(); //random x coordinate
            double y = Math.random(); //random y coordinate
            double radius = min + Math.random() * (max - min); //random radius

            if (Math.random() < p) {
                StdDraw.setPenColor(StdDraw.BLACK);
            } else {
                StdDraw.setPenColor(StdDraw.WHITE);
            }
            StdDraw.filledCircle(x, y, radius);
        }

    }
}