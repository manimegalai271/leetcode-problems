# Write your MySQL query statement below
SELECT product_name,s.year,s.price from Sales s join Product p on s.product_id=p.product_id;