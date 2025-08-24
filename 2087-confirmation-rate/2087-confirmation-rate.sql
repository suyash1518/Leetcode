# Write your MySQL query statement below
select s.user_id, round(
    IFNULL(sum(c.action= 'confirmed') /count(c.user_id),0),2) as confirmation_rate
from Signups s
left Join Confirmations c
on s.user_id= c.user_id
group by s.user_id