package zuoye;

import java.util.Random;


/*
定义String getStr()方法
        功能描述：
        获取长度为5的随机字符串
        字符串由随机的4个大写英文字母和1个0-9之间(包含0和9)的整数组成
        英文字母和数字的顺序是随机的
*/


//  48 - 57  0-9
//  65 - 90  A-Z
//  97 - 122 a-z
public class T3 {
    public static void main(String[] args) {
        System.out.println(getStr());
    }

    public static String getStr(){
        byte[] chars = new byte[5];

        //字符串前几位 赋值为 随机 大写字母 65 - 90  A-Z
        Random r = new Random();
        int numIndex = r.nextInt(5);    //随机出数字所在位置
        for (int i = 0; i < chars.length; i++) {
            if(i == numIndex){
                //字符串随机一位 赋值为 随机数字 48 - 57  0-9
                chars[numIndex] = (byte)(r.nextInt(10) + 48);
            }else {
                chars[i] = (byte) (r.nextInt(26) + 65);
            }
        }

        //将生成的随机字符定义 为 字符串
        String str = new String(chars);
        return str;
    }
}
