-- Banco de testes com informações básicas para
-- testar a conectividade entre o programa e o MySQL

-- Cria o banco
CREATE DATABASE BIBLIOTECH;

-- Seleciona o banco que será usado
USE BIBLIOTECH;

-- Cria a tabela e seus respectivos atributos
CREATE TABLE USUARIOS(
USR_NOME varchar(20) not null,
USR_SENHA varchar(16) not null
);

-- Insert de usuário
INSERT INTO USUARIOS(USR_NOME, USR_SENHA)
VALUES('admin', 'admin');

-- Printando todos os dados.
SELECT * FROM USUARIOS;
