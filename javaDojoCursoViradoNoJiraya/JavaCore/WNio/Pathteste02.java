package JavaCore.WNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathteste02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath= Paths.get("pasta1");
        Path pastaDirectories = Files.createDirectories(pastaPath);

    }
}
