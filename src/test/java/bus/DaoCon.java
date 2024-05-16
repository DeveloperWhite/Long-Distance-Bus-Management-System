package bus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DaoCon {
  static String driverName = "com.mysql.cj.jdbc.Driver";
  static String dbURL = "jdbc:mysql://localhost:3306/";
  static String userName = "root";
  static String userPwd = "123456"; // 设置与 SQL Server 容器相同的密码

  public static Connection getConnection() throws SQLException {
    Connection con = null;
    try {
      Class.forName(driverName);
      con = DriverManager.getConnection(dbURL, userName, userPwd);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return con;
  }
}

