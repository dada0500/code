package com.heima.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo_intermethod {
    public static void main (String[] args) throws Exception {
//        ArrayList<String> list = new ArrayList<> ();
//        list.add("abc");
//        list.add("zzz");

        Class stuClass = ttt.class;
//        Class stuClass = list.getClass ();
//        Method getMethod = stuClass.getDeclaredMethod ("add");
////        Method getMethod = stuClass.getDeclaredMethod ("add",String.class);
//        getMethod.setAccessible (true);
//        Method getMethod = stuClass.getMethod ("add");
//        Method getMethod = stuClass.getMethod ("add", Object.class);
//        Method getMethod = stuClass.getMethod ("prin");
        Method[] getMethods = stuClass.getDeclaredMethods ();
//        Method[] getMethods = stuClass.getMethods ();
        for (Method ms : getMethods) {
            System.out.println (ms);
        }
        System.out.println ("--------------");

        Method prin = stuClass.getMethod ("prin");
        prin.invoke ((ttt) () -> {});
//        prin.invoke (ttt.class);
        System.out.println ("--------------");

//        Method priprinMethod = stuClass.getDeclaredMethod ("priprin");
//        priprinMethod.setAccessible (true);
//        priprin.invoke (stuClass);
//        priprinMethod.invoke (stuClass);
//        getMethod.invoke (list,"ccc");
//        Object ccc = getMethod.invoke (stuClass,"ccc");
//        System.out.println (ccc);
//        System.out.println (list);
/*        Method[] getMethods = stuClass.getDeclaredMethods ();
        for (Method getMethod : getMethods) {
            System.out.println (getMethod);
        }*/

/*        public void java.util.ArrayList.add(int,java.lang.Object)
        public boolean java.util.ArrayList.add(java.lang.Object)
        private void java.util.ArrayList.add(java.lang.Object,java.lang.Object[],int)*/
    }
}
