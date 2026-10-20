public class Once {
    public static void main(String[] args) {
        String str = args[0];

        for (int i = 0; i < str.length(); i++){
            char checking = str.charAt(i);
            int amount = 0;

            for (int j = 0; j < str.length(); j++) if (str.charAt(j) == checking) amount++;

            if (amount == 1) System.out.println(checking);
        }
    }
}
