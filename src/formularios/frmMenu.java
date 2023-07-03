package formularios;

import Controlador.CtrlClientes;
import Controlador.CtrlEmpleados;
import Controlador.CtrlEntregas;
import Controlador.CtrlProducto;
import variables.Clientes;
import variables.Empleados;
import variables.Entregas;
import variables.ProcesoClientes;
import variables.ProcesoEmpleados;
import variables.ProcesoEntregas;
import variables.ProcesosProducto;
import variables.Productos;

public class frmMenu extends javax.swing.JFrame {

    public frmMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

   // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuProcesos = new javax.swing.JMenu();
        menuEmpleados = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenuItem();
        menuProductos = new javax.swing.JMenuItem();
        menuEntregas = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();
        menuCerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu de la aplicación");

        menuProcesos.setBorder(new javax.swing.border.SoftBevelBorder(0));
        menuProcesos.setText("Ventanas de procesos");

        menuEmpleados.setText("Registrar Empleados");
        menuEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmpleadosActionPerformed(evt);
            }
        });
        menuProcesos.add(menuEmpleados);

        menuClientes.setText("Registrar Clientes");
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });
        menuProcesos.add(menuClientes);

        menuProductos.setText("Registrar y Modificar Productos");
        menuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosActionPerformed(evt);
            }
        });
        menuProcesos.add(menuProductos);

        menuEntregas.setText("Realizar Entregas");
        menuEntregas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEntregasActionPerformed(evt);
            }
        });
        menuProcesos.add(menuEntregas);

        menuReportes.setText("Crear Reportes");
        menuReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportesActionPerformed(evt);
            }
        });
        menuProcesos.add(menuReportes);

        jMenuBar1.add(menuProcesos);

        menuSalir.setBorder(new javax.swing.border.SoftBevelBorder(0));
        menuSalir.setText("Salir");

        menuCerrar.setText("Cerrar Sesion");
        menuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarActionPerformed(evt);
            }
        });
        menuSalir.add(menuCerrar);

        jMenuBar1.add(menuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmpleadosActionPerformed
        Empleados mod = new Empleados();
        ProcesoEmpleados modC = new ProcesoEmpleados();
        frmEmpleados frm = new frmEmpleados();

        CtrlEmpleados ctrl = new CtrlEmpleados(mod, modC, frm);
        ctrl.inciar();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuEmpleadosActionPerformed

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        Clientes mod = new Clientes();
        ProcesoClientes modC = new ProcesoClientes();
        frmClientes frm = new frmClientes();

        CtrlClientes ctrl = new CtrlClientes(mod, modC, frm);
        ctrl.inciar();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuClientesActionPerformed

    private void menuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosActionPerformed
        Productos mod = new Productos();
        ProcesosProducto modP = new ProcesosProducto();
        frmProducto frm = new frmProducto();

        CtrlProducto ctrl = new CtrlProducto(mod, modP, frm);
        ctrl.inciar();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuProductosActionPerformed

    private void menuEntregasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEntregasActionPerformed
        Entregas mod = new Entregas();
        ProcesoEntregas modE = new ProcesoEntregas();
        frmEntregas frm = new frmEntregas();

        CtrlEntregas ctrl = new CtrlEntregas(mod, modE, frm);
        ctrl.inciar();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuEntregasActionPerformed

    private void menuReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportesActionPerformed
        frmReportes obj = new frmReportes();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuReportesActionPerformed

    private void menuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuCerrar;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenuItem menuEmpleados;
    private javax.swing.JMenuItem menuEntregas;
    private javax.swing.JMenu menuProcesos;
    private javax.swing.JMenuItem menuProductos;
    private javax.swing.JMenuItem menuReportes;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
