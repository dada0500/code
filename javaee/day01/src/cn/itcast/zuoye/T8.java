package cn.itcast.zuoye;

/*
练习八：System类arraycopy方法的使用
        八、现有一个字符数组{'i','t','c','a','s','a'}，请使用System类中的arraycopy()方法在控制台输出“itcast”。（提示：将[1]号数组元素复制到最后位置并覆盖原有元素。）
*/


public class T8 {
    public static void main (String[] args) {
        char[] ch = {'i','t','c','a','s','a'};

//        char[] newch = ch;

        System.arraycopy (ch,1,ch,ch.length - 1,1);

        System.out.println (ch);
    }
}
