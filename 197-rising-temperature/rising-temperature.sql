# Write your MySQL query statement below

select w.id from Weather w join Weather r on DATEDIFF(w.recordDate,r.recordDate )=1 and w.temperature > r.temperature;
