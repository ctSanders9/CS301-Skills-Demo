public class ReverseString {
    public static void main(String[] args) {
        String reverseThis = args[0];
        System.out.println(reverse(reverseThis));
    }
    public static String reverse(String reverseThis){
        if (reverseThis.isEmpty()){
            return "";
        }
        return (reverseThis.substring(reverseThis.length() - 1) + reverse(reverseThis.substring(0, reverseThis.length()-1)));
    }
}
