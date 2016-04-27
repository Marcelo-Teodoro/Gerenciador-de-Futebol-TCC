drop database if exists dbfutebolmanager;
create database dbfutebolmanager;

use dbfutebolmanager;
    
create table member(
    idMember int not null auto_increment primary key,
    nomeMember varchar(255),
    dtNascimento date,
    endereco varchar(255),
    cpf int,
    rg int,
    email varchar(255),
    nivelacesso int
	
);


create table telefone(
    idTelefone int not null auto_increment primary key,
    numeroTelefone int
);



insert into member(nomeMember,dtnascimento, endereco, cpf, rg, email, nivelacesso) values ("Marcelo", 19900207,"rua tal", null, 10999999, "test@test.test", 1);
insert into member(nomeMember,dtnascimento, endereco, cpf, rg, email, nivelacesso) values ("Marcelo 2", 19900207,"rua tal", null, 10999999, "test@test.test", 2);
insert into member(nomeMember,dtnascimento, endereco, cpf, rg, email, nivelacesso) values ("Marcelo 3", 19900207,"rua tal", null, 10999999, "test@test.test", 3);
insert into member(nomeMember,dtnascimento, endereco, cpf, rg, email, nivelacesso) values ("Marcelo 4", 19900207,"rua tal", null, 10999999, "test@test.test", 4);
insert into member(nomeMember) values ("Indigente 2");
insert into member(nomeMember) values ("Mendigo 3");
insert into member(nomeMember) values ("Sei lá 4");

select * from member;