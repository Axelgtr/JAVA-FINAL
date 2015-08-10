CREATE TABLE PRODUCTO(ID_PRODUCTO INTEGER AUTO_INCREMENT PRIMARY KEY,
NOMBRE VARCHAR(120), COSTO FLOAT, UNIDADES INTEGER);


DESCRIBE PRODUCTO;

CREATE TABLE TARJETA(ID_TARJETA INTEGER AUTO_INCREMENT PRIMARY KEY, NOMBRE VARCHAR(120), DIACORTE INTEGER);

CREATE TABLE GASTOS (ID_GASTOS INTEGER AUTO_INCREMENT PRIMARY KEY, ID_TARJETA INTEGER,
 FECHA DATE, CONCEPTO VARCHAR(500), CANTIDAD FLOAT, FOREIGN KEY (ID_TARJETA) REFERENCES TARJETA (ID_TARJETA));




SELECT * FROM TARJETA;


SELECT * FROM GASTOS;
