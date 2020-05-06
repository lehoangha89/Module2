create database Furama;

create table ViTri(
id_vi_tri int primary key,
ten_vi_tri varchar(45));

create table TrinhDo(
id_trinh_do int primary key,
trinh_do varchar(45));

create table BoPhan(
id_bo_phan int primary key,
ten_bo_phan varchar (45));

create table NhanVien(
id_nhan_vien int primary key,
ho_ten varchar(45),
id_vi_tri int,
id_trinh_do int,
id_bo_phan int,
ngay_sinh date,
so_cmnd varchar (45),
luong varchar(45),
sdt varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key(id_vi_tri)references ViTri(id_vi_tri),
foreign key(id_bo_phan)references BoPhan(id_bo_phan),
foreign key(id_trinh_do)references TrinhDo(id_trinh_do));

create table LoaiKhach(
id_loai_khach int primary key,
ten_loai_khach varchar(45));

create table KhachHang(
id_khach_hang int primary key,
id_loai_khach int,
ho_ten varchar (45),
ngay_sinh_khach date,
so_cmnd_khach varchar(45),
sdt_khach varchar(45),
email_khach varchar (45),
dia_chi_khach varchar (45),
foreign key(id_loai_khach)references LoaiKhach(id_loai_khach));

create table KieuThue(
id_kieu_thue int primary key,
ten_kieu_thue varchar(45),
gia_kieu_thue int);

create table LoaiDichVu(
id_loai_dich_vu int primary key,
ten_loai_dich_vu varchar (45));

create table DichVu(
id_dich_vu int primary key,
ten_dich_vu varchar(45),
dien_tich int,
so_tang int,
so_nguoi_toi_da varchar(45),
chi_phi_thue varchar (45),
id_kieu_thue int,
id_loai_dich_vu int,
trng_thai varchar(45),
foreign key(id_kieu_thue) references KieuThue(id_kieu_thue),
foreign key(id_loai_dich_vu) references LoaiDichVu(id_loai_dich_vu));

create table DichVuDiKem(
id_dich_vu_di_kem int primary key,
ten_dich_vu_di_kem varchar(45),
gia_dich_vu_di_kem int,
don_vi int,
trang_thai_kha_dung varchar(45));

create table HopDong(
id_hop_dong int primary key,
id_nhan_vien int,
id_khach_hang int,
id_dich_vu int,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc int,
tong_tien int,
foreign key(id_nhan_vien) references nhanvien(id_nhan_vien),
foreign key(id_khach_hang) references KhachHang (id_khach_hang),
foreign key(id_dich_vu) references DichVu(id_dich_vu));

create table HopDongChiTiet(
id_hop_dong_chi_tiet int primary key,
id_hop_dong int,
id_dich_vu_di_kem int,
so_luong int,
foreign key(id_hop_dong) references HopDong(id_hop_dong),
foreign key(id_dich_vu_di_kem) references DichVuDiKem(id_dich_vu_di_kem));

insert into vitri
values (1,'Giam Doc'),
(2,'Truong Phong'),
(3,'Thu Ki'),
(4,'Quan Ly'),
(5,'Nhan Vien');

insert into trinhdo
values
(1,'Cao Hoc'),
(2,'Dai Hoc'),
(3,'Cao Dang'),
(4,'Trung Cap'),
(5,'THPT');

insert into bophan
values
(1,'Le Tan'),
(2,'Ke Toan'),
(3,'Buong Phong'),
(4,'Ki Thuat'),
(5,'Nha Hang'),
(6,'CEO');

insert into nhanvien values
(1,'Thuy Ngoc Loc',5,2,1,'1991-06-12',123456789,'5000','0123','abc@abc.abc','Quang Tri'),
(2,'Le Anh Bao',5,3,4,'1997-11-25',456,'5500','0456','def@abc.abc','Quang Nam'),
(3,'Le Hoang Ha',5,5,3,'1989-08-17',123456789,'4500','0123','abc@abc.abc','Da Nang'),
(4,'Nguyen Thi Nhung',2,1,2,'1983-03-11',123456789,'20000','0123','abc@abc.abc','Da Nang'),
(5,'Ho Phi Yen',4,4,5,'1993-02-09',123456789,'5000','0123','abc@abc.abc','Quang Ngai'),
(6,'Lenh Ho Xung',2,1,2,'1983-03-11',123456789,'20000','0123','abc@abc.abc','Vinh'),
(7,'Truong Tam Phong',1,1,6,'1972-03-11',123456789,'20000','0123','abc@abc.abc','Ha Noi');

