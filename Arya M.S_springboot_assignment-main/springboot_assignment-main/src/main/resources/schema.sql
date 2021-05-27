DROP TABLE IF EXISTS ITEM;
CREATE TABLE ITEM
(
    id   INT(11) NOT NULL,
    name VARCHAR(50) NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);

Insert into ITEM
values (1, 'Smart-Watch'),
       (2, 'Clock'),
       (3, 'Calculator');