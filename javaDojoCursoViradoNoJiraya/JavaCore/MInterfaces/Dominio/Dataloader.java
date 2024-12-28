package JavaCore.MInterfaces.Dominio;

public interface Dataloader {
    public static  final  int MAX_DATA_SIZE = 10;
    void load();
    default  void checkPermission(){
        System.out.println("fazendo checagem de Permissão");
    }

    public static  void retrieveMadataSiz(){
        System.out.println("dentro do retrieveMaxDataSize na interface");
    }
}
