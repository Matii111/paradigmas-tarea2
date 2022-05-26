package com.mycompany.tarea2;
import static com.mycompany.tarea2.Main.pasarHumedad;
import static com.mycompany.tarea2.Main.pasarCo2;
import static com.mycompany.tarea2.Main.pasarTemp;
import javax.swing.JLabel;
public class tarea_2Data extends javax.swing.JFrame {    
    
    float hum = (Float.parseFloat(Main.pasarHumedad))/100;
    float tem = Float.parseFloat(Main.pasarTemp);
    float temf = (float) (Float.parseFloat(Main.pasarTemp)*1.8+32);
    String hume = String.format("%.2f",hum);
    String temp = String.format("%.2f",tem);  
    String tempf = String.format("%.2f",temf);  
    public tarea_2Data() {
        
        if(tarea_2Login.option==2){temp = temp+" °C";}
        if(tarea_2Login.option==1){temp = tempf+" °F";}
        initComponents();        
    }
    tarea_2Data(tarea_2Login aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombreHumedad = new javax.swing.JLabel();
        nombreTemp = new javax.swing.JLabel();
        nombreCo2 = new javax.swing.JLabel();
        valorHumedad = new javax.swing.JLabel();
        valorCo2 = new javax.swing.JLabel();
        valortemp = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreHumedad.setText("Humedad:");

        nombreTemp.setText("Temperatura:");

        nombreCo2.setText("co2:");

        valorHumedad.setText(hume+" %");
        valorHumedad.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                valorHumedadAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        valorCo2.setText(Main.pasarCo2+" PPM");
        valorCo2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                valorCo2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                valorCo2AncestorRemoved(evt);
            }
        });

        valortemp.setText(temp);
        valortemp.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                valortempAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                valortempAncestorRemoved(evt);
            }
        });

        jButton1.setText("actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombreTemp, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(nombreHumedad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreCo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valorHumedad, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(valorCo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valortemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorHumedad))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valortemp))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreCo2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorCo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorHumedadAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_valorHumedadAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_valorHumedadAncestorAdded

    private void valorCo2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_valorCo2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_valorCo2AncestorAdded

    private void valorCo2AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_valorCo2AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_valorCo2AncestorRemoved

    private void valortempAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_valortempAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_valortempAncestorAdded

    private void valortempAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_valortempAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_valortempAncestorRemoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hum = (Float.parseFloat(Main.pasarHumedad))/100;
        tem = Float.parseFloat(Main.pasarTemp);
        temf = (float) (Float.parseFloat(Main.pasarTemp)*1.8+32);
        hume = String.format("%.2f",hum);
        temp = String.format("%.2f",tem);  
        tempf = String.format("%.2f",temf);
        valorCo2.setText(Main.pasarCo2+" PPM");
        if(tarea_2Login.option==2){temp = temp+" °C";}
        if(tarea_2Login.option==1){temp = tempf+" °F";}
        valortemp.setText(temp);
        valorHumedad.setText(hume+"%");
    }//GEN-LAST:event_jButton1ActionPerformed

    public void main(String args[]) {            

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tarea_2Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreCo2;
    private javax.swing.JLabel nombreHumedad;
    private javax.swing.JLabel nombreTemp;
    private javax.swing.JLabel valorCo2;
    public javax.swing.JLabel valorHumedad;
    private javax.swing.JLabel valortemp;
    // End of variables declaration//GEN-END:variables

    void setTexto(String sa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setText(String sa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
