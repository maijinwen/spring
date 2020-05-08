package net.togogo.dao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author 麦锦文
 */
public class StudentDao {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void save(String student){
        System.out.println("获取到的数据源" + dataSource);
        System.out.println("保存student:" + student);
        try {
            Connection connection = dataSource.getConnection();
            System.out.println("connection = " + connection);
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
