package JavaCore.MInterfaces.Teste;

import JavaCore.MInterfaces.Dominio.DatabaseLoader;
import JavaCore.MInterfaces.Dominio.Dataloader;
import JavaCore.MInterfaces.Dominio.FileLoader;

public class DataLoaderteste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader= new FileLoader();
        databaseLoader.load();;
        fileLoader.load();

        databaseLoader.remover();;
        fileLoader.remover();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        Dataloader.retrieveMadataSiz();
        DatabaseLoader.retrieveMadataSiz();
    }
}
