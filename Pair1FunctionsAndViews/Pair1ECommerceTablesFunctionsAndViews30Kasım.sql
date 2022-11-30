
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



