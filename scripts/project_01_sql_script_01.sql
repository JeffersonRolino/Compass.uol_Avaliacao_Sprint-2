create database products_db;

use products_db;

create table `products_db`.`product` (
  `id` int not null,
  `name` VARCHAR(75) not null,
  `description` VARCHAR(200) not null,
  `quantity` int not null,
  `price` double not null,
  primary key(`id`)
);
