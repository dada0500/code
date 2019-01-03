package UserTest;


import org.junit.Test;

import java.util.Arrays;

public class UserTest {

    @Test
    public void userTest(){
        String s1 = "user/regist?uid=e&from=i";
        String s = s1.substring (s1.lastIndexOf ('/')+1).split ("\\?",2)[0];
        System.out.println (s);
        String x = s.split ("\\?",2)[0];
        System.out.println (x);
    }
}
