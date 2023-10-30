package com.mycompany.bibliotech.dao;

import com.mycompany.bibliotech.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mycompany.bibliotech.model.bean.Livro;

public class LivroDAO {

    public void create(Livro lv) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO LIVRO (LIV_NOME_LIVRO, LIV_ISBN, LIV_ANO_PUBLICACAO, LIV_PAGINA, LIV_QUANTIDADE, LIV_CATEGORIA, LIV_PRECO) VALUES(?, ?, ?, ?, ?, ?, ?)");
            //stmt.setString(1, "NULL");
            stmt.setString(1, lv.getTitulo());
            stmt.setString(2, lv.getIsbn());
            stmt.setString(3, lv.getAnoDePublicacao());
            stmt.setInt(4, lv.getNumeroDePaginas());
            stmt.setInt(5, lv.getQuantidadeLivro());
            stmt.setString(6, lv.getCatrgoria());
            stmt.setDouble(7, lv.getPreco());

            // Para preparar o SQL e executar
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}