insert into loaikhach
values
(1, 'Diamond'),
(2,'Platium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');

insert into KhachHang values
(1,1,'Dang Tuan Ha','1989-08-17','1234','01234','hfgh@gdfg.dfg','Da Nang'),
(2,4,'Nguyen Van Nhan','1990-05-21','4567','01234','abc@gdfg.dfg','Quang Nam'),
(3,1,'Tran Chi Hieu','1997-11-03','8971','01234','zyz@gdfg.dfg','Quang Ngai'),
(4,1,'Dang Ngoc Son','1987-08-17','1589','01234','gdgjjh@gdfg.dfg','Vinh'),
(5,5,'Dang Van Lam','1995-08-22','4539','01234','lvkml@gdfg.dfg','Russia'),
(6,1,'Ronaldo','1986-10-09','7845','063524','ronaldo@gdfg.dfg','Portuga'),
(7,3,'Dinh Thien Son','1955-10-09','782315','0235524','donglao@gdfg.dfg','Trung Quoc'),
(8,1,'Ronaldo','1986-10-09','7845','063524','ronaldo@gdfg.dfg','Portuga');

insert into KieuThue values
(1,'day',2000),
(2,'week',4000),
(3,'month',6000);

insert into loaidichvu values
(1,'Villa'),
(2,'House'),
(3,'Room');

insert into dichvu values
(1,'Vila 01',150,3,'15','500',1,1,'full phong'),
(2,'House 01',100,2,'8','300',2,2,'trong'),
(3,'Room 01',35,3,'5','200',1,2,'trong'),
(4,'Vila 02',150,3,'15','500',2,1,'trong'),
(5,'House 02',100,2,'8','300',3,2,'full phong');

insert into dichvudikem values
(1,'Food',25,1,'san sang'),
(2,'Drink',15,1,'san sang'),
(3,'Massage',500,1,'san sang'),
(4,'Car',150,1,'san sang'),
(5,'Karaoke',50,1,'san sang');

insert into hopdong values
(1,2,1,1,'2019-04-04','2020-04-10',500,null),
(2,2,2,1,'2019-04-08','2020-04-10',500,null),
(3,2,4,2,'2019-03-15','2020-03-30',500,null),
(4,2,5,3,'2018-11-04','2019-12-04',500,null),
(5,3,6,4,'2019-01-20','2020-02-20',500,null),
(6,3,6,4,'2019-02-20','2020-03-20',500,null),
(7,2,5,3,'2018-10-04','2019-11-04',500,null),
(8,1,3,2,'2019-03-15','2020-03-30',500,null);

insert into hopdongchitiet values
(1,1,1,1),
(2,2,3,3),
(3,2,4,2),
(4,4,3,1),
(5,3,2,2),
(6,5,1,1),
(7,6,2,1),
(8,7,2,1),
(9,8,5,1);

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.

select*
from nhanvien
where (ho_ten like '% H%' or ho_ten like '% K%' or ho_ten like '% T%') and length(ho_ten) < 16;

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.

select*
from khachhang 
where dia_chi_khach in ('Da Nang','Quang Tri') and year(ngay_sinh_khach)<=2002 and year(ngay_sinh_khach)>=1970;

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

select khachhang.ho_ten, count(hopdong.id_hop_dong) as SoLanDat
from hopdong join khachhang
on hopdong.id_khach_hang=khachhang.id_khach_hang
join loaikhach
on khachhang.id_loai_khach=loaikhach.id_loai_khach
where ten_loai_khach='Diamond'
group by khachhang.ho_ten;

