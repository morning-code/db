CREATE DATABASE IF NOT EXISTS morning_code;
CREATE TABLE IF NOT EXISTS blog(
    id bigint NOT NULL AUTO_INCREMENT,
    title varchar(256),
    detail text,
    created_at datetime default current_timestamp,
    created_by varchar(32) default 'otajisan',
    updated_at datetime default current_timestamp on update current_timestamp,
    updated_by varchar(32) default 'otajisan',
    PRIMARY KEY (id)
);

INSERT INTO blog(title, detail) VALUES('タイトル', '本文');