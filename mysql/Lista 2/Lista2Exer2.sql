use db_pizzaria_legal;

create table tb_categoria(
		id bigint auto_increment,
		tipo varchar(20),
		qtde_fatia int,
		borda boolean,
		primary key (id)
);

insert into tb_categoria(tipo,qtde_fatia,borda)
VALUES
("Salgado", 8, true),
("Doce", 4, false),
("Salgado", 6, true),
("Doce", 10, false),
("Salgado", 12, true);

create table tb_pizza(
	id bigint auto_increment,
	fk_id_categoria bigint,
	sabor varchar (20),
	azeitona boolean,
	cebola boolean,
	tipo_refri varchar(20),
	preço decimal (2.2),
	primary key (id),
	foreign key (fk_id_categoria) references tb_categoria (id)
);

drop table tb_pizza;

insert into tb_pizza(sabor,azeitona,cebola,tipo_refri,preço,fk_id_categoria) values ("Mussarela",true,true,"Dolly",50.00,1);
insert into tb_pizza(sabor,azeitona,cebola,tipo_refri,preço,fk_id_categoria) values ("Brócolis",false,false,"Coca-Cola",60.00,5);
insert into tb_pizza(sabor,azeitona,cebola,tipo_refri,preço,fk_id_categoria) values ("Calabresa",false,true,"Fanta",40.00,5);
insert into tb_pizza(sabor,azeitona,cebola,tipo_refri,preço,fk_id_categoria) values ("Chocolate",false,true,"Antartica",45.00,4);
insert into tb_pizza(sabor,azeitona,cebola,tipo_refri,preço,fk_id_categoria) values ("Beijinho",false,false,"Tubaina",49.50,2);
insert into tb_pizza(sabor,azeitona,cebola,tipo_refri,preço,fk_id_categoria) values ("Portuguesa",true,false,"Jesus",47.30,3);
insert into tb_pizza(sabor,azeitona,cebola,tipo_refri,preço,fk_id_categoria) values ("Frango",true,true,"Guaravita",35.00,5);
insert into tb_pizza(sabor,azeitona,cebola,tipo_refri,preço,fk_id_categoria) values ("Brigadeiro",false,false,"Pepsi",60.00,4);


select * from tb_pizza where preço > 45;

select * from tb_pizza where preço between 29 and 60;

select * from tb_pizza where sabor like "%C%";

select * from tb_pizza inner join tb_categoria
on tb_categoria.id  = tb_pizza.fk_id_categoria;

select * from tb_pizza inner join tb_categoria
on tb_categoria.id  = tb_pizza.fk_id_categoria
where fk_id_categoria = 1;