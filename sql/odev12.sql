-- ****** Ben MySQL indirdim. MySQL'de dvdrental'a benzer bir örnek database var : sakila. ******
-- Ödevi bunun üzerinden yapacağım.
-- app.patika.dev/aibozlak

-- Ödev 12:
-- 1) film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
select count(*) from film
where length > (select avg(length) from film);

-- 2) film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
select count(*) from film
where rental_rate = (select max(rental_rate) from film);

-- 3) film tablosunda en düşük rental_rate ve en düşük replacement_cost değerlerine sahip filmleri sıralayınız.
select * from film
where rental_rate = (select min(rental_rate) from film) 
and replacement_cost = (select min(replacement_cost) from film);

-- 4) payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
-- ---> JOIN kullanacağım. Başka bir çözümü varsa göremedim.. 
select count(payment.payment_id) as 'count of payment', customer.customer_id, customer.first_name, customer.last_name, customer.email
from payment left join customer on payment.customer_id = customer.customer_id
group by payment.customer_id
order by count(payment.payment_id) desc;