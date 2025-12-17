with add_date as(
    SELECT player_id,date_add(min(event_date),INTERVAL 1 DAY) as firstorder FROM Activity GROUP BY player_id
)
SELECT round(sum(case when a.event_date = d.firstorder then 1 else 0 end)* 1.0 / count(DISTINCT a.player_id),2) as fraction FROM Activity a JOIN add_date d on a.player_id = d.player_id
