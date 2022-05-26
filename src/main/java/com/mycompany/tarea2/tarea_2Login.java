package com.mycompany.tarea2;

import static com.mycompany.tarea2.datosComprobador.password;
import static com.mycompany.tarea2.datosComprobador.username;
//import com.mycompany.tarea2.tarea_2Data.timer;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


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
        ok = new java.awt.Button();
        accesoData = new javax.swing.JLabel();
        access_codeData = new javax.swing.JLabel();
        loginExitoso = new javax.swing.JLabel();
        optionFahrenheit = new javax.swing.JRadioButton();
        tiempoRefresco = new javax.swing.JTextField();
        mostrarTiempo = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        boxPassword = new javax.swing.JPasswordField();
        boxUsername = new javax.swing.JTextField();
        buttonVerify = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jDialog1.setPreferredSize(new java.awt.Dimension(700, 206));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 182));

        access_code.setText("access_code: ");

        acceso.setText("acceso: ");

        ok.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ok.setLabel("button1");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        loginExitoso.setText("Login exitoso!");

        optionFahrenheit.setText("degrees °F");
        optionFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionFahrenheitActionPerformed(evt);
            }
        });

        tiempoRefresco.setText("Tiempo de refresco");
        tiempoRefresco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoRefrescoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(access_code, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginExitoso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mostrarTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tiempoRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(accesoData, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(optionFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(access_codeData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(148, 148, 148)))
                        .addGap(256, 256, 256))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(accesoData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(access_codeData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(loginExitoso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(optionFahrenheit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tiempoRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrarTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(access_code, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPassword.setText("username:");

        lblUsername.setText("password:");

        boxPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPasswordActionPerformed(evt);
            }
        });

        boxUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxUsernameActionPerformed(evt);
            }
        });

        buttonVerify.setText("Verify");
        buttonVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerifyActionPerformed(evt);
            }
        });
        buttonVerify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonVerifyKeyPressed(evt);
            }
        });

        jLabel1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabel1InputMethodTextChanged(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(0, 167, Short.MAX_VALUE)
                        .addComponent(buttonVerify)
                        .addGap(49, 49, 49))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername)
                            .addComponent(lblPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(boxUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(boxPassword)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(boxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(buttonVerify)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPasswordActionPerformed

    }//GEN-LAST:event_boxPasswordActionPerformed

    private void boxUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxUsernameActionPerformed
        
    }//GEN-LAST:event_boxUsernameActionPerformed

    private void buttonVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerifyActionPerformed
        password=new String(boxPassword.getPassword());            
        username=boxUsername.getText();                  
        try {
            Thread.sleep(4*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(tarea_2Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    if(Main.pasarDato!=null){
        jLabel1.setText(datosComprobador.username);
        jDialog1.setVisible(true);
        jDialog1.setSize(500,300);
        ok.setLabel("Acceder");        
        accesoData.setText(Main.pasarDato);  
        access_codeData.setText(Main.pasarDato2);
        jLabel1.setText("")
    ;}else{jLabel1.setText("Contrasena o usuario incorrecto");}         
    }//GEN-LAST:event_buttonVerifyActionPerformed

    private void buttonVerifyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonVerifyKeyPressed
       
    }//GEN-LAST:event_buttonVerifyKeyPressed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        String test;
        if(optionFahrenheit.isSelected()){            
            option = 1
        ;}else{option=2;}          
        tiempoRefres = tiempoRefresco.getText();  
        if("Tiempo de refresco".equals(tiempoRefres)|| Integer.parseInt
        (tiempoRefres)< 3||Integer.parseInt(tiempoRefres)>120){tiempoRefres="3";
        } else {}
        mostrarTiempo.setText("Tiempo ingresado: "+tiempoRefres+"s");
        try {
            Thread.sleep(1*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(tarea_2Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        tarea_2Data data = new tarea_2Data();data.setVisible(true);
        int timer = 1; 
    }//GEN-LAST:event_okActionPerformed

    private void jLabel1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel1InputMethodTextChanged
        
    }//GEN-LAST:event_jLabel1InputMethodTextChanged

    private void optionFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionFahrenheitActionPerformed
   
    }//GEN-LAST:event_optionFahrenheitActionPerformed

    private void tiempoRefrescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoRefrescoActionPerformed
        
    }//GEN-LAST:event_tiempoRefrescoActionPerformed
public static boolean esNumerico(String valor){     
    try{
        if(valor!= null){
            Integer.parseInt(valor);
        }
    }catch(NumberFormatException nfe){
         return false; 
    }
    return false;
}
    
    public void main(String args[]) throws Exception {     
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tarea_2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tarea_2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tarea_2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tarea_2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new tarea_2Login().setVisible(true);
                } catch (IOException | InterruptedException ex) {
                    Logger.getLogger(tarea_2Login.class.getName()).log(Level.SEVERE, null, ex);
                 
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
    public javax.swing.JButton buttonVerify;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel login;
    private javax.swing.JLabel loginExitoso;
    private javax.swing.JLabel mostrarTiempo;
    private java.awt.Button ok;
    private javax.swing.JRadioButton optionFahrenheit;
    private javax.swing.JTextField tiempoRefresco;
    // End of variables declaration//GEN-END:variables

}
