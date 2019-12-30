CREATE TABLE person (
  id bigint auto_increment,
  birth_day timestamp,
  email varchar(255) not null,
  name varchar(50) not null,
  phone_number varchar(255),
  colleague boolean,
  primary key (id));