use ecommerce;

create table tb_produtos(
    id int(3) auto_increment,
    peca varchar(20) not null,
    tamanho decimal (8,2),
    qtde decimal (10) not null,
    preco decimal (3),
    cor varchar(10), 
    primary key (id)
);

INSERT INTO tb_produtos(peca,tamanho,qtde,preco,cor) VALUES ("Blusa",36,5,50,"Preto") ; 
INSERT INTO tb_produtos(peca,tamanho,qtde,preco,cor) VALUES ("Calça",40,10,600,"Azul") ; 
INSERT INTO tb_produtos(peca,tamanho,qtde,preco,cor) VALUES ("Short",60,4,70,"Preto") ; 
INSERT INTO tb_produtos(peca,tamanho,qtde,preco,cor) VALUES ("Top",35,8,30,"Branco") ; 
INSERT INTO tb_produtos(peca,tamanho,qtde,preco,cor) VALUES ("Vestido",30,9,35,"Lilas") ;
INSERT INTO tb_produtos(peca,tamanho,qtde,preco,cor) VALUES ("Tênis",36,5,70,"Branco") ; 
INSERT INTO tb_produtos(peca,tamanho,qtde,preco,cor) VALUES ("Sutiã",12,9,36,"Vermelho") ; 
INSERT INTO tb_produtos(peca,tamanho,qtde,preco,cor) VALUES ("Moletom",32,26,700,"Verde") ;

select * from tb_produtos where preco > 500;

select * from tb_produtos where preco < 500;

update tb_produtos set produto = 100
where id = 2;