package com.heima.zuoye;

import com.heima.zuoye.lei.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        System.out.println("查询字符串在集合中出现次数：");
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a","b","c","a","b","a");
        String s = "a";

        int listCount = ListCount(collection, s);
        if (listCount == -1) {
            System.out.println("参数错误");
        }
        System.out.println(listCount);

        System.out.println("------------------------------------------------");

        System.out.println("数组转集合：");

        int[] arr = {2,3,4,5};

        Collection<Integer> coll = arrToColl(arr);

        System.out.println(coll);

        System.out.println();

        System.out.println("------------------------------------------------");

        System.out.println("集合转数组：");

        Object[] objects = collToArr(coll);

        for (Object object : objects) {
            System.out.print(object + " ");
        }

        System.out.println("------------------------------------------------");

        System.out.println("判断集合中包含字符串：");

        ArrayList<String> arrList = new ArrayList<>();

        Collections.addAll(arrList,"a","b","c","a","b","a");

        boolean contains = contains(arrList, s);

        System.out.println(contains);

        System.out.println("------------------------------------------------");

        System.out.println("判断集合中是否有元素：");

        boolean empty = isEmpty(arrList);

        System.out.println(empty);

        System.out.println("------------------------------------------------");

        System.out.println("迭代器的实现原理：");

        System.out.println("hasnext()是判断语句，表示集合中元素是否遍历完 ");

        System.out.println("next()相当于指针，返回Object对象，需要强转为需要的类型 ");

        System.out.println("总结：每个集合类内部都含有一个内部类，用来实现Iterator接口。" +
                "集合类的iterator方法就是在获取内部类对象（迭代器对象），" +
                "然后通过该对象调用hashNext和next方法实现遍历。");


        System.out.println("------------------------------------------------");

        System.out.println("判断在集合中元素第一次出现的索引位置：");

        ArrayList<Integer> arrI = new ArrayList<>();

        Collections.addAll(arrI,1,2,3,4);

        int index = getIndex(arrI, 2);

        System.out.println(index);

        System.out.println("------------------------------------------------");

        System.out.println("Collection集合练习：");

        ArrayList<Student> students = getList();

        print(students);

        System.out.println("--------->>>>>>>>>");

        objectList(students);

        System.out.println("------------------------------------------------");

        System.out.println("随机10个数字存到集合练习：");
        int[] ints = getArr();

        writeToList(ints);


        System.out.println("------------------------------------------------");

        System.out.println("自定义泛型方法交换数组元素位置：");

        Integer[] arrs = {1,2,3,4};
        swap(arrs,2,3);

        System.out.println("------------------------------------------------");

        System.out.println("自定义泛型方法反转数组元素位置：");

        Integer[] arrss = {1,2,3,4,5};

        //方法1
        //reverse(arrss);
        //方法2
        reverseTwo(arrss);





    }
    /**
     * 练习二：Collection集合统计元素出现次数
     */

    public static int ListCount(Collection<String> collection,String s) {
        int count = 0;
        if (collection.isEmpty() || s == null || "".equals(s)) {
            count = -1;
            return count;
        }

        for (String string : collection) {
            if (string.equals(s)) {
                count++;
            }
        }

        return count;
    }
    /**
     * 定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。
     */

    public static Collection<Integer> arrToColl(int[] arr) {
        Collection<Integer> collection = new ArrayList<>();
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                collection.add(arr[i]);
            }
            return collection;
        }
        return null;
    }

    /**
     * 四、定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，并将结果输出在控制台。
     * （可以使用Object[]数组类型接收转换的数组）
     */

    public static Object[] collToArr(Collection<Integer> collection) {
        Object[] obj = null;

        if (collection.isEmpty()) {
            return obj;
        }
        obj = collection.toArray();
        return obj;
    }

    /**
     * 五、定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。
     */

    public static boolean contains(ArrayList<String> arr, String s) {

        if (arr.isEmpty() || s == null || "".equals(s)) {
            return false;
        }
        return arr.contains(s);

    }

    /**
     * 六、定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。
     */

    public static boolean isEmpty(ArrayList<String> arr) {
        return arr.isEmpty();
    }

    /**
     * 八、定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
     */

    public static int getIndex(ArrayList<Integer> arr, Integer s) {
        int result = -1;
        if (arr.isEmpty()) {
            result = -2;
            return result;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (s == arr.get(i)) {
                result = i;
                return result;
            }
        }
        return result;
    }

    /**
     * 九、复杂，并不难)定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
     * A：遍历集合遍历输出。
     * B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
     */
    //获取一个集合
    public static ArrayList<Student> getList() {
        ArrayList<Student> arr = new ArrayList<>();

        Student xxx = new Student("xxx",18,"男");
        Student yyy = new Student("yyy",19,"男");
        Student zzz = new Student("zzz",20,"女");

        arr.add(xxx);
        arr.add(yyy);
        arr.add(zzz);

        return arr;
    }

    /**
     * 判断最大年龄，然后获取索引，更改name
     * @param arr
     */
    public static void objectList(ArrayList<Student> arr) {

        int age = 0;
        int index = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getAge() > age) {
                //给索引赋值
                index = i;
                //给年龄赋值
                age = arr.get(i).getAge();
            }
        }
        System.out.println("最大年龄是："+age);

        //将名字改成小猪佩奇
        arr.get(index).setName("小猪佩奇");
        System.out.println(arr.get(index));
    }


    /**
     * 打印集合
     * @param arr
     */
    public static void print(ArrayList<Student> arr){
        for (Student student : arr) {
            System.out.println(student);
        }
    }

    /**
     * 十、产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
     */
    public static int[] getArr() {
        //首先定义一个长度为10的数组
        int[] arr = new int[10];

        //开始生成随机数
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1; //生成的就是0~100之间的随机数，包含0和100 所以+1
        }

        return arr;
    }

    public static void writeToList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10) {
                list.add(arr[i]);
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    /**
     * 十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
     */
    public static <E> void swap(E[] e,int a,int b ) {
        //也就是将任意一个值给第三方元素，然后交换
        E emp = e[a];  //将e[a] 赋值 给 emp
        e[a] = e[b];  //将e[b] 赋值给 e[a]
        e[b] = emp;   //将emp 赋值给 e[b]

        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i]+" ");
        }
    }

    /**
     * 十二、编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
     *
     * for语句里面可以定义多个变量，但是必须是同型的
     */
    //方法1
    public static <E> void reverse(E[] e) {
        for (int min = 0,max = e.length - 1;min < max;min++,max--) {
            E temp = e[min];
            e[min] = e[max];
            e[max] = temp;
        }
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i]+" ");
        }
    }
    //方法2
    public static <E> void reverseTwo(E[] e) {

        int start = 0;
        int end = e.length-1;

        while (true) {
            if (start >= end) {
                break;
            }
            E temp = e[start];
            e[start] = e[end];
            e[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i]+" ");
        }

    }

}
