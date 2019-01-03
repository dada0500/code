package com.heima.testAnnoDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

public class reflectTestRun {
    public static void main (String[] args) throws Exception {
//        Class<Calculater> clazz = Calculater.class;
//        Calculater calc = clazz.newInstance ();

        Calculater calc = new Calculater ();
        Class clazz = calc.getClass ();

        Method[] methods = clazz.getMethods ();

        int num = 0;
        PrintStream ps = new PrintStream (new FileOutputStream ("day01\\TestRun.log"));


        for (Method method : methods) {
            if(method.isAnnotationPresent (TestRun.class)){
                try{
                    System.out.println (method.getName ());
                    method.invoke (calc);
                }catch (Exception e){
                    num++;
                    ps.println (method.getName () + "方法发生异常");
                    ps.println ("异常名称：" + e.getCause ().getClass ().getName ());
                    ps.println ("异常名称：" + e.getCause ().getClass ().getSimpleName ());
                    ps.println ("异常原因：" + e.getCause ().getMessage ());
                    ps.println ("异常 e.getLocalizedMessage ()：" + e.getLocalizedMessage ());
                    ps.println ("-------------------");
                }
            }
        }
        ps.println ("总共发生了" + num + "个异常");

        ps.close ();
    }
}
