package T1;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
    private static DataSource ds;
    static {
        ds = new ComboPooledDataSource ();
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection ();
    }

    public static DataSource getDataSource(){
        return ds;
    }

    public static void close(Statement stmt, Connection conn){
        close (null,stmt,conn);
    }

    public static void close(ResultSet rs, Statement stmt, Connection conn){
        if(rs != null){
            try {
                rs.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        if(stmt != null){
            try {
                stmt.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        if(conn != null){
            try {
                conn.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
    }
}
