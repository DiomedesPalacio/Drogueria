package variables;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Se heredan las clases conexion y productos
public class ProcesosProducto extends conexion {

    public boolean registrar(Productos pro) {
       
        // Metodo para registrar productos en la base de datos       
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "INSERT INTO productos (codigoProd, nombreProd, tipoProd, presentacionProd, cantidadprod) VALUES (?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getTipo());
            ps.setString(4, pro.getPresentecion());
            ps.setInt(5, pro.getCantidad());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    public boolean modificar(Productos pro) {
        
         // Metodo para modificar los productos en la base de datos  
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "UPDATE productos SET codigoProd=?, nombreProd=?, tipoProd=?, presentacionProd=?, cantidadprod=? WHERE IdProd=? ";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getTipo());
            ps.setString(4, pro.getPresentecion());
            ps.setInt(5, pro.getCantidad());
            ps.setInt(6, pro.getId());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
}
