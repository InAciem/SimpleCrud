package Proyecto.GUI;

import Proyecto.Clases.DatosUsuarios;
import Proyecto.Clases.Usuario;
import Proyecto.Utilidades.TextPrompt;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Inicio extends javax.swing.JFrame {
    private DatosUsuarios usuarios = new DatosUsuarios();
    private Usuario SesionPendiente = new Usuario();

    public Inicio() {
        initComponents();
        this.usuarios = this.usuarios.getInstancia();
        setLocationRelativeTo(null);
        Usuario admin = new Usuario("admi", "123");
        admin.convertirAdmin();
        usuarios.agregarUsuario(admin);
        TextPrompt placeholder1 = new TextPrompt("Usuario", this.jtxtUsuario);
        TextPrompt placeholder2 = new TextPrompt("Contraseña", this.jpassClave);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblBienvenido = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jpassClave = new javax.swing.JPasswordField();
        jbtnIngresar = new javax.swing.JButton();
        jbtnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblBienvenido.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlblBienvenido.setText("¡Hola, mundo!");
        jPanel1.add(jlblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 60));

        jtxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 170, 30));

        jpassClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassClaveActionPerformed(evt);
            }
        });
        jPanel1.add(jpassClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 170, 30));

        jbtnIngresar.setText("Ingresar");
        jbtnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 110, -1));

        jbtnRegistrar.setText("Registrar");
        jbtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsuarioActionPerformed

    }//GEN-LAST:event_jtxtUsuarioActionPerformed

    private void jpassClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassClaveActionPerformed

    private void jbtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresarActionPerformed
        String usuario = this.jtxtUsuario.getText();
        String clave = this.jpassClave.getText();
        if (this.usuarios.verificarUsuario(usuario, clave)) {
            this.usuarios.reemplazarUsuarioPorNombreDeUsuario(SesionPendiente,
                    usuario);
            System.out.println(SesionPendiente + "Esto es login");
            new Dashboard(this.SesionPendiente).setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(null, "¡El usuario existe, bienvenido!",
                    "¡Bienvenido!",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "El usuario no existe.",
                    "Error.",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnIngresarActionPerformed

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
        new Registrar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnIngresar;
    private javax.swing.JButton jbtnRegistrar;
    private javax.swing.JLabel jlblBienvenido;
    private javax.swing.JPasswordField jpassClave;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}