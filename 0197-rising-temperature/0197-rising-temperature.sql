SELECT today.id as id 
FROM Weather yesterday CROSS JOIN Weather today WHERE DATEDIFF(today.recordDate,yesterday.recordDate) = 1 && today.temperature > yesterday.temperature;
