package edu.ntudp.fit.hladchenko;

import java.sql.*;

public class StudentRequest {

        private static final String DB_URL = "jdbc:mysql://localhost:3306/students";
        private static final String DB_USER = "root";
        private static final String DB_PASSWORD = "root";

        public static void main(String[] args) {
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                String month = "06"; // Місяць червень

                String query = "SELECT * FROM Students WHERE MONTH(birth_date) = ?;";
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setString(1, month);

                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String lastName = resultSet.getString("last_name");
                    String firstName = resultSet.getString("first_name");
                    String middleName = resultSet.getString("middle_name");
                    String birthDate = resultSet.getString("birth_date");
                    String studentId = resultSet.getString("student_id");

                    System.out.println("ID: " + id);
                    System.out.println("Last Name: " + lastName);
                    System.out.println("First Name: " + firstName);
                    System.out.println("Middle Name: " + middleName);
                    System.out.println("Birth Date: " + birthDate);
                    System.out.println("Student ID: " + studentId);
                    System.out.println("--------------------");
                }

                resultSet.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

}
