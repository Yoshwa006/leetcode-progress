-- Last updated: 7/25/2025, 8:52:04 AM
# Write your MySQL query statement below
select player_id, min(event_date) as first_login
from Activity
group by player_id;