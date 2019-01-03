package com.heima.testAnnoDemo;

import java.io.*;
import java.lang.reflect.Method;

public class reflectTestRun2 {
    public static void main (String[] args) throws Exception {
//        Class<Calculater> clazz = Calculater.class;
//        Calculater calc = clazz.newInstance ();

        Calculater calc = new Calculater ();
        Class clazz = calc.getClass ();

        Method[] methods = clazz.getMethods ();

        int num = 0;
//        PrintStream ps = new PrintStream (new FileOutputStream ("day01\\TestRun.log"));
        BufferedWriter bw = new BufferedWriter (new FileWriter ("day01\\\\TestRun.log"));

        for (Method method : methods) {
            if(method.isAnnotationPresent (TestRun.class)){
                try{
                    System.out.println (method.getName ());
                    method.invoke (calc);
                }catch (Exception e){
                    num++;
                    bw.write (method.getName () + "方法发生异常");
                    bw.newLine ();
                    bw.write("异常名称：" + e.getCause ().getClass ().getName ());
                    bw.newLine ();
                    bw.write("异常名称：" + e.getCause ().getClass ().getSimpleName ());
                    bw.newLine ();
                    bw.write("异常原因：" + e.getCause ().getMessage ());
                    bw.newLine ();
                    bw.write ("异常 e.getLocalizedMessage ()：" + e.getLocalizedMessage ());
                    bw.newLine ();
                    bw.write ("-------------------");
                    bw.newLine ();
                }
            }
        }
        bw.write ("总共发生了" + num + "个异常");

        bw.flush ();
        bw.close ();
    }
}
