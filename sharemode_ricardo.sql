-- CREAR DATABASE
CREATE DATABASE dbtiendasharemoda;

-- ABRIR BASE DE DATOS 
USE dbtiendasharemoda;

-- CREAR TABLA


-- DROP DATABASE dbtiendasharemoda;


CREATE TABLE categorias(
	
codpro int primary key  auto_increment,
	
nomcat varchar(45),
	
ropav  varchar(45),
	
pantalones varchar(45),

perfumes varchar(45),
	
cuidadofacial varchar(45),
	
calzado varchar(45),
	
estado tinyint default 1
);


drop table categorias;



CREATE TABLE productos(
	codpro int primary key  auto_increment,
	nompro varchar(10),

caracpro varchar(10),
	
stockpro double,
	
combos varchar(45),
	
ofertas varchar(45),
   
categoria_codigo int,
	
estado tinyint default 1,
    
constraint fk_categoria foreign key(categoria_codigo) 
references categorias(codpro)
);




CREATE TABLE detalleproducto (
	
codpro int primary key  auto_increment,
	
cantpro varchar(10),
	
preciopro varchar(10),
	
estado tinyint default 1
);



CREATE TABLE pedidos(
	
codpro int primary key  auto_increment,
	
usuario varchar(10),
	
reclamo varchar(9),
	
estado tinyint default 1
);



CREATE TABLE registrousuario(
	codpro int primary key  auto_increment,
	
usuario varchar(10),
	
productos varchar(10),
	
direccion varchar(10),
	
pagos varchar(10),
	
estado tinyint default 1
);



insert into registrousuario(usuario, productos, direccion, pagos, estado) values('arubio', 'camiseta', 'jr', 'visa', 1);

insert into registrousuario(usuario, productos, direccion, pagos, estado) values('rrodriguez', 'jean', 'mz', 'visa', 1);



CREATE TABLE pagos(
	
codpro int primary key  auto_increment,
	cantidad double,
	
descripcion text,
	
estado tinyint default 1
);



CREATE TABLE entrega(
	
codpro int primary key  auto_increment,

enviorapido varchar(10),
	
contraentrega varchar(45),
	
estado tinyint default 1
);



-- CATEGORIAS ----

Insert into categorias (nomCat,ropaV,pantalones,perfumes,cuidadofacial,calzado) VALUES("Señores","Pantalon","Levis","Sasen","Crema hidratante", 23 );

Insert into categorias (nomCat,ropaV,pantalones,perfumes,cuidadofacial,calzado) VALUES("Jovenes","Pantalon","Salsa","Kaiak","Crema para brazos", 23 );

Insert into categorias (nomCat,ropaV,pantalones,perfumes,cuidadofacial,calzado) VALUES("Señores","Pantalon","Paige","Kiska","Jabon liquido", 23 );

Insert into categorias (nomCat,ropaV,pantalones,perfumes,cuidadofacial,calzado) VALUES("Niños","Pantalon","Ag Jeans","Homen","Crema ", 23 );

Insert into categorias (nomCat,ropaV,pantalones,perfumes,cuidadofacial,calzado) VALUES("Señores","Pantalon","Liu Jo","Esscencial","Discos Desmaquillantes", 23 );

Insert into categorias (nomCat,ropaV,pantalones,perfumes,cuidadofacial,calzado) VALUES("Jovenes","Pantalon","Straight","Chronos","Aceite de Almendras", 23 );

Insert into categorias (nomCat,ropaV,pantalones,perfumes,cuidadofacial,calzado) VALUES("Señores","Pantalon","cuerpo","Urbano","Máscara Desechable", 23 );

Insert into categorias (nomCat,ropaV,pantalones,perfumes,cuidadofacial,calzado) VALUES("Niños","Pantalon","Mezcilla","Jupiter","Esponja Cosmética", 23 );

Insert into categorias (nomCat,ropaV,pantalones,perfumes,cuidadofacial,calzado) VALUES("Jovenes","Pantalon","Balencia","Heart","Jabon desodorante", 23 );
Insert into categorias (nomCat,ropaV,pantalones,perfumes,cuidadofacial,calzado) VALUES("Señores","Pantalon","Diesel","Nartura","Mascra Capilar", 23 );

--  PRODUCTOS ---
Insert into productos (nompro,caracpro,stockpro,combos,ofertas) VALUES("Zapatillas", "addiddas", 10, 30.50, 23);

Insert into productos (nompro,caracpro,stockpro,combos,ofertas) VALUES("Zapatillas","addiddas",10,30.50, 23 );
Insert into productos (nompro,caracpro,stockpro,combos,ofertas) VALUES("Polos","reboot",12,15.00, 13);
Insert into productos (nompro,caracpro,stockpro,combos,ofertas) VALUES("Casacas","colosal",11,46.00, 32 );
Insert into productos (nompro,caracpro,stockpro,combos,ofertas) VALUES("Shorts","irun",9,25.50, 19 );
Insert into productos (nompro,caracpro,stockpro,combos,ofertas) VALUES("Jeans","nike",9,27.50, 23 );
Insert into productos (nompro,caracpro,stockpro,combos,ofertas) VALUES("Poleras","pegasus",12,27.50,24 );
Insert into productos (nompro,caracpro,stockpro,combos,ofertas) VALUES("Gorras","gucci",13,16.00, 14 );
Insert into productos (nompro,caracpro,stockpro,combos,ofertas) VALUES("Medias","talon",7,3.00, 2.50);
Insert into productos (nompro,caracpro,stockpro,combos,ofertas) VALUES("Zandalias","maui",10,15.00, 13 );
Insert into productos (nompro,caracpro,stockpro,combos,ofertas) VALUES("Zapatos","alpha",10,19.00, 16 );



Insert into productos (novedades,caracpro) VALUES("Zapatillas",true);
-- Insert into categorias()





select * from registrousuario;

