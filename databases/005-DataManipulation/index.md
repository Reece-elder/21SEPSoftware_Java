# Data Manipulation Language

subset of SQL that manipulates the content
DDL - manipulates the schema, this is content

DML integrated into CRUD applications to add/remove data from the database

- Insert data to                  = CREATE
- Reading data based on criteria  = SELECT  
- Updating existing data          = UPDATE
- Deleting data                   = DELETE

## Insert

CREATE TABLE penguins (
    penguin_id int AUTO_INCREMENT,
    name varchar(60) NOT NULL,
    height int NOT NULL,
    fluffy boolean DEFAULT TRUE,
    PRIMARY KEY (penguin_id)
);

CREATE TABLE fish (
    fish_id int NOT NULL AUTO_INCREMENT,
    fk_penguin_id int,
    name varchar(50),
    ocean_home varchar(50),
    PRIMARY KEY (fish_id),
    FOREIGN KEY (fk_penguin_id) REFERENCES penguins(penguin_id)
);

if inserting into all fields no need to specify.. Unless you have a Primary Key, which you need to specify the rest

INSERT INTO penguins (name, height, fluffy)
VALUES ('Tony', 28, TRUE ); 

INSERT INTO penguins (name, height, fluffy)
VALUES ('Tony', 28, TRUE ),
('Lucy', 24, FALSE ),
('Flipper', 17, TRUE ); 

## Delete

DELETE FROM penguins; Deletes all data BE CAREFUL

DELETE FROM penguins WHERE *field*=*value*
DELETE FROM penguins WHERE name='Flipper'

## Update

- Outline the table
- Specify value for changed field
- outline any conditions

UPDATE penguins 
SET name='Sir Tony'
WHERE name='Tony';

## Viewing

SELECT *columns interested in* FROM *table name*

SELECT * FROM penguins

## Exercises 

Add 5 records per table you have created (tip - Dont start with a table that relies on another table for foreign keys)
Delete 2 records from any tables
Update 2 Records from any tables
View records in all of your tables


