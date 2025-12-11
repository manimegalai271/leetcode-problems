with confirmation as(
SELECT s.user_id,COUNT(c.user_id) AS actioncount,
sum( case when c.action = 'confirmed' then 1 else 0 end) as confirmed_rate
FROM Signups s LEFT JOIN Confirmations c ON s.user_id = c.user_id GROUP BY s.user_id)
SELECT user_id,IFNULL(ROUND(confirmed_rate / actioncount,2),0) as confirmation_rate from confirmation;