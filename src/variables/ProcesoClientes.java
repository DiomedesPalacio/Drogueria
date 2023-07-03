package variables;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Se heredan las clases conexion y productos
public class ProcesoClientes extends conexion {

    public boolean registrar(Clientes cli) {

        // Metodo para registrar los clientes en la base de datos       
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "INSERT INTO clientes (cedula, nombres, edad, direccion, celular, eps) VALUES (?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, cli.getCedula());
            ps.setString(2, cli.getNombres());
            ps.setString(3, cli.getEdad());
            ps.setString(4, cli.getDireccion());
            ps.setString(5, cli.getCelular());
            ps.setString(6, cli.getEps());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
}
