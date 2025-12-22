with cc as(
     SELECT case when COUNT(class) >= 5 then 1 else 0 end as c,class FROM Courses GROUP BY class
)
SELECT class FROM cc WHERE c = 1;