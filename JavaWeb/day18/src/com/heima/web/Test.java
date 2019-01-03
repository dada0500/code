package com.heima.web;

import com.heima.domain.Cuser;

public class Test {
/*
    public static void main (String[] args) {
        Cuser user = new Cuser ();
        System.out.println ("new user: " + user);
        */
/*user.
        System.out.println (user);*//*

        Cuser b = null;
//        System.out.println (b == null);
//        System.out.println (b == "");
        abc(user);
        abc(b);


        StringBuilder sb = new StringBuilder ("年年有余");
        sb.reverse ();
        System.out.println (sb);
    }
*/

    public Test () {
    }

    public int Test(){
        System.out.println ();
        return 1;
    }
    public static void abc(Object o){
        System.out.println ("abc:"+ o);
        System.out.println (o == null);
        System.out.println (o == "");
        System.out.println ("".equals (o));
        System.out.println ("---");

        int[] arr = {11,22};
    }
}
