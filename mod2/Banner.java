public class Banner {
    public static void main(String[] args) {
        String s = args[0];
        double speed = Double.parseDouble(args[1]);

        double pos = 0.0;
        while (true){
            StdDraw.clear();
            StdDraw.text(pos, 0.5, s);
            StdDraw.show();
            StdDraw.pause(1);

            pos += 0.01 * speed;

            if (pos > 1.0){
                pos = 0.0;
            }
        }
    }
}
