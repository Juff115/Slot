
import javax.swing.JOptionPane;


public class SlotGUI extends javax.swing.JFrame {
    SlotMachine m[];
    
    int money=0, m1last=0, m2last=0, m3last=0;
    
    public SlotGUI() {
        initComponents();
       m= new SlotMachine[3];
       m[0]=new SlotMachine(30,20);
       m[1]=new SlotMachine(10,9);
       m[2]=new SlotMachine(90,60);
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtmoney = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtm1 = new javax.swing.JTextField();
        txtm2 = new javax.swing.JTextField();
        txtm3 = new javax.swing.JTextField();
        btntry = new javax.swing.JButton();
        lbltries = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter the number of Quarter in the jar: ");

        jLabel2.setText("Last Time Machine 1 Paid: ");

        jLabel3.setText("Last Time Machine 2 Paid: ");

        jLabel4.setText("Last Time Machine 3 Paid: ");

        btntry.setText("Tries Until Broke");
        btntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntryActionPerformed(evt);
            }
        });

        lbltries.setBackground(new java.awt.Color(255, 255, 255));
        lbltries.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbltries.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmoney, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(txtm1)
                    .addComponent(txtm2)
                    .addComponent(txtm3)
                    .addComponent(lbltries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtmoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtm3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntry)
                    .addComponent(lbltries, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntryActionPerformed
        try {
            money= Integer.parseInt(txtmoney.getText());
            m1last= Integer.parseInt(txtm1.getText());
            m2last= Integer.parseInt(txtm2.getText());
            m3last= Integer.parseInt(txtm3.getText());
        } catch (Exception e) {
        }
            
        if (money>=1 && m1last>0 && m1last<30 && m2last>0 && m2last<10 && m3last>0 && m3last<90 ){
            lbltries.setText(""+tries(money,m1last,m2last,m3last));
        }
        else{
            JOptionPane.showMessageDialog(this, "Date was entered incorrectly please fill it in properly");
        }
    }//GEN-LAST:event_btntryActionPerformed

    public int tries(int mo, int m1, int m2, int m3){
        int tries=0;
        
        while(mo>0){
            tries++;
            mo--;
            m1++;
            if(m[0].turnsLeft(m1)==0){
                mo+=m[0].payout;
                m1=0;
                
            }
            if(mo==0)break;
            tries++;
            mo--;
            m2++;
            if(m[1].turnsLeft(m2)==0){
                mo+=m[1].payout;
                m2=0;
                
            }
            if(mo==0)break;
            tries++;
            mo--;
            m3++;
            if(m[2].turnsLeft(m3)==0){
                mo+=m[2].payout;
                m3=0;
                if(mo==0)break;
            }
            if(mo==0)break;
            
            
            
        }
        return tries;
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
            java.util.logging.Logger.getLogger(SlotGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlotGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlotGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlotGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlotGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbltries;
    private javax.swing.JTextField txtm1;
    private javax.swing.JTextField txtm2;
    private javax.swing.JTextField txtm3;
    private javax.swing.JTextField txtmoney;
    // End of variables declaration//GEN-END:variables
}
