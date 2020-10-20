CREATE DATABASE NextFavoriteBook;
USE NextFavoriteBook;


CREATE TABLE Passwords(
p_id INTEGER,
pass VARCHAR(30),
PRIMARY KEY (p_id)
);


CREATE TABLE Users(
username VARCHAR(20),
p_id INTEGER,
email VARCHAR(60),
PRIMARY KEY(username),
FOREIGN KEY (p_id) REFERENCES Passwords(p_id)
);


Delete from Passwords;


SELECT * FROM Users;
SELECT * FROM Passwords;
SELECT * FROM zip;
SELECT * FROM personal_info;


CREATE TABLE zip(
zip_id INTEGER,
city VARCHAR(30),
PRIMARY KEY (zip_id)
);

CREATE TABLE personal_info(
u_id INTEGER,
username VARCHAR(20),
fname VARCHAR(20),
lname VARCHAR(20),
add1 VARCHAR(30),
add2 VARCHAR(30),
zip_code INTEGER,
contact VARCHAR(10),
PRIMARY KEY(u_id),
FOREIGN KEY(zip_code) REFERENCES zip(zip_id)
);


 CREATE TABLE authors(
 a_id INTEGER,
 a_fname VARCHAR(20),
 a_lname VARCHAR(20),
 PRIMARY KEY(a_id)
 );

CREATE TABLE bookrecords(
b_id INTEGER,
b_name VARCHAR(30),
price NUMERIC(4,4),
intro VARCHAR(150),
a_id INTEGER,
PRIMARY KEY(b_id),
FOREIGN KEY(a_id) REFERENCES authors(a_id)
);


CREATE TABLE purchaced_books(
pb_id INTEGER,
b_id INTEGER,
username VARCHAR(20),
unit INTEGER,
PRIMARY KEY(pb_id)
);


CREATE TABLE transactions(
t_id INTEGER,
u_id INTEGER,
b_id INTEGER,
a_id INTEGER,
PRIMARY KEY(t_id),
FOREIGN KEY(u_id) REFERENCES personal_info(u_id), 
FOREIGN KEY(b_id) REFERENCES bookrecords(b_id),
FOREIGN KEY(a_id) REFERENCES authors(a_id)
);


alter table bookrecords modify column price float(8,2); 


delete from Users;
delete from passwords;
delete from personal_info;

SELECT * FROM Users;
SELECT * FROM Passwords;
SELECT * FROM zip;
SELECT * FROM personal_info;
SELECT * FROM bookrecords;
SELECT * FROM authors;


insert into zip values(02120, "Boston");
insert into personal_info values(1,"rohan","Rohan","Joshi","244Winchesterst","apt2",02120,"6179352539");


insert into authors values(001,"J.K.","Rowling");
insert into authors values(002,"George R.","Martin");
insert into authors values(003,"Harper","Lee");
insert into authors values(004,"Herman","Hesse");

insert into bookrecords values(01,"The Harry Potter",40.99,"Its a story of a wizard",001);
insert into bookrecords values(02,"A Game of Thrones",62.99,"A Story of many kings",002);
insert into bookrecords values(03,"Kill a Mockingbird",39.99,"A story of a mocking bird",003);
insert into bookrecords values(04,"Siddhartha",52.99,"Story of great gautam Buddha",004);










