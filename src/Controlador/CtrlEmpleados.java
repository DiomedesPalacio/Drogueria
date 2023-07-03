package Controlador;

import formularios.frmEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import variables.Empleados;
import variables.ProcesoEmpleados;

public class CtrlEmpleados implements ActionListener {

    private Empleados mod;
    private ProcesoEmpleados modC;
    private frmEmpleados frm;

    public CtrlEmpleados(Empleados mod, ProcesoEmpleados modC, frmEmpleados frm) {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.btnGuardar.addActionListener(this);
    }

    // Formatea el inicio del formulario con el nombre y sitio en pantalla
    public void inciar() {
        frm.setTitle("Registro de empleados");
        frm.setLocationRelativeTo(null);
    }

    // Crea el evento para registrar los datos del cliente
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btnGuardar) {
            mod.setCedula(Integer.parseInt(frm.txtIdentificacion.getText()));
            mod.setNombre(frm.txtNombres.getText());
            mod.setCargo(frm.txtCargo.getText());
            mod.setUsuario(frm.txtUsuario.getText());
            mod.setPassword(frm.txtPassword.getText());

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
    public void Limpiar() {
        frm.txtIdentificacion.setText(null);
        frm.txtNombres.setText(null);
        frm.txtCargo.setText(null);
        frm.txtUsuario.setText(null);
        frm.txtPassword.setText(null);

    }

}
