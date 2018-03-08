CREATE TABLE mypersonaldata(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL,
	mail VARCHAR(50),
	age INTEGER
);

INSERT INTO mypersonaldata(name, mail, age)VALUES('taro', 'taro@yamada.jp' ,34);
INSERT INTO mypersonaldata(name, mail, age)VALUES('hanako', 'hana@yamada.jp' ,24);

