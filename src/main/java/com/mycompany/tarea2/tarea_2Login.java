package com.mycompany.tarea2;
import static com.mycompany.tarea2.datosComprobador.password;
import static com.mycompany.tarea2.datosComprobador.username;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.WindowConstants;
public class tarea_2Login extends javax.swing.JFrame {      
    static int option;
    static String tiempoRefres;
    static int timer=0;
    public tarea_2Login() throws IOException, InterruptedException {
    String password=null;
    String username=null;    
    datosComprobador.username = username;
    datosComprobador.password = password;    
    
        initComponents();             
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        access_code = new javax.swing.JLabel();
        acceso = new javax.swing.JLabel();
        accesoData = new javax.swing.JLabel();
        access_codeData = new javax.swing.JLabel();
        loginExitoso = new javax.swing.JLabel();
        optionFahrenheit = new javax.swing.JRadioButton();
        tiempoRefresco = new javax.swing.JTextField();
        mostrarTiempo = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        login = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        boxPassword = new javax.swing.JPasswordField();
        boxUsername = new javax.swing.JTextField();
        buttonVerify = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jDialog1.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        jDialog1.setLocation(new java.awt.Point(500, 200));
        jDialog1.setPreferredSize(new java.awt.Dimension(900, 100));
        jDialog1.setResizable(false);
        jDialog1.setSize(new java.awt.Dimension(900, 182));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFocusable(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        access_code.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        access_code.setText("access_code: ");

        acceso.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        acceso.setText("acceso: ");

        loginExitoso.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        loginExitoso.setText("Login exitoso!");

        optionFahrenheit.setBackground(new java.awt.Color(0, 0, 0));
        optionFahrenheit.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        optionFahrenheit.setText("grados °F");
        optionFahrenheit.setActionCommand("grados");
        optionFahrenheit.setBorder(null);

        tiempoRefresco.setBackground(new java.awt.Color(222, 222, 222));
        tiempoRefresco.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        tiempoRefresco.setText("Tiempo de refresco");

        mostrarTiempo.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete-icon.png"))); // NOI18N
        salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salir.setPreferredSize(new java.awt.Dimension(25, 25));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play-icon.png"))); // NOI18N
        ok.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ok.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/check-icon-no-selec.png"))); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginExitoso)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(access_code)
                            .addComponent(acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ok))
                            .addComponent(access_codeData, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accesoData, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiempoRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(loginExitoso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accesoData, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acceso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(access_code, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(access_codeData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(optionFahrenheit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tiempoRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mostrarTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok))
                .addContainerGap(319, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        login.setBackground(new java.awt.Color(0, 0, 0));
        login.setPreferredSize(new java.awt.Dimension(400, 200));

        lblPassword.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        lblPassword.setText("usuario :");

        lblUsername.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        lblUsername.setText("contraseña : ");

        boxPassword.setBackground(new java.awt.Color(153, 153, 153));
        boxPassword.setForeground(new java.awt.Color(0, 0, 0));
        boxPassword.setCaretColor(new java.awt.Color(0, 0, 0));

        boxUsername.setBackground(new java.awt.Color(153, 153, 153));

        buttonVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check-icon-no-selec.png"))); // NOI18N
        buttonVerify.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonVerify.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/check-icon.png"))); // NOI18N
        buttonVerify.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/check-icon.png"))); // NOI18N
        buttonVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerifyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonVerify)
                .addGap(63, 63, 63))
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(lblPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(boxPassword))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(boxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(buttonVerify)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        lblPassword.getAccessibleContext().setAccessibleName("username :");
        lblUsername.getAccessibleContext().setAccessibleName("password :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                                                                
    private void buttonVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerifyActionPerformed
        password=new String(boxPassword.getPassword());                         //la funcion del button 'verify'  se   encarga   de
        username=boxUsername.getText();                                         //almacenar los datos de usuario y clave para luego
        try {                                                                   //comprobar  si    son    los    datos    correctos
            Thread.sleep(4*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(tarea_2Login.class.getName()).log(Level.SEVERE,
                null, ex);
        }
        if(Main.pasarDato!=null){
            jLabel1.setText(datosComprobador.username);
            jDialog1.setVisible(true);
            jDialog1.setSize(500,300);           
            accesoData.setText(Main.pasarDato);
            access_codeData.setText(Main.pasarDato2);
            jLabel1.setText("");
            dispose()
            ;}else{jLabel1.setText("Contraseña o usuario incorrecto");}
    }//GEN-LAST:event_buttonVerifyActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
                String test;                                                            //la funcion del button 'ok' es almacenar el  valor
        if(optionFahrenheit.isSelected()){                                      //de el tiempo de refresco para luego  calcular  el
            option = 1                                                          //tiempo final, ademas  ayuda   a   comprobar    el
            ;}else{option=2;}                                                       //radiobutton    de    la    unidad  de temperatura
        tiempoRefres = tiempoRefresco.getText();
        if("Tiempo de refresco".equals(tiempoRefres)|| Integer.parseInt
            (tiempoRefres)< 3||Integer.parseInt(tiempoRefres)>120){tiempoRefres="3";
        } else {mostrarTiempo.setText("TIEMPO INVALIDO");}
        mostrarTiempo.setText("Tiempo ingresado: "+tiempoRefres+"s");
        try {
            Thread.sleep(1*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(tarea_2Login.class.getName()).log(Level.SEVERE,
                null, ex);
        }
        tarea_2Data data = new tarea_2Data();data.setVisible(true);
        int timer = 1;
    }//GEN-LAST:event_okActionPerformed
  public void main(String args[]) throws Exception {            
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.
                    UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tarea_2Login.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tarea_2Login.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tarea_2Login.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tarea_2Login.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public  void run() {
                try {
                    new tarea_2Login().setVisible(true);
                } catch (IOException | InterruptedException ex) {
                    Logger.getLogger(tarea_2Login.class.getName()).log(Level.
                            SEVERE, null, ex);
                 
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acceso;
    private javax.swing.JLabel accesoData;
    private javax.swing.JLabel access_code;
    private javax.swing.JLabel access_codeData;
    private javax.swing.JPasswordField boxPassword;
    private javax.swing.JTextField boxUsername;
    private javax.swing.JButton buttonVerify;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel login;
    private javax.swing.JLabel loginExitoso;
    private javax.swing.JLabel mostrarTiempo;
    private javax.swing.JButton ok;
    private javax.swing.JRadioButton optionFahrenheit;
    private javax.swing.JButton salir;
    private javax.swing.JTextField tiempoRefresco;
    // End of variables declaration//GEN-END:variables

}
