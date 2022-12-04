USE master;
GO

DROP DATABASE IF EXISTS Assingment_Java_3;
GO

CREATE DATABASE Assingment_Java_3;
GO

USE Assingment_Java_3;
GO


CREATE TABLE account (
    tai_khoan nvarchar(255) not null PRIMARY KEY,
    mat_khau NVARCHAR (255) NOT NULL,
    vai_tro NVARCHAR(225) NOT NULL,
    
);

GO

CREATE TABLE sinh_vien (
    ma_sv NVARCHAR(255) NOT NULL PRIMARY KEY,
    ho_ten NVARCHAR (255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    sdt NVARCHAR(20) NOT NULL,
    gioi_tinh BIT NOT NULL,
	dia_chi NVARCHAR(255) NOT NULL,
	hinh_anh NVARCHAR(255) NOT NULL
);

GO

CREATE TABLE diem (
    id INT IDENTITY PRIMARY KEY,
    ma_sv NVARCHAR (255) NOT NULL,
    tieng_anh INT NOT NULL DEFAULT 0,
    tin_hoc int NOT NULL DEFAULT 0,
    gdtc INT NOT NULL DEFAULT 0,
	CONSTRAINT fk_diem_sinh_vien foreign key (ma_sv) references sinh_vien
);

GO

INSERT INTO account VALUES
('anhttlph23268','123456',N'giangvien'),
('lyntph25593','123456',N'canbodaotao')

GO
SELECT * FROM account
INSERT INTO sinh_vien VALUES
('SV001',N'Nguyễn Văn Tèo','teonv@gmail.com','0903414749',0,N'Hà Nội','icon/Sad.png'),
('SV002',N'Le Thi Oi','oilt@gmail.com','0899899128',0,N'Thanh Hóa','icon/Smile.png'),
('SV003',N'Nguyen Thi Cu','cunt@gmail.com','01683314129',1,N'Nghệ An','icon/Happy.png'),
('SV004',N'Nguyễn Thị Tường Vy','Vyntt@gmail.com','0903936177',1,N'TP HCM','icon/Funny.png')

GO
SELECT * FROM sinh_vien
INSERT INTO diem VALUES
('SV001',10,10,10),
('SV002',9,9,9),
('SV003',8,8,8)
SELECT * FROM diem







