-- ****** Ben MySQL indirdim. MySQL'de dvdrental'a benzer bir örnek database var : sakila. ******
-- Ödevi bunun üzerinden yapacağım.
-- app.patika.dev/aibozlak

-- Ödev 11:
-- 1) actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
(select first_name from actor) union (select first_name from customer);
/*
actor tablosunda 200 actor var, customer tablosunda 599 customer var. 
Sorgu sonucunda bana 647 isim verdi UNION.
(799-647) 152 isim ortak. 
*/


-- 2) actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
-- !! MySQL INTERSECT'i desteklemiyor...
-- (select first_name from actor) intersect (select first_name from customer); <----- PostgeSQL komutu.


-- 3) actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
-- !! MySQL EXCEPT'i de desteklemiyor....
-- (select first_name from actor) except (select first_name from customer); <------ PostgreSQL komutu. 


-- 4) İlk 3 sorguyu tekrar eden veriler için de yapalım. 
(select first_name from actor) union all (select first_name from customer);
-- --> actor ve customer tablolarında ortak olan 152 ismi tekrar ederek verdi. 799 isim verdi UNION ALL. 