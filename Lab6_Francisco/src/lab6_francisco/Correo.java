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
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
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

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(jTextField1)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))))
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
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            nombre=tf_nombre.getText();
            ad.CrearCarpeta(nombre);
            apellido=tf_apellido.getText();
            if (Evaluar(tf_correo.getText())==false) {
                JOptionPane.showMessageDialog(this, "El Correo ya existe");
                correo=null;
            }else{
                correo=tf_correo.getText();
            }
            fechaN=jc_fecha.getDate();
            pais=tf_pais.getText();
            telefono=tf_telefono.getText();
            contraseña=pf_contraseña.getText();
            persona.add(new Persona(nombre,apellido,correo,fechaN,pais,telefono,contraseña));
            //
            tf_nombre.setText("");
            tf_apellido.setText("");
            tf_correo.setText("");
            jc_fecha.setDate(null);
            tf_pais.setText("");
            tf_telefono.setText("");
            pf_contraseña.setText("");
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
    public boolean Evaluar(String correo){
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private com.toedter.calendar.JDateChooser jc_fecha;
    private javax.swing.JDialog jd_crear;
    private javax.swing.JDialog jd_login;
    private javax.swing.JMenuItem ji_login;
    private javax.swing.JMenuItem ji_user;
    private javax.swing.JPasswordField pf_contraseña;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_correo;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_pais;
    private javax.swing.JTextField tf_telefono;
    // End of variables declaration//GEN-END:variables
ArrayList<String> correo=new ArrayList();
ArrayList<Persona> persona=new ArrayList();
Administrador ad = new Administrador();
}
