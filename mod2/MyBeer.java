public class MyBeer {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int wins = 0;

        for (int i = 0; i < 1000; i++){
            int[] beers = new int[n];

            for (int student = 0; student < n; student++){
                beers[student] = student;
            }

            for (int j = 0; j < n; j++){
                int rand = (int) (Math.random() * n);

                int swap = beers[j];
                beers[j] = beers[rand];
                beers[rand] = swap;
            }

            boolean beerGet = false;
             for (int j = 0; j < n; j++){
                 if (beers[j] == j){
                     beerGet = true;
                     break;
                 }
             }
             if (beerGet){
                 wins++;
             }
        }

        System.out.println((double) wins/1000);
    }
}
