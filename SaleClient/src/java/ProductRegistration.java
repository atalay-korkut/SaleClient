/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phase1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author Atalay Korkut
 */
public class ProductRegistration extends javax.swing.JFrame{

public Main a=new Main();

    
 
                
    
    
    
   
            
            

    
    

    /**
     * Creates new form UI
     */
    public ProductRegistration() {
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

        jLabelUrunKaydet = new javax.swing.JLabel();
        jLabelPNo = new javax.swing.JLabel();
        jTextFieldPNo = new javax.swing.JTextField();
        jTextFieldPName = new javax.swing.JTextField();
        jTextFieldPPrice = new javax.swing.JTextField();
        jTextFieldPKdv = new javax.swing.JTextField();
        jTextFieldPBarcode = new javax.swing.JTextField();
        jButtonPSave = new javax.swing.JButton();
        jLabelPName = new javax.swing.JLabel();
        jLabelPPrice = new javax.swing.JLabel();
        jLabelPKdv = new javax.swing.JLabel();
        jLabelPBarcode = new javax.swing.JLabel();
        jButtonPsend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelUrunKaydet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelUrunKaydet.setForeground(new java.awt.Color(204, 0, 51));
        jLabelUrunKaydet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUrunKaydet.setText("Urun Kaydetme");

        jLabelPNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPNo.setText("Urun Adedi:");

        jTextFieldPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPNameActionPerformed(evt);
            }
        });

        jButtonPSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPSave.setText("Kaydet");
        jButtonPSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPSaveActionPerformed(evt);
            }
        });

        jLabelPName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPName.setText("Urun Adi:");

        jLabelPPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPPrice.setText("Urun Fiyati");

        jLabelPKdv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPKdv.setText("Urun KDVsi:");

        jLabelPBarcode.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPBarcode.setText("Urun Barkodu:");

        jButtonPsend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPsend.setText("Gönder");
        jButtonPsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPsendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButtonPsend, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPSave, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPKdv, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldPBarcode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPKdv)
                                    .addComponent(jTextFieldPPrice)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPNo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPNo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabelUrunKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUrunKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jTextFieldPKdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPKdv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPsend, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPSaveActionPerformed
        // TODO add your handling code here:
         
      jButtonPSave.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button was clicked!");
        a.prName=jTextFieldPName.getText();
        a.prNo =Integer.parseInt(jTextFieldPNo.getText());
        a.prPrice =Double.parseDouble(jTextFieldPPrice.getText());
        a.prKDV =Double.parseDouble(jTextFieldPKdv.getText());
       a.prBarcode =jTextFieldPBarcode.getText();
       a.productReg();
       
       jTextFieldPName.setText("");
       jTextFieldPNo.setText("");
       jTextFieldPPrice.setText("");
       jTextFieldPKdv.setText("");
       jTextFieldPBarcode.setText("");
    }
});
      
         jButtonPsend.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button 2 was clicked!");
       
              String name  =jTextFieldPName.getText();
               a.prName=  name.replace(" ", "-");
                
        a.prNo =Integer.parseInt(jTextFieldPNo.getText());
        a.prPrice =Double.parseDouble(jTextFieldPPrice.getText());
        a.prKDV =Double.parseDouble(jTextFieldPKdv.getText());
       a.prBarcode =jTextFieldPBarcode.getText();
       
       if(99<a.prKDV|| a.prKDV <0){
           System.out.println("3031 - ürün kdvsi gecerli  değil");
           jTextFieldPName.setText("");
       jTextFieldPNo.setText("");
       jTextFieldPPrice.setText("");
       jTextFieldPKdv.setText("");
       jTextFieldPBarcode.setText("");
       }
       
       if(a.prName.length()>20|| a.prName.length()<1){
           System.out.println("3032 - ürün ismi gecerli  değil");
           jTextFieldPName.setText("");
       jTextFieldPNo.setText("");
       jTextFieldPPrice.setText("");
       jTextFieldPKdv.setText("");
       jTextFieldPBarcode.setText("");
       }
       
       if(a.prPrice<0.01||a.prPrice>9999.99){
           System.out.println("3033 - ürün fiyati gecerli  değil");
           jTextFieldPName.setText("");
       jTextFieldPNo.setText("");
       jTextFieldPPrice.setText("");
       jTextFieldPKdv.setText("");
       jTextFieldPBarcode.setText("");
       }
       
       if(a.prBarcode.length()>13||(a.prBarcode.length()<1) ){
           System.out.println("3034 - ürün barkodu gecerli  değil");
           jTextFieldPName.setText("");
       jTextFieldPNo.setText("");
       jTextFieldPPrice.setText("");
       jTextFieldPKdv.setText("");
       jTextFieldPBarcode.setText("");
       }
       a.productSend();
       
       jTextFieldPName.setText("");
       jTextFieldPNo.setText("");
       jTextFieldPPrice.setText("");
       jTextFieldPKdv.setText("");
       jTextFieldPBarcode.setText("");
    }
});
      
   
        
    }//GEN-LAST:event_jButtonPSaveActionPerformed

    private void jTextFieldPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPNameActionPerformed

    private void jButtonPsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPsendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPsendActionPerformed
/**/
                

    
  
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonPSave;
    private javax.swing.JButton jButtonPsend;
    private javax.swing.JLabel jLabelPBarcode;
    private javax.swing.JLabel jLabelPKdv;
    private javax.swing.JLabel jLabelPName;
    private javax.swing.JLabel jLabelPNo;
    private javax.swing.JLabel jLabelPPrice;
    private javax.swing.JLabel jLabelUrunKaydet;
    private javax.swing.JTextField jTextFieldPBarcode;
    private javax.swing.JTextField jTextFieldPKdv;
    private javax.swing.JTextField jTextFieldPName;
    private javax.swing.JTextField jTextFieldPNo;
    private javax.swing.JTextField jTextFieldPPrice;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) 
    
    {
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
            java.util.logging.Logger.getLogger(ProductRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
            @Override
            public void run() {
                new ProductRegistration().setVisible(true);
            }
        });
        
      
        
        
    }
    
    }
    
    
   
   
    
    

