-- ****** Ben MySQL indirdim. MySQL'de dvdrental'a benzer bir örnek database var : sakila. ******
-- Ödevi bunun üzeeinden yapacağım.
-- app.patika.dev/aibozlak

-- Ödev 4:
-- 1) film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız.
select distinct replacement_cost from sakila.film;  -- -> Listed 21 values.alter

-- 2) film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?
select count(distinct replacement_cost) from sakila.film; -- -> result: 21

-- 3) film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?
select count(*) from sakila.film where (title like ('T%')) and (rating = 'G');  -- -> result: 9

-- 4) country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?
select count(*) from sakila.country where country like ('_____'); -- -> Used underscore 5 times  -- -> result: 13

-- 5) city tablosundaki şehir isimlerinin kaç tanesi 'R' veya r karakteri ile biter?
-- ->  !! Not: MySQL'de like keywordu case sensitive değildir...!!  <-----
select count(*) from sakila.city where city like ('%r');  -- -> result: 33