CREATE DATABASE EMP;
USE EMP;

CREATE TABLE EMP(
emp_id INTEGER(6),
fname VARCHAR(10),
lname VARCHAR(10),
add1 VARCHAR(20),
add2 VARCHAR(20),
zip INTEGER(6),
contact INTEGER(3),
PRIMARY KEY(emp_id)
);

CREATE TABLE zip_code(
zip INTEGER(6),
city VARCHAR(20),
PRIMARY KEY(zip)
);

CREATE TABLE contact(
c_id INTEGER(6),
phone_num VARCHAR(10),
home_num VARCHAR(10),
fax VARCHAR(10),
PRIMARY KEY(c_id)
);

SELECT * FROM zip_code;
SELECT * FROM contact;
SELECT * FROM EMP;


ALTER TABLE EMP 
ADD FOREIGN KEY(zip) REFERENCES zip_code(zip);

ALTER TABLE EMP 
ADD FOREIGN KEY(contact) REFERENCES contact(c_id);



INSERT INTO zip_code VALUES(99546, "ADAK");
INSERT INTO zip_code VALUES(90101, "LA");
INSERT INTO zip_code VALUES(92101,"SAN DEAGO");
INSERT INTO zip_code VALUES(02120,"BOSTON");

INSERT INTO contact VALUES(1,"6179352539","1229881234",null);
INSERT INTO contact VALUES(2,"6179300678","8974561234",null);
INSERT INTO contact VALUES(3,"6568761243",null,"1227613456");


INSERT INTO EMP VALUES(11,"Rohan","Joshi","1578 Tremont Street","Apt4",02120,1);
INSERT INTO EMP VALUES(12,"Neha","Oak","1578 Tremont Street","Apt 4",02120,2);
INSERT INTO EMP VALUES(13,"Purva","Joshi","2601 Wash Street","Apt1",92101,3);

SELECT t1.emp_id,t1.fname,t1.lname,t1.add1,t1.add2 ,t1.zip,t2.phone_num,t2.home_num,t2.fax,t3.city
FROM EMP t1
INNER JOIN contact t2 ON t1.contact =t2.c_id
INNER JOIN zip_code t3 ON t1.zip = t3.zip
WHERE t2.phone_num = "6179352539";

SELECT fname ,lname from EMP
WHERE zip = 02120;
















