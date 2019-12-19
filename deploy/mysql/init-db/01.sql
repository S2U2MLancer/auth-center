
create database if not exists `s2u2m-ac` DEFAULT CHARACTER SET utf8mb4;

-- service user
create user 's2u2m'@'%' identified by 's2u2m1234';
grant select,insert,update,delete,execute on `s2u2m-ac`.* to 's2u2m'@'%';

-- maintains user
create user 's2u2m-admin'@'%' identified by 's2u2m1234';
grant all on `s2u2m-ac`.* to 's2u2m-admin'@'%';
