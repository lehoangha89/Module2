create database hoc_vien_codegym;

create table hoc_vien_codegym.thong_tin_hoc_vien (
	id_hoc_vien int primary key,
    ten_hoc_vien varchar(60)
);
insert into hoc_vien_codegym.thong_tin_hoc_vien
values
(1, 'Tien'),
(2, 'Toan');

insert into hoc_vien_codegym.thong_tin_hoc_vien
values
(3, 'Hung'),
(4, 'Dai'),
(5, 'Phi');

select *
from hoc_vien_codegym.thong_tin_hoc_vien
where ten_hoc_vien like '%i%';
SET FOREIGN_KEY_CHECKS=0;

update hoc_vien_codegym.thong_tin_hoc_vien
set ten_hoc_vien = 'Nguyen Vu Thanh Tien'
where ten_hoc_vien = 'Tien';

delete from hoc_vien_codegym.thong_tin_hoc_vien
where ten_hoc_vien = 'Tien';

drop table hoc_vien_codegym.thong_tin_hoc_vien;

drop database hoc_vien_codegym;

UPDATE customers
SET addressLine2='Level 2'
WHERE customerNumber = '103';