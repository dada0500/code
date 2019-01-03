package test;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        list.add(123);
        System.out.println(list.add("a"));
        System.out.println(list.remove("a"));

        System.out.println("==============");
        String[] strArr1 = {"aaa","bbb","ccc"};
        String[] strArr2 = {"aaa","bbb","ccc"};
        System.out.println(strArr1);
        System.out.println(strArr2);
        if(strArr1 == strArr2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        System.out.println("==============");
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1);
        System.out.println(str2);
        if(str1 == str2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        System.out.println("==============");
//        char data[] = {'a', 'b', 'c'};
        char[] data = {'a', 'b', 'c'};
        int num[] = {1,2,3};
        String str = new String(data);
        System.out.println(str);
        System.out.println(num);
    }
}
