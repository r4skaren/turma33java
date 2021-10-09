# Blog-Pessoal

banco de dados não suporta o mecanismo InnoDB. 


De

~~~Java
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQLInnoDBDialect
~~~

Para

~~~Java
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
~~~
