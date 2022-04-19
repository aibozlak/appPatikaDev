-- ****** Ben MySQL indirdim. MySQL'de dvdrental'a benzer bir örnek database var : sakila. ******
-- Ödevi bunun üzerinden yapacağım.
-- app.patika.dev/aibozlak

-- Ödev 7:
-- 1) film tablosunda bulunan filmleri rating değerlerine göre gruplayınız.
select rating from sakila.film group by rating;  -- -> 5 diffrent ratings: PG, G, NC-17, PG-13, R.

-- 2) film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film sayısı 50 den fazla olan 
--    replacement_cost değerini ve karşılık gelen film sayısını sıralayınız.
select replacement_cost, count(*) from sakila.film 
group by replacement_cost 
having count(*) > 50;  
-- ------> 8 rows returned

-- 3) customer tablosunda bulunan store_id değerlerine karşılık gelen müşteri sayılarını nelerdir?
select store_id, count(*) from sakila.customer group by store_id;
-- --> store_id 1 has 326 customers, store_id 2 has 273 customers.

-- 4) city tablosunda bulunan şehir verilerini country_id sütununa göre gruplandırdıktan sonra 
--    en fazla şehir sayısı barındıran country_id bilgisini ve şehir sayısını paylaşınız.
select country_id, count(*) from sakila.city 
group by country_id 
order by count(*) desc 
limit 1;
-- ----> Result: country_id : 44 has 60 cities in city table.