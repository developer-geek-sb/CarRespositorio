

insert into marca (id, nombre) values (NEXTVAL('hibernate_sequence'), 'Toyota');
insert into marca (id, nombre) values (NEXTVAL('hibernate_sequence'), 'Tesla');
insert into marca (id, nombre) values (NEXTVAL('hibernate_sequence'), 'Porshe');
insert into marca (id, nombre) values (NEXTVAL('hibernate_sequence'), 'BMW');

insert into coche (id, modelo, cv, precio, marca_id) values (NEXTVAL('hibernate_sequence'), 'Compacto', 69, 7000, 1);
insert into coche (id, modelo, cv, precio, marca_id) values (NEXTVAL('hibernate_sequence'), 'Deportivo', 110, 10000, 2);
insert into coche (id, modelo, cv, precio, marca_id) values (NEXTVAL('hibernate_sequence'), 'Berlina',210, 45000, 3);
insert into coche (id, modelo, cv, precio, marca_id) values (NEXTVAL('hibernate_sequence'), 'Comercial', 310, 25000, 1);
insert into coche (id, modelo, cv, precio, marca_id) values (NEXTVAL('hibernate_sequence'), 'Familiar', 210, 60000, 4);
