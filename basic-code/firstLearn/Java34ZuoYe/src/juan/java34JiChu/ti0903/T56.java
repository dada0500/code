package juan.java34JiChu.ti0903;

import java.util.ArrayList;

public class T56 {
    public static void main(String[] args) {
/*        1)	根据以下内容创建并初始化3个Student对象
                ("张三",17,"男")
                ("李四",18,"女")
                ("王五",17,"男")
        2)	创建一个ArrayList<Student> list，将上面的3个Student对象添加到list中，调用filter方法传入list和”男”，
  */
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",17,"男");
        Student stu2 = new Student("李四",18,"女");
        Student stu3 = new Student("王五",17,"男");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //根据返回的list集合输出所有元素信息
        System.out.println("返回的list集合中所有元素信息：");
        ArrayList<Student> newList = filter(list, "男");
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i).getName() + "  " + newList.get(i).getAge() + "  " + newList.get(i).getGender());
        }
    }
    //1)	遍历list集合，将list中性别与参数gender相同的元素存入到另一个ArrayList<Student> 中并返回
    public static ArrayList<Student> filter(ArrayList<Student> list, String gender) {
        ArrayList<Student> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(gender.equals(list.get(i).getGender())){
                newList.add(list.get(i));
            }
        }
        return newList;
    }

}
