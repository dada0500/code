package com.ttt;

import com.heima.JdbcUtils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test {

    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("转入账户:");
        String zr = sc.nextLine();
        System.out.println("转出账户:");
        String zc = sc.nextLine();
        System.out.println("转入金额:");
        String je = sc.nextLine();
        Connection conn = null;
        PreparedStatement ps1 =null;
        PreparedStatement ps2 =null;
        try {
            conn = JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            ps1 = conn.prepareStatement("UPDATE account SET balance = balance - ?  WHERE name = ? ");
            ps2 = conn.prepareStatement("UPDATE account SET balance = balance + ?  WHERE name = ? ");


            ps1.setString(1,je);
            ps1.setString(2,zr);

            ps2.setString(1,je);
            ps2.setString(2,zc);

            ps1.executeUpdate ();
            ps2.executeUpdate ();

            conn.commit();
            System.out.println ("成功");
        } catch (Exception e) {
            try {
                e.printStackTrace();
                conn.rollback();
                System.out.println("1111");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }finally {
            JdbcUtils.close(null,ps1,conn);
            JdbcUtils.close(null,ps2,conn);
        }

    }
}
