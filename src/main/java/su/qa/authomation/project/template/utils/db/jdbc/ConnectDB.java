package su.qa.authomation.project.template.utils.db.jdbc;


import su.qa.authomation.project.template.utils.properties.OMPProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDB {

    private final static String HOST = OMPProperties.getConnectData("db.jdbc") + "://" + OMPProperties.getConnectData("db.url") + ":" + OMPProperties.getConnectData("db.port") + "/" + OMPProperties.getConnectData("db.name");
    private final static String USERNAME = OMPProperties.getConnectData("db.user");
    private final static String PASSWORD = OMPProperties.getConnectData("db.password");

    private static Connection connection;

    private ConnectDB() {
    }


    public synchronized static Connection getInstance() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
                System.out.println("Create DB connect");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

}
