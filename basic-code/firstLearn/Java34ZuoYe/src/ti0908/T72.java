package ti0908;


import java.util.Scanner;

/*
 定义一个无返回值的方法，传入一个字符串和一个字符，将该字符在字符串中出现的所有位置打印到控制台上；
2.  在main方法中调用该方法（字符串和字符需要键盘录入,用“,”隔开，然后根据逗号分隔字符串，获取逗号前的字符串和逗号后的字符，调用方法传参）。
PS：如果传入的字符串中没有该字符则输出-1即可
打印格式如下：


 */
public class T72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入格式: 字符串,字符");
        String in = sc.next();
        String[] inSandC = in.split(",");
        char inC = inSandC[1].charAt(0);
        getIndex(inSandC[0],inC);
    }

    public static void getIndex(String str,char ch){
        int i = str.indexOf(ch); //查一次ch在str中存在位置

        if(i == -1){
            System.out.println(ch + "在" + str + "中不存在。" + -1);
        }else{
            System.out.println(ch + "在" + str + "出现的位置有：");
            while(i != -1){
                System.out.print(i + "  ");     //输出索引
                i = str.indexOf(ch,i + 1);  //继续向后查
            }
        }
    }
}
