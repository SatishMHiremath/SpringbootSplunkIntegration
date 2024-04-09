drop table if exists PRODUCT;

create table PRODUCT(id LONG AUTO_INCREMENT PRIMARY KEY, name varchar(20) NOT NULL, quantity INTEGER NOT NULL, price double NOT NULL); 