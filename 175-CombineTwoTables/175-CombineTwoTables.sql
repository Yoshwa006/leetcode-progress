-- Last updated: 7/25/2025, 8:53:59 AM
# Write your MySQL query statement below
SELECT
 p.firstname,
 p.lastname,
 a.city,
 a.state
FROM Person AS p
LEFT JOIN Address as a
ON p.personID=a.personID; 