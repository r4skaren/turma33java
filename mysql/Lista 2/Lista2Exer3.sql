use db_farmacia_do_bem;

create table tb_categoria(
		id bigint auto_increment,
		tipo varchar(20),
		qtde int,
		necessario_receita boolean,
		primary key (id)
);


insert into tb_categoria(tipo,qtde,necessario_receita) 
values 
("Comprimido",10,false),
("Liquído",10,true),
("Comprimido",8,true),
("Liquído",7,false),
("Comprimido",3,true);


create table tb_produto(
	id bigint auto_increment,
	fk_id_categoria bigint,
	nome varchar (20),
	preço bigint (2.2), -- irá arrendodar
	funçao varchar (100),
	disponivel boolean,
	made_in_br boolean,
	primary key (id),
	foreign key (fk_id_categoria) references tb_categoria (id)
);


drop table tb_produto;

insert into tb_produto(nome,preço,funçao,disponivel,made_in_br,fk_id_categoria)
values
("Ivermectina", 5.90,"Tratar: Estrongiloidíase intestinal",false,true,5),
("Cloroquina", 60.00,"Tratar: Malária",false,true,3),
("Dipirona", 3.32,"Tratar: Anti-inflamatório não-esteroidal com ação analgésica e antitérmica",true,false,2),
("Dorflex", 5.89,"Tratar: Dores muculares",false,true,3),
("Xarelto", 162.72,"Tratar: Estrongiloidíase intestinal",true,false,3),
("Neosaldina", 21.90,"Tratar: Analgésico para dor",false,true,4),
("Addera d3", 37.99,"Tratar: Regular vitamina D",false,true,1),
("Glifage", 25.83,"Tratar: Indicado para pessoas com diabete do tipo 2",false,true,2);


select * from tb_produto where preço > 50;

select * from tb_produto where preço between 3 and 60;

select * from tb_produto where sabor like "%B%";

select * from tb_produto inner join tb_categoria
on tb_categoria.id  = tb_produto.fk_id_categoria;
