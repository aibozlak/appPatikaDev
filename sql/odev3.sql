-- ****** Ben MySQL indirdim. MySQL'de dvdrental'a benzer bir örnek database var : sakila. ******
-- Ödevi bunun üzeeinden yapacağım.
-- app.patika.dev/aibozlak

-- Ödev 3:
-- 1) country tablosunda bulunan country sütunundaki ülke isimlerinden 'A' karakteri ile başlayıp 'a' karakteri ile sonlananları sıralayınız.
select * from sakila.country where country like ('A%a');  -- -> Listed 8 records. 

-- 2) country tablosunda bulunan country sütunundaki ülke isimlerinden en az 6 karakterden oluşan 
--    ve sonu 'n' karakteri ile sonlananları sıralayınız.
select * from sakila.country where country like ('%_____n'); -- -> Used 5 times underscore. (Listed 12 records.)

-- 3) film tablosunda bulunan title sütunundaki film isimlerinden en az 4 adet büyük ya da küçük harf farketmesizin 'T' karakteri içeren 
--    film isimlerini sıralayınız.
-- !! Not: MySQL ILIKE desteklemiyor. LIKE keywordu ise case sensitive filtreleme yapmıyor.. !!! Bundan dolayı LIKE kullanmalıyım:
select title from sakila.film where title like ('%t%t%t%t%'); -- -> Listed 9 records

-- 4) film tablosunda bulunan tüm sütunlardaki verilerden title 'C' karakteri ile başlayan 
--    ve uzunluğu (length) 90 dan büyük olan ve rental_rate 2.99 olan verileri sıralayınız.
select * from sakila.film where (title like ('C%')) and (length > 90) and (rental_rate = 2.99); -- -> Listed 20 records