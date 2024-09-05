select amount, sum(price) price
from money_tbl_02
group by amount
having sum(price) > 1500
order by price desc, amount desc;
