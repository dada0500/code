package demo7;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class t05 {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        printArrayList(list);

    }

    //定义以指定格式打印集合的方法(ArrayList类型作为参数)
    //	* 使用{}扩起集合，使用@分隔每个元素。
    //	* 格式参照 {元素@元素@元素}。
//    public static void printArrayList(ArrayList<String> list){
    public static void printArrayList(ArrayList list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.print(list.get(i) + "}");
            }else {
                System.out.print(list.get(i) + "@");
            }
        }
    }
}
