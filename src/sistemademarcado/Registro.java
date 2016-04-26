/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemademarcado;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author JGran
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        nombre_lbl = new javax.swing.JLabel();
        apellido_lbl = new javax.swing.JLabel();
        dir_lbl = new javax.swing.JLabel();
        tel_lbl = new javax.swing.JLabel();
        cel_lbl = new javax.swing.JLabel();
        user_lbl = new javax.swing.JLabel();
        pass_lbl = new javax.swing.JLabel();
        area_lbl = new javax.swing.JLabel();
        cargo_lbl = new javax.swing.JLabel();
        genero_lbl = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JTextField();
        apellido_txt = new javax.swing.JTextField();
        dir_txt = new javax.swing.JTextField();
        tel_txt = new javax.swing.JTextField();
        cel_txt = new javax.swing.JTextField();
        usuario_txt = new javax.swing.JTextField();
        pass_txt = new javax.swing.JTextField();
        area_txt = new javax.swing.JTextField();
        cargo_txt = new javax.swing.JTextField();
        fechnac_lbl = new javax.swing.JLabel();
        fechnac_frmtxt = new javax.swing.JFormattedTextField();
        ced_lbl = new javax.swing.JLabel();
        ced_txt = new javax.swing.JTextField();
        nuevo_btn = new javax.swing.JButton();
        guardar_btn = new javax.swing.JButton();
        Masculino = new javax.swing.JRadioButton();
        Femenino = new javax.swing.JRadioButton();
        cancelar_btn = new javax.swing.JButton();
        eliminar_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        actualizar_btn = new javax.swing.JButton();
        email_lbl = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 156, 180));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        nombre_lbl.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        nombre_lbl.setForeground(new java.awt.Color(255, 255, 255));
        nombre_lbl.setText("Nombre");

        apellido_lbl.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        apellido_lbl.setForeground(new java.awt.Color(255, 255, 255));
        apellido_lbl.setText("Apellido");

        dir_lbl.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        dir_lbl.setForeground(new java.awt.Color(255, 255, 255));
        dir_lbl.setText("Dirección");

        tel_lbl.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        tel_lbl.setForeground(new java.awt.Color(255, 255, 255));
        tel_lbl.setText("Teléfono");

        cel_lbl.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        cel_lbl.setForeground(new java.awt.Color(255, 255, 255));
        cel_lbl.setText("Celular");

        user_lbl.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        user_lbl.setForeground(new java.awt.Color(255, 255, 255));
        user_lbl.setText("Usuario");

        pass_lbl.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        pass_lbl.setForeground(new java.awt.Color(255, 255, 255));
        pass_lbl.setText("Contraseña");

        area_lbl.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        area_lbl.setForeground(new java.awt.Color(255, 255, 255));
        area_lbl.setText("Área");

        cargo_lbl.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        cargo_lbl.setForeground(new java.awt.Color(255, 255, 255));
        cargo_lbl.setText("Cargo");

        genero_lbl.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        genero_lbl.setForeground(new java.awt.Color(255, 255, 255));
        genero_lbl.setText("Género");

        nombre_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_txtActionPerformed(evt);
            }
        });

        fechnac_lbl.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        fechnac_lbl.setForeground(new java.awt.Color(255, 255, 255));
        fechnac_lbl.setText("Fecha de Nacimiento");

        fechnac_frmtxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yyyy"))));

        ced_lbl.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        ced_lbl.setForeground(new java.awt.Color(255, 255, 255));
        ced_lbl.setText("Cédula");

        nuevo_btn.setText("Nuevo");
        nuevo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_btnActionPerformed(evt);
            }
        });

        guardar_btn.setText("Guardar");
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });

        Masculino.setText("Masculino");

        Femenino.setText("Femenino");

        cancelar_btn.setText("Cancelar");
        cancelar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btnActionPerformed(evt);
            }
        });

        eliminar_btn.setText("Eliminar");
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Dirección", "Teléfono", "Celular", "Usuario", "E-Mail", "Área", "Cargo", "Género", "Fecha de Nacimiento", "Cédula"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        actualizar_btn.setText("Actualizar");
        actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_btnActionPerformed(evt);
            }
        });

        email_lbl.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        email_lbl.setForeground(new java.awt.Color(255, 255, 255));
        email_lbl.setText("E-mail");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nuevo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminar_btn)
                        .addGap(321, 321, 321)
                        .addComponent(actualizar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cargo_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apellido_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dir_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tel_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ced_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cel_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(user_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pass_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(area_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(email_lbl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(fechnac_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genero_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(apellido_txt)
                            .addComponent(dir_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(area_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechnac_frmtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ced_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Masculino, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Femenino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(257, 257, 257))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {apellido_txt, area_txt, cargo_txt, ced_txt, cel_txt, dir_txt, email_txt, fechnac_frmtxt, nombre_txt, pass_txt, tel_txt, usuario_txt});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelar_btn, eliminar_btn, guardar_btn, nuevo_btn});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellido_lbl)
                            .addComponent(apellido_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dir_lbl)
                            .addComponent(dir_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cel_lbl))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(usuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(user_lbl)))
                            .addComponent(tel_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(area_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cargo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cargo_lbl)))
                            .addComponent(area_lbl))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Masculino)
                            .addComponent(genero_lbl)
                            .addComponent(Femenino))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechnac_frmtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechnac_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ced_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ced_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email_lbl)
                            .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nuevo_btn)
                        .addComponent(guardar_btn)
                        .addComponent(cancelar_btn)
                        .addComponent(eliminar_btn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(actualizar_btn)
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancelar_btn, eliminar_btn, guardar_btn, nuevo_btn});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Femenino, Masculino, apellido_txt, area_txt, cargo_txt, ced_txt, cel_txt, dir_txt, email_txt, fechnac_frmtxt, nombre_txt, pass_txt, tel_txt, usuario_txt});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_txtActionPerformed

    private void nuevo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_btnActionPerformed
      limpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevo_btnActionPerformed

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed

        Conexion CONN = new Conexion();
        CONN.CONECTAR();

        String nombre = nombre_txt.getText();
        String apellido = apellido_txt.getText();
        String direccion = dir_txt.getText();
        String telefono = tel_txt.getText();
        String celular = cel_txt.getText();
        String usuario = usuario_txt.getText();
        String pass = pass_txt.getText();
        String area = area_txt.getText();
        String cargo = cargo_txt.getText();
        String fecha_nac = fechnac_frmtxt.getText();
        String cedula = ced_txt.getText();
        String email = email_txt.getText();
        String genero = "";
        if (Masculino.isSelected()) {
            genero = Masculino.getActionCommand();
        } else {
            genero = Femenino.getActionCommand();
        }
        
        CONN.EJECUTAR("INSERT INTO marcado.personal(Nombre,Apellido,Direccion,Telefono,Celular,Usuario,Pass,Area,Cargo,Genero,Fecha_Nac,Cedula,email) VALUES('" +nombre+ "', '" +apellido+ "', '" +direccion+ "', '"+telefono+"', '"+celular+"', '"+usuario+"', '"+pass+"', '"+area+"', '"+cargo+"', '"+genero+"', '"+fecha_nac+"', '"+cedula+"', '"+email+"');");
        JOptionPane.showMessageDialog(null, "¡Registro creado exitosamente!");
        actualizar();
        CONN.CERRAR();
        limpiar();
