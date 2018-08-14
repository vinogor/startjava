SELECT * FROM Characteristicsofrobots;
SELECT modelname FROM Characteristicsofrobots WHERE status != 'Destroyed';
SELECT modelname FROM Characteristicsofrobots WHERE mark = 'Mark-6' OR mark = 'Mark-5';
SELECT * FROM Characteristicsofrobots ORDER BY mark DESC;
SELECT * FROM Characteristicsofrobots WHERE launch = (SELECT MIN(launch) FROM Characteristicsofrobots);
SELECT * FROM Characteristicsofrobots WHERE kaijukill = (SELECT MIN(kaijukill) FROM Characteristicsofrobots) OR kaijukill = (SELECT MAX(kaijukill) FROM Characteristicsofrobots);
SELECT AVG(weight) FROM Characteristicsofrobots;
UPDATE Characteristicsofrobots SET kaijukill = (kaijukill + 1) WHERE status != 'Destroyed';
SELECT * FROM Characteristicsofrobots;
DELETE FROM Characteristicsofrobots WHERE status = 'Destroyed';
SELECT * FROM Characteristicsofrobots;
\q