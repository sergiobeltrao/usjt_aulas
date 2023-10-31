package com.mycompany.bibliotech.telas;

import com.mycompany.bibliotech.dao.AutorDAO;
import com.mycompany.bibliotech.dao.EditoraDAO;
import com.mycompany.bibliotech.dao.LivroDAO;
import com.mycompany.bibliotech.model.bean.Autor;
import com.mycompany.bibliotech.model.bean.Editora;
import com.mycompany.bibliotech.model.bean.Livro;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CadastroDeLivros extends javax.swing.JFrame {

    public CadastroDeLivros() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tbSelect.getModel();
        tbSelect.setRowSorter(new TableRowSorter(modelo));

        readJTable();
    }

    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) tbSelect.getModel();

        // Para evitar que todos os dados sejam duplicados após um insert
        modelo.setNumRows(0);

        LivroDAO ldao = new LivroDAO();

        for (Livro l : ldao.read()) {

            modelo.addRow(new Object[]{
                l.getId(),
                l.getTitulo(),
                l.getIsbn(),
                l.getAnoDePublicacao(),
                l.getNumeroDePaginas(),
                l.getQuantidadeLivro(),
                l.getCatrgoria(),
                l.getPreco(),});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnInsert = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtAnoDePublicacao = new javax.swing.JTextField();
        txtNumeroDePaginas = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        txtAutorDataDeNascimento = new javax.swing.JTextField();
        txtNomeDoAutor = new javax.swing.JTextField();
        txtAutorNacionalidade = new javax.swing.JTextField();
        txtNomeDaEditora = new javax.swing.JTextField();
        boxBibliografia = new javax.swing.JScrollPane();
        txtAutorBibliografia = new javax.swing.JTextArea();
        cmbAutorSexo = new javax.swing.JComboBox<>();
        pnSelect = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSelect = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnInsert.setBackground(new java.awt.Color(255, 255, 255));
        pnInsert.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Título"));

        txtISBN.setBorder(javax.swing.BorderFactory.createTitledBorder("ISBN"));

        txtAnoDePublicacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Ano de Publicação"));

        txtNumeroDePaginas.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de Páginas"));

        txtQuantidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade"));

        txtCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));

        txtPreco.setBorder(javax.swing.BorderFactory.createTitledBorder("Preço"));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");

        btnDeletar.setText("Deletar");

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        txtAutorDataDeNascimento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Data de Nascimento"), "Data de Nascimento do Autor"));

        txtNomeDoAutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do Autor"));

        txtAutorNacionalidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Nacionalidade do Autor"));

        txtNomeDaEditora.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome da Editora"));

        boxBibliografia.setBorder(null);

        txtAutorBibliografia.setColumns(20);
        txtAutorBibliografia.setLineWrap(true);
        txtAutorBibliografia.setRows(5);
        txtAutorBibliografia.setBorder(javax.swing.BorderFactory.createTitledBorder("Bibliografia do Autor"));
        boxBibliografia.setViewportView(txtAutorBibliografia);

        cmbAutorSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não informado", "Masculino", "Feminino" }));
        cmbAutorSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo do Autor"));
        cmbAutorSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAutorSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnInsertLayout = new javax.swing.GroupLayout(pnInsert);
        pnInsert.setLayout(pnInsertLayout);
        pnInsertLayout.setHorizontalGroup(
            pnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInsertLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInsertLayout.createSequentialGroup()
                        .addGroup(pnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeDoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnoDePublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeDaEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroDePaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addGroup(pnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPreco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(txtISBN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(txtAutorDataDeNascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(txtAutorNacionalidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(cmbAutorSexo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnInsertLayout.createSequentialGroup()
                        .addComponent(voltarButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(pnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInsertLayout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addGap(52, 52, 52)
                        .addComponent(btnDeletar))
                    .addComponent(boxBibliografia, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        pnInsertLayout.setVerticalGroup(
            pnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInsertLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnInsertLayout.createSequentialGroup()
                        .addGroup(pnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeDoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnoDePublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAutorDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeDaEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAutorNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroDePaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAutorSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(boxBibliografia, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarButton)
                    .addComponent(btnCadastrar)
                    .addComponent(btnEditar)
                    .addComponent(btnDeletar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnSelect.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbSelect.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "ISBN", "Ano", "Nº de Páginas", "Quantidade", "Categoria", "Preço", "Autor", "Editora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbSelect);

        javax.swing.GroupLayout pnSelectLayout = new javax.swing.GroupLayout(pnSelect);
        pnSelect.setLayout(pnSelectLayout);
        pnSelectLayout.setHorizontalGroup(
            pnSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        pnSelectLayout.setVerticalGroup(
            pnSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        Livro lv = new Livro();
        Autor aut = new Autor();
        Editora ed = new Editora();

        LivroDAO lvdao = new LivroDAO();
        AutorDAO autdao = new AutorDAO();
        EditoraDAO eddao = new EditoraDAO();

        // Livro
        lv.setTitulo(txtTitulo.getText());
        lv.setIsbn(txtISBN.getText());
        lv.setAnoDePublicacao(Integer.parseInt(txtAnoDePublicacao.getText()));
        lv.setNumeroDePaginas(Integer.parseInt(txtNumeroDePaginas.getText()));
        lv.setQuantidadeLivro(Integer.parseInt(txtQuantidade.getText()));
        lv.setCatrgoria(txtCategoria.getText());
        lv.setPreco(Double.parseDouble(txtPreco.getText()));

        // Autor
        aut.setNome(txtNomeDoAutor.getText());
        aut.setNacionalidade(txtAutorNacionalidade.getText());
        aut.setDataDeNascimento(txtAutorDataDeNascimento.getText());
        aut.setBibliografia(txtAutorBibliografia.getText());

        // Opções de sexo do autor
        String valorAutorSexo = cmbAutorSexo.getSelectedItem().toString();
        String valorSelecionado = "MASC"; // Padrão "MASC" até implementar "OUTRO" no banco

        if (valorAutorSexo.equals("Masculino")) {
            valorSelecionado = "MASC";
        } else if (valorAutorSexo.equals("Feminino")) {
            valorSelecionado = "FEM";
        }

        aut.setSexo(valorSelecionado);

        // Editora
        ed.setNome(txtNomeDaEditora.getText());

        lvdao.create(lv);
        autdao.create(aut);
        eddao.create(ed);

        // Para limpar os campos já preenchidos
        txtTitulo.setText("");
        txtISBN.setText("");
        txtAnoDePublicacao.setText("");
        txtNumeroDePaginas.setText("");
        txtQuantidade.setText("");
        txtCategoria.setText("");
        txtPreco.setText("");
        txtNomeDoAutor.setText("");
        txtAutorNacionalidade.setText("");
        txtAutorDataDeNascimento.setText("");
        txtAutorBibliografia.setText("");
        txtNomeDaEditora.setText("");

        // Para que a leitura da tabela seja feita novamente
        // após salvar novas informações
        readJTable();

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        new TelaPrincipalAdministrador().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void cmbAutorSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAutorSexoActionPerformed

    }//GEN-LAST:event_cmbAutorSexoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDeLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane boxBibliografia;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox<String> cmbAutorSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnInsert;
    private javax.swing.JPanel pnSelect;
    private javax.swing.JTable tbSelect;
    private javax.swing.JTextField txtAnoDePublicacao;
    private javax.swing.JTextArea txtAutorBibliografia;
    private javax.swing.JTextField txtAutorDataDeNascimento;
    private javax.swing.JTextField txtAutorNacionalidade;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtNomeDaEditora;
    private javax.swing.JTextField txtNomeDoAutor;
    private javax.swing.JTextField txtNumeroDePaginas;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
