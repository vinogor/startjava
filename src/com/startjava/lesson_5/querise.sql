SELECT *
FROM Characteristics_of_robots;

SELECT modelname
FROM Characteristics_of_robots
WHERE status != 'Destroyed';

SELECT modelname
FROM Characteristics_of_robots
WHERE mark = 'Mark-6'
   OR mark = 'Mark-5';

SELECT *
FROM Characteristics_of_robots
ORDER BY mark DESC;

SELECT *
FROM Characteristics_of_robots
WHERE launch = (SELECT MIN(launch) FROM Characteristics_of_robots);

SELECT *
FROM Characteristics_of_robots
WHERE kaijukill = (SELECT MIN(kaijukill) FROM Characteristics_of_robots)
   OR kaijukill = (SELECT MAX(kaijukill) FROM Characteristics_of_robots);

SELECT AVG(weight)
FROM Characteristics_of_robots;

UPDATE Characteristics_of_robots
SET kaijukill = (kaijukill + 1)
WHERE status != 'Destroyed';

SELECT *
FROM Characteristics_of_robots;

DELETE
FROM Characteristics_of_robots
WHERE status = 'Destroyed';

SELECT *
FROM Characteristics_of_robots;

\q