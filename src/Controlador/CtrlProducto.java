package Controlador;

import formularios.frmProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import variables.ProcesosProducto;
import variables.Productos;

// Genara la accion para el proceso de ingreso de los datos de los productos
public class CtrlProducto implements ActionListener {

    private Productos mod;
    private ProcesosProducto modP;
    private frmProducto frm;

    public CtrlProducto(Productos mod, ProcesosProducto modP, frmProducto frm) {
        this.mod = mod;
        this.modP = modP;
        this.frm = frm;
        this.frm.btnGuardar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
    }
    
    // Formatea el inicio del formulario con el nombre y sitio en pantalla
    public void inciar() {
        frm.setTitle("Productos");
        frm.setLocationRelativeTo(null);
        frm.txtId.setVisible(false);
    }

     // Crea el evento para registrar los datos del producto
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btnGuardar) {
            mod.setCodigo(frm.txtCodigo.getText());
            mod.setNombre(frm.txtNombre.getText());
            mod.setTipo(frm.txtTipo.getText());
            mod.setPresentecion(frm.cbxPresentacion.getSelectedItem().toString());
            mod.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));

            if (modP.registrar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                Limpiar();
            }

        }
        
         // Crea el evento para modificar los registros los datos del productos
        
        if (e.getSource() == frm.btnModificar) {
            mod.setId(Integer.parseInt(frm.txtId.getText()));
            mod.setCodigo(frm.txtCodigo.getText());
            mod.setNombre(frm.txtNombre.getText());
            mod.setTipo(frm.txtTipo.getText());
            mod.setPresentecion(frm.cbxPresentacion.getSelectedItem().toString());
            mod.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));

            if (modP.modificar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                Limpiar();
            }

        }
        
    }
    
    
     // Limpia las cajas despues de ingresar el registro
    public void Limpiar()
    {
        frm.txtId.setText(null);
        frm.txtCodigo.setText(null);
        frm.txtNombre.setText(null);
        frm.txtTipo.setText(null);
        frm.cbxPresentacion.setSelectedIndex(0);
        frm.txtCantidad.setText(null);
    }
}
