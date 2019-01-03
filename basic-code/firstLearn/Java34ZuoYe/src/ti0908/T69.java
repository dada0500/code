package ti0908;

import java.util.ArrayList;

/*
69、定义一个方法，方法可以接收一个字符串数组，返回一个集合。在方法内部创建一个集合，遍历数组，并判断数组中每一个元素的长度，将长度为奇数的元素添加到集合左边，长度为偶数的元素添加到集合右边，最终将这个集合返回。
        在main方法定义字符串数组：{"12","345","6789","1","123","4567"}，调用方法得到返回值，并遍历打印返回的集合元素。
*/



public class T69 {
    public static void main(String[] args) {
        String[] strArr = {"12","345","6789","1","123","4567"};
        ArrayList<String> list = getList(strArr);
            System.out.println(list);
    }

    public static ArrayList<String> getList(String[] strArr){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].length() % 2 != 0){
                list.add(0,strArr[i]);
            }else{
                list.add(strArr[i]);
            }
        }
        return list;
    }
}
