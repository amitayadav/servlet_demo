package com.virtualemp.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DaoConnection {
    private InputStream inputStream;
    private Connection conn;

    public Connection getConnection() throws IOException {
        try {
            Properties prop = new Properties();
            String propFileName = "config.properties";
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            Class.forName(prop.getProperty("driver"));
            conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
                    prop.getProperty("password"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            inputStream.close();

        }
        return conn;
    }
}



