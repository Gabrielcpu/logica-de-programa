package JavaCore.ZZAclassesInternas;

public class OuterClassesTeste02 {
    private String nome = "Midorya";

    void print(final String param) {
        final String lastName = "Izuku";


        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(nome+ " "+lastName);
            }
        }
       new LocalClass().printLocal();

    }

    public static void main(String[] args) {
        OuterClassesTeste02 oter = new OuterClassesTeste02();
        oter.print("");
    }
}
