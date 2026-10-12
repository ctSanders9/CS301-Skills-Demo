import java.util.Arrays;

public class SAT {
    public static void main(String[] args) {
        double[] scores = new double[20000];

        for (int i = 0; i < 20000; i++){
            scores[i] = StdRandom.gaussian(1200, 100);
        }

        Arrays.sort(scores);
        System.out.println("Lowest score: " + scores[15000]);
    }
}
