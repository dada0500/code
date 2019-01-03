package com.heima.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/lastTimeGet")
public class lastTimeGet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码格式
        request.setCharacterEncoding ("utf-8");
        response.setContentType ("text/html;charset=utf-8");
        // 获取cookie
        Cookie[] cookies = request.getCookies ();
        // 判断是否有cookie
        if(cookies != null && cookies.length > 0){
            // 遍历cookies
            for (Cookie cookie : cookies) {
                String name = cookie.getName ();
                // cookies中是否有lastTime
                if("lastTime".equals (name)){
                    // 解码URL编码，获取上次登录时间
                    String lastTimeValue = URLDecoder.decode (cookie.getValue (), "utf-8");
                    System.out.println ("set前lastTime:" + lastTimeValue);
                    // 浏览器页面输出 欢迎消息
                    response.getWriter().println ("欢迎您，上次登录时间：" + lastTimeValue);

                    // 获取当前日期时间
                    Date date = new Date ();
                    SimpleDateFormat sdf = new SimpleDateFormat ("yyyy年MM月dd日 HH:mm:ss");
                    String strDate = sdf.format (date);
                    // URL编码
                    strDate = URLEncoder.encode (strDate, "utf-8");
                    cookie.setValue (strDate);
                    // 设置响应头 set-cookie
                    response.addCookie (cookie);
                    break;
                }else{
                    firstLogin (response);
                }
            }
        }else if(cookies == null || cookies.length == 0 ){
            firstLogin (response);
        }else{
            response.getWriter().println ("未知");
        }
    }

    private void firstLogin (HttpServletResponse response) throws IOException {
        response.getWriter().println ("首次登录");
        // 获取当前日期
        Date date = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy年MM月dd日 HH:mm:ss");
        String strDate = sdf.format (date);

        System.out.println ("首次登录时间：" + strDate);

        // url编码，处理乱码
        strDate = URLEncoder.encode (strDate, "utf-8");
        // 设置响应头 set-cookie
        Cookie lastTime = new Cookie ("lastTime", strDate);
        response.addCookie (lastTime);
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
