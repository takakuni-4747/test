drop database if exists sampledb;
create database sampledb;
use testdb;

create table sample_table(
user_id int,
user_name varchar(50),
age int,
mail varchar(50)
);

insert into test_table values(1,"yamada","21","xxx@yahoo.co.jp");
insert into test_table values(2,"sato","39","yyy@google.com");
insert into test_table values(1,"harada","44","zzz@yajoo.co.jp");