-- CRIA O BANCO
CREATE DATABASE DB_FESTAS_INFANTIS;

-- SELECIONA O BANCO
USE DB_FESTAS_INFANTIS;

-- CRIANDO A PRIMEIRA TABELA
CREATE TABLE T_TEMA(
TM_ID INT NOT NULL PRIMARY KEY,
TM_NOME VARCHAR(100) NOT NULL,
TM_VALOR_ALUGUEL NUMERIC(8,2) NULL
);

-- CRUD
-- CREATE
INSERT INTO T_TEMA(TM_ID, TM_NOME, TM_VALOR_ALUGUEL)
VALUES (1, 'HEROIS', 199.99);
INSERT INTO T_TEMA(TM_ID, TM_NOME, TM_VALOR_ALUGUEL)
VALUES (2, 'VILOES', 299.99);

-- READ
SELECT * FROM T_TEMA;
SELECT * FROM T_TEMA WHERE TM_NOME = 'HEROIS';

-- UPDATE
UPDATE T_TEMA SET TM_VALOR_ALUGUEL = 300.00 WHERE TM_ID = 2;

-- DELETE
DELETE FROM T_TEMA WHERE TM_ID = 2;

-- DELETAR A COLUNA
ALTER TABLE T_TEMA DROP COLUMN TM_VALOR_ALUGUEL;

-- CRIANDO COMULA E ATUALIZANDO O VALOR
ALTER TABLE T_TEMA ADD TM_VALOR_ALUGUEL NUMERIC(8,2) NOT NULL;
UPDATE T_TEMA SET TM_VALOR_ALUGUEL = 199.99 WHERE TM_ID = 1;

-- CRIANDO A TABELA DE ALUGUEL
CREATE TABLE T_ALUGUEL(
AL_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
AL_VLCOBRADO NUMERIC (8,2) NOT NULL,
AL_DINCI DATETIME NOT NULL,
AL_DTFIN DATETIME NOT NULL
);

ALTER TABLE T_ALUGUEL ADD FES_IDTEMA INT NOT NULL;

ALTER TABLE T_ALUGUEL ADD CONSTRAINT FOREIGN KEY (FES_IDTEMA) REFERENCES T_TEMA (TM_ID);

SELECT * FROM T_ALUGUEL;

CREATE TABLE T_ENDERECO(
EN_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
EN_LOGR VARCHAR(100) NOT NULL,
EN_NUM INT NOT NULL,
EN_CIDADE VARCHAR(100) NOT NULL,
EN_UF VARCHAR(2) NOT NULL,
EN_CEP VARCHAR (10) NOT NULL
);

CREATE TABLE T_CLIENTE(
CLI_CPF BIGINT(15),
CLI_NOME VARCHAR(100),
CLI_TELEFONE VARCHAR(100)
);
