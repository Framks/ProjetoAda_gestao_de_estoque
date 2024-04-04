CREATE DATABASE estoque;

CREATE TABLE produto(
    id serial not null primary key,
    nome varchar(50),
    tipo varchar(50),
    quantidade int,
    preco real
);