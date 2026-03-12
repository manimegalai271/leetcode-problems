with countedd as (
SELECT v.customer_id,COUNT(t.visit_id) as counted
FROM Visits v LEFT JOIN Transactions t on v.visit_id = t.visit_id GROUP BY v.visit_id HAVING COUNT(t.visit_id) = 0 )

SELECT customer_id,COUNT(customer_id) count_no_trans FROM countedd GROUP BY customer_id;