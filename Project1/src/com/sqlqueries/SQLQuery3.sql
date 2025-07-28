select * from myTable ;

select last_name,max(user_id) as maxid from myTable where user_id >6
group by last_name having max(user_id)>10;