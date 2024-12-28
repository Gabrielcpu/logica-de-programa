package introdução;

public class javaDojoArrysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arry =new int[4][];
        arry[0] = new int [2];
        arry[1] = new int [3];
        arry[2] = new int [4];
        arry[3] = new int [6];

        int [][] arryint = {{1,2,},{1,2,3},{1,2,3,4},{1,2,3,4,5,6}};

        for (int[] arryBase:arryint){
            System.out.println("\n------");
            for (int num:arryBase){
                System.out.print(num+"  ");
            }

        }
    }
}
