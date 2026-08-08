-- 코드를 입력하세요
select count(*)
from USER_INFO
where AGE >= 20 and AGE <=29 and JOINED >= '2021-01-01' and JOINED <= '2021-12-31';