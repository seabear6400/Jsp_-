select amount, sum(price) price
from money_tbl_02
group by amount
order by price desc;
