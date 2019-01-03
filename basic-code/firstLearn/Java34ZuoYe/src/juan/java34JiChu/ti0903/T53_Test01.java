package juan.java34JiChu.ti0903;

import java.util.ArrayList;

public class T53_Test01 {
    public static void main(String[] args) {
        //  1.实例化3个Stu对象
        T53_Stu stu1= new T53_Stu(9001,55.0);
        T53_Stu stu2= new T53_Stu(9002,66.6);
        T53_Stu stu3= new T53_Stu(9003,77.0);

        //  2.创建一个ArrayList集合，将上面的3个Stu对象添加到集合中
        ArrayList<T53_Stu> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //  3.遍历集合，删除集合中元素的学号为9002的元素，并打印集合中剩余元素的学号和成绩
        System.out.println("不包含学号为9002的集合");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getSnum() == 9002){
                list.remove(i);
            }
            System.out.println("学号：" + list.get(i).getSnum() + "  成绩：" + list.get(i).getScore());
        }
    }
}
