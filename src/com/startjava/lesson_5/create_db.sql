\l
CREATE DATABASE jaegers1;
\l
\connect jaegers1;
CREATE TABLE CharacteristicsOfrobots (
	id 				SERIAL PRIMARY KEY,
	modelName 		TEXT,
	mark 			CHAR(6),
	height 			INTEGER,
	weight	 		INTEGER,
	status 			CHAR(9),
	origin 			TEXT,
	launch 			DATE,
	kaijuKill 		SMALLINT
);
\d
\d 'CharacteristicsOfrobots'
\q
