package util;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.apache.log4j.Logger;

public class DBAmazon {
    
//    private static final Logger LOGGER = Logger.getLogger(DBAmazon.class);
//
//    public static Connection getConnnectionAmazon() throws SQLException, NamingException {
//        Connection conn = null;
//        try {
//            Context context = new InitialContext();
//            Context envCtx = (Context) context.lookup("java:comp/env");
//            DataSource ds = (DataSource) envCtx.lookup("DBConnAmazon");
//            conn = ds.getConnection();
//        } catch (Exception e) {
//            LOGGER.error(e);
//        }
//        return conn;
//    }
}
