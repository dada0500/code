package com.heima.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

@WebServlet("/lastTime")
public class Demo_lastTime extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应消息体格式
        resp.setContentType ("text/html;charset=utf-8");

        Cookie[] cookies = req.getCookies ();
        if(cookies != null && cookies.length > 0){
            for (Cookie cookie : cookies) {
                String name = cookie.getName ();
                if("lastTime".equals (name)){
                    String value = URLDecoder.decode (cookie.getValue (), "utf-8");
                    System.out.println ("欢迎您！，上次登录时间："+ value);
                    setLastTime (resp);
                    break;
                }
            }
        }else {
            System.out.println ("第一次登录！");
            setLastTime (resp);
        }
    }

    private String getLastTime(String value) throws UnsupportedEncodingException {
//        System.out.println (value);
        byte[] decode = Base64.getUrlDecoder ().decode (value.getBytes ("utf-8"));
        return new String(decode);
    }
    private void setLastTime (HttpServletResponse resp) throws UnsupportedEncodingException {
        Date date = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy年MM月dd日 HH:mm:ss");
        String formatDate = sdf.format (date);
        String enDate = URLEncoder.encode (formatDate,"utf-8");
        Cookie cookieLastTime = new Cookie ("lastTime", enDate);
        resp.addCookie (cookieLastTime);
    }

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost (req,resp);
    }
}
