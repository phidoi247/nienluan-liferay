create table MienTayAds_KhuVuc (
	id_ LONG not null primary key,
	khuVucId VARCHAR(75) null,
	khuVucName VARCHAR(75) null
);

create table MienTayAds_LoaiSP (
	loaiSPId LONG not null primary key,
	loaiSPName VARCHAR(75) null
);

create table MienTayAds_SanPham (
	spId LONG not null primary key,
	spName VARCHAR(75) null,
	desc_ VARCHAR(75) null,
	nguoiDang VARCHAR(75) null,
	sdt VARCHAR(75) null,
	diaChi VARCHAR(75) null,
	gia VARCHAR(75) null,
	ngayDang DATE null,
	image VARCHAR(75) null,
	loaiSPId LONG,
	khuVucId LONG,
	passWord VARCHAR(75) null,
	loaiNguoiDung INTEGER,
	loaiMuaBan INTEGER,
	email VARCHAR(75) null
);

create table loaiSP_KhuVuc (
	id_ LONG not null primary key,
	khuVucId VARCHAR(75) null,
	khuVucName VARCHAR(75) null
);

create table loaiSP_LoaiSP (
	loaiSPId LONG not null primary key,
	loaiSPName VARCHAR(75) null
);

create table loaiSP_SanPham (
	spId LONG not null primary key,
	spName VARCHAR(75) null,
	desc_ VARCHAR(75) null,
	nguoiDang VARCHAR(75) null,
	sdt VARCHAR(75) null,
	diaChi VARCHAR(75) null,
	gia VARCHAR(75) null,
	ngayDang DATE null,
	image VARCHAR(75) null,
	loaiSPId LONG,
	khuVucId LONG,
	passWord VARCHAR(75) null
);