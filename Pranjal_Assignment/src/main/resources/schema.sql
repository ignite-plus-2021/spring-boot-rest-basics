DROP TABLE IF EXISTS ITEM;
CREATE TABLE ITEM
(
    id   INT(11) NOT NULL,
    name VARCHAR(50) NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);

Insert into ITEM
values (1, 'Smart-Watch');
Insert into ITEM values (2, 'Laptop');
Insert into ITEM values (3, 'Phone');
Insert into ITEM values (4, 'Tablet');
