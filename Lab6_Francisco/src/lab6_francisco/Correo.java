/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_francisco;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Santos
 */
public class Correo extends javax.swing.JFrame {

    /**
     * Creates new form Correo
     */
    public Correo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_login = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ev_correo = new javax.swing.JTextField();
        ev_contraseña = new javax.swing.JPasswordField();
        jb_login = new javax.swing.JButton();
        jd_crear = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_apellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_correo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jc_fecha = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_telefono = new javax.swing.JTextField();
        tf_pais = new javax.swing.JTextField();
        pf_contraseña = new javax.swing.JPasswordField();
        Registrar = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        jd_buzon = new javax.swing.JDialog();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jm_modificar = new javax.swing.JMenuItem();
        jd_modificar = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tf_nombre1 = new javax.swing.JTextField();
        tf_apellido1 = new javax.swing.JTextField();
        tf_correo1 = new javax.swing.JTextField();
        tf_telefono1 = new javax.swing.JTextField();
        tf_pais1 = new javax.swing.JTextField();
        jc_fecha1 = new com.toedter.calendar.JDateChooser();
        pf_contraseña1 = new javax.swing.JPasswordField();
        jb_modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CrearCuenta = new javax.swing.JButton();
        LogIn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        ji_login = new javax.swing.JMenuItem();
        ji_user = new javax.swing.JMenuItem();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Log In");

        jLabel3.setText("Correo");

        jLabel4.setText("Contraseña");