-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem)
--  cho tất cả các Khách hàng đã từng đặt phỏng.(Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select khachhang.id_khach_hang, khachhang.ho_ten, loaikhach.ten_loai_khach, hopdong.id_hop_dong, dichvu.ten_dich_vu, hopdong.ngay_lam_hop_dong, hopdong.ngay_ket_thuc,
sum(dichvu.chi_phi_thue+hopdongchitiet.so_luong*dichvudikem.gia_dich_vu_di_kem) as tong_tien
from khachhang left join loaikhach
on khachhang.id_loai_khach=loaikhach.id_loai_khach
left join hopdong
on khachhang.id_khach_hang=hopdong.id_khach_hang
left join dichvu
on hopdong.id_dich_vu=dichvu.id_dich_vu
left join hopdongchitiet
on hopdong.id_hop_dong=hopdongchitiet.id_hop_dong
left join dichvudikem
on hopdongchitiet.id_dich_vu_di_kem=dichvudikem.id_dich_vu_di_kem
group by khachhang.id_khach_hang;

-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện
-- đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

select  dichvu.id_dich_vu, dichvu.ten_dich_vu, dichvu.dien_tich, dichvu.chi_phi_thue, loaidichvu.ten_loai_dich_vu
from dichvu
left join loaidichvu
on dichvu.id_loai_dich_vu = loaidichvu.id_loai_dich_vu
left join hopdong
on dichvu.id_dich_vu=hopdong.id_dich_vu
where hopdong.id_dich_vu not in (select id_dich_vu from hopdong 
where ngay_lam_hop_dong between '2019-01-01' and '2019-03-31');

-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng
-- trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.

select dichvu.id_dich_vu, dichvu.ten_dich_vu, dichvu.dien_tich, dichvu.so_nguoi_toi_da, dichvu.chi_phi_thue, loaidichvu.ten_loai_dich_vu
from dichvu join loaidichvu
on dichvu.id_loai_dich_vu=loaidichvu.id_loai_dich_vu
join hopdong
on hopdong.id_dich_vu=dichvu.id_dich_vu
where hopdong.id_dich_vu not in (select id_dich_vu from hopdong
where ngay_lam_hop_dong between '2018-01-01' and '2018-12-31');

-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.

select khachhang.ho_ten
from khachhang 
group by khachhang.ho_ten;

select distinct khachhang.ho_ten
from khachhang;

select khachhang.ho_ten
from khachhang union select khachhang.ho_ten
from khachhang;

-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select month(hopdong.ngay_lam_hop_dong) as thang, count(hopdong.ngay_lam_hop_dong) as 'Tong so hop dong', sum(tong_tien)
from hopdong
where year(ngay_lam_hop_dong)=2019
group by thang;

-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem
-- (được tính dựa trên việc count các IDHopDongChiTiet).

select hopdong.id_hop_dong, hopdong.ngay_lam_hop_dong, hopdong.ngay_ket_thuc, hopdong.tien_dat_coc, count(hopdongchitiet.id_hop_dong_chi_tiet) as 'So luong dich vu di kem'
from hopdong join hopdongchitiet
on hopdong.id_hop_dong=hopdongchitiet.id_hop_dong
group by id_hop_dong;

-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.

select khachhang.ho_ten, khachhang.dia_chi_khach, dichvudikem.ten_dich_vu_di_kem
from dichvudikem join hopdongchitiet
on hopdongchitiet.id_dich_vu_di_kem=hopdongchitiet.id_dich_vu_di_kem
join hopdong
on hopdongchitiet.id_hop_dong=hopdongchitiet.id_hop_dong
join khachhang
on khachhang.id_khach_hang=hopdong.id_khach_hang
join loaikhach
on khachhang.id_loai_khach=loaikhach.id_loai_khach
where (khachhang.dia_chi_khach ='Quang Ngai' or khachhang.dia_chi_khach='Vinh') and loaikhach.ten_loai_khach='Diamond'
group by khachhang.ho_ten
order by dichvudikem.ten_dich_vu_di_kem;

-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết),
-- TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.

select hopdong.id_hop_dong, nhanvien.ho_ten, khachhang.ho_ten, khachhang.sdt_khach, dichvu.ten_dich_vu, count(hopdongchitiet.id_hop_dong_chi_tiet) as 'So luong dich vu di kem'
from hopdong join nhanvien
on nhanvien.id_nhan_vien=hopdong.id_nhan_vien
join khachhang
on khachhang.id_khach_hang=hopdong.id_khach_hang
join dichvu
on dichvu.id_dich_vu=hopdong.id_dich_vu
join hopdongchitiet
on hopdong.id_hop_dong=hopdongchitiet.id_hop_dong
where (month(hopdong.ngay_lam_hop_dong) in (10,11,12)) not in (select hopdong.ngay_lam_hop_dong between '2019-01-01' and '2019-06-30');

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

select *
from (select dichvudikem.id_dich_vu_di_kem,dichvudikem.ten_dich_vu_di_kem,dichvudikem.gia_dich_vu_di_kem,dichvudikem.trang_thai_kha_dung,
count(hopdongchitiet.id_hop_dong_chi_tiet) as SoLuongDichVuDiKem
from dichvudikem
left join hopdongchitiet on hopdongchitiet.id_dich_vu_di_kem = dichvudikem.id_dich_vu_di_kem
group by id_dich_vu_di_kem)Temp
where SoLuongDichVuDiKem = (select max(SoLuongDichVuDiKem)
from(select dichvudikem.id_dich_vu_di_kem,dichvudikem.ten_dich_vu_di_kem,dichvudikem.gia_dich_vu_di_kem,dichvudikem.trang_thai_kha_dung,
count(hopdongchitiet.id_hop_dong_chi_tiet) as SoLuongDichVuDiKem
from dichvudikem
left join hopdongchitiet on hopdongchitiet.id_dich_vu_di_kem = dichvudikem.id_dich_vu_di_kem
group by id_dich_vu_di_kem )as BangThongKe);

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

