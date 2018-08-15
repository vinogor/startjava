\l
CREATE DATABASE jaegers;
\l
\connect jaegers;
CREATE TABLE Characteristicsofrobots(
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
\d 'Characteristicsofrobots'
\q
