package com.heima;

import org.junit.Test;

public class test {

    @Test
    public void aTest(){
        boolean f = Character.isJavaIdentifierPart ('国');
        boolean e = Character.isJavaIdentifierStart ('国');
        System.out.println (f);
        System.out.println (e);
        System.out.println ((12 & 8)/8);
        System.out.println ((123 & 8)/8);
        System.out.println ((1234 & 8)/8);
        System.out.println ((12345 & 8)/8);
        System.out.println ((123456 & 8)/8);

    }
}