// TODO add your handling code here:
    }//GEN-LAST:event_guardar_btnActionPerformed

    private void cancelar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btnActionPerformed
      
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelar_btnActionPerformed

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_btnActionPerformed

    private void actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_btnActionPerformed
      
        actualizar();
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizar_btnActionPerformed

     public void limpiar(){
        
        nombre_txt.setText("");
        apellido_txt.setText("");
        dir_txt.setText("");
        tel_txt.setText("");
        cel_txt.setText("");
        usuario_txt.setText("");
        pass_txt.setText("");
        area_txt.setText("");
        cargo_txt.setText("");
        fechnac_frmtxt.setText("");
        ced_txt.setText("");
        nombre_txt.requestFocus();
    }
     
      public void actualizar(){
        Conexion CONN = new Conexion();
        CONN.CONECTAR();
        ResultSet rs = CONN.CONSULTAR("SELECT * FROM personal order by Apellido ASC");
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    }
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Femenino;
    private javax.swing.JRadioButton Masculino;
    private javax.swing.JButton actualizar_btn;
    private javax.swing.JLabel apellido_lbl;
    private javax.swing.JTextField apellido_txt;
    private javax.swing.JLabel area_lbl;
    private javax.swing.JTextField area_txt;
    private javax.swing.JButton cancelar_btn;
    private javax.swing.JLabel cargo_lbl;
    private javax.swing.JTextField cargo_txt;
    private javax.swing.JLabel ced_lbl;
    private javax.swing.JTextField ced_txt;
    private javax.swing.JLabel cel_lbl;
    private javax.swing.JTextField cel_txt;
    private javax.swing.JLabel dir_lbl;
    private javax.swing.JTextField dir_txt;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JTextField email_txt;
    private javax.swing.JFormattedTextField fechnac_frmtxt;
    private javax.swing.JLabel fechnac_lbl;
    private javax.swing.JLabel genero_lbl;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nombre_lbl;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JButton nuevo_btn;
    private javax.swing.JLabel pass_lbl;
    private javax.swing.JTextField pass_txt;
    private javax.swing.JLabel tel_lbl;
    private javax.swing.JTextField tel_txt;
    private javax.swing.JLabel user_lbl;
    private javax.swing.JTextField usuario_txt;
    // End of variables declaration//GEN-END:variables
}
