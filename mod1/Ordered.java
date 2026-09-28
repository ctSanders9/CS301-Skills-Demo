public class Ordered {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        Boolean b = false;

        if (x < y && y < z) {
            b = true;
        }else if(x > y && y > z){
            b = true;
        }

        System.out.println(b);
    }
}
