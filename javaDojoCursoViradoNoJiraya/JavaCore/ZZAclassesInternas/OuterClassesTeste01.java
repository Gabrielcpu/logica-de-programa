package JavaCore.ZZAclassesInternas;

public class OuterClassesTeste01 {
    private String nome = "Monkey D.Luffy";

    class inner {
        public void printOuterClassesAttributes() {
            System.out.println(nome);
            System.out.println(OuterClassesTeste01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTeste01 outerClasses = new OuterClassesTeste01();
       inner inner = outerClasses.new inner();
        inner inner1 = new OuterClassesTeste01().new inner();
       inner.printOuterClassesAttributes();
       inner1.printOuterClassesAttributes();
    }
}
