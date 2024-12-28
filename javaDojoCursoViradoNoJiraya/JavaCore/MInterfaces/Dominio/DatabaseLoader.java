package JavaCore.MInterfaces.Dominio;

public class DatabaseLoader implements Dataloader , DataRomover{
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("carregando dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("checando permissão no bando de dados");
    }

    @Override
    public void remover() {
        System.out.println("removendo dados do banco de dados");
    }

    public static  void retrieveMadataSiz(){
        System.out.println("dentro do retrieveMaxDataSize na classe Data base loader");
    }
}
