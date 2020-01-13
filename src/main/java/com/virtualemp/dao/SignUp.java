package com.virtualemp.dao;

import com.virtualemp.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignUp {
    Connection conn;
    String sql = "INSERT INTO login(username,password) VALUES(?,?)";

    public boolean insert(User user) {
        try {
            conn = new DaoConnection().getConnection();

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, user.getEmail());
            st.setString(2, user.getPassword());
            int affectedRows = st.executeUpdate();
            if (affectedRows > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean isExists(String user) {
        try {
            conn = new DaoConnection().getConnection();

            PreparedStatement st = conn.prepareStatement("SELECT username FROM login where username=?");
            st.setString(1, user);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return false;
    }
}
