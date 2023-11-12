package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
  private static ConexionDB instancia;
  private Connection conexion;

  private ConexionDB() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      String url = "jdbc:mysql://localhost:3306/world";
      String user = "root";
      String password = "admin38";
      this.conexion = DriverManager.getConnection(url, user, password);
    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static ConexionDB obtenerInstancia() {
    if (instancia == null) {
      instancia = new ConexionDB();
    }
    return instancia;
  }

  public Connection obtenerConexion() {
    return conexion;
  }

  public void cerrarConexion() {
    try {
      if (conexion != null && !conexion.isClosed()) {
        conexion.close();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