        ev_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ev_correoActionPerformed(evt);
            }
        });

        jb_login.setText("Log In");
        jb_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jd_loginLayout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_loginLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(39, 39, 39)
                            .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ev_correo)
                                .addComponent(ev_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ev_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ev_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Crear Usuario");

        jLabel6.setText("Nombre");

        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });

        jLabel7.setText("Apellido");

        jLabel8.setText("Correo");

        jLabel9.setText("Fecha de Nacimiento");

        jLabel10.setText("Telefono");

        jLabel11.setText("Pais");

        jLabel12.setText("Contraseña");

        tf_pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_paisActionPerformed(evt);
            }
        });

        Registrar.setText("Registrar");
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_crearLayout = new javax.swing.GroupLayout(jd_crear.getContentPane());
        jd_crear.getContentPane().setLayout(jd_crearLayout);
        jd_crearLayout.setHorizontalGroup(
            jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearLayout.createSequentialGroup()
                .addGroup(jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crearLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel5))
                    .addGroup(jd_crearLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_crearLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(45, 45, 45)
                        .addGroup(jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre)
                            .addComponent(tf_apellido)
                            .addComponent(tf_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                        .addGap(176, 176, 176)
                        .addGroup(jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(32, 32, 32)
                        .addGroup(jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_telefono)
                            .addComponent(tf_pais, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(pf_contraseña)))
                    .addGroup(jd_crearLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jd_crearLayout.setVerticalGroup(
            jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(42, 42, 42)
                .addGroup(jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tf_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(pf_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("jMenu1");

        jMenu5.setText("Opciones");

        jm_modificar.setText("Modificar");
        jm_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_modificarActionPerformed(evt);
            }
        });
        jMenu5.add(jm_modificar);

        jMenuBar2.add(jMenu5);

        jd_buzon.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jd_buzonLayout = new javax.swing.GroupLayout(jd_buzon.getContentPane());
        jd_buzon.getContentPane().setLayout(jd_buzonLayout);
        jd_buzonLayout.setHorizontalGroup(
            jd_buzonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_buzonLayout.setVerticalGroup(
            jd_buzonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Modificar");

        jLabel15.setText("Nombre");

        jLabel16.setText("Apellido");

        jLabel17.setText("Correo");

        jLabel18.setText("Fecha de Nacimiento");

        jLabel19.setText("Telefono");

        jLabel20.setText("Pais");

        jLabel21.setText("Contraseña");

        tf_nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombre1ActionPerformed(evt);
            }
        });

        tf_telefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_telefono1ActionPerformed(evt);
            }
        });

        jb_modificar.setText("Modificar");
        jb_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jb_modificarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jd_modificarLayout = new javax.swing.GroupLayout(jd_modificar.getContentPane());
        jd_modificar.getContentPane().setLayout(jd_modificarLayout);
        jd_modificarLayout.setHorizontalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_modificarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_correo1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jd_modificarLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16))
                        .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_modificarLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jd_modificarLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tf_pais1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jd_modificarLayout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(jLabel18)
                            .addGap(18, 18, 18)
                            .addComponent(jc_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_modificarLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel17)
                            .addGap(145, 145, 145)
                            .addComponent(jLabel21)
                            .addGap(18, 18, 18)
                            .addComponent(pf_contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jb_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_modificarLayout.setVerticalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(tf_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(tf_pais1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_correo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(pf_contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jc_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Bienvenidos");

        CrearCuenta.setText("Crear Cuenta");
        CrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearCuentaMouseClicked(evt);
            }
        });

        LogIn.setText("Log In");
        LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInMouseClicked(evt);
            }
        });

        jMenu4.setText("Opciones");

        ji_login.setText("Log In");
        ji_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ji_loginActionPerformed(evt);
            }
        });
        jMenu4.add(ji_login);

        ji_user.setText("Crear Usuario");
        ji_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ji_userActionPerformed(evt);
            }
        });
        jMenu4.add(ji_user);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(CrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreActionPerformed

    private void tf_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_paisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_paisActionPerformed

    private void RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseClicked
        try {
            String nombre;
            String apellido;
            String pais;
            String telefono;
            String correo = "";
            String contraseña;
            Date fechaN;
            //
            nombre = tf_nombre.getText();
            ad.CrearCarpeta(nombre);
            apellido = tf_apellido.getText();
            if (Evaluar(tf_correo.getText()) == false) {
                JOptionPane.showMessageDialog(this, "El Correo ya existe");
                correo = null;
            } else {
                correo = tf_correo.getText();
            }
            fechaN = jc_fecha.getDate();
            pais = tf_pais.getText();
            telefono = tf_telefono.getText();
            contraseña = pf_contraseña.getText();
            if (!nombre.equals(null) || !apellido.equals(null) || !correo.equals(null) || !pais.equals(null) || !telefono.equals(null) || !contraseña.equals(null)) {
                persona.add(new Persona(nombre, apellido, correo, fechaN, pais, telefono, contraseña));
                tf_nombre.setText("");
                tf_apellido.setText("");
                tf_correo.setText("");
                jc_fecha.setDate(null);
                tf_pais.setText("");
                tf_telefono.setText("");
                pf_contraseña.setText("");
                JOptionPane.showMessageDialog(this, "Registro Exitosamente");
            } else {
                JOptionPane.showMessageDialog(this, "No se guardo la Informacion");
            }
            //

        } catch (Exception e) {
        }
    }//GEN-LAST:event_RegistrarMouseClicked

    private void ji_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ji_userActionPerformed
        jd_crear.pack();
        jd_crear.setModal(true);
        jd_crear.setVisible(true);
        jd_crear.setLocationRelativeTo(this);
    }//GEN-LAST:event_ji_userActionPerformed

    private void CrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearCuentaMouseClicked
        jd_crear.pack();
        jd_crear.setModal(true);
        jd_crear.setVisible(true);
        jd_crear.setLocationRelativeTo(this);
    }//GEN-LAST:event_CrearCuentaMouseClicked

    private void LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInMouseClicked
        jd_login.pack();
        jd_login.setModal(true);
        jd_login.setVisible(true);
        jd_login.setLocationRelativeTo(this);
    }//GEN-LAST:event_LogInMouseClicked

    private void ji_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ji_loginActionPerformed
        jd_login.pack();
        jd_login.setModal(true);
        jd_login.setVisible(true);
        jd_login.setLocationRelativeTo(this);
    }//GEN-LAST:event_ji_loginActionPerformed

    private void jb_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_loginMouseClicked
        String Ecorreo, contraseña;
        Ecorreo = ev_correo.getText();
        contraseña = ev_contraseña.getText();
        for (Persona p : persona) {
            if (p.getCorreo().equals(Ecorreo) && p.getContraseña().equals(contraseña)) {
                login = true;
            } else {
                login = false;
            }
        }
        if (login == true) {
            jd_buzon.pack();
            jd_buzon.setModal(true);
            jd_buzon.setVisible(true);
            jd_buzon.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_jb_loginMouseClicked

    private void ev_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ev_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ev_correoActionPerformed

    private void jm_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_modificarActionPerformed
        jd_modificar.pack();
        jd_modificar.setModal(true);
        jd_modificar.setVisible(true);
        jd_modificar.setLocationRelativeTo(this);
    }//GEN-LAST:event_jm_modificarActionPerformed

    private void tf_telefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_telefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_telefono1ActionPerformed

    private void tf_nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombre1ActionPerformed

    private void jb_modificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarMouseEntered

    }//GEN-LAST:event_jb_modificarMouseEntered

    private void jb_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarMouseClicked
        String nombre = "", apellido = "", correo = "", pais = "", telefono = "", contraseña = "";
        Date fechaN = null;
        if (tf_nombre1 == null) {
            for (Persona t : persona) {
                nombre = t.getNombre();
            }
        } else {
            for (Persona t : persona) {
                nombre = tf_nombre1.getText();

            }
        }
        if (tf_apellido1 == null) {
            for (Persona t : persona) {
                apellido = t.getApellido();
            }
        } else {
            for (Persona t : persona) {
                apellido = tf_apellido1.getText();
            }
        }
        if (tf_correo1 == null) {
            for (Persona t : persona) {
                correo = t.getCorreo();
            }
        } else {
            for (Persona t : persona) {
                correo = tf_correo1.getText();
            }
        }
        if (tf_pais1 == null) {
            for (Persona t : persona) {
                pais = t.getPais();
            }
        } else {
            for (Persona t : persona) {
                pais = tf_pais1.getText();
            }
        }
        if (tf_telefono1 == null) {
            for (Persona t : persona) {
                telefono = t.getTelefono();
            }
        } else {
            for (Persona t : persona) {
                telefono = tf_telefono1.getText();
            }
        }
        if (pf_contraseña1 == null) {
            for (Persona t : persona) {
                contraseña = t.getContraseña();
            }
        } else {
            for (Persona t : persona) {
                contraseña = pf_contraseña1.getText();
            }
        }
        if (jc_fecha1 == null) {
            for (Persona t : persona) {
                fechaN = t.getFechaN();
            }
        } else {
            for (Persona t : persona) {
                fechaN = jc_fecha1.getDate();
            }
        }
        persona.add(new Persona(nombre, apellido, correo, fechaN, pais, telefono, contraseña));
        tf_nombre1.setText("");
        tf_apellido1.setText("");
        tf_correo1.setText("");
        jc_fecha1.setDate(null);
        tf_pais1.setText("");
        tf_telefono1.setText("");
        pf_contraseña1.setText("");
    }//GEN-LAST:event_jb_modificarMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Correo().setVisible(true);
            }
        });
    }

    public boolean Evaluar(String correo) {
        for (Persona p : persona) {
            if (p.getCorreo().equals(correo)) {
                return false;
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearCuenta;
    private javax.swing.JButton LogIn;
    private javax.swing.JButton Registrar;
    private javax.swing.JPasswordField ev_contraseña;
    private javax.swing.JTextField ev_correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_modificar;
    private com.toedter.calendar.JDateChooser jc_fecha;
    private com.toedter.calendar.JDateChooser jc_fecha1;
    private javax.swing.JDialog jd_buzon;
    private javax.swing.JDialog jd_crear;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_modificar;
    private javax.swing.JMenuItem ji_login;
    private javax.swing.JMenuItem ji_user;
    private javax.swing.JMenuItem jm_modificar;
    private javax.swing.JPasswordField pf_contraseña;
    private javax.swing.JPasswordField pf_contraseña1;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_apellido1;
    private javax.swing.JTextField tf_correo;
    private javax.swing.JTextField tf_correo1;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JTextField tf_pais;
    private javax.swing.JTextField tf_pais1;
    private javax.swing.JTextField tf_telefono;
    private javax.swing.JTextField tf_telefono1;
    // End of variables declaration//GEN-END:variables
ArrayList<String> correo = new ArrayList();
    ArrayList<Persona> persona = new ArrayList();
    Administrador ad = new Administrador();
    boolean login = false;
}
