package JavaCore.WNio;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTeste01 {
    public static void main(String[] args) {
        Path arquivozip = Paths.get("pasta/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta/subPasta1/subsubPasta1");
        zip(arquivozip,arquivosParaZipar);
    }
    private static void zip (Path arquivozip,Path arquivoParaZipar){
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivozip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivoParaZipar)){
            for (Path file : directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file,zipStream);
                zipStream.closeEntry();
            }
            System.out.println("arquivo criado com sucesso");
        }catch (IOException e ){
            e.printStackTrace();
        }

    }
}
