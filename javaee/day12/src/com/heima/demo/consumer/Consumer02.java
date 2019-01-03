package com.heima.demo.consumer;

import java.util.function.Consumer;

public class Consumer02 {
    public static void main (String[] args) {
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};
        method (arr,
                s -> System.out.print ("姓名： " + s.split (",")[0] + "，"),
                s -> System.out.println("性别： " + s.split (",")[1] )
        );
    }

    public static void method(String[] arr, Consumer<String> con1, Consumer<String> con2){
        for (String s : arr) {
            con1.andThen (con2).accept (s);
        }
    }
}
