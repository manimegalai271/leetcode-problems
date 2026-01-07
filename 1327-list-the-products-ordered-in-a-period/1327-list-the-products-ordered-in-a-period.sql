SELECT p.product_name,SUM(o.unit) as unit
FROM Products p JOIN Orders o ON p.product_id = o.product_id where o.order_date like '2020-02-%' group by p.product_id having sum(o.unit) >= 100;