package variables;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProcesoEntregas extends conexion {

    public boolean registrar(Entregas ent) {

        // Metodo para registrar las entregas en la base de datos       
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "INSERT INTO entregas (nombreCli, direccion, celular, eps, nombreProd, tipo, presentacion, cantidad, fechaEntrega) VALUES (?,?,?,?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, ent.getNombresC());
            ps.setString(2, ent.getDireccion());
            ps.setString(3, ent.getCelular());
            ps.setString(4, ent.getEps());
            ps.setString(5, ent.getNombre());
            ps.setString(6, ent.getTipo());
            ps.setString(7, ent.getPresentecion());
            ps.setInt(8, ent.getCantidad());
            ps.setDate(9, ent.getFecha());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

}
