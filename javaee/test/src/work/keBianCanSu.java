package work;

import java.util.Arrays;

public class keBianCanSu {
    public static void main (String[] args) {
        getNum ();
    }

    static void getNum(int ... a){
        System.out.println (Arrays.toString (a));
    }
}
