package JavaCore.PWrappers.Teste;

public class WrappersTeste01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shotP = 1;
        int intP = 1;
        long longP = 1;
        float floatP = 1;
        double dobleP = 1;
        char charP = 'W';
        boolean booleanP = false;


        Byte bytew = 1;
        Short shotw = 1;
        Integer intw = 1;  //autoboxing
        Long longw = 1L;
        Float floatw = 1F;
        Double doblew = 1D;
        Character charw = 'W';
        Boolean booleanw = false;

        int i = intw; //unboxing

        Integer intw2 = Integer.parseInt("1");
        Boolean booleanw2 = Boolean.parseBoolean("true");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('A'));
        System.out.println(Character.toLowerCase('A'));
    }
}
