drop table if exists list_item CASCADE;
create table list_item (id integer AUTO_INCREMENT,
deadline varchar(255),
description varchar(255),
priority integer,
title varchar(255),
primary key (id));