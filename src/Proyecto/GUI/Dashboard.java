package Proyecto.GUI;

import Proyecto.Clases.DatosUsuarios;
import Proyecto.Utilidades.ResizeImg;
import Proyecto.Clases.Usuario;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {
    private DatosUsuarios usuarios = new DatosUsuarios();
    private Usuario sesionActual = new Usuario();
    private ResizeImg img;

    public Dashboard() {
        initComponents();
        for (int i = 0; i < jpbContenedor.getTabCount(); i++) {
            jpbContenedor.setEnabledAt(i, false);
        }
        this.jlblBloqueColor.setBackground(Color.WHITE);
        this.jlblBloqueColor.setOpaque(true);
        setLocationRelativeTo(null);
        img = new ResizeImg("src/Proyecto/IMG/bookicon.png",
                jlbliconLibro, true);
        img = new ResizeImg("src/Proyecto/IMG/solicitudicon.png",
                jlbliconSolicitud, true);
        img = new ResizeImg("src/Proyecto/IMG/saliricon.png",
                jlblCerrarSesion, true);
    }

    public Dashboard(Usuario sesionActual) {
        this();
        this.sesionActual = sesionActual;
        this.jlblSaludoEntrada.setText("¡Hola, " + this.sesionActual.getUsuario() + "!");
        this.jlblidentificadorRol.setText("Tu rol es de: " + this.sesionActual.getRol());
        String rolActual = this.sesionActual.getRol() + "";
        switch (rolActual) {
            case "ADMIN":
                System.out.println("Ha iniciado como admininistrador.");
                img = new ResizeImg("src/Proyecto/IMG/adminBanner.png",
                        jlblBanner);
                img = new ResizeImg("src/Proyecto/IMG/usericon.png",
                        jlbliconUsuario, true);
                this.usuarios = this.usuarios.getInstancia();
                actualizarTablaUsuarios();
                break;
            case "USUARIO":
                System.out.println("Ha iniciado como usuario.");
                img = new ResizeImg("src/Proyecto/IMG/userBanner.png",
                        jlblBanner);
                this.jlbliconUsuario.setEnabled(false);
                this.jLblUsuarios.setText("");
                this.jLblUsuarios.setEnabled(false);
                quitarEventoLabel(jlbliconUsuario);
                quitarEventoLabel(jLblUsuarios);
                break;
            default:
                System.err.println("ERROR!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaneBase = new javax.swing.JPanel();
        jlblSaludoEntrada = new javax.swing.JLabel();
        jlblidentificadorRol = new javax.swing.JLabel();
        jpaneLateralIzq = new javax.swing.JPanel();
        jlblCrudTXT = new javax.swing.JLabel();
        jlblDashboardTXT = new javax.swing.JLabel();
        jlblBanner = new javax.swing.JLabel();
        jLblLibros = new javax.swing.JLabel();
        jlbliconLibro = new javax.swing.JLabel();
        jLblSolicitudes = new javax.swing.JLabel();
        jlbliconSolicitud = new javax.swing.JLabel();
        jLblUsuarios = new javax.swing.JLabel();
        jlbliconUsuario = new javax.swing.JLabel();
        jlblCerrarSesion = new javax.swing.JLabel();
        jlblBloqueColor = new javax.swing.JLabel();
        jpbContenedor = new javax.swing.JTabbedPane();
        jtbdpLibros = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbLibros = new javax.swing.JTable();
        jbtnAgregar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jtbdpSolicitudes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbdpUsuarios = new javax.swing.JPanel();
        jscrollUsuarios = new javax.swing.JScrollPane();
        jtableUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpaneBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblSaludoEntrada.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jpaneBase.add(jlblSaludoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 200, 20));

        jlblidentificadorRol.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jpaneBase.add(jlblidentificadorRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 180, 20));

        jpaneLateralIzq.setBackground(new java.awt.Color(153, 153, 255));
        jpaneLateralIzq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblCrudTXT.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jlblCrudTXT.setText("CRUD");
        jpaneLateralIzq.add(jlblCrudTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 9, 50, 30));

        jlblDashboardTXT.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jlblDashboardTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDashboardTXT.setText("Dashboard");
        jpaneLateralIzq.add(jlblDashboardTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 42));
        jpaneLateralIzq.add(jlblBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 100));

        jLblLibros.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLblLibros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblLibros.setText("Libros");
        jLblLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblLibrosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblLibrosMousePressed(evt);
            }
        });
        jpaneLateralIzq.add(jLblLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, 40));

        jlbliconLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbliconLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbliconLibroMousePressed(evt);
            }
        });
        jpaneLateralIzq.add(jlbliconLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 90, 80));

        jLblSolicitudes.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLblSolicitudes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblSolicitudes.setText("Solicitudes");
        jLblSolicitudes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblSolicitudesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblSolicitudesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblSolicitudesMousePressed(evt);
            }
        });
        jpaneLateralIzq.add(jLblSolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 90, 40));

        jlbliconSolicitud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbliconSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbliconSolicitudMousePressed(evt);
            }
        });
        jpaneLateralIzq.add(jlbliconSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 80, 70));

        jLblUsuarios.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLblUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblUsuarios.setText("Usuarios");
        jLblUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblUsuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblUsuariosMousePressed(evt);
            }
        });
        jpaneLateralIzq.add(jLblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 90, 40));

        jlbliconUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbliconUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbliconUsuarioMousePressed(evt);
            }
        });
        jpaneLateralIzq.add(jlbliconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 90, 80));

        jpaneBase.add(jpaneLateralIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 660));

        jlblCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblCerrarSesionMousePressed(evt);
            }
        });
        jpaneBase.add(jlblCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 70, 70));
        jpaneBase.add(jlblBloqueColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 790, 70));

        jtbdpLibros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtbLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Autor", "Páginas", "Precio", "Copias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtbLibros);
        if (jtbLibros.getColumnModel().getColumnCount() > 0) {
            jtbLibros.getColumnModel().getColumn(0).setResizable(false);
            jtbLibros.getColumnModel().getColumn(1).setResizable(false);
            jtbLibros.getColumnModel().getColumn(2).setResizable(false);
            jtbLibros.getColumnModel().getColumn(3).setResizable(false);
            jtbLibros.getColumnModel().getColumn(4).setResizable(false);
        }

        jtbdpLibros.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 730, 470));

        jbtnAgregar.setText("Agregar");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });
        jtbdpLibros.add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jtbdpLibros.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jbtnEditar.setText("Editar");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });
        jtbdpLibros.add(jbtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jtbdpLibros.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, -1));

        jpbContenedor.addTab("tab1", jtbdpLibros);

        jtbdpSolicitudes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Solicitudes");
        jtbdpSolicitudes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        jpbContenedor.addTab("tab2", jtbdpSolicitudes);

        jbdpUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jscrollUsuarios.setViewportView(jtableUsuarios);

        jbdpUsuarios.add(jscrollUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jpbContenedor.addTab("tab3", jbdpUsuarios);

        jpaneBase.add(jpbContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 790, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaneBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaneBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLblLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblLibrosMouseEntered
        jLblLibros.setForeground(new Color(0, 51, 153));
    }//GEN-LAST:event_jLblLibrosMouseEntered

    private void jLblLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblLibrosMouseExited
        jLblLibros.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jLblLibrosMouseExited

    private void jLblSolicitudesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblSolicitudesMouseEntered
        jLblSolicitudes.setForeground(new Color(0, 51, 153));
    }//GEN-LAST:event_jLblSolicitudesMouseEntered

    private void jLblSolicitudesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblSolicitudesMouseExited
        jLblSolicitudes.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jLblSolicitudesMouseExited

    private void jLblLibrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblLibrosMousePressed
        jpbContenedor.setSelectedIndex(0);
    }//GEN-LAST:event_jLblLibrosMousePressed

    private void jLblSolicitudesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblSolicitudesMousePressed
        jpbContenedor.setSelectedIndex(1);
    }//GEN-LAST:event_jLblSolicitudesMousePressed

    private void jlbliconLibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbliconLibroMousePressed
        jpbContenedor.setSelectedIndex(0);
    }//GEN-LAST:event_jlbliconLibroMousePressed

    private void jlbliconUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbliconUsuarioMousePressed
        jpbContenedor.setSelectedIndex(2);
    }//GEN-LAST:event_jlbliconUsuarioMousePressed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        new Agregar().setVisible(true);
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jLblUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblUsuariosMouseEntered
        jLblUsuarios.setForeground(new Color(0, 51, 153));
    }//GEN-LAST:event_jLblUsuariosMouseEntered

    private void jLblUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblUsuariosMouseExited
        jLblUsuarios.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jLblUsuariosMouseExited

    private void jLblUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblUsuariosMousePressed
        jpbContenedor.setSelectedIndex(2);
    }//GEN-LAST:event_jLblUsuariosMousePressed

    private void jlbliconSolicitudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbliconSolicitudMousePressed
        jpbContenedor.setSelectedIndex(1);
    }//GEN-LAST:event_jlbliconSolicitudMousePressed

    private void jlblCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCerrarSesionMousePressed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea salir?",
                "Seleccione su respuesta.",
                JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "Saliendo de la sesión...",
                    "¡Hasta luego!",
                    JOptionPane.INFORMATION_MESSAGE);
            new Inicio().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null,
                    "Continúa en la sesión",
                    "¡Bienvenido de vuelta!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jlblCerrarSesionMousePressed

    private void quitarEventoLabel(JLabel label) {
        for (MouseListener listener : label.getMouseListeners()) {
            label.removeMouseListener(listener);
        }
    }
    
    public void actualizarTablaUsuarios() {
        List<Usuario> listaUsariosParaTabla = this.usuarios.getListaUsuarios();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Usuario");
        model.addColumn("Correo");

        for (Usuario user : listaUsariosParaTabla) {
            model.addRow(new Object[]{user.getUsuario(), user.getCorreo()});
        }

        jtableUsuarios.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblLibros;
    private javax.swing.JLabel jLblSolicitudes;
    private javax.swing.JLabel jLblUsuarios;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jbdpUsuarios;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JLabel jlblBanner;
    private javax.swing.JLabel jlblBloqueColor;
    private javax.swing.JLabel jlblCerrarSesion;
    private javax.swing.JLabel jlblCrudTXT;
    private javax.swing.JLabel jlblDashboardTXT;
    private javax.swing.JLabel jlblSaludoEntrada;
    private javax.swing.JLabel jlbliconLibro;
    private javax.swing.JLabel jlbliconSolicitud;
    private javax.swing.JLabel jlbliconUsuario;
    private javax.swing.JLabel jlblidentificadorRol;
    private javax.swing.JPanel jpaneBase;
    private javax.swing.JPanel jpaneLateralIzq;
    private javax.swing.JTabbedPane jpbContenedor;
    private javax.swing.JScrollPane jscrollUsuarios;
    private javax.swing.JTable jtableUsuarios;
    private javax.swing.JTable jtbLibros;
    private javax.swing.JPanel jtbdpLibros;
    private javax.swing.JPanel jtbdpSolicitudes;
    // End of variables declaration//GEN-END:variables
}
