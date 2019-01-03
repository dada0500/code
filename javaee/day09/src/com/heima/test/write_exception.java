package com.heima.test;

import java.io.FileWriter;
import java.io.IOException;

public class write_exception {
    public static void main (String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter ("D:/test/a.txt");
            for (int i = 0; i < 10; i++) {
                fw.write ('A');
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }finally {
            if(fw != null){
                try {
                    fw.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
        }
    }
}
