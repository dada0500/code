package com.heima.zuoye;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class T12 {

/*    练习十二：HashSet的使用
    十二、双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。（要求同色号码不重复）*/

    public static void main (String[] args) {
        Random r = new Random ();
        LinkedHashSet<Integer> set = new LinkedHashSet<> ();
        while (set.size () < 6){

            set.add (r.nextInt (33) + 1);

        }

        set.add (r.nextInt (16) + 1);

        System.out.println (set);
    }

}
