package com.heima.demo;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

@WebServlet("/Demo_ImgServlet")
public class Demo_ImgServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int width = 100;
        int height = 50;
        BufferedImage bufferedImage = new BufferedImage (width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.getGraphics ();
        graphics.setColor (Color.lightGray);
//        graphics.fillOval (5,5,50,20);
        graphics.fillRect (5,5,50,20);



/*
        // 2.2 画边框
        graphics.setColor (Color.BLUE);
        graphics.drawRect (0, 0, width - 1, height - 1);

        */
        
        
        
        ImageIO.write (bufferedImage,"jpg",response.getOutputStream ());


    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request,response);
    }
}
