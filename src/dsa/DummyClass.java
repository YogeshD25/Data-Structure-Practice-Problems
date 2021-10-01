package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DummyClass {

    public static void main(String args[]) {

        System.out.println(System.currentTimeMillis());
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.stream().filter(a -> a % 2 == 0).forEach(System.out::println);


        System.out.println(list.stream().filter(a -> a % 2 == 0).map(x->String.valueOf(x)).collect(Collectors.toList()));
        System.out.println(System.currentTimeMillis());

        int[] arr = {5,8,1,0,6,9,1,1,1,1,1,1,1,1,1,212312,31,23,213,213,12,31,23,12,31,23,12,3,123,12,31,23,12,31,23,12,31,23,123,12,3};
        System.out.println("-------------------");

        System.out.println(System.currentTimeMillis());
        Arrays.sort(arr);
        System.out.println(System.currentTimeMillis());

        System.out.println("-------------------||||");
        System.out.println(System.currentTimeMillis());
        Arrays.parallelSort(arr);
        System.out.println(System.currentTimeMillis());

    }
}
