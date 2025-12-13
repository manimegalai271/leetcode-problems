SELECT r.contest_id,ROUND(COUNT(*) * 100.0 / (SELECT COUNT(user_id) from Users),2) as percentage 
FROM Users u JOIN Register r ON u.user_id = r.user_id group by r.contest_id ORDER BY percentage desc,contest_id;

