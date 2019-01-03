package juan.java34JiChu.ti0903;

import java.util.ArrayList;

public class T57_Test {
    public static void main(String[] args) {
        //3个Computer对象
        T57_Computer cp1 = new T57_Computer("DELL",6799,"一体机");
        T57_Computer cp2 = new T57_Computer("MacAir", 7488,"颜值担当");
        T57_Computer cp3 = new T57_Computer("MIAir",4288,"轻薄笔记本");

        //将上面的3个Computer对象添加到 list_cp中
        ArrayList<T57_Computer> list_cp = new ArrayList<>();
        list_cp.add(cp1);
        list_cp.add(cp2);
        list_cp.add(cp3);

        //调用filter方法传入list_cp和“Air”，根据返回的list集合输出电脑名称以“Air”结尾的所有元素信息
        ArrayList<T57_Computer> newList = filter(list_cp,"aacAir");
        if(newList.size() != 0){
            for (int i = 0; i < newList.size(); i++) {
                System.out.println("名称：" + newList.get(i).getName() + "\t\t价格：" + newList.get(i).getPrice() + "\t类型：" + newList.get(i).getType());
            }
        }else {
            System.out.println("无符合条件的值");
        }

    }

    //遍历集合list，将电脑名称是以参数str结尾的元素存入另一个ArrayList<Computer> 中并返回
    public static ArrayList<T57_Computer> filter(ArrayList<T57_Computer> list, String str){
        ArrayList<T57_Computer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            if(name.length() > str.length()){
                name = name.substring( name.length() - str.length() );
            }

            if(str.equals(name)){
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
