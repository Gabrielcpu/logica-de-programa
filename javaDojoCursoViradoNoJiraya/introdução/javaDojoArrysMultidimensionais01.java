package introdução;

public class javaDojoArrysMultidimensionais01 {
    public static void main(String[] args) {
        //1,2,3,4 meses
        //31,28,31,30 dias
        int[][] dias = new int[2][2];
        dias [0][0] = 30;
        dias [0][1] = 31;
        dias [1][0] = 32;
        dias [1][1] = 33;
        for (int i = 0; i < dias.length ; i++) {
            for (int  j = 0;  j < dias[i].length ;  j++) {
                System.out.println("esse é o numeros dentro da variavel multidimensional "+dias[i][j]);
            }
        }
        System.out.println("--------------------------------------------------------");
        for (int[]arrym :dias){
            for (int num:arrym){
                System.out.println(num);
            }
        }
    }
}
