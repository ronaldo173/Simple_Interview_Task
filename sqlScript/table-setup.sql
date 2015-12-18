create database if not exists myBank;

use myBank;

SET FOREIGN_KEY_CHECKS=0;
drop table if exists accounts;
drop table if exists clients;
drop table if exists payment_history;
SET FOREIGN_KEY_CHECKS=1;

CREATE TABLE `clients` (
  `id` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  `last_name` varchar(64) NOT NULL,
  `first_name` varchar(64) NOT NULL  
)ENGINE=InnoDB  DEFAULT CHARSET=latin1;

CREATE TABLE `accounts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_client` int(11) NOT NULL, 
  `balance` double DEFAULT NULL,  
  PRIMARY KEY (`id`),
  foreign key (id_client) references clients(id)
  on update cascade
  on delete cascade
)ENGINE=InnoDB  DEFAULT CHARSET=latin1;

CREATE TABLE `payment_history` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT null,
  `id_account` int(11) NOT NULL,
  `id_account_operated_with` int(11) NOT NULL,
  `amount` double NOT NULL,
  `action_date_time` timestamp,
  PRIMARY KEY (id),
  FOREIGN KEY (id_user) REFERENCES  clients(id)
   on update cascade
  on delete cascade,
  FOREIGN KEY (id_account) REFERENCES  accounts(id)
   on update cascade
  on delete cascade,
  foreign key (id_account_operated_with) references accounts(id)
   on update cascade
  on delete cascade
)ENGINE=InnoDB  DEFAULT CHARSET=latin1;

INSERT INTO `clients` (`id`,`first_name`,`last_name`) VALUES (1,'Alexandr','Efimov');
INSERT INTO `clients` (`first_name`,`last_name`) VALUES ('Bill','Geits');
INSERT INTO `clients` (`first_name`,`last_name`) VALUES ('John','Bush');
INSERT INTO `clients` (`first_name`,`last_name`) VALUES ('Joshua','Bloch');
INSERT INTO `clients` (`first_name`,`last_name`) VALUES ('Bruss','Eckel');

insert into `accounts` (`id`,`id_client`,  `balance`) VALUES (1 , 1 , 100500);
insert into `accounts` (`id_client`,  `balance`) VALUES ( 2 , 999999);
insert into `accounts` (`id_client`,  `balance`) VALUES ( 3 , 222222);
insert into `accounts` (`id_client`,  `balance`) VALUES ( 3 , 333333);
insert into `accounts` (`id_client`,  `balance`) VALUES ( 4 , 444444);

