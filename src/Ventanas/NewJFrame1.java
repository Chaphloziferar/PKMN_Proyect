/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import Classes.Pokemon;

/**
 *
 * @author PC 2
 */
public class NewJFrame1 extends javax.swing.JFrame {

    private Timer t1;
    private Timer t2;
    private Timer t3; 
    
    Pokemon p = new Pokemon();
    
    
    public NewJFrame1() {
        initComponents();
        this.setLocationRelativeTo(null);
        t1 = new Timer(500, new progreso1());
        t2 = new Timer(500, new progreso2());
        t3 = new Timer(500, new progreso3());
        Pbar.setValue(100);
        PB.setValue(100);
        p.setAtack1(20);
        p.setAtack2(60);
        p.setAtack3(50);
    }
    
    
    public class progreso1 implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            int n = Pbar.getValue();
            
            if(n>0){
                Pbar.setValue(Pbar.getValue()-p.getAtack1());
                t1.stop();
            }
            if(Pbar.getValue()<=0){
                JOptionPane.showMessageDialog(null, "Carga Exitosa");
                t1.stop();
                t2.stop();
            }
        }
    }
    
    public class progreso2 implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            int m = Pbar.getValue();
            
            if(m>0){
                Pbar.setValue(Pbar.getValue()-p.getAtack2());
                t2.stop();
            }
            if(Pbar.getValue()<=0){
                JOptionPane.showMessageDialog(null, "Carga Exitosa");
                t1.stop();
                t2.stop();
            }
        }
    }
    
    public class progreso3 implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            int m = PB.getValue();
            
            if(m>0){
                PB.setValue(PB.getValue()-p.getAtack3());
                t3.stop();
            }
            if(Pbar.getValue()<=0){
                JOptionPane.showMessageDialog(null, "Carga Exitosa");
                t1.stop();
                t2.stop();
                t3.stop();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Pbar = new javax.swing.JProgressBar();
        PB = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Boton1.setText("Ataque1");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setText("Ataque2");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Pbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton1)
                        .addGap(77, 77, 77)
                        .addComponent(Boton2))
                    .addComponent(PB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(Pbar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton1)
                    .addComponent(Boton2))
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        t1.start();
        try{
            Thread.sleep(500);
        }catch(InterruptedException e ) { 
            System.out.println("Thread Interrupted"); 
        }
        JOptionPane.showMessageDialog(null, "Bajo la vida enemiga");
        try{
            Thread.sleep(500);
        }catch(InterruptedException e ) { 
            System.out.println("Thread Interrupted"); 
        }
        t3.start();
        try{
            Thread.sleep(500);
        }catch(InterruptedException e ) { 
            System.out.println("Thread Interrupted"); 
        }
        JOptionPane.showMessageDialog(null, "Bajo tu vida alv");
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        t2.start();
    }//GEN-LAST:event_Boton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JProgressBar PB;
    private javax.swing.JProgressBar Pbar;
    // End of variables declaration//GEN-END:variables
}
