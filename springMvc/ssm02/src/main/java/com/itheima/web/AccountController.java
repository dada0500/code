package com.itheima.web;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("/mvcTest")
    public ModelAndView testMVC(){
        ModelAndView mv = new ModelAndView ();
        mv.setViewName ("list");
        mv.addObject ("mv","成功访问");
        return mv;
    }



    /**
     * 查询所有账户
     * @return
     */
    @RequestMapping("/findAll")
    public String findAllAccount(){
        System.out.println ("Con-finall...");

        accountService.findAllAccount ();
        return "list";
    }

    /**
     * 更新账户
     * @param account
     */
    @RequestMapping("/update")
    public void updateAccount(Account account){
        System.out.println ("Con-update...");
        accountService.updateAccount (account);
        findAllAccount ();
    }

    /**
     * 转账
     * @param a
     * @param b
     * @param money
     */
    @RequestMapping("/transfer")
    public void transfer(String a,String b,Double money){
        System.out.println ("Con-transfer...");
        accountService.transfer (a,b,money);
        findAllAccount ();
    }
}