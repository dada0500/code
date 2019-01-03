package com.heima.zuoye;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class T {
    public static void main (String[] args) throws IOException {
//        BufferedOut();
//        bufferTest4 ();
//        outputStreamWriter();
//        inputStreamReader ();
        printSteam ();
    }

    public static void BufferedOut() throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream (new FileOutputStream ("day10\\Tout.txt"));

        bos.write ("I Love Java".getBytes ());
        bos.write ("97".getBytes ());

        bos.close ();

    }
//    练习三:高效流文件复制
    public static void BufferedCopy() throws IOException {
        BufferedInputStream bis = new BufferedInputStream (new FileInputStream ("day10\\Tout.txt"));
        BufferedOutputStream bos = new BufferedOutputStream (new FileOutputStream ("day10\\Tcopy.txt"));

        byte[] bys = new byte[8192];
        int len = -1;
        while ((len = bis.read (bys)) != -1){
            bos.write (bys,0,len);
        }

        int i = -1;
        while ((i = bis.read ()) != -1){
            bos.write (i);
        }

        bos.close ();
        bis.close ();
    }

/*

    练习四:高效字符流和集合的综合使用
    描述:
    分析以下需求，并用代码实现
    实现一个验证码小程序，要求如下：
            1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
            2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败
*/
//练习四:高效字符流和集合的综合使用
    public static void bufferTest4 () throws IOException {
//        BufferedReader br = new BufferedReader (new FileReader ("day10\\src\\com\\heima\\zuoye\\data.txt"));
        BufferedWriter bw = new BufferedWriter (new FileWriter ("day10\\src\\com\\heima\\zuoye\\data.txt"));
        ArrayList<String> list = new ArrayList<> ();
        String inStr;   //接收键盘输入的字符串
        Scanner sc = new Scanner (System.in);
        System.out.println ("存入3个验证码：");
        for (int i = 0; i < 3; i++) {
            inStr = sc.nextLine ();
            list.add (inStr);
            bw.write (inStr);
            bw.newLine ();
        }
        bw.close ();
        System.out.println ("校验验证码：");
        if(list.contains (sc.nextLine ())){
            System.out.println ("验证成功");
        }else {
            System.out.println ("验证失败");
        }
    }

    //练习五:转换输出流的使用
/*

    描述:现有一字符串：”我爱Java”。将该字符串保存到当前项目根目录下的a.txt文件中。
    要求：使用gbk编码保存。
    注意：idea的默认编码是utf-8,所以可以通过filesettingsfile encodings设置为gbk格式，否则打开a.txt文件看到的将会是乱码。
*/
    public static void outputStreamWriter () throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter (new FileOutputStream ("day10\\a.txt"),"gbk");

        osw.write ("我爱Java");

        osw.close ();
    }


//    练习六:转换输入流的使用
/*    描述:利用转换输入流将当前项目根目录下使用gbk编码的a.txt文件的内容读取出来，并打印在控制台上。
    要求：不能出现乱码的情况。*/
    public static void inputStreamReader() throws IOException {
        InputStreamReader isr = new InputStreamReader (new FileInputStream ("day10\\a.txt"),"gbk");

        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars)) != -1){
            System.out.println (new String(chars,0,len));
        }
        isr.close ();
    }

/*
    练习三:字节打印流的使用
    描述:从键盘录入一行字符串，利用字节打印流将该行字符串保存到当前项目根目录下的d.txt文件中
*/
    private static void printSteam () throws FileNotFoundException {
        PrintStream p = new PrintStream (new FileOutputStream ("day10\\src\\com\\heima\\zuoye\\d.txt",true));
//        PrintStream p = new PrintStream ("day10\\src\\com\\heima\\zuoye\\d.txt");
        System.out.println ("请输入一行字符串：");
        p.println (new Scanner (System.in).nextLine ());
        p.close ();
    }

/*
    练习四:高效字符流读写数据
    描述:
    项目根路径下有text.txt文件，内容如下：
    我爱黑马
	123456
    利用IO流的知识读取text.txt文件的内容反转后写入text1.txt文件中，内容如下：
            654321
    马黑爱我

    提示：List集合反转元素的顺序时，用到了如下API。
    java.util类 Collections
    static void	reverse(List<?> list)
    反转指定列表中元素的顺序。
*/


}

