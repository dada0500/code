package cn.itcast.test;

public class Test_S {
    public static void main (String[] args) {
        char a = 'a';
        String s = "a";
        System.out.println (s.equals (a));

        String s1 = "ab";
//        String s3 = s1 + "c";
        String s2 = "abc";
        String s3 = s1;
        s3 = s3 + "c";
        System.out.println(s3 == s2); 		// false
        System.out.println(s3.equals(s2)); 	// true

    }
}
