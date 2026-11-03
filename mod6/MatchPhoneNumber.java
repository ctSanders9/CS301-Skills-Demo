public class MatchPhoneNumber {
    public static void main(String[] args) {
        String rePhoneNumber = "(\\(\\d{3}\\) )?\\d{3}-\\d{4}";

        String[] phoneNumbers = {
                "(360) 123-4567",
                "123-4567",
                "not a phone number"
        };

        for (String number : phoneNumbers){
            if (number.matches(rePhoneNumber)){
                System.out.println(number + " is a valid number");
            }else{
                System.out.println(number + " is NOT a valid number");
            }
        }

    }
}
