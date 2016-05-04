drop database if exists dbfutebolmanager;
create database dbfutebolmanager;

use dbfutebolmanager;
    
create table member(
    idMember int not null auto_increment primary key,
    nomeMember varchar(255),
    dtNascimento date,
    endereco varchar(255),
    cpf varchar(50),
    rg varchar(50),
    email varchar(255),
    nivelacesso int
	
);


create table telefone(
    idTelefone int not null auto_increment primary key,
    numeroTelefone int
);



select * from member;