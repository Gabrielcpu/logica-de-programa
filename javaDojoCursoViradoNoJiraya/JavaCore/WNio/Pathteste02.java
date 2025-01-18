package JavaCore.WNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathteste02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath= Paths.get("pasta");
        if (Files.notExists(pastaPath)){
        Path pastaDirectories = Files.createDirectories(pastaPath);
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        Path filePathCreated = Files.createFile(filePath);

    }
}
