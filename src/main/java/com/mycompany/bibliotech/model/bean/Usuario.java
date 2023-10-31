package com.mycompany.bibliotech.model.bean;

public class Usuario {

    private int userId;
    private String userNick;
    private String userSenha;
    // USE_TYPE
    private String userNome;
    private String userSobrenome;
    // USE_DATANASC
    private String userEmail;
    // USE_CRIA
    //USE_SEXO
    private String userCpf;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserSenha() {
        return userSenha;
    }

    public void setUserSenha(String userSenha) {
        this.userSenha = userSenha;
    }

    public String getUserNome() {
        return userNome;
    }

    public void setUserNome(String userNome) {
        this.userNome = userNome;
    }

    public String getUserSobrenome() {
        return userSobrenome;
    }

    public void setUserSobrenome(String userSobrenome) {
        this.userSobrenome = userSobrenome;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


    public String getUserCpf() {
        return userCpf;
    }

    public void setUserCpf(String userCpf) {
        this.userCpf = userCpf;
    }

}
