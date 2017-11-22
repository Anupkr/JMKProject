select s.id,s.name,s.address1,s.address2,
s.mobile1,s.mobile2,
s.arrival_type,
s.email_id,s.id_type,s.id_number,sa.current_balance  from supplier_details  s
             left join 
             (
				select supplier_id, current_balance from supplier_account where id =
				(
					select max(id) from supplier_account group by supplier_id limit 1
				)
			 ) sa on sa.supplier_id=s.id;
  