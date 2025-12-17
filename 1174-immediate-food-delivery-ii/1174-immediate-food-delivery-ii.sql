 with get_first_order as(
 SELECT customer_id,min(order_date) as firstorder from Delivery group by customer_id)

 SELECT round(sum(case when d.order_date = d.customer_pref_delivery_date then 1 else 0 end) * 100.0 / count(*),2) as immediate_percentage
 FROM Delivery d JOIN get_first_order g on d.customer_id = g.customer_id and d.order_date = g.firstorder;

