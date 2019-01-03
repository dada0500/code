package com.heima.demolist;

public interface tInterface {
    public abstract void nn();
    public abstract void mm();

    default void aa(){
        System.out.println ("default");
    }

   public static  void ss(){
        System.out.println ("static");
    }

   private static  void ps(){
        System.out.println ("static");
    }

    private void pr(){
        System.out.println ("private");
    }


}
