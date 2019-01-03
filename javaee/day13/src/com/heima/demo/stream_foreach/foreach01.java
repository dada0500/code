package com.heima.demo.stream_foreach;

import java.util.Arrays;
import java.util.stream.Stream;

public class foreach01 {
    public static void main (String[] args) {
//        Stream<String> s1 = Stream.of (11, 22, 33);
//        s1.forEach (s-> System.out.println (s = s +1));


//        Stream.of(11,22,33).forEach (s->System.out.println (s));

        Integer[] arr = {11, 22, 33};
        Stream<Integer> s2 = Stream.of (arr);
//        s2.forEach (s->System.out.println (s += 1));
        s2.map ((n)->n+=3).forEach (System.out::println);
        System.out.println ("s2:" +s2);
        System.out.println (Arrays.toString (arr));


    }
}
