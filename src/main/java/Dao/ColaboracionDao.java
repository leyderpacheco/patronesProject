/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Colaboracion;


public class ColaboracionDao {

    public int registerColab(Colaboracion colaboracion) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO colaborador"
                + "  VALUES "
                + " (?, ?, ?, ?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/bd_Bussi?useSSL=false", "root", "root");
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, colaboracion.getId());
            preparedStatement.setString(2, colaboracion.getNombre());
            preparedStatement.setString(3, colaboracion.getApellido());
            preparedStatement.setString(4, colaboracion.getCorreo());
            preparedStatement.setString(5, colaboracion.getPassw());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
