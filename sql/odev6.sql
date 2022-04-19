-- ****** Ben MySQL indirdim. MySQL'de dvdrental'a benzer bir örnek database var : sakila. ******
-- Ödevi bunun üzerinden yapacağım.
-- app.patika.dev/aibozlak

-- Ödev 6:
-- 1) film tablosunda bulunan rental_rate sütunundaki değerlerin ortalaması nedir?
select avg(rental_rate) from sakila.film;  -- -> result: 2.980000
select round(avg(rental_rate),2) from sakila.film;  -- -> result: 2.98

-- 2) film tablosunda bulunan filmlerden kaç tanesi 'C' karakteri ile başlar?
select count(*) from sakila.film where title like 'C%';  -- -> result: 92

-- 3) film tablosunda bulunan filmlerden rental_rate değeri 0.99 a eşit olan en uzun (length) film kaç dakikadır?
select max(length) from sakila.film where rental_rate = 0.99;  -- -> result: 184
-- Other way:
select length from sakila.film where rental_rate = 0.99 order by length desc limit 1;

-- 4) film tablosunda bulunan filmlerin uzunluğu 150 dakikadan büyük olanlarına ait kaç farklı replacement_cost değeri vardır?
select count(distinct replacement_cost) from sakila.film where length > 150;  -- -> result: 21