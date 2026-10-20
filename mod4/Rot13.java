public class Rot13 {
    public static void main(String[] args) {
        String str = args[0];
        String encrypted = "";

        char[] alphabet = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        char[] upperAlphabet = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean found = false;

            for (int j = 0; j < 26; j++) {
                if (current == alphabet[j]) {
                    int index = (j + 13) % 26;
                    current = alphabet[index];
                    found = true;
                    break;
                }

                if (current == upperAlphabet[j]) {
                    int index = (j + 13) % 26;
                    current = upperAlphabet[index];
                    found = true;
                    break;
                }
            }

            encrypted += current;
        }

        System.out.println(encrypted);
    }
}
