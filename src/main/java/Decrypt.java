import java.io.IOException;

public class Decrypt {
    public void run(String filePath, int key) {
        FileService fileService = new FileService();

        try {
            String encryptedText = fileService.readText(filePath);
            String decryptedText = decryptText(encryptedText, key);
            fileService.writeText(filePath, decryptedText, "[DECRYPTED]");
        } catch (IOException e) {
            System.out.println("Error during working the filw" + e.getMessage());
        }
    }

    private String decryptText(String text, int key) {
        return encryptText(text, 26 - (key % 26));
    }

    private String encryptText(String text, int key) {
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) ('A' + (ch - 'A' + key) % 26));
            } else if (ch >= 'a' && ch <= 'z') {
                result.append((char) ('a' + (ch - 'a' + key) % 26));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
