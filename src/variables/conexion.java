
package variables;

import java.sql.*;

public class conexion {
    
     Connection con;
    
    public conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdrogueriabuenasalud" + "?useTimezone=true&serverTimezone=UTC", "root", "");
            System.out.println("Conexión exitosa con la base de datos de la Drogueria Buena Salud");

        } catch (Exception e) {
            System.err.println("Error:" + e);
        }

    }

    public Connection getConnection() {
        return con;
    }

}
