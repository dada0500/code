package extends1.extends4;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String args[]) {
//不兼容的类型        Manager m = new Employee();
        ArrayList<String> li  = new ArrayList<String>();
//        li.add("法国队");li.add("巴西队");li.add("西班牙队");li.add("德国队");
/*        Collections.addAll(list,"java","php","java","IOS","java");
        for (int i = list.size() ; i > 0; i--) {
            list.remove("java");
        }*/
//li.add(123);
//li.set(3,"比利时");
//        System.out.println(li.get(2));
        System.out.println("itheima".substring(1,2).toUpperCase());
//
    }
}
