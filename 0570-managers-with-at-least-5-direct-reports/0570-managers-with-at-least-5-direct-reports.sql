# Write your MySQL query statement below

select m.name from employee A
join employee m
on A.managerId=m.id
group by A.managerId
having count(A.managerId)>=5