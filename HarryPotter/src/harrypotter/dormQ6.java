/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harrypotter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.*;


/**
 *
 * @author KELVIN
 */
public class dormQ6 extends javax.swing.JPanel {
    int x = 0;
    int k = 0;
    int posA = 0;
    int posB = 0;
    int a;
    int b;
    int start = 0;
    Timer myTimer;
    String word = "Hogwart... Im on the way to the one of the best\n" +
                      "magic school in the world.";
    int wordSize = word.length();
    
    
    
    public dormQ6() {
        initComponents();
        this.setSize(800,600);
        
        ImageIcon raw = new ImageIcon("Image/q6_Background.jpg");
        Image img = raw.getImage();
        Image newImg = img.getScaledInstance(900, 700, Image.SCALE_SMOOTH);
        ImageIcon finalImage = new ImageIcon(newImg);
        JLabel lblBackground = new JLabel(finalImage);
        
        this.add(lblBackground);
        lblBackground.setBounds(0, 0, 900, 700);
        lblBackground.setLocation(-80,-80);
        myTimer = new Timer(100,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(k < 4){
                    posA--;
                    k++;
                }else if(k < 8){
                    posB--;
                    k++;
                }else if(k < 12){
                    posA++;
                    k++;
                }else if(k < 16){
                    posB++;
                    k++;
                }else if(k == 16){
                    k = 0;
                }
                lblBackground.setLocation(posA, posB);
            }
        });
        
        myTimer.start();
    }
    
    public void rebuild(){
        x = 0;
        posA = -40;
        posB = -40;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("What is your favorite movie genre ?");
        add(jLabel1);
        jLabel1.setBounds(10, 140, 780, 80);

        jButton1.setFont(new java.awt.Font("Milano Traffic Demo", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 0));
        jButton1.setText("ACTION OR ADVENTURE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(130, 240, 550, 30);

        jButton2.setFont(new java.awt.Font("Milano Traffic Demo", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 0));
        jButton2.setText("MYSTERY AND DRAMA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(130, 390, 550, 30);

        jButton3.setFont(new java.awt.Font("Milano Traffic Demo", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 153, 0));
        jButton3.setText("FAMILY AND ROMANTIC");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(130, 290, 550, 30);

        jButton4.setFont(new java.awt.Font("Milano Traffic Demo", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 102, 0));
        jButton4.setText("SCI-FI OR FANTASY");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(130, 340, 550, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainFrame temp = (mainFrame) this.getParent().getParent().getParent().getParent();
        temp.p1.a++;
        temp.goToDq7();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mainFrame temp = (mainFrame) this.getParent().getParent().getParent().getParent();
        temp.p1.b++;
        temp.goToDq7();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mainFrame temp = (mainFrame) this.getParent().getParent().getParent().getParent();
        temp.p1.c++;
        temp.goToDq7();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mainFrame temp = (mainFrame) this.getParent().getParent().getParent().getParent();
        temp.p1.d++;
        temp.goToDq7();
    }//GEN-LAST:event_jButton2ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
