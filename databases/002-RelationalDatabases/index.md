# Relational Databases

Relational Database Management Systems (RDBMS)

Organised collection of data, all web apps need database for storage and retrieval

Front end > Back end > Database

two areas:
- Data - what is stored
- Schema - how it is stored (layout of data)

create database testDB;
use testDB;

## Tables

Data stored as tables (known as entities)
Real life semantic objects (customers, products etc)
Tables contain one or more records, a set of data

create table orders (
    flavour varchar(255),
    size int,
    stuffedCrust boolean
);

show columns from orders

INSERT INTO orders (flavour, size, stuffedCrust)
VALUES ('Pepperoni', 12, TRUE);

SELECT * FROM orders; 

## Schema + Relationships

Defines the structure and relationship between data

Orders links to Pizzas and customers

Using a schema to model this relationship AND the individual table structure

Allowing tables to access data from another table

## Queries

Statements to access data (What you could want)

Statement run against database, database prints out the value of the query

### Exercise

Model as a graph (using software of choice) the kinds of tables and what data they'd need for a cinema. 
Minimum 3 tables and each of the tables should link and want access to one of the other tables records

### Stretch goal 
Using Community and what I did attempt to create a database with one/all of the tables you created. You will need to use online resources for this



