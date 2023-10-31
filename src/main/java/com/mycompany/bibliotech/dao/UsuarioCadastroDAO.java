package com.mycompany.bibliotech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.mycompany.bibliotech.connection.ConnectionFactory;
import com.mycompany.bibliotech.model.bean.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioCadastroDAO {

    public void cadastrarUsuario(Usuario user) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
            
        try  {
            stmt = con.prepareStatement("INSERT INTO USUARIO (USE_NOME, USE_SOBRENOME, USE_CPF, USE_EMAIL, USE_SENHA, USE_NICK, USE_SEXO, USE_DATANASC, USE_TYPE, USE_CRIA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())");
            
            stmt.setString(1, user.getUserNome());
            stmt.setString(2, user.getUserSobrenome());
            stmt.setString(3, user.getUserCpf());
            stmt.setString(4, user.getUserEmail());
            stmt.setString(5, user.getUserSenha());
            stmt.setString(6, user.getUserNick());
            stmt.setString(7, user.getUserSexo().toString());
            stmt.setString(8, user.getUserDataNasc().toString());
            stmt.setString(9, user.getUserType().toString());
            stmt.setString(10, user.getUserCria().toString());
            stmt.executeUpdate();
            
           JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}