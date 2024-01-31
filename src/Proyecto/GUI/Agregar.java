package Proyecto.GUI;

public class Agregar extends javax.swing.JFrame {

    public Agregar() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanFondo = new javax.swing.JPanel();
        jlblTitutlo = new javax.swing.JLabel();
        jlblAutor = new javax.swing.JLabel();
        jlblApartado = new javax.swing.JLabel();
        jlblPaginas = new javax.swing.JLabel();
        jlblPrecio = new javax.swing.JLabel();
        jtxtTitulo = new javax.swing.JTextField();
        jtxtAutor = new javax.swing.JTextField();
        jtxtApartado = new javax.swing.JTextField();
        jtxtPaginas = new javax.swing.JTextField();
        jtxtPrecio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblTitutlo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblTitutlo.setText("Título");
        jpanFondo.add(jlblTitutlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 90, 20));

        jlblAutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblAutor.setText("Autor");
        jpanFondo.add(jlblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 90, 20));

        jlblApartado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblApartado.setText("Género");
        jpanFondo.add(jlblApartado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 90, 20));

        jlblPaginas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblPaginas.setText("Páginas");
        jpanFondo.add(jlblPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 90, 20));

        jlblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblPrecio.setText("Precio");
        jpanFondo.add(jlblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 90, 20));

        jtxtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTituloActionPerformed(evt);
            }
        });
        jpanFondo.add(jtxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 140, 20));

        jtxtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAutorActionPerformed(evt);
            }
        });
        jpanFondo.add(jtxtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 140, 20));
        jpanFondo.add(jtxtApartado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 140, 20));

        jtxtPaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPaginasActionPerformed(evt);
            }
        });
        jpanFondo.add(jtxtPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 140, 20));
        jpanFondo.add(jtxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 140, 20));

        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpanFondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 90, 30));

        jButton2.setText("Agregar");
        jpanFondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jpanFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTituloActionPerformed

    private void jtxtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAutorActionPerformed

    private void jtxtPaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPaginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPaginasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jlblApartado;
    private javax.swing.JLabel jlblAutor;
    private javax.swing.JLabel jlblPaginas;
    private javax.swing.JLabel jlblPrecio;
    private javax.swing.JLabel jlblTitutlo;
    private javax.swing.JPanel jpanFondo;
    private javax.swing.JTextField jtxtApartado;
    private javax.swing.JTextField jtxtAutor;
    private javax.swing.JTextField jtxtPaginas;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JTextField jtxtTitulo;
    // End of variables declaration//GEN-END:variables
}
