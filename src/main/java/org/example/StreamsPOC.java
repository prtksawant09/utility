package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPOC {

    public static void main(String args[]) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        Stream<Integer> stream = list1.stream();
        List<Integer> list2 = stream.filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(list2);
    }

}