select hopdong.id_hop_dong, loaidichvu.ten_loai_dich_vu, dichvudikem.ten_dich_vu_di_kem, count(hopdongchitiet.id_hop_dong_chi_tiet) as Solansudung
from hopdong join dichvu
on hopdong.id_dich_vu=dichvu.id_dich_vu
join loaidichvu
on dichvu.id_loai_dich_vu=loaidichvu.id_loai_dich_vu
join hopdongchitiet
on hopdong.id_hop_dong=hopdongchitiet.id_hop_dong
join dichvudikem
on dichvudikem.id_dich_vu_di_kem=hopdongchitiet.id_dich_vu_di_kem
group by ten_dich_vu_di_kem
having Solansudung=1;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

select id_hop_dong, id_nhan_vien, ho_ten, trinh_do, ten_bo_phan, sdt, dia_chi
from (
select HopDong.id_hop_dong, nhanvien.id_nhan_vien, nhanvien.ho_ten, trinhdo.trinh_do, bophan.ten_bo_phan, nhanvien.sdt, nhanvien.dia_chi, ngay_lam_hop_dong
from nhanvien
join bophan on bophan.id_bo_phan = nhanvien.id_bo_phan
join trinhdo on trinhdo.id_trinh_do = nhanvien.id_trinh_do
left join hopdong on hopdong.id_nhan_vien= nhanvien.id_nhan_vien
group by NhanVien.id_nhan_vien
having (id_hop_dong is null)
or (year(ngay_lam_hop_dong) <> 2018)
or (count(hopdong.id_nhan_vien) <=3 and year(ngay_lam_hop_dong) = 2018)) as Bang1;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.

delete from nhanvien where not exists (select nhanvien.id_nhan_vien from hopdong
where hopdong.ngay_lam_hop_dong between '2017-01-31' and '2019-12-31' and hopdong.id_nhan_vien=nhanvien.id_nhan_vien);

-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng
--  với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.

update khachhang, (select hopdong.id_khach_hang as id, sum(hopdong.tong_tien) as TongTien from hopdong
where year(hopdong.ngay_lam_hop_dong)=2019
group by hopdong.id_khach_hang
having TongTien >100000000) as temp set khachhang.id_loai_khach=( select loaikhach.id_loai_khach from loaikhach where loaikhach.ten_loai_khach='Diamond')
where  khachhang.id_loai_khach=( select loaikhach.id_loai_khach from loaikhach where loaikhach.ten_loai_khach='Platium')
and temp.id =khachhang.id_khach_hang;

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).

delete khachhang, hopdong, hopdongchitiet from khachhang join hopdong 
on khachhang.id_khach_hang=hopdong.id_khach_hang
join hopdongchitiet 
on hopdong.id_hop_dong=hopdongchitiet.id_hop_dong
where not exists (select hopdong.id_hop_dong where year(hopdong.ngay_lam_hop_dong)>2016 and khachhang.id_khach_hang=hopdong.id_khach_hang);

-- 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.

update dichvudikem join (select dichvudikem.ten_dich_vu_di_kem as TenDichVuDiKem from hopdongchitiet join dichvudikem
on dichvudikem.id_dich_vu_di_kem=hopdongchitiet.id_dich_vu_di_kem
group by dichvudikem.id_dich_vu_di_kem
having count(hopdongchitiet.id_dich_vu_di_kem)>3) as temp set dichvudikem.gia_dich_vu_di_kem=dichvudikem.gia_dich_vu_di_kem*2 where dichvudikem.ten_dich_vu_di_kem=temp.TenDichVuDiKem;

-- 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị
-- bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.

select nhanvien.id_nhan_vien as id, nhanvien.ho_ten, nhanvien.email, nhanvien.sdt, nhanvien.ngay_sinh, nhanvien.dia_chi,'nhanvien' as fromtable
from nhanvien
union all
select khachhang.id_khach_hang as id, khachhang.ho_ten, khachhang.email_khach, khachhang.sdt_khach, khachhang.ngay_sinh_khach, khachhang.dia_chi_khach,'khachhang' as fromtable
from khachhang;