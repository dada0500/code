package huigu;

//随机产生10个随机数(1-100)添加到集合中, 并从集合中随机找出一个元素输出在控制台


import java.util.ArrayList;
import java.util.Random;

public class Ti4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getArray();  //生成集合
        System.out.println(list);
        print(list);
    }

    //生成一个集合，存有10个1-100之间的随机数
    public static ArrayList<Integer> getArray(){
        //定义ArrayList集合，存储int数据
        ArrayList<Integer> list = new ArrayList<>();

        //随机生成10个随机数(1-100)添加到集合中
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(100) + 1;
            list.add(num);
        }
        return list;
    }

    //随机输出一个集合中的元素
    public static void print(ArrayList<Integer> list){
        Random r = new Random();
        int index = r.nextInt(list.size());
        System.out.println(list.get(index));
    }

}
