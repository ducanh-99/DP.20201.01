package entity.db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import java.sql.Connection;
import utils.*;

/*
    Db is coincidental cohesion so it's not related to the package entity, 
    it must belong to db or connect package
*/
public class AIMSDB {

	private static Logger LOGGER = Utils.getLogger(Connection.class.getName());
	private static Connection connect;
    // TODO: refactor Utils -> limit connections
    // Common coupling: xảy ra khi ai cũng có thể truy cập vào method này 
    public static Connection getConnection() {
        if (connect != null) return connect;
        try {
			Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:src/main/resources/assets/db/aims.db";
            connect = DriverManager.getConnection(url);
            LOGGER.info("Connect database successfully");
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
        } 
        return connect;
    }


    public static void main(String[] args) {
        AIMSDB.getConnection();
    }
}
