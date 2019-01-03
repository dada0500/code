package com.heima.test;

import java.io.FileNotFoundException;

public class T_1 {
    public static void main(String[] args) {
        try {
            read("a.tx3t");
            System.out.println ("try中的代码");
        } catch (FileNotFoundException e) {
            //抓取到的是编译期异常  抛出去的是运行期
            System.out.println ("catch中的代码111");
            throw new RuntimeException("虲" + e + "尾");
//            throw new RuntimeException(e);
//            System.out.println ("catch中的代码222");  //无法访问的语句
        } finally {
            System.out.println("不管程序怎样，这里都将会被执行。");
        }
        System.out.println("over");
    }
    /*
     *
     * 我们 当前的这个方法中 有异常  有编译期异常
     */
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件
            // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw new FileNotFoundException("文件不存在");
        }
    }
}
