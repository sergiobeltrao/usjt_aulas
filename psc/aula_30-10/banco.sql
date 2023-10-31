CREATE DATABASE sergio_db;
USE sergio_db;

CREATE TABLE tb_usuario (id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(200), senha VARCHAR(200));

INSERT INTO tb_usuario (nome, senha) VALUES ('admin', 'admin');

