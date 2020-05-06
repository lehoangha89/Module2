create database ngan_hang;
create table ngan_hang.customers(
customer_number int (11) not null,
fullname varchar(50) not null,
address varchar (250) not null,
email varchar (50),
phone int (10),
PRIMARY KEY (customer_number));

create table ngan_hang.accounts(
account_number int (11) not null,
account_type varchar(50) not null,
date date,
balance float (11.0) not null,
customer_number int (11) not null,
primary key(account_number),
foreign key(customer_number)references customers(customer_number));

create table ngan_hang.transactions(
tran_number int (11) not null,
date date,
amounts varchar (12) not null,
descriptions varchar(50),
account_number int (11) not null,
primary key(tran_number),
foreign key(account_number)references accounts(account_number));
