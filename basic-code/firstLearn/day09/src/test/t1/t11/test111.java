package t11;


import java.util.ArrayList;

public class test111 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("1");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).length());
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()>1) {
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}
