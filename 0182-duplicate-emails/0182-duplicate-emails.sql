# Write your MySQL query statement below
select p1.email from person p1
group by(email) having count(email)>1
# left join person p2 on p1.email=p2.email