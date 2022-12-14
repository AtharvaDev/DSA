# Write your MySQL query statement below

select w1.id as 'Id' from weather w1 
join weather w2 ON DATEDIFF (w1.recordDate, w2.recordDate) =1
AND w1.Temperature > w2.Temperature