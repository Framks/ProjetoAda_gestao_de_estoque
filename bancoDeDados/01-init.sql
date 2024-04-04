CREATE DATABASE 'estoque';

CREATE TABLE produto(
    id serial not null primary key,
    nome varchar(50),
    tipo varchar(50),
    qtd int,
    valor_uni real
);

CREATE TABLE cliente(
    id serial not null primary key,
    nome varchar(30),
    
);

CREATE TABLE venda(
    id serial not null primary key,
    id_produto int references produto(id),
    id_cliente int,
    qtd int,
    valor_total real
);