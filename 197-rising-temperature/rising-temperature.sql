# Write your MySQL query statement below
SELECT id
FROM (
    SELECT
        id,
        recordDate,
        temperature,
        LAG(temperature) OVER (ORDER BY recordDate) AS previous_temp,
        LAG(recordDate) OVER (ORDER BY recordDate) AS previous_date
    FROM Weather
) t
WHERE temperature > previous_temp
  AND DATEDIFF(recordDate, previous_date) = 1;