package JavaCore.WNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAtributesTeste02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/novo_path.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creation time "+creationTime);
        System.out.println("lastModifiedTime time "+lastModifiedTime);
        System.out.println("lastAccessTime time "+lastAccessTime);
        System.out.println("----------------------------------------------");

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationtime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime,newCreationtime,creationTime);

         creationTime = fileAttributeView.readAttributes().creationTime();
         lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
         lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("creation time "+creationTime);
        System.out.println("lastModifiedTime time "+lastModifiedTime);
        System.out.println("lastAccessTime time "+lastAccessTime);
    }
}
