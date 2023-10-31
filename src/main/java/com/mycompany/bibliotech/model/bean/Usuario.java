package com.mycompany.bibliotech.model.bean;

import java.util.Date;

public class Usuario {

    private int userId;
    private String userNick;
    private String userSenha;
    private UserType userType;
    private String userNome;
    private String userSobrenome;
    private Date userDataNasc;
    private String userEmail;
    private Date userCria;
    private UserSexo userSexo;
    private String userCpf;
    public enum UserType {
        ADMIN,
        BIBLIOTECARIO,
        CLIENTE
    }
    public enum UserSexo {
        MASC,
        FEM,
        OUTRO
    }
    
        public int getUserId() {
            return userId;
        }
        
        public String getUserNick() {
            return userNick;
        }

        public String getUserSenha() {
            return userSenha;
        }

        public UserType getUserType() {
            return userType;
        }

        public String getUserNome() {
            return userNome;
        }

        public String getUserSobrenome() {
            return userSobrenome;
        }

        public Date getUserDataNasc() {
            return userDataNasc;
        }

        public String getUserEmail() {
            return userEmail;
        }

        public Date getUserCria() {
            return userCria;
        }

        public UserSexo getUserSexo() {
            return userSexo;
        }

        public String getUserCpf() {
            return userCpf;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public void setUserNick(String userNick) {
            this.userNick = userNick;
        }

        public void setUserSenha(String userSenha) {
            this.userSenha = userSenha;
        }

        public void setUserType(UserType userType) {
            this.userType = userType;
        }

        public void setUserNome(String userNome) {
            this.userNome = userNome;
        }

        public void setUserSobrenome(String userSobrenome) {
            this.userSobrenome = userSobrenome;
        }

        public void setUserDataNasc(Date userDataNasc) {
            this.userDataNasc = userDataNasc;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public void setUserCria(Date userCria) {
            this.userCria = userCria;
        }

        public void setUserSexo(UserSexo userSexo) {
            this.userSexo = userSexo;
        }

        public void setUserCpf(String userCpf) {
            this.userCpf = userCpf;
        }

        
}
