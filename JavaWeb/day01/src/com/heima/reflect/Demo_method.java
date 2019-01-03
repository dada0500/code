package com.heima.reflect;

import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo_method {
    public static void main (String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<> ();
        list.add("abc");
        list.add("zzz");

        Class stuClass = list.getClass ();
//        Method getMethod = stuClass.getDeclaredMethod ("add");
////        Method getMethod = stuClass.getDeclaredMethod ("add",String.class);
//        getMethod.setAccessible (true);
//        Method getMethod = stuClass.getMethod ("add");
        Method getMethod = stuClass.getMethod ("add", Object.class);


        getMethod.invoke (list,"ccc");
//        Object ccc = getMethod.invoke (stuClass,"ccc");
//        System.out.println (ccc);
        System.out.println (list);
/*        Method[] getMethods = stuClass.getDeclaredMethods ();
        for (Method getMethod : getMethods) {
            System.out.println (getMethod);
        }*/

/*        public void java.util.ArrayList.add(int,java.lang.Object)
        public boolean java.util.ArrayList.add(java.lang.Object)
        private void java.util.ArrayList.add(java.lang.Object,java.lang.Object[],int)*/
    }
}
