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