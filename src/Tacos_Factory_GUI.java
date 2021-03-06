/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author apple
 */
public class Tacos_Factory_GUI extends javax.swing.JFrame {
    Tacos_Factory tacos= new Tacos_Factory();
    /**
     * Creates new form Tacos_Factory_GUI
     */
    public Tacos_Factory_GUI() {
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

        ChefImage = new javax.swing.JLabel();
        ChefSlider = new javax.swing.JSlider();
        MaistroSlider = new javax.swing.JSlider();
        DiosTacosNameLabel = new javax.swing.JLabel();
        MaistroNameLabel = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        MaistroImage = new javax.swing.JLabel();
        Cooked = new javax.swing.JLabel();
        Eated = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        ChefImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChefImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chef.jpg"))); // NOI18N

        ChefSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ChefSliderStateChanged(evt);
            }
        });

        MaistroSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MaistroSliderStateChanged(evt);
            }
        });

        DiosTacosNameLabel.setText("Dios de los Tacos");

        MaistroNameLabel.setText("Maistro");

        start.setText("Tacos!");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        MaistroImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaistroImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maistro.jpg"))); // NOI18N
        MaistroImage.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(ChefImage, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(ChefSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(Cooked)))
                .addGap(465, 465, 465)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MaistroImage)
                    .addComponent(MaistroSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(DiosTacosNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaistroNameLabel)
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(start)
                .addGap(386, 386, 386))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Eated)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiosTacosNameLabel)
                    .addComponent(MaistroNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MaistroImage, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MaistroSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Eated)
                        .addGap(18, 18, 18)
                        .addComponent(start))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ChefImage)
                        .addGap(18, 18, 18)
                        .addComponent(ChefSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cooked)))
                .addContainerGap())
        );

        ChefImage.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
            // TODO add your handling code here:
        tacos.startTacosFactory(ChefSlider.getValue(),MaistroSlider.getValue(),Cooked,Eated);
    }//GEN-LAST:event_startActionPerformed

    private void ChefSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ChefSliderStateChanged
        // TODO add your handling code here:
        System.out.println(ChefSlider.getValue());
        tacos.Change_Chef_velocity(ChefSlider.getValue());
    }//GEN-LAST:event_ChefSliderStateChanged

    private void MaistroSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MaistroSliderStateChanged
        // TODO add your handling code here:
        System.out.println(MaistroSlider.getValue());
        tacos.Change_Maistro_velocity(MaistroSlider.getValue());
    }//GEN-LAST:event_MaistroSliderStateChanged

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
            java.util.logging.Logger.getLogger(Tacos_Factory_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tacos_Factory_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tacos_Factory_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tacos_Factory_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tacos_Factory_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChefImage;
    private javax.swing.JSlider ChefSlider;
    public javax.swing.JLabel Cooked;
    private javax.swing.JLabel DiosTacosNameLabel;
    public javax.swing.JLabel Eated;
    private javax.swing.JLabel MaistroImage;
    private javax.swing.JLabel MaistroNameLabel;
    private javax.swing.JSlider MaistroSlider;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
