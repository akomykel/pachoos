/* =================================================== */
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`
(
    id int(11) NOT NULL AUTO_INCREMENT,
    lastname varchar(150),
    firstname varchar(150),
    middlename varchar(150),
    contactnumber varchar(15),
    dateadded datetime,
    addedby int(11),
    datealtered datetime,
    alteredby int(11),
    remarks varchar(255),
    isdeleted int(1),
    PRIMARY KEY (`id`),
    UNIQUE KEY `id` (`id`)
);
COMMIT;