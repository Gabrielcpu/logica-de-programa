package JavaCore.ZZEStreams.Teste;

import JavaCore.ZZEStreams.Dominio.Category;
import JavaCore.ZZEStreams.Dominio.LightNovel;
import JavaCore.ZZEStreams.Dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class StreamTeste16 {


    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamINterate(num);
        sumParallelStreamINterate(num);
        sumLongStreamINterate(num);
        sumParallelLongStreamINterate(num);
    }
    private static void  sumFor(long num){
        System.out.println("sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <=num; i++){
            result+= i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result+ " "+(end - init) +"ms");
    }

    private static void  sumStreamINterate(long num){
        System.out.println("sum StreamINterate");
        long init = System.currentTimeMillis();
       long result = Stream.iterate(1L,i-> i + 1).limit(num).reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+ " "+(end - init) +"ms");
    }
    //[1,2,3,4,5,6,7,8,9,0,]
    //1 - 1-5
    //2 - 6-0
    private static void  sumParallelStreamINterate(long num){
        System.out.println("sum ParallelStreamINterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L,i-> i + 1).limit(num).parallel().reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+ " "+(end - init) +"ms");
    }
    private static void  sumLongStreamINterate(long num){
        System.out.println("sum LongStreamINterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L,num).reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+ " "+(end - init) +"ms");
    }
    private static void  sumParallelLongStreamINterate(long num){
        System.out.println("sum ParallelLongStreamINterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L,num).parallel().reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+ " "+(end - init) +"ms");
    }
}
