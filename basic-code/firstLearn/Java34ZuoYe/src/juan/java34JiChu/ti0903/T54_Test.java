package juan.java34JiChu.ti0903;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class T54_Test {
    public static void main(String[] args) {
       // 2.1分别实例化三个Soldier对象，三个对象分别为："王小兵" ,25,”打篮球”、"李团长" ,35,”游泳”、"王军长" ,55,”踢足球”;
        T54_Soldier so1 = new T54_Soldier("王小兵",25,"打篮球");
        T54_Soldier so2 = new T54_Soldier("李团长",35,"游泳");
        T54_Soldier so3 = new T54_Soldier("王军长",55,"踢足球");
        
        // 2.2	创建一个ArrayList集合，这个集合里面存储的是Solider类型，分别将上面的三个Solider对象添加到集合中
        ArrayList<T54_Soldier> list = new ArrayList<>();
        list.add(so1);
        list.add(so2);
        list.add(so3);
        
       // 2.3遍历这个集合，在遍历的过程中，如果这个集合里面中有对象的年龄大于40，那么将集合中这个对象的爱好改成”打高尔夫”，然后调用这个对象的show方法展示这个对象所有的属性信息
        System.out.println("年龄大于40的：");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge() > 40){
                list.get(i).setLike("打高尔夫");
                list.get(i).show();
            }
        }

    }
}
