Create database  if not exists Test1;

use Test1;
create table customer(
    name varchar(100) not null ,
    id int auto_increment primary key ,
    address varchar(100) not null
);

insert into customer(name, id, address) values ("isuru",1,"colombo");