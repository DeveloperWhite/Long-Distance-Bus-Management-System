package bus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DaoCon {
  static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
  static String dbURL = "jdbc:sqlserver://localhost:1433";
  static String userName = "SA";
  static String userPwd = "Y.sa123456"; // 设置与 SQL Server 容器相同的密码

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

