\l
CREATE DATABASE jaegers;
\l
\connect jaegers;
CREATE TABLE Characteristics_of_robots(
    id        SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      CHAR(6),
    height    INTEGER,
    weight    INTEGER,
    status    CHAR(9),
    origin    TEXT,
    launch    DATE,
    kaijuKill SMALLINT
);
\d
\d 'Characteristics_of_robots'
\q
