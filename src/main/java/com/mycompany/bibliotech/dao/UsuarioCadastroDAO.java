package com.mycompany.bibliotech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import com.mycompany.bibliotech.connection.ConnectionFactory;
import com.mycompany.bibliotech.telas.CadastroUsuario;

public class UsuarioCadastroDAO {

    private int codigo;
    private String nick;
    private String senha;
    
    private String nome;
    private int datanasc;
    private String email;
    private String sexo;
    private String fone;

    public UsuarioCadastroDAO(String nome) {
        this.nome = nome;
    }

    public UsuarioCadastroDAO(String nick, String senha, String nome, String email, String sexo, String fone) {
        this.nick = nick;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.fone = fone;
    }

    public UsuarioCadastroDAO() {
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNick() {
        return nick;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public int getDatanasc() {
        return datanasc;
    }

    public String getEmail() {
        return email;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFone() {
        return fone;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDatanasc(int datanasc) {
        this.datanasc = datanasc;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {
        return "UsuarioCadastroDAO{" + "codigo=" + codigo + ", nick=" + nick + ", senha=" + senha + ", nome=" + nome + ", datanasc=" + datanasc + ", email=" + email + ", sexo=" + sexo + ", fone=" + fone + '}';
    }
/*
    public boolean cadNick() {
        String sql = "INSERT INTO USUARIO (USE_NICK) VALUES (?)";
        try (Connection c = ConnectionFactory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nick);
            ps.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    
        public boolean cadSenha() {
        String sql = "INSERT INTO USUARIO (USE_SENHA) VALUES (?)";
        try (Connection c = ConnectionFactory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nick);
            ps.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    
    public boolean cadType() {
        String sql = "INSERT INTO USUARIO (USE_TYPE) VALUES (?)";
        try (Connection c = ConnectionFactory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nick);
            ps.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    
    public boolean cadNome() {
        String sql = "INSERT INTO USUARIO (USE_Nome) VALUES (?)";
        try (Connection c = ConnectionFactory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nick);
            ps.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    
    public boolean cadSobrenome() {
        String sql = "INSERT INTO USUARIO (USE_SOBRENOME) VALUES (?)";
        try (Connection c = ConnectionFactory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nick);
            ps.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    
    public boolean cadDataNasc() {
        String sql = "INSERT INTO USUARIO (USE_DATANASC) VALUES (?)";
        try (Connection c = ConnectionFactory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nick);
            ps.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    
    public boolean cadEmail() {
        String sql = "INSERT INTO USUARIO (USE_EMAIL) VALUES (?)";
        try (Connection c = ConnectionFactory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nick);
            ps.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    
    public boolean cadCria() {
        String sql = "INSERT INTO USUARIO (USE_CRIA) VALUES (?)";
        try (Connection c = ConnectionFactory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nick);
            ps.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    
    public boolean cadSexo() {
        String sql = "INSERT INTO USUARIO (USE_SEXO) VALUES (?)";
        try (Connection c = ConnectionFactory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nick);
            ps.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    
    public boolean cadCPF() {
        String sql = "INSERT INTO USUARIO (USE_CPF) VALUES (?)";
        try (Connection c = ConnectionFactory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nick);
            ps.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    
    public boolean cadFone() {
        String sql = "INSERT INTO USUARIO (USE_TELEFONE) VALUES (?)";
        try (Connection c = ConnectionFactory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nick);
            ps.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    */
public boolean cadastrar() {
    CadastroUsuario cad = new CadastroUsuario();
    
    String sql = "INSERT INTO USUARIO (USE_NICK, USE_SENHA, USE_TYPE, USE_NOME, USE_SOBRENOME, USE_DATANASC, USE_EMAIL, USE_CRIA, USE_SEXO) " +
                 "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, NOW(), ?)";
    
    try (Connection c = ConnectionFactory.getConnection();
         PreparedStatement ps = c.prepareStatement(sql)) {
        ps.setString(1, cad.nickTxt.getText());
        ps.setString(2, cad.senhaTxt.getText());
        ps.setString(3, cad.cargoBox.getText());
        ps.setString(4, cad.nomeTxt.getText());
        ps.setString(5, cad.sobrenomeTxt.getText());
        ps.setString(6, cad.dataNascChooser.getText());
        ps.setString(7, cad.emailTxt.getText());
        ps.setString(8, cad.sexoTxt.getText());

        ps.execute();
        return true;

    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

    
    
}
