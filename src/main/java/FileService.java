import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileService {

    public String readText(String filePath) throws IOException {
        Path path = Path.of(filePath).normalize().toAbsolutePath();
        return Files.readString(path);
    }

    public void writeText(String originalPath, String content, String suffix) throws IOException {
        Path original = Path.of(originalPath).normalize().toAbsolutePath();
        String newFilePath = createNewFilePath(original, suffix);

        Files.writeString(Path.of(newFilePath), content);
        System.out.println("Result was written to file: " + newFilePath);
    }

    private String createNewFilePath(Path originalFile, String suffix) {
        String fullFileName = originalFile.getFileName().toString();
        String folderPath = originalFile.getParent().toString();
        int dotIndex = fullFileName.lastIndexOf(".");
        String nameWithoutExtension;
        String extension;

        if (dotIndex != -1) {
            nameWithoutExtension = fullFileName.substring(0, dotIndex);
            extension = fullFileName.substring(dotIndex);
        } else {
            nameWithoutExtension = fullFileName;
            extension = ".txt";
        }

        if (nameWithoutExtension.contains("[ENCRYPTED]") && suffix.equals("[DECRYPTED]")) {
            nameWithoutExtension = nameWithoutExtension.replace("[ENCRYPTED]", "");
        }

        String newFileName = nameWithoutExtension + suffix + extension;
        return folderPath + "/" + newFileName;
    }
}
