package com.itheima.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy {
    public static void main (String[] args) {
        final Producer producer = new Producer ();

        Producer o = (Producer) Enhancer.create (producer.getClass (), new MethodInterceptor () {
//            public Object intercept (Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            public Object intercept (Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                // 提供增强的代码
                Object returnValue = null;
                // 1.获取方法执行的参数
                Float arg = (Float) args[0];
                // 2.判断当前方法是不是销售
                if("saleProduct".equals (method.getName ())){
                    returnValue = method.invoke (producer,arg * 0.8f);
                }
                return returnValue;
            }
        });
        o.saleProduct (8000);
    }
}
