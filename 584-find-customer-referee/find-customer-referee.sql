# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id Is null OR referee_id != 2;