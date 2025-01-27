package JavaCore.ZZAclassesInternas;

public class OUterClassesTeste03 {
    private String nome = "gabriel";
    static class Nested {
        private String nome = "Monkey";
 void print() {
     System.out.println(new OUterClassesTeste03().nome+" "+nome);
 }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
