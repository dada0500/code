package com.itheima.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProducerProxy {

    public static void main (String[] args) {
        final Producer producer = new Producer ();

        IProducer proxyProducer = (IProducer) Proxy.newProxyInstance (producer.getClass ().getClassLoader (), producer.getClass ().getInterfaces (), new InvocationHandler () {
            public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {

                Float arg = (Float) args[0];
                return method.invoke (producer,arg * 0.8f);
            }
        });

        proxyProducer.saleProduct (8000);
    }
}
