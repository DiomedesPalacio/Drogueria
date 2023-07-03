
package Controlador;

import formularios.frmEntregas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;
import variables.Entregas;
import variables.ProcesoEntregas;


// Genera la accion para el proceso de ingreso de los datos de las entregas
public class CtrlEntregas implements ActionListener {
    
    private Entregas mod;
    private ProcesoEntregas modE;
    private frmEntregas frm;

    public CtrlEntregas(Entregas mod, ProcesoEntregas modE, frmEntregas frm) {
        this.mod = mod;
        this.modE = modE;
        this.frm = frm;
        this.frm.btnGuardar.addActionListener(this);
    }

    // Formatea el inicio del formulario con el nombre y sitio en pantalla
    public void inciar() {
        frm.setTitle("Entrega de Productos");
        frm.setLocationRelativeTo(null);
        frm.txtId.setVisible(false);
        frm.txtIdProd.setVisible(false);
    }
    
    
    // Crea el evento para registrar los datos del cliente
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btnGuardar) {
            mod.setNombresC(frm.txtNombre.getText());
            mod.setDireccion(frm.txtDireccion.getText());
            mod.setCelular(frm.txtCelular.getText());
            mod.setEps(frm.txtEps.getText());
            mod.setNombre(frm.txtNombreProd.getText());
            mod.setTipo(frm.txtTipoProd.getText());
            mod.setPresentecion(frm.txtPresen.getText());
            mod.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
            mod.setFecha(Date.valueOf(frm.txtFecha.getText()));
            

            if (modE.registrar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                Limpiar();
            }
        }
    }
    
    // Limpia las cajas despues de ingresar el registro
     public void Limpiar()
    {
        frm.txtNombre.setText(null);
        frm.txtDireccion.setText(null);
        frm.txtCelular.setText(null);
        frm.txtEps.setText(null);
        frm.txtNombreProd.setText(null);
        frm.txtTipoProd.setText(null);
        frm.txtPresen.setText(null);
        frm.txtCantidad.setText(null);
        frm.txtFecha.setText(null);    
        frm.txtCedula.setText(null);    
        frm.txtCodigo.setText(null);    
    }
    
}
