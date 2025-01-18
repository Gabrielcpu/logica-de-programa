package JavaCore.WNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Pathteste02 {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws IOException {
        Path pastaPath= Paths.get("pasta");
        if (Files.notExists(pastaPath)){
        Path pastaDirectories = Files.createDirectories(pastaPath);
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }
        Path sourc = filePath;
        Path target = Paths.get(filePath.getParent().toString(),"file_renamed.txt");
        Files.copy(sourc,target, StandardCopyOption.REPLACE_EXISTING);

    }
}
