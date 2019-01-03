package demo7;

import java.util.ArrayList;
import java.util.Random;

public class t06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            list.add(num);
            System.out.print(num + ",  ");
        }
        System.out.println("");
        System.out.println("===================");
        ArrayList<Integer> smallList = getSmallList(list);
        for (int i = 0; i < smallList.size(); i++) {
            System.out.print(smallList.get(i) + ".  ");
        }
    }

//    筛选原集合中的偶数元素，放到小集合当中
//    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}

