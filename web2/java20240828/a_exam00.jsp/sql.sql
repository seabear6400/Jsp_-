select a.custno, a.custname,
case when a.grade = 'A' then 'VIP'
when a.grade = 'B' then '일반'
else '직원' end grade,
sum(b.price) price
from member_tbl_02 a, money_tbl_02 b
where a.custno = b.custno and nvl(b.price,0)>0
group by a.custno, a.custname, a.grade
order by sum(b.price) desc;

select amount, sum(price) price
from money_tbl_02
group by amount
having sum(price) > 1500
order by price desc, amount desc;

select amount, sum(price) price
from money_tbl_02
group by amount
order by price desc;