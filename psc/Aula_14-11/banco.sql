CREATE DATABASE sergio_db;
USE sergio_db;

CREATE TABLE tb_usuario (id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(200), senha VARCHAR(200));

INSERT INTO tb_usuario (nome, senha) VALUES ('admin', 'admin');

CREATE TABLE TB_CURSOS(
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(200) NOT NULL,
    TIPO VARCHAR(100) NOT NULL
);

INSERT INTO TB_CURSOS(NOME, TIPO) VALUES('ENGENHARIA DA COMPUTAÇÃO', 'BACHARELADO');
INSERT INTO TB_CURSOS(NOME, TIPO) VALUES('ANÁLISE DE SISTEMAS', 'BACHARELADO');

CREATE TABLE TB_ALUNO(
ALU_ID INT PRIMARY KEY AUTO_INCREMENT,
ALU_NOME VARCHAR(200),
ALU_ANOASCIMENTO INT    
);

INSERT INTO TB_ALUNO(ALU_NOME, ALU_ANOASCIMENTO) VALUES('Sérgio Beltrão', 1996);
INSERT INTO TB_ALUNO(ALU_NOME, ALU_ANOASCIMENTO) VALUES('Monica', 1980);
INSERT INTO TB_ALUNO(ALU_NOME, ALU_ANOASCIMENTO) VALUES('Dino da Silva Sauro', 666);
INSERT INTO TB_ALUNO(ALU_NOME, ALU_ANOASCIMENTO) VALUES('Robert da Silva Sauro', 700);

SELECT * FROM TB_ALUNO;

SELECT * FROM TB_CURSOS;

CREATE TABLE TB_ALUNO_CURSO(
ID_ALUNO INT NOT NULL PRIMARY KEY,
ID_CURSO INT NOT NULL PRIMARY KEY,
ANO INT,
SEMESTRE INT,
FOREIGN KEY (ID_ALUNO) REFERENCES TB_ALUNO(ALU_ID),
FOREIGN KEY (ID_CURSO) REFERENCES TB_CURSOS(ID),
ON DELETE NO ACTION,
ON UPGRADE NO ACTION
);