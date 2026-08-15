-- 코드를 작성해주세요
select ID, LENGTH
from FISH_INFO
group by ID
having LENGTH is not null
order by LENGTH desc
limit 10;
