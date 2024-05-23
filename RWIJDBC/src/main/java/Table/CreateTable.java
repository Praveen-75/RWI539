package Table;

import db.dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {
    public static int crateTable() throws SQLException {
        Connection connection = dbConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement("create table mobile(id int(20) primary key auto_increment, name varchar(255) not null)");
        return ps.executeUpdate();
    }

    public static int insertValue() throws SQLException {
        Connection connection = dbConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement("insert into mobile(name) values (?)");
        ps.setString(1, "Praveen");
        return ps.executeUpdate();
    }

    public static void main(String[] args) throws SQLException {
//        crateTable();
        insertValue();
    }
}
