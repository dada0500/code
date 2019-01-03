package huigu;

//键盘录入班级学生姓名, 然后完成随机点名的效果

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ti5 {
    public static void main(String[] args) {
        ArrayList<String> list = getName();
        System.out.println(list);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("李一");
//        list.add("李二");
//        list.add("李三");
//        list.add("李四");
//        list.add("李五");
        while (list.size() > 0){
            int index = callName(list);
            System.out.println(list.get(index));
            list.remove(index);
        }
    }

    //创建键盘输入存储姓名的方法
    public static ArrayList<String> getName(){
        //定义ArrayList<String>集合，用来存储姓名
        ArrayList<String> nameList = new ArrayList<>();

        //输入姓名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.next();
        while(!name.equals("over")){
            nameList.add(name);
            name = sc.next();
        }
//        System.out.println("学生总数：" +　nameList.size());
        return nameList;
    }

    //随机点一个姓名的方法
    public static int callName(ArrayList<String> list){
        Random r = new Random();
        int index = r.nextInt(list.size());
//        System.out.println(list.get(index));
        return index;
    }
}
