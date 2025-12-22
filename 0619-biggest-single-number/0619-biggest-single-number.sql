with count as (
    SELECT num FROM MyNumbers GROUP BY num HAVING COUNT(num) = 1
)
SELECT MAX(num) as num FROM count;
