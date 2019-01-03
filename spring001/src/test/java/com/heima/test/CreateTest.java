package com.heima.test;


import com.heima.service.ListService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreateTest {

    @Test
    public void testC(){
        ApplicationContext ac = new ClassPathXmlApplicationContext ("bean.xml");
        ListService list = (ListService) ac.getBean ("list");
        list.myPrint();
    }
}
