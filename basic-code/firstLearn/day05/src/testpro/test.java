package testpro;

public class test {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        System.out.println(a);
        String s = new String("123");
        String ss = new String("123");
        //引用数据类型 比较相等 用equals比较内容 ==比较地址值
        //基本数据类型 比较相等 用==
        String week = "星期一";
        if(week==("星期一")){
            System.out.println("等于");
        }else{
            System.out.println("不等");
        }

        if(s == ss) {
            System.out.println("s == ss");
        }else {
            System.out.println("s != ss");
        }

        if( s.equals(ss)){
            System.out.println("s  equals  ss ");
        }else {
            System.out.println("s  ! equals  ss ");
        }
    }

}
