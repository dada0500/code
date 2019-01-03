package test;

import java.sql.*;

public class T11 {
    public static void main (String[] args) throws SQLException, ClassNotFoundException {
        String name = "zs '-- ";
        String pwd = "123";
        Class.forName ("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/db4";
        String user = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection (url, user, password);
//        Statement statement = conn.createStatement ();
//        String sql = "select count(*) from user where username = '" + name + "'and password='" + pwd + "'";
        String sql = "select count(*) from user where name = ? and pwd = ? "; PreparedStatement prepareStatement = conn.prepareStatement(sql); prepareStatement.setString(1, name); prepareStatement.setString(2, pwd);
//        ResultSet resultSet = statement.executeQuery (sql);
        ResultSet resultSet = prepareStatement.executeQuery (sql);
        while (resultSet.next ()) {
            int num = resultSet.getInt ("count(*)");
            System.out.println (num);
            if (num == 1){
                System.out.println ("登录成功");
            }else{
                System.out.println ("登录失败");

            }
        }

    }
}