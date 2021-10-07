# Joins

Used to combine different tables together based on common data values

Commonly used to match a primary key in one table to a foreign key in another

Types of Joins:
- Inner Join - Default Join, combines with data present in both tables
- Outer Joins - returns records that include an inner join AND records with no corresponding from either side (left or right)
    - left outer join provides all data for t1 in query
    - right outer join provides all data fot t2 in query

CREATE TABLE penguins (
    penguin_id int AUTO_INCREMENT,
    name varchar(60) NOT NULL,
    height int NOT NULL,
    fluffy boolean DEFAULT TRUE,
    PRIMARY KEY (penguin_id)
);

CREATE TABLE fish (
    fish_id int NOT NULL AUTO_INCREMENT,
    penguin_id int,
    name varchar(50),
    ocean_home varchar(50),
    PRIMARY KEY (fish_id),
    FOREIGN KEY (penguin_id) REFERENCES penguins(penguin_id)
);

INSERT INTO fish (penguin_id, name, ocean_home)
VALUES (3, 'Julian', 'Pacific'), ( 1, 'Eeeeely', 'Arcitc'), (3,'John', 'Pacific');

INSERT INTO fish (fk_penguin_id, name, ocean_home)
VALUES (5, 'Leon', 'Pacific'), ( 6, 'Mr Fish', 'Arcitc'), (5,'Spot', 'Pacific');

SELECT *
FROM penguins t1
RIGHT OUTER JOIN fish t2 ON t1.penguin_id=t2.fk_penguin_id;