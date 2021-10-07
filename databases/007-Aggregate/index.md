# Aggregate Functions

Is a function where values of multiple rows grouped together to form one value

COUNT - counts fields
SUM - sum total of a field
MIN/MAX/AVG - Gets corresponding value from a field

## Count

Returns number of records that match

SELECT COUNT(*field name*) FROM *table_name*

SELECT COUNT(Name) FROM city;
SELECT COUNT(Name) FROM city WHERE Population < 220000;
## SUM

Returns a calculated total from a numeric field

SELECT SUM(Population) FROM city;
SELECT SUM(Population) FROM city WHERE CountryCode != 'USA';

## MIN MAX AVG

Select MIN(Population) FROM city;
Select MAX(Population) FROM city;
Select AVG(Population) FROM city;

## Group By

Used in conjuction with aggregate functions to bring together sections of data

Finding MAX pop of each Contry Code, grouping by country code

SELECT ID, MAX(Population), CountryCode FROM city GROUP BY CountryCode;

Exercise - With your Cinema write and run select queries for the following issues 