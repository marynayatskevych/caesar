public class EncryptConsole {
    public void run() {
        ConsoleReader consoleReader = new ConsoleReader();
        CaesarCipher cipher = new CaesarCipher();

        String input = consoleReader.readLine("Enter text for encrypt ");
        int key = consoleReader.readInt("Enter key: ");

        String encrypted = cipher.encrypt(input, key);
        System.out.println("Encrypted text:");
        System.out.println(encrypted);
    }
}
