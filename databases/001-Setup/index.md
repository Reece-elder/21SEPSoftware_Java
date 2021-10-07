# MySQL 

https://dev.mysql.com/downloads/installer - 8.0.25 Follow me

Add MySQL to Env Path

## Setup with Linux AWS

ubuntu 20.04

sudo apt update

sudo apt install mysql-server

sudo mysql_secure_installation
Enter and remember password
press Y for everything

sudo mysql - Access mysql

======================

Create a mysql user
CREATE USER 'sammy'@'localhost' IDENTIFIED BY 'password';

GRANT ALL PRIVILEGES ON *.* TO 'sammy'@'localhost' WITH GRANT OPTION;

FLUSH PRIVILIGES

exit

mysql -u username -p

=====================

git clone https://github.com/ivanceras/sakila

mysql -u reece -p password

SOURCE ~/sakila/mysql-sakila-db/sakila-schema.sql;
SOURCE ~/sakila/mysql-sakila-db/sakila-data.sql

SHOW databases;





## Sample Databases 

https://dev.mysql.com/doc/index-other.html 
Download zip of World Database + Sakila / take files from teams

Open directory with .sql files
Click path at top to grab this path 

Open up Powershell login to `MySQL -u root -p` 
SOURCE *file Path*\.sql file

show databases

use *database name*

show tables / show tables from world;
