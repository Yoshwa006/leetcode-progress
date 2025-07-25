-- Last updated: 7/25/2025, 8:51:56 AM
# Write your MySQL query statement below

select distinct author_id as id from Views
where author_id = viewer_id 
order by id;