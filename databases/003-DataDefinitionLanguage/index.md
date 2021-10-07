# DDL + Data Design

## Data Design

Numeric - Used for calculations
Textual - Non calculated values (strings)
Date/Time - rubber stamping data

(List some types of data in a big table)
(Why you would use different data types)

## Database Constraints

UNIQUE - All values must be unique
NOT NULL - Has to be filled in
DEFAULT - Has a default value 
PRIMARY KEY - Unique and Not Null
AUTO INCREMENT - Increments 

## Keys

Primary key uniquely identifies every record in a table - given to IDs

Foreign Keys are Primary Keys from different tables. Allow linking

## Exercise 
Using method of choice add Data Design Principles to your tables created earlier
Giving them appropriate column names, data types, Constraints and keys

# DDL

Subset of SQL query types
Defining schema for database, writing queries to alter data
CRUD

https://www.sqlstyle.guide/ - useful link

## Databases 

CREATE DATABASE database_name;

IF NOT EXISTS database_name;

USE database_name;

## Tables + Constraints

CREATE TABLE table_name (
    column_name1 data_type(size), 
    column_name2 data_type(size) constraint_name, 
    PRIMARY KEY (field_name)
)

CREATE TABLE restaurants (
    restaurant_id int AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    address varchar NOT NULL, 
    head_count smallint DEFAULT '0',
    PRIMARY KEY (restaurant_id) 
    FOREIGN KEY (pizza_id) REFERENCES orders(id)
);

## Exercises 
Build on the tables made in the previous exercise and create a database and tables using Data Definition Language

Stretch goal - Try to work out how to add data to these tables

