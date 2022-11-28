# EtiyaAkademi 28/11/2022 ÖDEV

>- **<h3>Sorgu 1</h3> --Almanya/Berlin'da yaşayan müşterilerin adreslerini getiren sorguyu yazın. (Inner Join Usage):**
```
select cu.name,cu.phone,cu.name,c.name,a.postacode,a.street from adresses a
INNER JOIN  users u
on a.user_id= u.user_id
INNER JOIN customers cu
on u.user_id=cu.id
INNER JOIN cities c
on a.city_id=c.city_id
INNER JOIN countries co
on a.country_id=co.country_id
where co.name=LOWER('Almanya') and c.name=LOWER('Berlin')
 
```
#### Kod Çıktısı :

![1] <img src="https://raw.githubusercontent.com/FurkanBaysan/EtiyaAkademi/main/Images/Sorgu1.PNG"></img>


-----------------------------------------------------------------------------------------------------------------

>- **<h3>Sorgu 2</h3> İstediğimiz kategorideki ürünleri stok adedine göre sıralayan sorguyu yazın. (ORDER BY Usage):**
```
select * from products pr
INNER JOIN products_categories pc
on pr.product_id=pc.product_id
INNER JOIN categories ca
on pc.category_id=ca.category_id
where ca.category_id=2
ORDER BY pr.stock DESC
 
```

#### Kod Çıktısı :

![2] <img src="https://raw.githubusercontent.com/FurkanBaysan/EtiyaAkademi/main/Images/Sorgu2.PNG"></img>


-----------------------------------------------------------------------------------------------------------------

>- **<h3>Sorgu 3</h3> Bir tedarikçinin elindeki ürünlerin tamamını sattığı durumda kazandığı toplam kazancı getiren sorguyu yazınız(GROUP BY Usage)**
```
select su.supplierid,su.name, SUM(pc.price-(pc.price * pc.discount_rate)) as "Toplam Kazanç" from products pc  
INNER JOIN suppliers su
on pc.supplierid=su.supplierid
where su.supplierid=1
GROUP BY su.supplierid
 
```

#### Kod Çıktısı :


![3] <img src="https://raw.githubusercontent.com/FurkanBaysan/EtiyaAkademi/main/Images/Sorgu3.PNG"></img>


---------------------------------------------------------------------------------------------------------------

>- **<h3>Sorgu 4</h3> Update (U) Operasyonu gerceklestirelim**

```
update customers 
set name = 'Kaya', phone = '33333'
where id =7
 
```

#### Kod Çıktısı :

![4] <img src="https://raw.githubusercontent.com/FurkanBaysan/EtiyaAkademi/main/Images/Sorgu4.PNG"></img>


---------------------------------------------------------------------------------------------------------------

>- **<h3>Sorgu 5</h3> Delete (D) Operasyonu gerceklestirelim **

```
delete from customers
where id = 7
 
```

#### Kod Çıktısı :

![5] <img src="https://raw.githubusercontent.com/FurkanBaysan/EtiyaAkademi/main/Images/Sorgu5.PNG"></img>



---------------------------------------------------------------------------------------------------------------


>- **<h3>Sorgu 6</h3>Insert (C) Operasyonu gerceklestirelim **

```
insert into customers(id,email,phone,name,costumer_id,birthday,gender)
values(7,'furkan@gmail','5458463233','furkan',7,'1999-06-06','Male')
 
```
#### Kod Çıktısı :


![6] <img src="https://raw.githubusercontent.com/FurkanBaysan/EtiyaAkademi/main/Images/Sorgu6.PNG"></img>



---------------------------------------------------------------------------------------------------------------


>- **<h3>Sorgu 7</h3>Elinde birden fazla ürün olan tedarikçilerin isimlerini getiren sorguyu yazınız (having Usage)**
```
select s.name as "Tedarikci Adı", COUNT(p.stock) as "Ürün stok sayısı" from products p 
inner join suppliers s 
on p.supplierid = s.supplierid
group by s.name
having COUNT(p.stock)>1
 
```
#### Kod Çıktısı :

![7] <img src="https://raw.githubusercontent.com/FurkanBaysan/EtiyaAkademi/main/Images/Sorgu7.PNG"></img>


---------------------------------------------------------------------------------------------------------------



>- **<h3>Sorgu 8</h3>Stok adedi 50'den fazla ürünleri isme göre gruplayıp listeleyiniz **

```
select p.name as "Urun Adı", p.stock as "Ürün stok sayısı" from products p 
inner join suppliers s 
on p.supplierid = s.supplierid
group by p.name, p.stock
having p.stock>50
 
```

#### Kod Çıktısı :

![8] <img src="https://raw.githubusercontent.com/FurkanBaysan/EtiyaAkademi/main/Images/Sorgu8.PNG"></img>


---------------------------------------------------------------------------------------------------------------


>- **<h3>Sorgu 9</h3>Stok adedi 5 ile 60 arasında olan ürünleri listeleyen sorguyu yazınız (between Usage)**

```
select p.name as "Urun Adı", p.stock as "Ürün stok sayısı" from products p 
group by p.name, p.stock
having p.stock
between 5 and 60
 
```

#### Kod Çıktısı :

![9] <img src="https://raw.githubusercontent.com/FurkanBaysan/EtiyaAkademi/main/Images/Sorgu9.PNG"></img>


---------------------------------------------------------------------------------------------------------------

>- **<h3>Sorgu 10</h3> Left Join Usage**

```
select * from products p 
left join products_categories pc
on p.product_id=pc.product_id
inner join categories c
on c.category_id=pc.category_id
 
```

#### Kod Çıktısı :

![10] <img src="https://raw.githubusercontent.com/FurkanBaysan/EtiyaAkademi/main/Images/Sorgu10.PNG"></img>



---------------------------------------------------------------------------------------------------------------


>- **<h3>Sorgu 11</h3> Right Join Usage**

```
select * from products p 
left join products_categories pc
on p.product_id=pc.product_id
right join categories c
on c.category_id=pc.category_id
 
```

#### Kod Çıktısı :

![10] <img src="https://raw.githubusercontent.com/FurkanBaysan/EtiyaAkademi/main/Images/Sorgu11.PNG"></img>



---------------------------------------------------------------------------------------------------------------


>- **<h3>Sorgu 12</h3> Full Join Usage **

```
select * from products p 
full join products_categories pc
on p.product_id=pc.product_id
full join categories c
on c.category_id=pc.category_id
 
```

#### Kod Çıktısı :

![10] <img src="https://raw.githubusercontent.com/FurkanBaysan/EtiyaAkademi/main/Images/Sorgu12.PNG"></img>



---------------------------------------------------------------------------------------------------------------



>- **<h3>Sorgu 13</h3>in Usage **

```
select * from users u
where name in ('furkan','veysel')
 
```

#### Kod Çıktısı :

![10] <img src="https://raw.githubusercontent.com/FurkanBaysan/EtiyaAkademi/main/Images/Sorgu13.PNG"></img>


---------------------------------------------------------------------------------------------------------------
