package Proyecto.GUI;

import Proyecto.Clases.DatosUsuarios;
import Proyecto.Utilidades.TextPrompt;
import Proyecto.Clases.Usuario;
import javax.swing.JOptionPane;

public class Registrar extends javax.swing.JFrame {

    public DatosUsuarios usuarios = new DatosUsuarios();

    public Registrar() {
        initComponents();
        setLocationRelativeTo(null);
        TextPrompt placeholder1 = new TextPrompt("Usuario", this.jtxtUsuario);
        TextPrompt placeholder2 = new TextPrompt("Correo", this.jtxtCorreo);
        TextPrompt placeholder3 = new TextPrompt("Contraseña", this.jpassClave);
        this.usuarios = this.usuarios.getInstancia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblBienvenido = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jpassClave = new javax.swing.JPasswordField();
        jbtnAtras = new javax.swing.JButton();
        jbtnAceptar = new javax.swing.JButton();
        jtxtCorreo = new javax.swing.JTextField();
        jcbCorreo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblBienvenido.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlblBienvenido.setText("Registro");
        jPanel1.add(jlblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 60));

        jtxtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
        jPanel1.add(jpassClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 170, 30));

        jbtnAtras.setText("Atrás");
        jbtnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 80, -1));

        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 80, -1));
        jPanel1.add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 170, 30));

        jcbCorreo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@outlook.com", "@hotmail.com" }));
        jPanel1.add(jcbCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 100, 30));

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

    private void jbtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtrasActionPerformed
        new Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnAtrasActionPerformed

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        if (this.jtxtUsuario.getText().isEmpty() || this.jpassClave.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar.", "Error.", JOptionPane.ERROR_MESSAGE);
        } else {
            String correo = this.jtxtCorreo.getText() + jcbCorreo.getSelectedItem().toString();
            Usuario usuario = new Usuario(this.jtxtUsuario.getText(),
                    correo,
                    this.jpassClave.getText());
            usuarios.agregarUsuario(usuario);
            JOptionPane.showMessageDialog(null, "Usuario registrado.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        }
        jtxtUsuario.setText("");
        jpassClave.setText("");
    }//GEN-LAST:event_jbtnAceptarActionPerformed
    public DatosUsuarios tomarDatosUsuarios() {
        return this.usuarios;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnAtras;
    private javax.swing.JComboBox<String> jcbCorreo;
    private javax.swing.JLabel jlblBienvenido;
    private javax.swing.JPasswordField jpassClave;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
