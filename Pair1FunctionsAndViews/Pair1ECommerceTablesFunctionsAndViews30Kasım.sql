create or replace function datediff(date1 date,date2 date ,unit character varying)
returns int 
as  $$
DECLARE
diff int =0;
BEGIN
if unit in ('yyyy','yy','year') then
select date_part('year',date2) - date_part('year',date1) into diff;
end if;

if unit in ('m','mm','month') then
select (date_part('year',date2) - date_part('year',date1))*12+date_part('month',date2) - date_part('month',date1) into diff;
end if;

if unit in ('dd','d','day') then
select date2-date1 into diff;
end if;

return diff;
END;
$$ LANGUAGE plpgsql;

create or replace function ordersformonth(lastmonth int)
returns int
as $$
declare
sonuc int =0;
BEGIN
select count(*) as "Sipariş Sayısı" into sonuc from orders o where
date_part('month',current_date) -date_part('month',o."orderDate") < lastmonth;
RETURN sonuc;
END;
$$ LANGUAGE plpgsql;


select datediff('2020-01-01','2021-02-02','day')
select ordersformonths(3)

create view categoryproductstock
as 
select SUM(pr.stock) as "İlgili Kategorideki Ürünlerin Stok Toplamları" from products pr
INNER JOIN products_categories pc
on pr.product_id=pc.product_id
INNER JOIN categories ca
on pc.category_id=ca.category_id
where ca.category_id=2

select * from categoryproductstock

create view highestpriceproduct
as
select MAX(p.price) as "Her kategorideki ürünlerden fiyatı en yüksek olanlar",
ca.name as "kategori adı" from products p
INNER JOIN products_categories pc 
on p.product_id=pc.product_id
INNER JOIN categories ca
on pc.category_id=ca.category_id
GROUP BY ca.category_id

select * from highestpriceproduct



