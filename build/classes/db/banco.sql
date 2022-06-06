create database biblioteca_wissen;

use biblioteca_wissen;

create table user(
	id integer not null auto_increment,
    nome varchar(80) not null,
    login varchar(80) not null,
    senha varchar(80) not null,
    cpf varchar(11) not null,
    verificaAdm boolean not null,
    primary key(id)
);

insert into user values(null,"adm","adm","adm","adm",true);

create table item(
	id integer not null auto_increment,
    titulo varchar(80) not null,
    autor varchar(80) not null,
    editora varchar(80) not null,
    categoria varchar(80) not null,
    descricao varchar(240),
    anoPublicacao integer not null,
    disponivel boolean not null,
    primary key(id)
);
