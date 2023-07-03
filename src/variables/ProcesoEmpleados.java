
package variables;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProcesoEmpleados extends conexion{
    
    public boolean registrar(Empleados emp) {

        // Metodo para registrar los empleados en la base de datos       
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "INSERT INTO empleados (cedula, nombres, cargo, usuario, contrasena) VALUES (?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, emp.getCedula());
            ps.setString(2, emp.getNombre());
            ps.setString(3, emp.getCargo());
            ps.setString(4, emp.getUsuario());
            ps.setString(5, emp.getPassword());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
    
}
