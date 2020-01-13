package com.virtualemp.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class LoginDao {
    Connection conn;
    String sql = "SELECT * from login where username=? and password=?";

    public boolean check(String user, String pass) {
        try {
            conn = new DaoConnection().getConnection();

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,user);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
