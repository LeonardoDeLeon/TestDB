import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.internal.OracleTypes;

public class DbConnUtil {
    public static Connection getDbConnect() throws SQLException, IOException {
        String url = "jdbc:oracle:thin:@oracle-instance1.cplzhxlkxjj9.us-west-1.rds.amazonaws.com:1521:orcl";
		String username = "zoo";
		String password = "password01";
        
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		return DriverManager.getConnection(url, username, password);
    }
}    