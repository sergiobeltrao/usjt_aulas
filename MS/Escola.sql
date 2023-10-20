CREATE DATABASE Escola;

USE Escola;

CREATE TABLE Alunos (
    ID INT PRIMARY KEY,
    Nome VARCHAR(255) NOT NULL,
    DataNascimento DATE NOT NULL,
	Genero CHAR(1) NOT NULL,         /* M (masculino) ou F (Feminino)*/
    Rua VARCHAR(150) NOT NULL,
    Bairro VARCHAR(50) NOT NULL,
    Numero INT NOT NULL,
    CEP CHAR(8) NOT NULL,
    Telefone VARCHAR(15) NOT NULL
);

CREATE TABLE Cursos (
    ID INT PRIMARY KEY,
    NomeCurso VARCHAR(255) NOT NULL,
    DescricaoCurso TEXT NOT NULL
);

CREATE TABLE Matriculas (
    ID INT PRIMARY KEY,
    ID_Aluno INT,
    ID_Curso INT,
    DataMatricula DATE,
    FOREIGN KEY (ID_Aluno) REFERENCES Alunos(ID),
    FOREIGN KEY (ID_Curso) REFERENCES Cursos(ID)
);

CREATE TABLE Notas (
    ID INT PRIMARY KEY,
    ID_Aluno INT,
    ID_Curso INT,
    Nota DECIMAL(5, 2),
    FOREIGN KEY (ID_Aluno) REFERENCES Alunos(ID),
    FOREIGN KEY (ID_Curso) REFERENCES Cursos(ID)
);
