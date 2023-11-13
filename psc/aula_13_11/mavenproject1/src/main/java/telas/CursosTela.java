package telas;

import model.Curso;
import dao.CursoDAO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class CursosTela extends javax.swing.JFrame {

    /**
     * Creates new form CursosTela
     */
    public CursosTela() {
        super("Gerenciamento de Cursos");
        initComponents();
        buscarCursos();
        setLocationRelativeTo(null);
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
        cursosComboBox = new javax.swing.JComboBox<>();
        idCursoTxtFild = new javax.swing.JTextField();
        nomeCursoTxtFild = new javax.swing.JTextField();
        tipoCursoTxtFild = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerenciamento de Cursos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15))); // NOI18N

        cursosComboBox.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        cursosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursosComboBoxActionPerformed(evt);
            }
        });

        idCursoTxtFild.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        idCursoTxtFild.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        nomeCursoTxtFild.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        nomeCursoTxtFild.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        nomeCursoTxtFild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCursoTxtFildActionPerformed(evt);
            }
        });

        tipoCursoTxtFild.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tipoCursoTxtFild.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));
        tipoCursoTxtFild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoCursoTxtFildActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tipoCursoTxtFild)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(40, 40, 40)
                        .addComponent(btnAtualizar)
                        .addGap(40, 40, 40)
                        .addComponent(btnRemover)
                        .addGap(41, 41, 41)
                        .addComponent(btnCancelar))
                    .addComponent(nomeCursoTxtFild)
                    .addComponent(idCursoTxtFild)
                    .addComponent(cursosComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(cursosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(idCursoTxtFild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(nomeCursoTxtFild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(tipoCursoTxtFild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAtualizar)
                    .addComponent(btnRemover)
                    .addComponent(btnCancelar))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        //Capturar as informações digitadas
        String nomeCurso = nomeCursoTxtFild.getText();
        String tipoCurso = tipoCursoTxtFild.getText();

        if (nomeCurso == null || nomeCurso.length() == 0 || tipoCurso == null || tipoCurso.length() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor preencha os dois campos!");
        } else {
            try {
                int opcao = JOptionPane.showConfirmDialog(null, "Confirma inserção?");
                if (opcao == JOptionPane.YES_NO_OPTION) {
                    Curso curso = new Curso(nomeCurso, tipoCurso);
                    CursoDAO cd = new CursoDAO();
                    cd.inserirCurso(curso);
                    nomeCursoTxtFild.setText("");
                    tipoCursoTxtFild.setText("");
                    JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!");
                    buscarCursos();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro! Problemas técnicos");
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void nomeCursoTxtFildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCursoTxtFildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCursoTxtFildActionPerformed

    private void tipoCursoTxtFildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCursoTxtFildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoCursoTxtFildActionPerformed

    private void cursosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursosComboBoxActionPerformed
        Curso curso = (Curso) cursosComboBox.getSelectedItem();
        idCursoTxtFild.setText(Integer.toString(curso.getId()));
        nomeCursoTxtFild.setText(curso.getNome());
        tipoCursoTxtFild.setText(curso.getTipo());
    }//GEN-LAST:event_cursosComboBoxActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Confirma atualização");
        if (opcao == JOptionPane.YES_NO_OPTION) {
            try {
                int id = Integer.parseInt(idCursoTxtFild.getText());
                String nome = nomeCursoTxtFild.getText();
                String tipo = tipoCursoTxtFild.getText();
                Curso curso = new Curso(id, nome, tipo);
                CursoDAO cd = new CursoDAO();
                cd.atualizarCurso(curso);
                JOptionPane.showMessageDialog(null, "Curso atualizado!");
                buscarCursos();
                idCursoTxtFild.setText("");
                nomeCursoTxtFild.setText("");
                tipoCursoTxtFild.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Deu ruim! Chama o ADM");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente remover o curso?");
        if (opcao == JOptionPane.YES_OPTION) {
            try {
                int id = Integer.parseInt(idCursoTxtFild.getText());
                Curso curso = new Curso(id);
                CursoDAO cd = new CursoDAO();
                cd.removerCurso(curso);
                JOptionPane.showMessageDialog(null, "Curso removido com sucesso!");
                buscarCursos();
                nomeCursoTxtFild.setText("");
                tipoCursoTxtFild.setText("");
                idCursoTxtFild.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro inseperado!");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        DashboardTela dt = new DashboardTela();
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CursosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursosTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<Curso> cursosComboBox;
    private javax.swing.JTextField idCursoTxtFild;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeCursoTxtFild;
    private javax.swing.JTextField tipoCursoTxtFild;
    // End of variables declaration//GEN-END:variables

    private void buscarCursos() {

        try {
            CursoDAO cd = new CursoDAO();
            Curso[] cursos = cd.obterCursos();
            cursosComboBox.setModel(new DefaultComboBoxModel<>(cursos));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lista de cursos não encontrada");
            e.printStackTrace();
        }
    }

}