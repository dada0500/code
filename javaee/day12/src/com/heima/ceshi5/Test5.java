package com.heima.ceshi5;

import java.util.ArrayList;
import java.util.Random;

/*
    十二、双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
            红色球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。（要求同色号码不重复）

 */
public class Test5 {
    public static void main (String[] args) {
        ArrayList<Integer> red = new ArrayList<> ();
        ArrayList<Integer> result = new ArrayList<> ();

        Random r = new Random ();
        for (int i = 0; i < 6; i++) {
            red.add (r.nextInt (33) + 1);
        }

        int blue = r.nextInt (16) + 1;

        result.addAll (red);
        result.add(blue);
        System.out.println (red);
        System.out.println (blue);
        System.out.println (result);
    }
}
