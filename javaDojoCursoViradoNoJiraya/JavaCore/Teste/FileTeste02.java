package JavaCore.Teste;

import java.io.File;
import java.io.IOException;

public class FileTeste02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);
     File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
     boolean isFileCread = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCread);

        File fileRename = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRename = fileArquivoDiretorio.renameTo(fileRename);
        System.out.println(isRename);

        File diretorioRenamed = new File("Pasta2");
        boolean isDiretorioRenameado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenameado);
    }
}
