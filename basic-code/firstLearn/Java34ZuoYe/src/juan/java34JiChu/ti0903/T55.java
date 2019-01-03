package juan.java34JiChu.ti0903;

import java.util.ArrayList;

public class T55 {
    public static void main(String[] args) {
        //2.1 实例化2个Stu对象stu1和stu2，2个对象的属性分别为：”Jack”, 27、”Tom”,31
        Stu st1 = new Stu("Jack", 27);
        Stu st2 = new Stu("Tom", 31);


        //2.2	创建一个ArrayList集合，分别将上面的2个Stu对象添加到集合中
        ArrayList<Stu>  list = new ArrayList<>();
        list.add(st1);
        list.add(st2);

        //2.3	实例化1个Stu对象stu3，对应的属性为：”Rose”, 29
        Stu st3 = new Stu("Rose", 29);

        //	2.4	将stu3替换集合中年龄属性大于stu3年龄的元素，全部替换完后，并将集合中所有元素在控制台打印输出
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge() > st3.getAge()){
                list.set(i,st3);
            }
            System.out.println("姓名：" + list.get(i).getName() + "  年龄：" + list.get(i).getAge());
        }
    }

}