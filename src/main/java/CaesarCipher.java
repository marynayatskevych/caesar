public class CaesarCipher {
    public String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                char newChar = (char) ('A' + (ch - 'A' + key) % 26);
                result.append(newChar);
            } else if (ch >= 'a' && ch <= 'z') {
                char newChar = (char) ('a' + (ch - 'a' + key) % 26);
                result.append(newChar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
