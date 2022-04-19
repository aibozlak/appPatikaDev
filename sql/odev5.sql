-- ****** Ben MySQL indirdim. MySQL'de dvdrental'a benzer bir örnek database var : sakila. ******
-- Ödevi bunun üzerinden yapacağım.
-- app.patika.dev/aibozlak

-- Ödev 5: 
-- 1) film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en uzun (length) 5 filmi sıralayınız.
select * from sakila.film where title like '%n' order by length desc limit 5;

-- 2) film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en kısa (length) ikinci 5 filmi(6,7,8,9,10) sıralayınız.
select * from sakila.film where title like '%n' order by length limit 5 offset 5;

-- 3) customer tablosunda bulunan last_name sütununa göre azalan yapılan sıralamada store_id 1 olmak koşuluyla ilk 4 veriyi sıralayınız.
select * from sakila.customer where store_id = 1 order by last_name limit 4;