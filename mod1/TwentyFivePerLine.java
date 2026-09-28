public class TwentyFivePerLine {
    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++){
            if ((i+1)%25 == 0){
                System.out.println(" " + i);
            }else{
                System.out.print(" " + i);
            }
        }
    }
}
