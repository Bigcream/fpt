use fpt_entry_test;
CREATE TABLE book_on_tape
(
  id bigint NOT NULL PRIMARY KEY auto_increment,
  name        nvarchar(200) NOT NULL,
  author_name        nvarchar(200) NOT NULL,
  category nvarchar(200) NOT NULL,
  price       float NOT NULL,
  short_description nvarchar(1200),
  quantity    bigint NOT NULL,
  seri_number    bigint NOT NULL
);

CREATE TABLE video
(
  id bigint NOT NULL PRIMARY KEY auto_increment,
  name        nvarchar(200) NOT NULL,
  category nvarchar(200) NOT NULL,
  country nvarchar(200) NOT NULL,
  price       float NOT NULL,
  short_description nvarchar(1200),
  quantity    bigint NOT NULL,
  seri_number    bigint NOT NULL
);
CREATE TABLE furniture
(
  id bigint NOT NULL PRIMARY KEY auto_increment,
  name        nvarchar(200) NOT NULL,
  category nvarchar(200) NOT NULL,
  color nvarchar(200) NOT NULL,
  price       float NOT NULL,
  short_description nvarchar(1200),
  quantity    bigint NOT NULL,
  seri_number    bigint NOT NULL
);