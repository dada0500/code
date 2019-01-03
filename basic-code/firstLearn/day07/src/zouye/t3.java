package zouye;

import java.util.ArrayList;
import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + i + "个字符串：");
            String str = sc.nextLine();
            list.add(str);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
