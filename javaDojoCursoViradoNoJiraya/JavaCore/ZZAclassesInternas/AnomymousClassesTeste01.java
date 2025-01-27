package JavaCore.ZZAclassesInternas;

class Animal {
    public void walk() {
        System.out.println("Animal Walking");
    }
}

public class AnomymousClassesTeste01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Anomymous Walking");
            }
        };
        animal.walk();
    }
}
