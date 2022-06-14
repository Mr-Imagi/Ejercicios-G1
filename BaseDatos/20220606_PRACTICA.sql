use generationg1;

CREATE TABLE direcciones(
id int primary key not null auto_increment,
nombre varchar(100) NOT NULL,
numero int not null,
ciudad varchar(100),
region int not null,
pais varchar(100)
);

CREATE TABLE cursos(
id int primary key not null auto_increment,
nombre varchar(100) NOT NULL,
descripcion varchar(100)
);

CREATE TABLE registros(
id int primary key not null auto_increment,
codigo_registro varchar(100) NOT NULL,
rut varchar(100)
);

CREATE TABLE alumnos(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre varchar(30) NOT NULL,
apellido varchar(50),
edad int not null,
curso_id int,
direccion_id int,
registro_id int,
FOREIGN KEY (curso_id) REFERENCES cursos(id),
FOREIGN KEY (direccion_id) REFERENCES direcciones(id),
FOREIGN KEY (registro_id) REFERENCES registros(id)
);