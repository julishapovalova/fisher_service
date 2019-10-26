package com.fish.spitter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class SpitterDB {

    private static final String SQL_INSERT_SPITTER = "insert into spitter (username, password, fullname) values (?, ?, ?)";
    private static final String SQL_SELECT_SPITTER = "select id, username, fullname from spitter where id = ?";


    private DataSource dataSource;

    public SpitterDB(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public void addSpitter(Spitter spitter) {
        Connection connection = null;
        PreparedStatement stmt = null;
        try {
            connection = dataSource.getConnection();//connection
            stmt = connection.prepareStatement(SQL_INSERT_SPITTER);//create query

            stmt.setString(1, spitter.getUsername());
            stmt.setString(1, spitter.getPassword());
            stmt.setString(1, spitter.getFullName());

            stmt.execute();// run query
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
            System.out.println("Error with connection or query");
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.out.println("Error with connection or query");
            }
        }
    }

    public Spitter getSpitter(long id) {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Spitter spitter = null;
        try {
            connection = dataSource.getConnection();
            stmt = connection.prepareStatement(SQL_SELECT_SPITTER);

            stmt.setLong(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                spitter = new Spitter();
                spitter.setId(rs.getLong("id"));
                spitter.setUsername(rs.getString("username"));
                spitter.setPassword(rs.getString("password"));
                spitter.setFullName(rs.getString("fullname"));
            }

            return spitter;
        } catch (SQLException e) {
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (stmt != null)
                    stmt.close();
            } catch (SQLException e) {
            }
        }
        return spitter;
    }

}
