create database produtos_db;

use produtos_db;

create table `produtos_db`.`produtos` (
  `id` int not null	auto_increment,
  `nome` VARCHAR(75) not null,
  `descricao` VARCHAR(200) not null,
  `quantidade` int not null,
  `preco` double not null,
  primary key(`id`)
);
