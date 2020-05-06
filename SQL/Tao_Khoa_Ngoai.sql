create database ngan_hang;
create table ngan_hang.Customers(
customer_number int(11) not null,
fullname varchar(50) not null,
address varchar(220) not null,
email varchar(50),
phone int (10) not null,
primary key(customer_number));
create table ngan_hang.accounts(
account_number int (11) not null,
account_type varchar(50) not null,
date date,
customer_number int,
balance int (11) not null,
primary key(account_number),
FOREIGN KEY (account_number) REFERENCES Customers(customer_number));
create table ngan_hang.transactions(
tran_number int(11) not null,
account_number int(11) not null,
date date,
account_number int,
amounts int (11) not null,
descriptions varchar(100),
primary key(tran_number),
foreign key(account_number) references transactions(tran_number));

