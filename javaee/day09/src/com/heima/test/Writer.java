package com.heima.test;

import java.io.*;

public class Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day09\\b.txt");

        fw.write (3365533);
        fw.write (95539);
        fw.write (95536);
        fw.write ("\r\n");
        fw.write (30000);

        fw.close();

    }
}