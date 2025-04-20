import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    private final BufferedReader reader;

    public ConsoleReader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readLine(String prompt) {
        System.out.print(prompt);
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("Error during reading " + e.getMessage());
            return "";
        }
    }

    public int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                String line = reader.readLine();
                return Integer.parseInt(line);
            } catch (IOException e) {
                System.out.println("Error during reading " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Enter integer number");
            }
        }
    }
}
