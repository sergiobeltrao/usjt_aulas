CREATE DATABASE DB_BiblioTech;

USE DB_BiblioTech;

CREATE TABLE Livro ( 
	Li_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	Li_Titulo VARCHAR (100),
	Li_Autor VARCHAR (100),
	Li_ISBN VARCHAR (100),
	Li_Pagina int (4),
	Li_Quantidade VARCHAR (100),
	Li_Categoria VARCHAR (50),
	Li_Editora VARCHAR (50),
	Li_Versao VARCHAR (40),
	Li_Integridade CHAR (2),
	Li_Avalicacao VARCHAR (4),
	Li_Sinopse TEXT 
    );

INSERT INTO Livro (Li_ID, Li_Titulo, Li_Autor, Li_ISBN, Li_Paginas, Li_Categoria, Li_Editora ) VALUES
( 'O Segredo das Estrelas', 'Laura Smith', '978-1234567890', 320, 'Ficção Científica', 'Galáxia Editora');

INSERT INTO livro (Li_ID, Li_Titulo, Li_Autor, Li_ISBN, Li_Paginas, Li_Categoria, Li_Editora, Li_Versao ) VALUES
( 'Caminho das Sombras', 'John Doe', '978-0987654321', 480, 'Fantasia Épica', 'Mundo Mágico Publicações', 'Altas'),
( 'A Cidade dos Suspiros', 'Maria Silva', '978-5432109876', 256, 'Romance', 'Amor & Drama Editora', 'Atlas'),
( 'Aventuras no Espaço-Tempo', 'Carlos Rodrigues', '978-1122334455', 400, 'Ficção Científica', 'Via Láctea Livros', 'Edição Limitada'),
( 'Noites de Mistério', 'Isabel Pereira', '978-5555555555', 384, 'Suspense', 'Editora Enigma', 'Edição de Bolso'),
( 'O Legado Perdido', 'Roberto Santos', '978-9876543210', 320, 'Fantasia', 'Terra dos Sonhos Publicações', 'Edição Revisada'),
( 'Trilhas de Aventura', 'Lucas Ribeiro', '978-1357924680', 416, 'Ação e Aventura', 'Editora Desbravadores', 'Edição Definitiva'),
( 'Segredos Obscuros', 'Mariana Lima', '978-1111222233', 272, 'Thriller', 'Editora Mistério Sombrio', 'Edição de Colecionador'),
( 'Além da Imaginação', 'Pedro Carvalho', '978-9876543211', 352, 'Ficção Científica', 'Universo Paralelo Editora', 'Edição Especial'),
( 'O Enigma do Passado', 'Ana Santos', '978-4444333222', 304, 'Mistério', 'Editora Enigmas e Revelações', 'Edição Limitada');

CREATE TABLE User_Admin (
	Adm_ID INT AUTO_INCREMENT PRIMARY KEY,
    Adm_Nome_Completo VARCHAR(100) NOT NULL,
    Adm_Nick VARCHAR(50) UNIQUE NOT NULL,
    Adm_Senha VARCHAR(100) NOT NULL,
    Adm_Email VARCHAR(100) UNIQUE NOT NULL,
    Adm_DataNascimento DATE,
    Adm_Data_Criacao DATETIME,
    Adm_Data_Modificacao DATETIME,
    Adm_Nivel_Acesso ENUM('Administrador', 'Funcionario', 'Cliente'),
    Adm_Ativo BOOLEAN,
    Adm_Rua VARCHAR(100),
    Adm_Cidade VARCHAR(50),
    Adm_Estado VARCHAR(50),
    Adm_CEP VARCHAR(10),
    Adm_Telefone VARCHAR(15),
    Config_Notificacao BOOLEAN 
);

INSERT INTO User_Admin (Adm_Nome_Completo, Adm_Nick, Adm_Senha, Adm_Email, Adm_Data_Criacao, Adm_Data_Modificacao, Adm_Nivel_Acesso, 
Adm_Ativo, Adm_Rua, Adm_Cidade, Adm_Estado, Adm_CEP, Adm_Telefone, Adm_DataNascimento) VALUES
('Eduardo Silva', 'eduardo', 'senha123', 'eduardo@email.com', NOW(), NOW(), 'Administrador', 1, '123 Main St', 'Cidade A', 
'Estado A', '12345', '555-123-4567', '1990-01-15'),
('John Smith', 'john', 'senha456', 'john@email.com', NOW(), NOW(), 'Funcionario', 1, '456 Elm St', 'Cidade B', 'Estado B', 
'54321', '555-987-6543', '1985-05-20'),
('Sérgio Almeida', 'sergio', 'senha789', 'sergio@email.com', NOW(), NOW(), 'Funcionario', 1, '789 Oak St', 'Cidade C', 'Estado C', 
'98765', '555-111-2222', '1992-12-10'),
('Bruno Oliveira', 'bruno', 'senhaabc', 'bruno@email.com', NOW(), NOW(), 'Cliente', 1, '456 Pine St', 'Cidade A', 'Estado B', 
'54321', '555-222-3333', '1995-08-03'),
('Tiago Santos', 'tiago', 'senhabcd', 'tiago@email.com', NOW(), NOW(), 'Cliente', 1, '987 Cedar St', 'Cidade D', 'Estado A',
 '23456', '555-333-4444', '1998-03-27'),
('Alisson Lima', 'alisson', 'senhacef', 'alisson@email.com', NOW(), NOW(), 'Cliente', 1, '123 Oak St', 'Cidade E', 'Estado E', 
'12345', '555-444-5555', '1997-11-12'),
('Gustavo Ribeiro', 'gustavo', 'senhaghi', 'gustavo@email.com', NOW(), NOW(), 'Cliente', 1, '456 Elm St', 'Cidade F', 'Estado F', 
'54321', '555-555-6666', '1996-09-07', 1),
('Rodrigo Fernandes', 'rodrigo', 'senhaidj', 'rodrigo@email.com', NOW(), NOW(), 'Cliente', 1, '789 Pine St', 'Cidade G', 'Estado G',
 '98765', '555-666-7777', '1999-02-18');
 
select * from livro;







