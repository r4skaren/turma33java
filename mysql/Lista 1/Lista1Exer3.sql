use db_Lista1Exer3;

create table db_alune(
	id int(5) auto_increment,
	nome varchar(20) not null,
	idade bigint (2),
	matricula varchar(20) not null,
	pronome enum('ela', 'elu', 'ele', 'outro'),
	nota int (6),
	primary key(id)
);

INSERT INTO db_alune(nome,idade,matricula,pronome,nota) 
VALUES 
("Nelson Mandela",15,"1000","elu",8),
("Martin Luther King",16,"1001","ele",9),
("Rosa Parks",17,"1002","ela",7),
("Nina Simone",18,"1003","ela",6),
("Elizabeth Eckford",19,"1004","elu",5),
("James Brown",20,"1005","ele",4),
("Carolina de Jesus",21,"1006","ela",10),
("Alice Walker",22,"1007","ela",7);

select * from db_alune where nota > 7;
select * from db_alune where nota < 7;

update db_alune set nota = 10
where id = 4;






