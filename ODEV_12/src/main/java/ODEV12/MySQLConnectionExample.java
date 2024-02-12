package ODEV12;

import java.sql.*;

public class MySQLConnectionExample {
    public static void main(String[] args) {
//        try {
//            Seed();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        String url = "jdbc:mysql://localhost:3306/ece_test";
        String userName = "root";
        String password = "12345";

        Connection connection = null;
        ResultSet resultset = null;
        PreparedStatement prestatement = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
            String uName = "ayşe";
            String uPassword = "123456789";

            viewUserInfo(connection);

            String sqlQuery = "SELECT * FROM user WHERE name= ? AND password = ?";
            prestatement = connection.prepareStatement(sqlQuery);

            prestatement.setString(1, uName);
            prestatement.setString(2, uPassword);
            resultset = prestatement.executeQuery();

            while (resultset.next()) {
                int id = resultset.getInt("id");
                String name = resultset.getString("name");
                String surName = resultset.getString("surname");
                String title = resultset.getString("title");
                System.out.println("ID: " + id + ", Ad: " + name + ", Soyad: " + surName + ", Görevi: " + title);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultset != null) resultset.close();
                if (prestatement != null) prestatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
    public static void viewUserInfo(Connection a) {
        Statement statement = null;
        ResultSet result = null;
        try {
            statement = a.createStatement();
            String Query = "SELECT * FROM user";
            statement.executeQuery(Query);
            result = statement.executeQuery(Query);

            while (result.next()) {
                int id = result.getInt("id");
                String ad = result.getString("name");
                String password = result.getString("password");
                System.out.println("ID: " + id + ", Ad: " + ad + ", Şifre: " + password);
            }
            System.out.println("***************************");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (result != null) result.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void Seed() throws SQLException {
        String url = "jdbc:mysql://localhost:3306";
        String userName = "root";
        String password = "12345";

        Connection myCon = DriverManager.getConnection(url, userName, password);
        myCon.prepareStatement("CREATE DATABASE ece_test")
                .execute();

        myCon.close();


    }
}
