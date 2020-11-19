CREATE DATABASE ProyectoWeb;
USE ProyectoWeb;

CREATE TABLE ProyectoWeb.Posts(
Id_Post int UNIQUE NOT NULL,
Username char(30) NOT NULL,
Title char(30) NOT NULL,
Descrip char(250) NOT NULL,
Notice varchar(10000) NOT NULL,
Category char(50) NOT NULL,
Image1 mediumblob NOT NULL,
Image2 mediumblob NOT NULL,
Image3 mediumblob NOT NULL,
Video mediumblob NULL,
PRIMARY KEY(Id_Post)
);

CREATE TABLE ProyectoWeb.Users(
Id_User int UNIQUE NOT NULL,
Id_Post int UNIQUE NOT NULL,
Email char(100) NOT NULL,
Username char(30) UNIQUE NOT NULL,
Contraseña char(50) NOT NULL,
SocialNet char(100) NULL,
Image mediumblob NULL,
Tipo char(50) NOT NULL,
PRIMARY KEY (Id_User),
FOREIGN KEY (Id_Post) REFERENCES Posts(Id_Post)
);

call SP_Users;

Create table ProyectoWeb.Ejemplo(
ID int UNIQUE NOT NULL,
Nombre Char(30) NULL ,
edad int NULL
);


INSERT INTO Ejemplo (ID,Nombre) Values (1,'Angel');

Select * from Ejemplo;

UPDATE Ejemplo SET edad = 20 WHERE ID=1;