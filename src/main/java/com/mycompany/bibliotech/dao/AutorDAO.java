package com.mycompany.bibliotech.dao;

import com.mycompany.bibliotech.connection.ConnectionFactory;
import com.mycompany.bibliotech.model.bean.Autor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AutorDAO {

    public void create(Autor aut) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO AUTOR (ID_AUTOR, AUT_NOME_AUTOR, AUT_DATA_NASC, AUT_NACIONALIDADE, AUT_BIBLIOGRAFIA, AUT_SEXO) VALUES(NULL, ?, ?, ?, ?, ?)");

            stmt.setString(1, aut.getNome());
            stmt.setString(2, aut.getDataDeNascimento());
            stmt.setString(3, aut.getNacionalidade());
            stmt.setString(4, aut.getBibliografia());
            stmt.setString(5, aut.getSexo());

            // Para preparar o SQL e executar
            stmt.executeUpdate();
            
            // Desativado por enquanto para evitar duplicidade de mensagens
            // JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
