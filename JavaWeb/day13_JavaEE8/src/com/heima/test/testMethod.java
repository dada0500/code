package com.heima.test;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

public class testMethod {

    @Test
    public void test() throws UnsupportedEncodingException {

        Date date = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy年MM月dd日 HH:mm:ss");
        String formatDate = sdf.format (date);
        String enDate = Base64.getUrlEncoder ().encodeToString (formatDate.getBytes ("utf-8"));
        System.out.println ("sout:" + formatDate);
        System.out.println ("sout:" + enDate);
        System.out.println ("------");

        byte[] decode = Base64.getUrlDecoder ().decode (enDate.getBytes ("utf-8"));
        System.out.println (new String (decode));
    }
}
