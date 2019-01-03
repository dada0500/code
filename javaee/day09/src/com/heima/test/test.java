package com.heima.test;


import java.util.Arrays;

public class test {
    public static void main (String[] args) {
        System.out.println (Arrays.toString ("\r\n".getBytes ()));
        System.out.println (Arrays.toString ("田".getBytes ()));
//        System.out.println (Objects.toString ( (byte)30000)  );//111010100110000  //00110000
        System.out.println ((char)30000);
        System.out.println ((char)226608);//226608 : 110111010100110000
        System.out.println ((char)95536);//95536 : 010111010100110000
        System.out.println ("----------");
        System.out.println ((char)30001);
        System.out.println ((char)30002);
        System.out.println ((char)30003);
        System.out.println ((char)30004);
        System.out.println ((char)30005);
        System.out.println ((char)30006);
        System.out.println ((char)30007);
        System.out.println ((char)30008);
        System.out.println ((char)30009);
        System.out.println ((char)30010);
/*        由
                甲
        申
                甴
        电
                甶
        男
                甸
        甹
                町*/

//        int t = Integer.parseInt ((int)"田");
//        System.out.println (t);
    }
}
