public class Partition {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        part(N);
    }
    public static void part(int N){
        partHelp(N, N, "");
    }
    private static void partHelp(int N, int max, String printed){
        if (N == 0){
            System.out.println(printed);
            return;
        }

        for (int i = N; i >= 1; i--){
            if (i <= max){
                String toPrint = "";

                if (printed.isEmpty()){
                    toPrint = "" + i;
                }else{
                    toPrint = printed + " " + i;
                }
                partHelp(N-i, i, toPrint);
            }
        }
    }
}
