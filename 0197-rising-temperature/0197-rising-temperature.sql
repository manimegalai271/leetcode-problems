SELECT today.id AS Id
FROM Weather yesterday 
CROSS JOIN Weather today 
WHERE DATEDIFF(today.recordDate,yesterday.recordDate) = 1 AND
   yesterday.temperature < today.temperature;

