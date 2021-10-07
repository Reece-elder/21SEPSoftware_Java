# Nested Queries

Used to query information that has been returned from another query
Used commonly to return unknown values

Encapsulated query must return a single value

Get ALL of the data from the city with the lowest population 

SELECT * 
FROM city
WHERE population =???

SELECT MAX(Population)
FROM city;

SELECT *
FROM city 
WHERE Population = (
    SELECT MIN(Population)
    FROM city
);

## Views

CREATE VIEW nested_query AS SELECT MIN(Population) FROM city;

SELECT * FROM nested_query

