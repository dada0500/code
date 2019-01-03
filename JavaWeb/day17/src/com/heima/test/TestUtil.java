package com.heima.test;

import com.heima.dao.UserDaoImpl;
import com.heima.domain.User;
import com.heima.service.UserService;
import com.heima.service.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestUtil {
    @Test
    public void replaceAll(){
        String value = "张太阳大";
        List<String> list = new ArrayList<> ();
        list.add ("太阳");
        value = value.replaceAll (list.get (0),"***");
        System.out.println (list.get (0));
        System.out.println (value);

    }

    @Test
    public void doTest(){
        UserDaoImpl userDao = new UserDaoImpl ();
        List<User> allUsers = userDao.findAllUsers ();
        System.out.println (allUsers);

    }

    @Test
    public void beanTest(){
        Map<String, String[]> parameterMap = new HashMap<> ();

/*            private int id;
            private String name;
            private String gender;
            private int age;
            private String address;
            private String qq;
            private String email;*/
        String[] strs = {"name"};
        parameterMap.put ("name",strs);
        User user = new User ();
        try {
            BeanUtils.populate (user,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace ();
        } catch (InvocationTargetException e) {
            e.printStackTrace ();
        }

        System.out.println (user);

        // 获取 操作用户信息的 UserService 实现类对象
        UserService userService = new UserServiceImpl ();


        // 增加用户信息
        boolean flag = userService.add (user);;

        System.out.println (flag);
    }

    @Test
    public void findByIdTest(){
        UserDaoImpl userDao = new UserDaoImpl ();
        int uid = 5;
        System.out.println ("uid:"+uid);
        User user = userDao.findUserById (uid);
        System.out.println (user);
    }
}
