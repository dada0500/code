package zouye;

import java.util.ArrayList;

public class t4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("def");
        list.add("ghi");
        list.add("def");
        list.add("hij");
        list.add("jkol");
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("def")){
                count++;
//                list.remove(i);
            }
        }

        for (int i = 0; i < count; i++) {
            list.remove("def");
        }

        //删除"def"后的集合元素：
        System.out.println("删除\"def\"后的集合元素：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }

    }
}
