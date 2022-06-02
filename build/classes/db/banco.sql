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

SELECT * from user;