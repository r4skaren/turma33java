create database db_generation_game_online;

use db_generation_game_online;

create table tb_classes(
  id bigint auto_increment,
	nome varchar (20),
	poder varchar (20),
	energia int,
	primary key (id)
);

insert into tb_classes(nome,poder,energia)
VALUES
("Guerreiro", "Machadada",110),
("Bruxa", "Magia",200),
("Mercenário", "Punhalada",70),
("Sacerdote", "Cura",80),
("Arqueiro", "Flechada",130);


create table tb_personagens(
	id bigint auto_increment,
	fk_id_classes bigint,
	nome varchar (20),
	genero enum('ela', 'elu', 'ele', 'outro'),
	raça varchar(20),
	ataque int,
	vida int,
	primary key (id),
	foreign key (fk_id_classes) references tb_classes (id)
);

insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Gustavo","ele","jacare",20,150,1);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Joice","ela","humana",20,150,3);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Juan","elu","bullywug",8,50,4);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Raniere","ele","humana",22,100,2);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Guilherme","ele","Morcego",40,150,3);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Matheus","ele","Homem",21,100,1);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Ilanna","ela","Aleatória",30,200,5);
insert into tb_personagens(nome,genero,raça,ataque,vida,fk_id_classes) values ("Graebin","ele","Da paz",25,160,4);



select * from tb_personagens where ataque > 200;

select * from tb_personagens where ataque between 1000 and 2000;

select * from tb_personagens where nome like "%C%";

select * from tb_personagens inner join tb_classes
on tb_classes.id  = tb_personagens.fk_id_classes;


select * from tb_personagens inner join tb_classes
on tb_classes.id  = tb_personagens.fk_id_classes
where fk_id_classes = 5;
