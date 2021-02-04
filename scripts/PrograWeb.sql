CREATE DATABASE ProyectoWeb;
USE ProyectoWeb;

CREATE TABLE ProyectoWeb.Posts(
Id_Post int NOT NULL PRIMARY KEY AUTO_INCREMENT,
Username char(30) NOT NULL,
Title char(30) NOT NULL,
Descrip char(250) NOT NULL,
Notice varchar(10000) NOT NULL,
Category char(50) NOT NULL,
Image1 varchar(1000) NOT NULL,
Image2 varchar(1000) NOT NULL,
Image3 varchar(1000) NOT NULL,
Video varchar(1000) NULL,
);


CREATE TABLE ProyectoWeb.Users(
Id_User int NOT NULL PRIMARY KEY AUTO_INCREMENT,
Email char(100) NOT NULL,
Username char(30) UNIQUE NOT NULL,
Contraseña char(50) NOT NULL,
Facebook char(1000) NULL,
Instagram char(1000) NULL,
Twitter char(1000),
Image varchar(1000) DEFAULT 'https://busheyautomotive.com/wp-content/uploads/2016/02/default-profile-pic-300x300.png',
Tipo char(50) NOT NULL
);

CREATE TABLE ProyectoWeb.Comments(
Id_Comment int NOT NULL PRIMARY KEY AUTO_INCREMENT,
Id_User int NOT NULL, 

FOREIGN KEY (Id_User) REFERENCES Users(Id_User)

)



call SP_Users;

Create table ProyectoWeb.Ejemplo(
ID int UNIQUE NOT NULL,
Nombre Char(30) NULL ,
edad int NULL
);


INSERT INTO Ejemplo (ID,Nombre) Values (1,'Angel');
Insert into Ejemplo Values (1,'Brenda',23) ON DUPLICATE KEY UPDATE;
Select * from Ejemplo;

UPDATE Ejemplo SET edad = 20 WHERE ID=1;