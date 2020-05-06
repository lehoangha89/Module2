create database library;

create table library.category(
cate_number varchar(50) primary key not null,
name_category varchar (50));

create table library.book(
id_book varchar(50) primary key not null,
name_book varchar(50),
publishing_company_book varchar(200),
author_book varchar(50),
publishing_year_book date,
number_of_editions int,
price_book int,
image_book varchar(10),
cate_number varchar(50),
foreign key(cate_number)references category(cate_number));

create table library.student(
student_number varchar(15) primary key not null,
student_name varchar(50),
birthday_student date,
address varchar(500),
email varchar (50),
phone_student varchar(10),
image blob,
id_book varchar(50),
foreign key(id_book)references book(id_book));

create table library.borrow_oders(
id_borrow_oders varchar (15) primary key not null,
date_borrow varchar (50),
date_prompt varchar (50),
student_number varchar(15),
id_book varchar(50),
foreign key(student_number)references library.student(student_number),
foreign key (id_book)references library.book(id_book));

create table library.student_borrow_book(
student_number varchar(15),
id_book varchar(50),
foreign key(student_number)references student(student_number),
foreign key (id_book)references book(id_book));
