package com.heima.zuoye;

import java.util.HashMap;
import java.util.Map;

public class T7 {
    public static void main (String[] args) {
        /*练习七：Map集合的使用（二）
        七、有2个数组，第一个数组内容为：*/
        String[] sArr1 = {"黑龙江省","浙江省","江西省","广东省","福建省"};
//        第二个数组为：
        String[] sArr2 = {"哈尔滨","杭州","南昌","广州","福州"};

        /*将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
*/

        Map<String,String> map = new HashMap<> ();
        for (int i = 0; i < sArr1.length; i++) {
            map.put (sArr1[i],sArr2[i]);
        }

        System.out.println (map);
    }
}
