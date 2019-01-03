package com.heima.junit.test;

import com.heima.junit.Demo_Junit;
import org.junit.*;

public class junitTest {

    @BeforeClass
    public static void bc(){
        System.out.println ("BeforeClass...");
    }

    @AfterClass
    public static void ac(){
        System.out.println ("AfterClass...");
    }

    @Before
    public void bf(){
        System.out.println ("Before...");
    }

    @After
    public void af(){
        System.out.println ("After...");
    }

    @Test
    public void addTest(){
        Demo_Junit ju = new Demo_Junit ();
        int sum = ju.add (1, 3);
        System.out.println (sum);
        Assert.assertEquals (4,sum);
    }

    @Test
    public void subTest(){
        Demo_Junit ju = new Demo_Junit ();
        int sum = ju.sub (1, 3);
        System.out.println (sum);
        Assert.assertEquals (-2,sum);
    }


}
