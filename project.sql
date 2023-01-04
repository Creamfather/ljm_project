CREATE USER ljm_project@'%' identified by 'dlwjdans1@';
FLUSH PRIVILEGES ;

CREATE DATABASE learn;
SHOW DATABASES ;

GRANT ALL PRIVILEGES ON learn.* TO ljm_project@'%';

CREATE TABLE IF NOT EXISTS `learn`.`users`
(
    `id`
    MEDIUMINT
    AUTO_INCREMENT
    PRIMARY
    KEY,
    `name`
    VARCHAR
(
    50
) NOT NULL
    );

SELECT *
FROM users;

INSERT INTO `learn`.`users` (name)
VALUES ('이정문');

-- MYSQL Log 설정
select @@GLOBAL.log_output;
select @@GLOBAL.general_log;
SET
GLOBAL log_output = 'table';

SELECT *
FROM mysql.general_log;