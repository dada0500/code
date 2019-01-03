package com.heima.demo;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Demo_BufferedImg {

    public void drawImg(){
        int width = 100;
        int height = 50;
        BufferedImage bufferedImage = new BufferedImage (width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.getGraphics ();
        graphics.setColor (Color.lightGray);
        graphics.fillOval (5,5,50,20);



    }


}
