package com01.itheima.demo;

import com01.itheima.domain.Account;
import com01.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;


@Controller
@RequestMapping("/user")
@SessionAttributes(names = {"msg"})
public class Demo01 {

/*
    @RequestMapping("/setSession")
    public String setS(Model model){
        System.out.println ("setSeesion:______________");
        model.addAttribute ("msg","消息");
        return "hello";
    }

    @RequestMapping("/getSession")
    public String getS(ModelMap model){
        System.out.println ("getSeesion:______________");
        Object msg = model.get ("msg");
        System.out.println (msg);
        return "hello";
    }

    @RequestMapping("/cleanSession")
    public String cleanS(SessionStatus status){
        System.out.println ("cleanSeesion:______________");
        status.setComplete ();
        return "hello";
    }
*/
    @RequestMapping("/ajax")
    public String testAjax(@RequestBody String ajax){
        System.out.println ("ajax:"+ajax);
        return "success";
    }


    @RequestMapping("/hello")
    public String sayHello(){

        System.out.println ("demo01执行了...");

        return "hello";
    }

    @RequestMapping("/date")
    public String testDate(User user){

        System.out.println ("testDate执行了...");
        System.out.println (user);
        return "hello";
    }


    @RequestMapping("/param")
    public String testParam(@RequestParam(name="uname") String username){

        System.out.println ("getString...");
        System.out.println (username);
        return "hello";
    }

    @RequestMapping("/body")
    public String testBody(@RequestBody String username){
        System.out.println ("getString...");
        System.out.println (username);
        return "hello";
    }

    @RequestMapping("/pathVariable/{username}")
    public String pathV(@PathVariable("username") String username){
        System.out.println ("pathV...");
        System.out.println (username);
        return "hello";
    }


    @RequestMapping("/reg")
    public String rege(Account account){
        System.out.println ("reg...");
        System.out.println (account);
        return "hello";
    }

    @RequestMapping("/regUser")
    public String regUser(User user){
        System.out.println ("reg..........................");
        System.out.println (user);
        return "hello";
    }

//    @ModelAttribute
    public User firstffff(String name){
        System.out.println ("f执行了........................");
        System.out.println (name);
        //模拟查询数据库原有的值
        User user = new User();
        user.setName ("五");
        user.setAge (55);
        user.setBirthday (new Date ());
        System.out.println (user);
        return user;
    }
}
