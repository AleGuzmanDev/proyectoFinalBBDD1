package conexionBBDD;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBBDD {
    public static void main(String[] args) {
        // Configuración de la conexión
        String url = "jdbc:mysql://localhost:3306/bd_proyectofinalbbdd";
        String usuario = "root";
        String contraseña = "root";

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                // Aquí puedes realizar operaciones con la base de datos
                // Por ejemplo, consultar datos, insertar, actualizar, etc.
            } else {
                System.out.println("No se pudo establecer la conexión.");
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}




