# DQL - Database Query Language

Allows you to read data, schema (DDL) and Raw data (DML)

SELECT - Single command, most powerful

So far with DDL: 

SHOW databases;

SHOW tables;

DESCRIBE table_name;

## Select

### Simple

SELECT *columns interested in* FROM *table name*

SELECT * FROM penguins

### Distinct - Unique

SELECT CountryCode FROM city;

SELECT DISTINCT CountryCode FROM city;

### Where - Further Specifics

SELECT *fields* FROM *table name* WHERE *condition*

SELECT * FROM city WHERE Population > 200000;

#### Operators 

= equal
!= not equal

SELECT * FROM city WHERE CountryCode = 'ZWE';
SELECT * FROM city WHERE CountryCode != 'USA';

< - Less than  
> - Greater than
<= Less than or equal 

SELECT * FROM city WHERE Population < 200000;
SELECT * FROM city WHERE Population >= 250000;

BETWEEN - within a range

SELECT * FROM city WHERE Population BETWEEN 42000 AND 167000;

LIKE - Searching for a pattern

use wildcards to make it easier
% - Represents Zero or more
%apple - represents any values that END in apple
apple% - represents values that START in apple
%apple% - starts and ends with anything, contains apple

SELECT * FROM city WHERE Name LIKE '%river%';

(NOT) IN - Specifying possible values for a field
SELECT * FROM city WHERE CountryCode IN ('TUR', 'UKR', 'DEU');


### Aliasing

Allows you to combine values

SELECT title, rental_rate * rental_duration AS rental_price FROM film;

Aliasing allows us to rename 

SELECT CONCAT(Name, ', ', CountryCode, ', ', District) AS string FROM city LIMIT 10;

### Ordering

ORDER BY sort records upon retrieval

ORDER BY defaults in ascending order unless specified

SELECT *field names* FROM *table_name* ORDER BY *field name to sort* ASC/DESC

Select * FROM city ORDER BY Population ASC LIMIT 50;

Exercise - Using either your data or the sample databases attempt the following:

- View all records from one table
- View two fields of all records
- View all records using Distinct
- View all records where:
Equal to
Not Equal to 
Greater than
Less than
Between
Like
In
- View 20 records where one column name has been changed
- View all / 50 records where they have been ordered by one value
