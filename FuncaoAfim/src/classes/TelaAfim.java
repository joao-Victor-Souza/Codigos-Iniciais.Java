/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;

/**
 *
 * @author Conta Principal
 */
public class TelaAfim extends javax.swing.JFrame {

    /**
     * Creates new form TelaAfim
     */
    public TelaAfim() {
        initComponents();
        panResposta.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        lblX2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblX22 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtX1 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        txtA = new javax.swing.JSpinner();
        lblX11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtB = new javax.swing.JSpinner();
        btnCalc = new javax.swing.JButton();
        panResposta = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblX3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblResposta = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Calculando Função Afim ! ");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel2.setText("F (");

        lblX2.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        lblX2.setForeground(new java.awt.Color(204, 0, 0));
        lblX2.setText("x");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel4.setText(") =");

        lblA.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        lblA.setForeground(new java.awt.Color(204, 0, 0));
        lblA.setText("A");

        lblX22.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        lblX22.setForeground(new java.awt.Color(204, 0, 0));
        lblX22.setText("x");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel7.setText("+");

        lblB.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        lblB.setForeground(new java.awt.Color(204, 0, 0));
        lblB.setText("B");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel10.setText("F (");

        txtX1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtX1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtX1StateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel11.setText(") = ");

        txtA.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtAStateChanged(evt);
            }
        });

        lblX11.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        lblX11.setForeground(new java.awt.Color(204, 0, 0));
        lblX11.setText("X");

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel13.setText("+");

        txtB.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtBStateChanged(evt);
            }
        });

        btnCalc.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        btnCalc.setText("Calcular !");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel14.setText("Resultado !");

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel15.setText("F (");

        lblX3.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        lblX3.setForeground(new java.awt.Color(204, 0, 0));
        lblX3.setText("x");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel6.setText(") =");

        lblResposta.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        lblResposta.setText("<VAZIO>");

        javax.swing.GroupLayout panRespostaLayout = new javax.swing.GroupLayout(panResposta);
        panResposta.setLayout(panRespostaLayout);
        panRespostaLayout.setHorizontalGroup(
            panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panRespostaLayout.createSequentialGroup()
                    .addGap(167, 167, 167)
                    .addComponent(jLabel15)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addGroup(panRespostaLayout.createSequentialGroup()
                            .addComponent(lblX3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblResposta)))
                    .addContainerGap(168, Short.MAX_VALUE)))
        );
        panRespostaLayout.setVerticalGroup(
            panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
            .addGroup(panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panRespostaLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jLabel14)
                    .addGap(28, 28, 28)
                    .addGroup(panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(lblX3)
                        .addComponent(jLabel6)
                        .addComponent(lblResposta))
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel8.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblX11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblX2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(4, 4, 4)
                                .addComponent(lblX22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblB))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblX11)
                    .addComponent(jLabel13)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblX2)
                    .addComponent(jLabel4)
                    .addComponent(lblA)
                    .addComponent(lblX22)
                    .addComponent(jLabel7)
                    .addComponent(lblB)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(panResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtX1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtX1StateChanged
        // TODO add your handling code here:
        
        //Exibindo o valor de X digitado pelo usuário em todos os campos necessários.
        
        lblX11.setText(txtX1.getValue().toString());
        
        lblX2.setText(txtX1.getValue().toString());
        lblX22.setText(txtX1.getValue().toString());
        
        lblX3.setText(txtX1.getValue().toString());
    }//GEN-LAST:event_txtX1StateChanged

    private void txtAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtAStateChanged
        // TODO add your handling code here:
        
      //Exibindo o valor de A digitado pelo usuário em todos os campos necessários.
        lblA.setText(txtA.getValue().toString());        
    }//GEN-LAST:event_txtAStateChanged

    private void txtBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtBStateChanged
        // TODO add your handling code here:
        
        //Exibindo o valor de B digitado pelo usuário em todos os campos necessários.
        lblB.setText(txtB.getValue().toString());
    }//GEN-LAST:event_txtBStateChanged

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
        
        //Armazenando os valores digitados pelo usuário.
        int X = Integer.parseInt(txtX1.getValue().toString());
        int A = Integer.parseInt(txtA.getValue().toString());
        int B = Integer.parseInt(txtB.getValue().toString());
        
        //Aplicando a equação. Usei double por segurança para não dar erro com números muito grandes.
        double Afim = (A * X) + B;
        
        //Exibindo a resposta.
        lblResposta.setText(Double.toString(Afim));
        
        //Tornando o painel visível novamente.
        panResposta.setVisible(true);
        
    }//GEN-LAST:event_btnCalcActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAfim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAfim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAfim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAfim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAfim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JLabel lblX11;
    private javax.swing.JLabel lblX2;
    private javax.swing.JLabel lblX22;
    private javax.swing.JLabel lblX3;
    private javax.swing.JPanel panResposta;
    private javax.swing.JSpinner txtA;
    private javax.swing.JSpinner txtB;
    private javax.swing.JSpinner txtX1;
    // End of variables declaration//GEN-END:variables
}
