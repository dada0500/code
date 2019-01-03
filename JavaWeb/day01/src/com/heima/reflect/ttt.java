package com.heima.reflect;

public interface ttt {
    String name = "def";
    void a();
    default void prin(){
        System.out.println ("interface_prin()");
    }
    static void sprin(){
        System.out.println ("interface_static_prin()");
    }

    private void priprin(){
        System.out.println ("interface_private_prin");
    }
}
