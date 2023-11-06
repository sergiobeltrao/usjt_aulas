
public class DashboardTela extends javax.swing.JFrame {

    public DashboardTela() {
        super("Cadastro de Cursos e Alunos");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnDashboard = new javax.swing.JPanel();
        btnGerenciaCurso = new javax.swing.JButton();
        btnGerenciamentoAlunos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnDashboard.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de cursos e alunos"));

        btnGerenciaCurso.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnGerenciaCurso.setText("Gerenciar Cursos");
        btnGerenciaCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciaCursoActionPerformed(evt);
            }
        });

        btnGerenciamentoAlunos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnGerenciamentoAlunos.setText("Gerenciar Alunos");

        javax.swing.GroupLayout pnDashboardLayout = new javax.swing.GroupLayout(pnDashboard);
        pnDashboard.setLayout(pnDashboardLayout);
        pnDashboardLayout.setHorizontalGroup(
            pnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDashboardLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(pnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGerenciamentoAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGerenciaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        pnDashboardLayout.setVerticalGroup(
            pnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDashboardLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnGerenciaCurso)
                .addGap(45, 45, 45)
                .addComponent(btnGerenciamentoAlunos)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(pnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(pnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerenciaCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciaCursoActionPerformed
        CursosTela ct = new CursosTela();
        ct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGerenciaCursoActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerenciaCurso;
    private javax.swing.JButton btnGerenciamentoAlunos;
    private javax.swing.JPanel pnDashboard;
    // End of variables declaration//GEN-END:variables
}
