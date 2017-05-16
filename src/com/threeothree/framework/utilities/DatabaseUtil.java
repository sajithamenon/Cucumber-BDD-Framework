package com.threeothree.framework.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Sajitha on 4/21/2017.
 */
public class DatabaseUtil {
    public static Connection open(String connectionString,String userName,String Password) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();//Oracle Database
            return DriverManager.getConnection(connectionString,userName,Password);

        } catch (Exception e) {
        }
        return null;
    }

    public static void Close()
    {

    }
    public static void executeQuery(String query, Connection connection) {

        Statement statement = null;
        try
        {
statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);
        }
        catch (Exception e) {
        }
    }
}
