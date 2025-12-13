SELECT query_name,
ROUND(AVG(rating / position),2) AS quality,
ROUND(AVG(case when rating < 3 then 1 else 0 end) * 100,2) AS poor_query_percentage
from Queries group by query_name;