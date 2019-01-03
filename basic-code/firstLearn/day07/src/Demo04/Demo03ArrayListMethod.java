package Demo04;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);   //注意事项：对于Arraylist集合来说，直接打印得到的不是地址值，而是内容。如果内容是空，得到的是空的中括号  []

        //向集合当中添加数据，需要用add方法
        list.add("赵丽颖");
        System.out.println(list);  //  [赵丽颖]
        list.add("迪丽热巴");
        list.add("古力娜扎");
        System.out.println(list);  //  [赵丽颖，迪丽热巴，古力娜扎]
        String s = list.get(2);
        System.out.println("get取到的值是：" + s);

        // public E remove(int index)
        String who = list.remove(1);
        System.out.println("被删除的人是：" + who);

        System.out.println(list.size());  //2
    }
}
