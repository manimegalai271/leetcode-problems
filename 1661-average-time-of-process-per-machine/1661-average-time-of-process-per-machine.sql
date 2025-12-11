# Write your MySQL query statement below
WITH average_time AS(
SELECT a.machine_id,a.process_id,c.timestamp - a.timestamp AS processing_time 
FROM Activity a JOIN Activity c ON a.machine_id = c.machine_id AND a.process_id = c.process_id AND a.activity_type = "start" AND  c.activity_type = "end"
)
SELECT machine_id,ROUND(AVG(processing_time),3) AS processing_time FROM average_time GROUP BY machine_id;