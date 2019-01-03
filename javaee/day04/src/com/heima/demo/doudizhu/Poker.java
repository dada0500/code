package com.heima.demo.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Poker {
    //定义牌的集合HashMap.
    public static HashMap<Integer, String> poker = new HashMap<> ();

    public static void main (String[] args) {
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] number = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};


        int index = 0;
        poker.put (index++, "大王");
        poker.put (index++, "小王");

        for (String n : number) {
            for (String c : color) {
                poker.put (index++, n + c);
            }
        }

        System.out.println (poker);

        //取牌的序号另作一集合pokerList
        Set<Integer> pokerSet = poker.keySet ();
        ArrayList<Integer> pokerList = new ArrayList<> ();
        pokerList.addAll (pokerSet);

        System.out.println (pokerList);

        //洗牌。 打乱pokerList元素顺序
        Collections.shuffle (pokerList);

        System.out.println (pokerList);
        //定义4个集合，分别存 底牌 、3位玩家 的牌
        ArrayList<Integer> dipai = new ArrayList<> ();
        ArrayList<Integer> play1 = new ArrayList<> ();
        ArrayList<Integer> play2 = new ArrayList<> ();
        ArrayList<Integer> play3 = new ArrayList<> ();

        //发牌
        for (int i = 0; i < pokerList.size (); i++) {
            index = pokerList.get (i);
            if(i > 50){
                dipai.add (index);
            }else if(i % 3 == 0){
                play1.add (index);
            }else if(i % 3 == 1){
                play2.add (index);
            }else if(i % 3 == 2){
                play3.add (index);
            }
        }

        //排序
        Collections.sort (dipai);
        Collections.sort (play1);
        Collections.sort (play2);
        Collections.sort (play3);

       look(dipai,"底牌");
       look(play1,"曹操");
       look(play2,"周瑜");
       look(play3,"诸葛亮");
    }

    //看牌的方法
    public static void look(ArrayList<Integer> I,String name){
        System.out.print (name + "的牌：");
        for (Integer i : I) {
            System.out.print( poker.get (i) + "  ");
        }
        System.out.println ();
    }
}