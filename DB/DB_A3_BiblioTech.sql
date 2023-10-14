CREATE DATABASE DB_BiblioTech;

USE DB_BiblioTech;

CREATE TABLE livros ( 
	li_ID_livros int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	li_nome_livro varchar (100),
	li_nome_autor varchar (100),
	li_ISBN Varchar (100),
	li_paginas int (4),
	li_quantidade varchar (100),
	li_categoria varchar (50),
	li_editora varchar (50),
	li_versao varchar (40),
	li_integridade char (2),
	li_avalicacao varchar (4),
	li_sinopse text
);

insert into livros (li_ID_livros, li_nome_livro, li_nome_autor, li_ISBN, li_paginas, li_quantidade, 
li_categoria, li_editora, li_versao, li_integridade, li_avalicacao, li_sinopse) values ( 
);
insert into livros (li_ID_livros, li_nome_livro, li_nome_autor, li_ISBN, li_paginas, li_categoria, li_editora ) values
(1, 'O Segredo das Estrelas', 'Laura Smith', '978-1234567890', 320, 'Ficção Científica', 'Galáxia Editora');

insert into livros (li_quantidade)  values ( auto_increment)  where li_ID_livros = 1;
INSERT INTO livros (li_quantidade) VALUES (NULL)  where li_ID_livros = 1;


insert into livros (li_ID_livros, li_nome_livro, li_nome_autor, li_ISBN, li_paginas, li_categoria, li_editora, li_versao ) values
(2, 'Caminho das Sombras', 'John Doe', '978-0987654321', 480, 'Fantasia Épica', 'Mundo Mágico Publicações', 3);

insert into livros (li_quantidade) values
(2, 'Caminho das Sombras', 'John Doe', '978-0987654321', 480, 'Fantasia Épica', 'Mundo Mágico Publicações', 3),
(3, 'A Cidade dos Suspiros', 'Maria Silva', '978-5432109876', 256, 'Romance', 'Amor & Drama Editora', 'Atlas'),
(4, 'Aventuras no Espaço-Tempo', 'Carlos Rodrigues', '978-1122334455', 400, 'Ficção Científica', 'Via Láctea Livros', 'Edição Limitada'),
(5, 'Noites de Mistério', 'Isabel Pereira', '978-5555555555', 384, 'Suspense', 'Editora Enigma', 'Edição de Bolso'),
(6, 'O Legado Perdido', 'Roberto Santos', '978-9876543210', 320, 'Fantasia', 'Terra dos Sonhos Publicações', 'Edição Revisada'),
(7, 'Trilhas de Aventura', 'Lucas Ribeiro', '978-1357924680', 416, 'Ação e Aventura', 'Editora Desbravadores', 'Edição Definitiva'),
(8, 'Segredos Obscuros', 'Mariana Lima', '978-1111222233', 272, 'Thriller', 'Editora Mistério Sombrio', 'Edição de Colecionador'),
(9, 'Além da Imaginação', 'Pedro Carvalho', '978-9876543211', 352, 'Ficção Científica', 'Universo Paralelo Editora', 'Edição Especial'),
(10, 'O Enigma do Passado', 'Ana Santos', '978-4444333222', 304, 'Mistério', 'Editora Enigmas e Revelações', 'Edição Limitada');
select * from livros;

ALTER TABLE livros MODIFY li_versao VARCHAR(40);
UPDATE livros set li_versao =  'Editora Luxo' where li_ID_livros = 1;
UPDATE livros set li_quantidade =  10 where li_ID_livros = 1;
 


