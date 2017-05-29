package su.qa.authomation.project.template.utils.db.jdbc;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WorkInDB {


    public static boolean findInnInDB(String inn) {
        int concurrency = 0;
        try {
            Statement statement = ConnectDB.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from \"public\".tb_organization where inn = '" + inn + "'");
            resultSet.next();
            concurrency = resultSet.getRow();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return (concurrency > 0);
    }
}
