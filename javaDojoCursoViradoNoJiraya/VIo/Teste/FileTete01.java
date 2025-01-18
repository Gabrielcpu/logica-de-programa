package JavaCore.Teste;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTete01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
          //  boolean isDeleted = file.delete();
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println("path "+file.getPath());
            System.out.println("path absolute "+file.getAbsolutePath());
            System.out.println("is directory "+file.isDirectory());
            System.out.println("is file "+file.isFile());
            System.out.println("is hidden "+file.isHidden());
            System.out.println("is modifified "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if (exists){
                System.out.println("Deleted "+file.delete());
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
