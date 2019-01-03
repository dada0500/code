package com.heima.test;

import com.heima.dao.AccountDao;
import com.heima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class sprint {
    public static void main (String[] args) {
        // 获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext ("bean.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext ("bean.xml");
        //
//       AccountService as = (AccountService) ac.getBean ("AccountService");
       AccountService as = (AccountService) ac.getBean ("factoryGet");
        System.out.println (as);
        System.out.println (ac);
        as.save ();
        ac.close();
/*
        System.out.println ("----------");
        System.out.println (as);
        System.out.println (ac);
        as.save ();

        AccountService as2 = (AccountService) ac.getBean ("AccountService");
        System.out.println ("as2:"+as2);
        ac.close ();
        System.out.println ("----结束----");*/


/*         AccountDao ad = ac.getBean ("AccountDao", AccountDao.class);

        System.out.println (ad);
        ad.save ();*/

/*        AccountService factoryGet = (AccountService) ac.getBean ("factoryGet");
        AccountDao factoryStaticGetGet = ac.getBean ("factoryStaticGet",AccountDao.class);

        System.out.println (factoryGet);
        System.out.println (factoryStaticGetGet);*/

    }
}
