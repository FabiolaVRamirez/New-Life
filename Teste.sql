CREATE DATABASE IF NOT EXISTS NewLife;
USE NewLife;

CREATE TABLE IF NOT EXISTS moradores (
	id_morador int AUTO_INCREMENT,
    apartamento long,
    nome varchar(75),
    rg varchar(12),
    cpf varchar(14),
    telefone1 varchar(20),
	telefone2 varchar(20),
    email varchar(75),
	contato_emergencia varchar(75),
    ce_telefone varchar(20),
    observacao varchar(572),
    PRIMARY KEY (id_morador)
);

CREATE TABLE IF NOT EXISTS veiculos (
	id_veiculo int AUTO_INCREMENT,
    apartamento long,
	placa varchar(7),
    marca varchar(25),
	modelo varchar(25),
    cor varchar(15),
	id_morador int,
    PRIMARY KEY (id_veiculo),
    FOREIGN KEY (id_morador) REFERENCES moradores(id_morador)
);

CREATE TABLE IF NOT EXISTS visitantes (
	id_visitante int AUTO_INCREMENT,
    apartamento long,
    nome varchar(75),
    rg varchar(12),
    cpf varchar(14),
    telefone1 varchar(20),
    telefone2 varchar(20),
    observacao varchar(572),
    id_morador int,
    PRIMARY KEY (id_visitante),
    FOREIGN KEY (id_morador) REFERENCES moradores(id_morador)
);

CREATE TABLE IF NOT EXISTS funcionarios (
	id_funcionario int AUTO_INCREMENT,
    apartamento long,
    nome varchar(75),
    rg varchar(12),
    cpf varchar(14),
    telefone1 varchar(20),
    telefone2 varchar(20),
    observacao varchar(572),
    id_morador int,
    PRIMARY KEY (id_funcionario),
    FOREIGN KEY (id_morador) REFERENCES moradores(id_morador)
);

INSERT INTO moradores (apartamento, nome, rg, cpf, telefone1, telefone2, email, contato_emergencia, ce_telefone, observacao)
VALUES (1, 'Matheus de Andrade', '11.111.111-1', '111.111.111-11', '+55 (11) 9 1111-1111', '+55 (11) 9 1111-1112', 'matheus@gmail.com', 'Polly', '+55 (11) 9 1111-1113', 'Possui um animal de porte médio.');
INSERT INTO moradores (apartamento, nome, rg, cpf, telefone1, telefone2, email, contato_emergencia, ce_telefone, observacao)
VALUES (1, 'Sofia de Andrade', '22.222.222-2', '222.222.222-22', '+55 (11) 9 1111-1114', '+55 (11) 9 1111-1115', 'sofia@gmail.com', 'Polly', '+55 (11) 9 1111-1113', 'Possui um animal de porte médio.');
INSERT INTO moradores (apartamento, nome, rg, cpf, telefone1, email, contato_emergencia, ce_telefone, observacao)
VALUES (2, 'Dwight Kurt Schrute', '33.333.333-3', '333.333.333-33', '+55 (11) 9 1111-1116', 'gerente.assistente@hotmail.com', 'Mose Schrute', '+55 (11) 9 1111-1117', 'Costuma andar armado.');

INSERT INTO veiculos (apartamento, placa, marca, modelo, cor, id_morador)
VALUES (1, 'AAA1A11', 'Chevrolet', 'Opala', 'Preto', '1');
INSERT INTO veiculos (apartamento, placa, marca, modelo, cor, id_morador)
VALUES (2, 'BBB2B22', 'Nissan', 'Datsun', 'Vinho', '3');