CREATE DATABASE estoque;
\c estoque;

CREATE TABLE produto(
    id serial not null primary key,
    nome varchar(50),
    categoria varchar(50),
    quantidade int,
    preco real
);