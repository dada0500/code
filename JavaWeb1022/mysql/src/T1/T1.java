package T1;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class T1 {
    public static void main (String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection ();

            // 创建表及表内容
            String createTable = "CREATE TABLE `User`(id INT PRIMARY KEY AUTO_INCREMENT,username VARCHAR(30) NOT NULL,password VARCHAR(30) NOT NULL,email VARCHAR(30));INSERT INTO USER VALUES(NULL,'zs','123','zs@itcast.cn'),(NULL,'ls','456','ls@itcast.cn'),(NULL,'ww','789','ww@itcast.cn')";


//            String createTable = "CREATE TABLE IF NOT EXISTS `User`(\n" +
//                    "\tid INT PRIMARY KEY AUTO_INCREMENT,\n" +
//                    "\tusername VARCHAR(30) NOT NULL,\n" +
//                    "\tPASSWORD VARCHAR(30) NOT NULL,\n" +
//                    "\temail VARCHAR(30)\n" +
//                    ");" +
//                    "INSERT INTO USER VALUES(NULL,'zs','123','zs@itcast.cn'),(NULL,'ls','456','ls@itcast.cn'),(NULL,'ww','789','ww@itcast.cn')";


       /*     String createTable = "CREATE TABLE IF NOT EXISTS `User`(\n" +
                    "\tid INT PRIMARY KEY AUTO_INCREMENT,\n" +
                    "\tusername VARCHAR(30) NOT NULL,\n" +
                    "\tPASSWORD VARCHAR(30) NOT NULL,\n" +
                    "\temail VARCHAR(30)\n" +
                    ");\n" +
                    "\n" +
                    "INSERT INTO USER VALUES(NULL,'zs','123','zs@itcast.cn'),\n" +
                    "(NULL,'ls','456','ls@itcast.cn'),\n" +
                    "(NULL,'ww','789','ww@itcast.cn');";*/
            pstmt1 = conn.prepareStatement (createTable);

//            int i = pstmt1.executeUpdate ();
        /*    System.out.println (i);
            if(i > 0){
                System.out.println ("已创建表及内容");
            }else {
                System.out.println ("未创建表");
            }*/

            // 表中数据封装成JavaBean(类名为User)
            // 创建list,存储User对象
            ArrayList<User> list = new ArrayList<> ();
            // 查询表中数据
            String sql = "SELECT * FROM User;";
            pstmt2 = conn.prepareStatement (sql);
            rs = pstmt2.executeQuery ();
            while (rs.next ()){
                int id = rs.getInt ("id");
                String username = rs.getString ("username");
                String password = rs.getString ("password");
                String email = rs.getString ("email");
                User user = new User (id,username,password,email);
                list.add (user);
            }
            System.out.println (list);



        } catch (SQLException e) {
            e.printStackTrace ();
        } finally {
            DBUtils.close (null,pstmt1,null);
            DBUtils.close (rs,pstmt2,conn);
        }

    }
}
