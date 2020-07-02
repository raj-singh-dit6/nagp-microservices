CREATE TABLE muser (
		user_id SERIAL CONSTRAINT user_id_pk  PRIMARY KEY,
		name VARCHAR (100) NOT NULL,
		age INTEGER,
		email  VARCHAR (30)
);