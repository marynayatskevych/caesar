import java.io.IOException;

public class Encrypt {
    public void run(String filePath, int key) {
        FileService fileService = new FileService();
        CaesarCipher cipher = new CaesarCipher();

        try {
            String content = fileService.readText(filePath);
            String encrypted = cipher.encrypt(content, key);
            fileService.writeText(filePath, encrypted, "[ENCRYPTED]");
        } catch (IOException e) {
            System.out.println("Error during the file work" + e.getMessage());
        }
    }
}


