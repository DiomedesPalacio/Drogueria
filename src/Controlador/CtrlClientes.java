package Controlador;

import formularios.frmClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import variables.Clientes;
import variables.ProcesoClientes;


// Genera la accion para el proceso de ingreso de los datos de los clientes
public class CtrlClientes implements ActionListener {

    private Clientes mod;
    private ProcesoClientes modC;
    private frmClientes frm;

    public CtrlClientes(Clientes mod, ProcesoClientes modC, frmClientes frm) {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.btnGuardar.addActionListener(this);
    }

    // Formatea el inicio del formulario con el nombre y sitio en pantalla
    public void inciar() {
        frm.setTitle("Clientes");
        frm.setLocationRelativeTo(null);
    }
    
    
    // Crea el evento para registrar los datos del cliente
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btnGuardar) {
            mod.setCedula(Integer.parseInt(frm.txtCedula.getText()));
            mod.setNombres(frm.txtNombres.getText());
            mod.setEdad(frm.txtEdad.getText());
            mod.setDireccion(frm.txtDireccion.getText());
            mod.setCelular(frm.txtCelular.getText());
            mod.setEps(frm.cbxEps.getSelectedItem().toString());
            

            if (modC.registrar(mod)) {
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
        frm.txtCedula.setText(null);
        frm.txtNombres.setText(null);
        frm.txtEdad.setText(null);
        frm.txtDireccion.setText(null);
        frm.txtCelular.setText(null);
        frm.cbxEps.setSelectedIndex(0);
        
    }
}
