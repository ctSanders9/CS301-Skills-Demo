public class Stats {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        double[] val = new double[num];

        for (int i = 0; i < num; i++){
            val[i] = StdIn.readDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < num; i++){
            sum += val[i];
        }
        double mean = sum/num;
        System.out.println(mean);

        double sumTwo = 0.0;
        for (int i = 0; i < num; i++){
            double sub = val[i] - mean;
            sumTwo += (sub*sub);
        }
        System.out.println(Math.sqrt(sumTwo/(num-1)));
    }
}
