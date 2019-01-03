package demo01;

public class Demo01String {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        System.out.println(str1 == str2);   //true
        System.out.println(str1.length());
        String str = null;
        System.out.println("abc".equals(str));  //推荐常量写在前面。会输出结果为false
        System.out.println(str.equals("abc"));  //不推荐。报错，空指针异常NullPointerException


/*
        byte[] byteArray = {97,98,99};
        String str1 = new String(byteArray);
        System.out.println("输出 byte 97 98 99 :  " + byteArray);
        System.out.println("输出str1 :  " + str1);

//        byte[] b2 = {0x0011,0x0022,0x0033};
        byte[] b2 = {48,49,50};
        String str2 = new String(b2);
//        System.out.println("输出 byte 0x0011,0x0022,0x0033 :　" + b2);
        System.out.println("输出 byte 22909,22909,22909 :　" + b2);
        System.out.println("输出str2 :　" + str2);
*/

//        char a = 'a';
//        System.out.println(a + 0);


    }
}
