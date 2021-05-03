DROP TABLE IF EXISTS ITEM;
CREATE TABLE ITEM
(
    id   INT(11) NOT NULL,
    name VARCHAR(50) NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);

Insert into ITEM values (1, 'Laptop');
Insert into ITEM values (2, 'Speaker');
Insert into ITEM values (3, 'Headphones');
Insert into ITEM values (4, 'Earphones');
Insert into ITEM values (5, 'Watch');
