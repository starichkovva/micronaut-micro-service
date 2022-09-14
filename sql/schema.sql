create database if not exists micro_shop character set utf8mb4;

use micro_shop;
create user if not exists 'tradesman';
alter user 'tradesman'@'%' identified by '';
grant insert, select, delete, update, references on micro_shop.* to 'tradesman'@'%';
grant create on micro_shop.* to 'tradesman'@'%';