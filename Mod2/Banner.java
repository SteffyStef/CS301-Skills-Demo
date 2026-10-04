public class Banner {
    public static void main(String[] args) {
        String s = args[0];
        int speed = Integer.parseInt(args[1]);
        StdDraw.setXscale(0.0, 1.0);
        StdDraw.setYscale(0.0, 1.0);
        StdDraw.enableDoubleBuffering();

        double x = 0.0;
        while (true) {
            StdDraw.clear();
            StdDraw.text(x, 0.5, s);
            StdDraw.show();
            StdDraw.pause(speed);
            x += 0.01;
            if (x > 1.0) {
                x = 0.0;
            }
        }
    }
}
