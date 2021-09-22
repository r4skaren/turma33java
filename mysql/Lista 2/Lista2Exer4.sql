use db_cidade_das_frutas;

create table tb_categoria(
	id bigint auto_increment,
	qtde int,
	tipo varchar (20),
	organico boolean,
	primary key (id)
);

insert into tb_categoria(qtde,tipo,organico) 
values 
(100,"Legume",false),
(150,"Fruta",true),
(200,"Legume",true),
(250,"Fruta",false),
(40,"Fruta",true);


create table tb_produto(
	id bigint auto_increment,
	fk_id_categoria bigint,
	preço bigint (2.2),
	peso decimal (2.2),
	sacola boolean,
	nota_fiscal boolean,
	made_in varchar(40),
	details varchar(40),
	primary key (id),
	foreign key (fk_id_categoria) references tb_categoria (id)
);

drop table tb_produto;

insert into tb_produto(preço,peso,sacola,nota_fiscal,made_in,details,fk_id_categoria)
values
(5.90,5.0,false,true,"Brasil","Umbu",5),
(60.00,6,false,true,"EUA","Soja",3),
(3.32,7,true,false,"China","Arroz",2),
(5.89,8,false,true,"Brasil","Batata",3),
(162.72,9,true,false,"Brasil","Feijão",3),
(21.90,2,false,true,"Brasil","Café",4),
(37.99,3,false,true,"Brasil","Mandioca",1),
(25.83,4,false,true,"Brasil","Laranja",2);


select * from tb_produto where preço > 50;

select * from tb_produto where preço between 3 and 60;

select * from tb_produto where datails like "%C%";

select * from tb_produto inner join tb_categoria
on tb_categoria.id  = tb_produto.fk_id_categoria;


