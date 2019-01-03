package com.heima.demo_login.View;

import javax.imageio.ImageIO;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkCode")
public class CheckCode extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {


        int width = 100;
        int height = 50;

        // 1. 创建一对象，在内存中的图片（验证码图片对象）
        BufferedImage image = new BufferedImage (width, height, BufferedImage.TYPE_INT_RGB);

        // 2. 美化图片
        // 2.1 填充背景色
        Graphics g = image.getGraphics ();
        // 画笔对象
        g.setColor (Color.CYAN);
        g.fillRect (0,0,width,height);

        // 2.2 画边框
        g.setColor (Color.BLUE);
        g.drawRect (0, 0, width - 1, height - 1);

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz0123456789";
        StringBuilder code = new StringBuilder ();
        // 生成随机角标
        Random ran = new Random ();
        for(int i = 1; i <= 4; i++){
            int index = ran.nextInt (str.length ());
            // 获取字符
            char ch = str.charAt (index);
            code.append (ch);
            // 随机字符
            // 2.3写验证码
            g.drawString (ch+"",width/5*i,height/2);
        }


        String strCode = code.toString ();
        request.getSession ().setAttribute ("checkCode",strCode);


    /*    HttpSession session = request.getSession ();
        System.out.println ("设置session: " + session);
        session.setAttribute ("checkcode",code);*/
      /*  HttpSession session = request.getSession ();
        session.setAttribute ("checkCode",code);*/

        // 2.4画干扰线
        g.setColor (Color.GREEN);

        //随机生成坐标点

        for(int i = 0; i < 10; i++){
            int x1 = ran.nextInt (width);
            int x2 = ran.nextInt (width);

            int y1 = ran.nextInt (height);
            int y2 = ran.nextInt (height);
            g.drawLine (x1,y1,x2,y2);
        }


        //3.将图片输出到页面展示
        ImageIO.write (image,"jpg",response.getOutputStream ());


//        Cookie sId = new Cookie ("JSESSIONID",session.getId ());
//        sId.setMaxAge (60 * 60);  // 1小时
//        response.addCookie (sId);
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws  IOException {
        this.doPost (request,response);
    }
}
