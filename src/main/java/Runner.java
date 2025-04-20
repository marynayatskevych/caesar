public class Runner {
    public void run(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java -jar Caesar.jar [ENCRYPT | DECRYPT | ENCRYPT_CONSOLE] ...");
            return;
        }

        String command = args[0].toUpperCase();

        switch (command) {
            case "ENCRYPT_CONSOLE":
                new EncryptConsole().run();
                break;
            case "DECRYPT_CONSOLE":
                new DecryptConsole().run();
                break;
            case "ENCRYPT":
            case "DECRYPT":
                if (args.length < 3) {
                    System.out.println("Usage: java -jar Caesar.jar " + command + " <filePath> <key>");
                    return;
                }

                String filePath = args[1];
                int key;

                try {
                    key = Integer.parseInt(args[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Key must be integer");
                    return;
                }

                if (command.equals("ENCRYPT")) {
                    new Encrypt().run(filePath, key);
                } else {
                    new Decrypt().run(filePath, key);
                }
                break;

            default:
                System.out.println("Unknown command: " + command);
        }
    }
}
