/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harrypotter;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author KELVIN
 */
public class shopPanel extends javax.swing.JPanel {

    int shop = 0;
    public shopPanel() {
        initComponents();
        this.setSize(800,600);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SHOP");
        jPanel1.add(jLabel1);

        add(jPanel1);
        jPanel1.setBounds(290, 20, 310, 70);

        jButton1.setBackground(new java.awt.Color(102, 51, 0));
        jButton1.setFont(new java.awt.Font("Tekton Pro", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(20, 530, 140, 60);

        jButton4.setBackground(new java.awt.Color(102, 51, 0));
        jButton4.setFont(new java.awt.Font("Tekton Pro", 3, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Wand");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(30, 260, 350, 40);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1);
        jScrollPane1.setBounds(410, 170, 350, 260);
        add(jTextField1);
        jTextField1.setBounds(410, 460, 100, 40);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTER NUMBER :");
        add(jLabel2);
        jLabel2.setBounds(410, 440, 110, 14);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("BUY");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(520, 460, 70, 40);

        jButton6.setBackground(new java.awt.Color(102, 51, 0));
        jButton6.setFont(new java.awt.Font("Tekton Pro", 3, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Item");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6);
        jButton6.setBounds(30, 320, 350, 40);

        jPanel2.setBackground(new java.awt.Color(153, 51, 0));

        jLabel3.setFont(new java.awt.Font("Tekton Pro Cond", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("GOLD : ");
        jPanel2.add(jLabel3);

        add(jPanel2);
        jPanel2.setBounds(410, 130, 350, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        shop = 1;
        jTextArea1.setText("[0] Cedric Wand -- 540G\n" +
"[1] Draco Wand -- 730G\n" +
"[2] Longbottom Wand -- 1200G\n" +
"[3] Ron Wand -- 3200G\n" +
"[4] Remus Wand -- 4200G\n" +
"[5] Hagrid Wand -- 4200G\n" +
"[6] Ginny Wand -- 4200G\n" +
"[7] Slughorn Wand -- 4800G\n" +
"[8] Dolores Wand -- 4800G\n" +
"[9] Hermione Wand -- 5200G\n" +
"[10] Lucius Wand -- 5200G\n" +
"[11] Minerva Wand -- 5600G\n" +
"[12] Krum Wand -- 5600G\n" +
"[13] Bellatrix Wand -- 6100G");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       shop = 2;
        jTextArea1.setText("[0] Ash Wood -- 500G\n" +
"[1] Hawthorn Wood -- 730G\n" +
"[2] Cypress Wood -- 4200G\n" +
"[3] Birch Wood -- 4800G\n" +
"[4] Elm Wood -- 5200G\n" +
"[5] Hornbean Wood -- 5600G\n" +
"[6] Galleon -- 3500G\n" +
"[7] Marvolo Gaunt's Ring -- 6500G\n" +
"[8] Gillyweed -- 6500G\n" +
"[9] Nimbus 2001 -- 6500G");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        
        int gold = temp.p1.gold;
        String input = jTextField1.getText();
        if(shop == 1){
            //WAND
            if(input.equals("0")){
                if(gold < 540){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 5% Magic Damage");
                    temp.p1.usedWand = new wand(0);
                    temp.p1.gold -= 540;
                }
            }else if(input.equals("1")){
                if(gold < 730){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 8% Magic Damage\nAdd 2% ATK Damage\nAdd 5% SPD");
                    temp.p1.usedWand = new wand(Integer.parseInt(input));
                    temp.p1.gold -= 730;
                }
            }else if(input.equals("2")){
                if(gold < 1200){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 10% Magic Damage\nAdd 10% ATK Damage\nAdd 2% SPD");
                    temp.p1.usedWand = new wand(Integer.parseInt(input));
                    temp.p1.gold -= 1200;
                }
            }else if(input.equals("3")){
                if(gold < 3200){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 20% Magic Damage\nAdd 30% ATK Damage\nAdd 10% SPD");
                    temp.p1.usedWand = new wand(Integer.parseInt(input));
                    temp.p1.gold -= 3200;
                }
            }else if(input.equals("4")){
                if(gold < 4200){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 50% Magic Damage\nAdd 50% HP\nAdd 10% Mana");
                    temp.p1.usedWand = new wand(Integer.parseInt(input));
                    temp.p1.gold-= 4200;
                }
            }else if(input.equals("5")){
                if(gold < 4200){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 100% HP");
                    temp.p1.usedWand = new wand(Integer.parseInt(input));
                    temp.p1.gold -= 4200;
                }
            }else if(input.equals("6")){
                if(gold < 4200){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 50%MP\n Add 50% Magic Damage\nAdd 20% SPD");
                    temp.p1.usedWand = new wand(Integer.parseInt(input));
                    temp.p1.gold -= 4200;
                }
            }else if(input.equals("7")){
                if(gold < 4800){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 50% HP\nAdd 80% Magic Damage\n Add 20% HP");
                    temp.p1.usedWand = new wand(Integer.parseInt(input));
                    temp.p1.gold -= 4800;
                }
            }else if(input.equals("8")){
                if(gold < 4800){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\n80% Magic Damage\n Add 50% Mana");
                    temp.p1.usedWand = new wand(Integer.parseInt(input));
                    temp.p1.gold -= 4800;
                }
            }else if(input.equals("9")){
                if(gold < 5200){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 80% Magic Damage\nAdd 80% Mana\nAdd 30% ATK Damage");
                    temp.p1.usedWand = new wand(Integer.parseInt(input));
                    temp.p1.gold -= 5200;
                }
            }else if(input.equals("10")){
                if(gold < 5200){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 50% Magic Damage\nAdd 60% ATK Damage\nAdd 50% HP");
                    temp.p1.usedWand = new wand(Integer.parseInt(input));
                    temp.p1.gold -= 5200;
                }
            }else if(input.equals("11")){
                if(gold < 5600){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 80% Magic Damage\nAdd 65% ATK Damage\nAdd 85% Mana");
                    temp.p1.usedWand = new wand(Integer.parseInt(input));
                    temp.p1.gold -= 5600;
                }
            }else if(input.equals("12")){
                if(gold < 5600){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 70% HP\nAdd 50% Magic Damage\nAdd 60% ATK Damage");
                    temp.p1.usedWand = new wand(Integer.parseInt(input));
                    temp.p1.gold -= 5600;
                }
            }else if(input.equals("13")){
                if(gold < 6100){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 85% Magic Damage\nAdd 85% ATK Damage");
                    temp.p1.usedWand = new wand(Integer.parseInt(input));
                    temp.p1.gold -= 6100;
                }
            }
        }else if(shop == 2){
            //ITEM
            if(input.equals("0")){
                if(gold < 540){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 2% Damage");
                    temp.p1.listItem.add(new usable(Integer.parseInt(input)));
                    temp.p1.gold -= 540;
                }
            }if(input.equals("1")){
                if(gold < 730){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 5% Magic Damage + 2% SPD");
                    temp.p1.listItem.add(new usable(Integer.parseInt(input)));
                    temp.p1.gold -= 730;
                }
            }if(input.equals("2")){
                if(gold < 4200){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 35% Magic Damage + 8% Mana");
                    temp.p1.listItem.add(new usable(Integer.parseInt(input)));
                    temp.p1.gold -= 4200;
                }
            }if(input.equals("3")){
                if(gold < 4800){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 60% Magic Damage + 30% Mana");
                    temp.p1.listItem.add(new usable(Integer.parseInt(input)));
                    temp.p1.gold -= 4800;
                }
            }if(input.equals("4")){
                if(gold < 5200){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 35% HP + 40% ATK Damage");
                    temp.p1.listItem.add(new usable(Integer.parseInt(input)));
                    temp.p1.gold -= 5200;
                }
            }if(input.equals("5")){
                if(gold < 5600){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 40% HP, Magic Damage, ATK Damage");
                    temp.p1.listItem.add(new usable(Integer.parseInt(input)));
                    temp.p1.gold -= 5600;
                }
            }if(input.equals("6")){
                if(gold < 3500){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 30% Gold Drop");
                    temp.p1.listItem.add(new usable(Integer.parseInt(input)));
                    temp.p1.gold -= 3500;
                }
            }if(input.equals("7")){
                if(gold < 6500){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 100 STR");
                    temp.p1.listItem.add(new usable(Integer.parseInt(input)));
                    temp.p1.gold -= 6500;
                }
            }if(input.equals("8")){
                if(gold < 6500){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 100 INT");
                    temp.p1.listItem.add(new usable(Integer.parseInt(input)));
                    temp.p1.gold -= 6500;
                }
            }if(input.equals("9")){
                if(gold < 6500){
                    JOptionPane.showMessageDialog(null, "not enough money!");
                }else{
                    JOptionPane.showMessageDialog(null, "SUCCESS!\nAdd 100 AGI");
                    temp.p1.listItem.add(new usable(Integer.parseInt(input)));
                    temp.p1.gold -= 6500;
                }
            }
        }
        jLabel3.setText("GOLD : "+temp.p1.gold);
        jTextField1.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        temp.goToMainMenu();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void rebuild(){
        mainFrame temp = (mainFrame)this.getParent().getParent().getParent().getParent();
        
        int gold = temp.p1.gold;
        
        jLabel3.setText("GOLD : "+gold);

            
        


        //BACKGROUND LAST
        ImageIcon raw1 = new ImageIcon("Image/shopBackground.jpg");
        Image img1 = raw1.getImage();
        Image newImg1 = img1.getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        ImageIcon finalImage1 = new ImageIcon(newImg1);
        JLabel lblBackground = new JLabel(finalImage1);
        
        lblBackground.setBounds(0, 0, 800, 600);
        this.add(lblBackground);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
