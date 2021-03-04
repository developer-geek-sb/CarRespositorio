CREATE TABLE coche (
  id bigint(11) NOT NULL AUTO_INCREMENT,
  modelo varchar(200) DEFAULT NULL,
  cv varchar(10) DEFAULT NULL,
  precio real NOT NULL,
  marca_id int(11) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE marca (
  id bigint(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(200) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


insert into marca (id, nombre) values (1, 'Isuzu');
insert into marca (id, nombre) values (2, 'Audi');
insert into marca (id, nombre) values (3, 'Honda');
insert into marca (id, nombre) values (4, 'Infiniti');
insert into marca (id, nombre) values (5, 'Jaguar');
insert into marca (id, nombre) values (6, 'Toyota');
insert into marca (id, nombre) values (7, 'Suzuki');
insert into marca (id, nombre) values (8, 'Oldsmobile');
insert into marca (id, nombre) values (9, 'Volkswagen');
insert into marca (id, nombre) values (10, 'Ford');
insert into marca (id, nombre) values (11, 'Honda');
insert into marca (id, nombre) values (12, 'Mercedes-Benz');
insert into marca (id, nombre) values (13, 'Mitsubishi');
insert into marca (id, nombre) values (14, 'GMC');
insert into marca (id, nombre) values (15, 'Subaru');
insert into marca (id, nombre) values (16, 'Lincoln');
insert into marca (id, nombre) values (17, 'Mitsubishi');
insert into marca (id, nombre) values (18, 'Jaguar');
insert into marca (id, nombre) values (19, 'Maybach');
insert into marca (id, nombre) values (20, 'Infiniti');
insert into marca (id, nombre) values (21, 'Hyundai');
insert into marca (id, nombre) values (22, 'GMC');
insert into marca (id, nombre) values (23, 'Chevrolet');
insert into marca (id, nombre) values (24, 'Mercedes-Benz');
insert into marca (id, nombre) values (25, 'Mazda');
insert into marca (id, nombre) values (26, 'Cadillac');
insert into marca (id, nombre) values (27, 'Dodge');
insert into marca (id, nombre) values (28, 'Lincoln');
insert into marca (id, nombre) values (29, 'Chevrolet');
insert into marca (id, nombre) values (30, 'Acura');
insert into marca (id, nombre) values (31, 'Volkswagen');
insert into marca (id, nombre) values (32, 'BMW');
insert into marca (id, nombre) values (33, 'GMC');
insert into marca (id, nombre) values (34, 'Land Rover');
insert into marca (id, nombre) values (35, 'Volvo');
insert into marca (id, nombre) values (36, 'Toyota');
insert into marca (id, nombre) values (37, 'Ford');
insert into marca (id, nombre) values (38, 'Ford');
insert into marca (id, nombre) values (39, 'BMW');
insert into marca (id, nombre) values (40, 'Mercury');
insert into marca (id, nombre) values (41, 'Lexus');
insert into marca (id, nombre) values (42, 'Toyota');
insert into marca (id, nombre) values (43, 'Aston Martin');
insert into marca (id, nombre) values (44, 'Ford');
insert into marca (id, nombre) values (45, 'Oldsmobile');
insert into marca (id, nombre) values (46, 'Kia');
insert into marca (id, nombre) values (47, 'Lexus');
insert into marca (id, nombre) values (48, 'Mitsubishi');
insert into marca (id, nombre) values (49, 'BMW');
insert into marca (id, nombre) values (50, 'Suzuki');


insert into coche (id, cv, modelo, precio, marca_id) values (1, 284, '9000', 25470, 1);
insert into coche (id, cv, modelo, precio, marca_id) values (2, 133, 'Fusion', 38426, 2);
insert into coche (id, cv, modelo, precio, marca_id) values (3, 300, 'Impreza', 14685, 3);
insert into coche (id, cv, modelo, precio, marca_id) values (4, 179, 'S-Type', 25115, 4);
insert into coche (id, cv, modelo, precio, marca_id) values (5, 282, 'Sunfire', 24521, 5);
insert into coche (id, cv, modelo, precio, marca_id) values (6, 202, 'Celica', 47119, 6);
insert into coche (id, cv, modelo, precio, marca_id) values (7, 164, 'Crown Victoria', 28640, 7);
insert into coche (id, cv, modelo, precio, marca_id) values (8, 255, '350Z', 44154, 8);
insert into coche (id, cv, modelo, precio, marca_id) values (9, 97, 'F-Series', 38505, 9);
insert into coche (id, cv, modelo, precio, marca_id) values (10, 95, 'Mazda6', 5052, 10);
insert into coche (id, cv, modelo, precio, marca_id) values (11, 145, 'Elantra', 47060, 11);
insert into coche (id, cv, modelo, precio, marca_id) values (12, 292, 'Wrangler', 6760, 12);
insert into coche (id, cv, modelo, precio, marca_id) values (13, 226, 'Murano', 31663, 13);
insert into coche (id, cv, modelo, precio, marca_id) values (14, 150, 'Aerostar', 47002, 14);
insert into coche (id, cv, modelo, precio, marca_id) values (15, 93, 'Evora', 11156, 15);
insert into coche (id, cv, modelo, precio, marca_id) values (16, 108, 'CLK-Class', 59280, 16);
insert into coche (id, cv, modelo, precio, marca_id) values (17, 307, '911', 20600, 17);
insert into coche (id, cv, modelo, precio, marca_id) values (18, 167, 'Mystique', 20199, 18);
insert into coche (id, cv, modelo, precio, marca_id) values (19, 201, 'Montero', 9341, 19);
insert into coche (id, cv, modelo, precio, marca_id) values (20, 140, 'Vantage', 21063, 20);
insert into coche (id, cv, modelo, precio, marca_id) values (21, 147, 'Forte', 36213, 21);
insert into coche (id, cv, modelo, precio, marca_id) values (22, 170, 'LeSabre', 19646, 22);
insert into coche (id, cv, modelo, precio, marca_id) values (23, 141, 'Outlander', 14972, 23);
insert into coche (id, cv, modelo, precio, marca_id) values (24, 198, 'Focus', 38410, 24);
insert into coche (id, cv, modelo, precio, marca_id) values (25, 201, 'Solara', 22655, 25);
insert into coche (id, cv, modelo, precio, marca_id) values (26, 292, 'Viper', 15765, 26);
insert into coche (id, cv, modelo, precio, marca_id) values (27, 127, 'V70', 31122, 27);
insert into coche (id, cv, modelo, precio, marca_id) values (28, 100, 'Sportage', 21307, 28);
insert into coche (id, cv, modelo, precio, marca_id) values (29, 123, 'IS-F', 55233, 29);
insert into coche (id, cv, modelo, precio, marca_id) values (30, 273, 'Sable', 17998, 30);
insert into coche (id, cv, modelo, precio, marca_id) values (31, 142, 'Grand Am', 16577, 31);
insert into coche (id, cv, modelo, precio, marca_id) values (32, 240, 'Nitro', 16433, 32);
insert into coche (id, cv, modelo, precio, marca_id) values (33, 109, 'Crown Victoria', 24107, 33);
insert into coche (id, cv, modelo, precio, marca_id) values (34, 296, 'Ram Van 3500', 53852, 34);
insert into coche (id, cv, modelo, precio, marca_id) values (35, 257, 'ES', 29944, 35);
insert into coche (id, cv, modelo, precio, marca_id) values (36, 165, 'Elantra', 56576, 36);
insert into coche (id, cv, modelo, precio, marca_id) values (37, 205, 'Escalade', 15474, 37);
insert into coche (id, cv, modelo, precio, marca_id) values (38, 280, 'Corsica', 46176, 38);
insert into coche (id, cv, modelo, precio, marca_id) values (39, 190, 'Town Car', 17307, 39);
insert into coche (id, cv, modelo, precio, marca_id) values (40, 209, '90', 20507, 40);
insert into coche (id, cv, modelo, precio, marca_id) values (41, 285, 'Stealth', 21916, 41);
insert into coche (id, cv, modelo, precio, marca_id) values (42, 119, 'Sierra', 39781, 42);
insert into coche (id, cv, modelo, precio, marca_id) values (43, 201, 'Phantom', 41625, 43);
insert into coche (id, cv, modelo, precio, marca_id) values (44, 129, 'Tribeca', 22782, 44);
insert into coche (id, cv, modelo, precio, marca_id) values (45, 130, 'S4', 14081, 45);
insert into coche (id, cv, modelo, precio, marca_id) values (46, 177, 'Sentra', 27379, 46);
insert into coche (id, cv, modelo, precio, marca_id) values (47, 308, '1 Series', 30506, 47);
insert into coche (id, cv, modelo, precio, marca_id) values (48, 187, 'Park Avenue', 40868, 48);
insert into coche (id, cv, modelo, precio, marca_id) values (49, 253, 'Maxima', 50726, 49);
insert into coche (id, cv, modelo, precio, marca_id) values (50, 238, 'Ridgeline', 58476, 50);
