package com.mycompany.tarea2;
import static com.mycompany.tarea2.tarea_2Login.tiempoRefres;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class tarea_2Data extends javax.swing.JFrame {         
    float hum ;float tem ;float temf ;
    String hume ;String temp ;String tempf ;
    float humAlmacenada ;float temAlmacenada ;int co2Almacenada;
    public tarea_2Data() {        
        if(tarea_2Login.option==2){temp = " °C";}
        if(tarea_2Login.option==1){temp = " °F";}    
        timer.start();                                                          //se inicializa el timer para actualizar los  datos
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
        minHume = new javax.swing.JLabel();
        promHume = new javax.swing.JLabel();
        maxHume = new javax.swing.JLabel();
        minTem = new javax.swing.JLabel();
        promTem = new javax.swing.JLabel();
        maxTem = new javax.swing.JLabel();
        minCo2 = new javax.swing.JLabel();
        promCo2 = new javax.swing.JLabel();
        maxCo2 = new javax.swing.JLabel();
        minTag = new javax.swing.JLabel();
        promTag = new javax.swing.JLabel();
        maxTag = new javax.swing.JLabel();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 268));

        nombreHumedad.setText("Humedad:");

        nombreTemp.setText("Temperatura:");

        nombreCo2.setText("co2:");

        valorHumedad.setText(hume+" %");

        valorCo2.setText(Main.pasarCo2+" PPM");

        valortemp.setText(temp);

        minHume.setText("           ");

        promHume.setText("           ");

        maxHume.setText("           ");

        minTem.setText("           ");

        promTem.setText("           ");

        maxTem.setText("           ");

        minCo2.setText("           ");

        promCo2.setText("           ");

        maxCo2.setText("           ");

        minTag.setText("MIN");

        promTag.setText("PROM");

        maxTag.setText("MAX");

        volver.setText("<- volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(minHume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minTem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minCo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minTag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(promHume)
                            .addComponent(promTem)
                            .addComponent(promCo2)
                            .addComponent(promTag))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maxTag)
                            .addComponent(maxCo2)
                            .addComponent(maxTem)
                            .addComponent(maxHume)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minTag)
                    .addComponent(promTag)
                    .addComponent(maxTag))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorHumedad)
                    .addComponent(minHume)
                    .addComponent(promHume)
                    .addComponent(maxHume))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valortemp)
                    .addComponent(minTem)
                    .addComponent(promTem)
                    .addComponent(maxTem))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreCo2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorCo2)
                    .addComponent(minCo2)
                    .addComponent(promCo2)
                    .addComponent(maxCo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(volver)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        dispose();
    }//GEN-LAST:event_volverActionPerformed
    Timer timer = new Timer (Integer.parseInt(tiempoRefres)                     //timer que actualiza los valores de  la  tabla, el
            *1000,new ActionListener ()                                         //resto de codigo es el formato   solicitado   para
{                                                                               //mostrar                 la                  tabla
    @Override
    public void actionPerformed(ActionEvent e)
    {   int comprobador=0;               
        hum = (Float.parseFloat(Main.pasarHumedad));
        tem = Float.parseFloat(Main.pasarTemp);
        temf = (float) (Float.parseFloat(Main.pasarTemp)*1.8+32);        
        co2Almacenada = Integer.parseInt(Main.pasarCo2);                
        humAlmacenada = humAlmacenada+hum;        
        hume = String.format("%.2f",hum);
        temp = String.format("%.2f",tem);  
        tempf = String.format("%.2f",temf);
        valorCo2.setText(Main.pasarCo2+" PPM");           
        valorHumedad.setText(hume+" %");              
        minHume.setText(Float.toString(Main.humedadMin)+" %");
        promHume.setText(Float.toString(Main.promHume)+" %");
        maxHume.setText(Float.toString(Main.humedadMax)+" %");
        if(tarea_2Login.option==2){
            temp = temp+" °C";
            valortemp.setText(temp);
            minTem.setText(Float.toString(Main.tempMin)+" °C");
            promTem.setText(Float.toString(Main.promTemp)+" °C");
            maxTem.setText(Float.toString(Main.tempMax)+" °C")
        ;}
        if(tarea_2Login.option==1){
            temp = tempf+" °F";     
            valortemp.setText(temp);
            minTem.setText((Float.toString((float) (Main.tempMin*1.8+32)))+" °F");
            promTem.setText((Float.toString((float) (Main.promTemp*1.8+32)))+" °F");
            maxTem.setText((Float.toString((float) (Main.tempMax*1.8+32)))+" °F")
        ;}        
        minCo2.setText(Float.toString(Main.Co2Min)+" PPM");
        promCo2.setText(Float.toString(Main.promCo2)+" PPM");
        maxCo2.setText(Float.toString(Main.Co2Max)+" PPM");     
     }
});
    public void main(String args[]) {                    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tarea_2Data().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel maxCo2;
    private javax.swing.JLabel maxHume;
    private javax.swing.JLabel maxTag;
    private javax.swing.JLabel maxTem;
    private javax.swing.JLabel minCo2;
    private javax.swing.JLabel minHume;
    private javax.swing.JLabel minTag;
    private javax.swing.JLabel minTem;
    private javax.swing.JLabel nombreCo2;
    private javax.swing.JLabel nombreHumedad;
    private javax.swing.JLabel nombreTemp;
    private javax.swing.JLabel promCo2;
    private javax.swing.JLabel promHume;
    private javax.swing.JLabel promTag;
    private javax.swing.JLabel promTem;
    private javax.swing.JLabel valorCo2;
    public javax.swing.JLabel valorHumedad;
    private javax.swing.JLabel valortemp;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    void setTexto(String sa) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setText(String sa) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
