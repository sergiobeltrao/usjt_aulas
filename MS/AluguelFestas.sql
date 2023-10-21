CREATE DATABASE AluguelFestas;

USE AluguelFestas;

CREATE TABLE Tema (
    ID INT PRIMARY KEY,
    Nome VARCHAR(255) NOT NULL,
    ValorAluguel NUMERIC(8,2) NOT NULL
);
CREATE TABLE Item_Tema (
    ID INT PRIMARY KEY,
    Descricao TEXT NOT NULL,
	Tema_ID INT,
	FOREIGN KEY (Tema_ID) REFERENCES Tema(ID)
);

CREATE TABLE Endereco (
    ID INT PRIMARY KEY,
	Logradouro VARCHAR(150) NOT NULL,
    Numero INT NOT NULL,
    Cidade VARCHAR(50) NOT NULL,
    UF CHAR(2) NOT NULL,
    CEP CHAR(8) NOT NULL
);

CREATE TABLE Cliente (
    CPF INT PRIMARY KEY,
    Nome VARCHAR(255) NOT NULL,
    Telefone VARCHAR(15) NOT NULL
);

CREATE TABLE Festa (
	ID INT PRIMARY KEY,
    ValorCobrado NUMERIC(8,2) NOT NULL,
    DataInicio DATE,
    DataFim DATE,
     Endereco_ID INT,
    Cliente_CPF INT,
    Tema_ID INT,
	FOREIGN KEY (Endereco_ID) REFERENCES Endereco(ID),
    FOREIGN KEY (Cliente_CPF) REFERENCES Cliente(CPF),
    FOREIGN KEY (Tema_ID) REFERENCES Tema(ID)
);

