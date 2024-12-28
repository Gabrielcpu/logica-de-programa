package JavaCore.MInterfaces.Dominio;

public class FileLoader implements  Dataloader , DataRomover {
    @Override
    public void load() {
        System.out.println("carregando dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("checando permissão no arquivo");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados de um arquivo.");
    }
    public static  void retrieveMadataSiz(){
        System.out.println("dentro do retrieveMaxDataSize na interface");
    }
}
