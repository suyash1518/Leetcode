# Write your MySQL query statement below
select Visits.customer_id, COUNT(Visits.visit_id) as count_no_trans
from Visits
LEFT JOIN Transactions
ON Visits.visit_id = Transactions.visit_id
where Transactions.transaction_id IS null
Group by Visits.customer_id