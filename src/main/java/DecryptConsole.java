public class DecryptConsole {
    public void run() {
        ConsoleReader reader = new ConsoleReader();
        CaesarCipher cipher = new CaesarCipher();

        String text = reader.readLine("Enter encrypt text: ");
        int key = reader.readInt("Enter key: ");
        String result = cipher.encrypt(text, 26 - (key % 26));

        System.out.println("Decrypt text:");
        System.out.println(result);
    }
}
