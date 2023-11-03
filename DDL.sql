create database country;
show databases;
select user();
select database();
use country;
drop database country;

create table state(id int, name varchar(7),capital varchar(10));

insert into state(id,name,capital) values(4,"mysore","delhi");
select * from state;

create table city(id int,name varchar(12),nameofthestate varchar(15));
insert into city(id,name,nameofthestate) values(1,"shimoga","karnataka");
select * from city;