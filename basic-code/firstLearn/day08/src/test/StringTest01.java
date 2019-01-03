package test;

public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2 + "c";      //abc
        String s4 = s2 + "c";
        String s5 = s1 + s2;
        String s6 = s1 + s2;

        System.out.println(s1);
        System.out.println(s1 == s3);
        System.out.println(s3);
        System.out.println(s1 == s4);
        System.out.println(s4);
        System.out.println(s3 == s4);
        System.out.println("s5:" + s5);
        System.out.println("s6:" + s6);
        System.out.println(s5 == s6);
    }
}
