-- Last updated: 7/25/2025, 8:51:06 AM
select v.customer_id,
count(v.visit_id) as count_no_trans
from Visits v
left join transactions t
on v.visit_id = t.visit_id
where t.transaction_id is null
group by v.customer_id;


