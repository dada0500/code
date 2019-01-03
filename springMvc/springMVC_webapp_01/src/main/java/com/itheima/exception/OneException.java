package com.itheima.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OneException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        e.printStackTrace ();
        MyException myE = null;
        if(e instanceof MyException){
            myE = (MyException) e;
        }else{
            myE = new MyException ("错误,请联系管理员");
        }
        ModelAndView mv = new ModelAndView ();
        mv.addObject ("errorMsg",myE.getMessage ());
        mv.setViewName ("error");
        return mv;
    }
}
