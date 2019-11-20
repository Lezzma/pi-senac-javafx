CREATE DATABASE lojamoveis;
use lojamoveis;
/* 
==================================
SEQUENCIA DE CRICAÇÃO DAS TABELAS
==================================
1º TABELA ENDERECO
2º CLIENTE
3º USUARIO
4º PRODUTO
5ª CARRINHO
6ª VENDA
===================================
*/
create table cliente (lojamoveis
id_cli int auto_increment primary key not null,
cpf_cli int(11) not null unique,
nome_cli varchar(50) not null,
data_nasc_cli date,
tel_cli int(11),
cel_cli int(11),
sexo_cli varchar(10),
est_civil_cli int(10),
email_cli varchar(30) unique not null,
id_endereco int not null,
foreign key (id_endereco) references endereco (id)
);

create table endereco(
id int auto_increment primary key not null,
rua_cli  varchar(30),
numero_cli int(10),
compl_cli varchar(20),
bairro_cli varchar(20),
cep_cli int(8) not null
);

create table produto (
id_prod int auto_increment primary key not null,
nome_prod varchar(50) not null,
descr_prod varchar(100),
preco_prod double(50, 2) not null,
marca_prod varchar(50),
qtde_estoq_prod int not null
);

create table usuario (
id_usu int auto_increment primary key,
nome_usu varchar(50) not null,
rg_usu int(10) not null,
cpf_usu int(11) not null,
email_usu varchar(20) not null unique,
senha_usu varchar(50) not null,
setor_usu enum('admin', 'vendedor') not null
);

create table venda (
id_venda int auto_increment not null primary key,
id_cli int not null,
id_vend int not null,
id_carrinho int not null,
valor_total double(50,2) not null,
qtd_produtos int not null,
data_venda date not null,
foreign key (id_carrinho) references carrinho (id)
);

create table carrinho(
	id int primary key null auto_increment,
    id_prod int not null,
    foreign key (id_prod) references produto (id_prod)
);
