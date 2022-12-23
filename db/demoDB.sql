create database if not exists demoDB;
use demoDB;

create table user
(
    id       int auto_increment
        primary key,
    username varchar(255) not null,
    password varchar(255) not null
);

INSERT INTO demoDB.user (id, username, password) VALUES (1, 'admin', '$2a$10$3mVZhRUa.I5YeTR7otp6xekaj2w2Bm8bns5Wh2EqGpo4NRKOLdOhK');
INSERT INTO demoDB.user (id, username, password) VALUES (2, 'LuoJun', '$2a$10$3mVZhRUa.I5YeTR7otp6xekaj2w2Bm8bns5Wh2EqGpo4NRKOLdOhK');