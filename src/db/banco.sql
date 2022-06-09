create database sistema_biblioteca;

use sistema_biblioteca;

create table usuario (
	id int not null auto_increment,
    nome varchar(80) not null,
    cpf varchar(11) not null,
    telefone varchar(11) not null,
    email varchar(80) not null,
    login_usuario varchar(30) not null,
    senha varchar(30) not null,
    verificar_adm boolean not null,
    primary key (id)
);

insert into usuario values (null, 'Conta ADM Padrão', '--', '--', '--', 'admin', 'admin', true);

create table acervo (
	id int not null auto_increment,
    titulo varchar(100) not null,
    autor varchar(80),
    editora varchar(80),
    categoria varchar(50),
    descricao varchar(360),
    ano_publicacao int,
    disponibilidade boolean not null,
    primary key(id)
);

create table cliente (
	id int not null auto_increment,
    nome varchar(80) not null,
    cpf varchar(11) not null,
    endereco varchar(100),
    email varchar(80),
    primary key(id)
);

create table emprestimo (
	id int not null auto_increment,
    id_acervo int not null,
    id_cliente int not null,
    data_emprestimo date not null,
    data_devolucao date not null,
    devolvido boolean not null,
    primary key(id),
    foreign key(id_acervo) references acervo(id),
    foreign key(id_cliente) references cliente(id)
);


