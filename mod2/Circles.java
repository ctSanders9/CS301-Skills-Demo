public class Circles {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        double probability = Double.parseDouble(args[1]);
        double min = Double.parseDouble(args[2]);
        double max = Double.parseDouble(args[3]);

        for (int i = 0; i < num; i++){
            double radius = min + Math.random() * (max - min);

            if (Math.random() < probability){
                StdDraw.setPenColor(StdDraw.BLACK);
            }else{
                StdDraw.setPenColor(StdDraw.WHITE);
            }

            StdDraw.filledCircle(Math.random(), Math.random(), radius);
        }
    }
}
