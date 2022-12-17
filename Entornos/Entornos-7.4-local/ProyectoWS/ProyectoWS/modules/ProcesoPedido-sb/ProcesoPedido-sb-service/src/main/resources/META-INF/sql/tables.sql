create table PROYECTO_Pedidos (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	idUsuario LONG,
	email VARCHAR(75) null,
	nombre VARCHAR(75) null,
	via VARCHAR(75) null,
	direccion VARCHAR(75) null,
	pais VARCHAR(75) null,
	provincia VARCHAR(75) null,
	ciudad VARCHAR(75) null,
	codipoPostal VARCHAR(75) null,
	idProducto LONG,
	precio DOUBLE,
	cantidad INTEGER
);