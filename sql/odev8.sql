-- app.patika.dev/aibozlak

-- Ödev 8:
/* 1) test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan 
      bir tablo oluşturalım. */
create table employees (
		employee_id integer primary key,
    name varchar(50) not null,
    birthday date,
    email varchar(100)
);

/* 2) Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim. */
insert into employees (employee_id, name, birthday, email) values (1, 'Casar Ovens', '1989-04-26', 'covens0@irs.gov');
insert into employees (employee_id, name, birthday, email) values (2, 'Rozalin Cannicott', '2001-04-11', 'rcannicott1@de.vu');
insert into employees (employee_id, name, birthday, email) values (3, 'Corbett Derycot', '2002-08-07', 'cderycot2@wsj.com');
insert into employees (employee_id, name, birthday, email) values (4, 'Tally Klimke', '1986-11-26', 'tklimke3@feedburner.com');
insert into employees (employee_id, name, birthday, email) values (5, 'Adriaens Petrelli', '1983-02-26', 'apetrelli4@vk.com');
insert into employees (employee_id, name, birthday, email) values (6, 'Fayina Matterface', '1985-06-08', 'fmatterface5@state.tx.us');
insert into employees (employee_id, name, birthday, email) values (7, 'Sonya Andreia', '1988-01-05', 'sandreia6@livejournal.com');
insert into employees (employee_id, name, birthday, email) values (8, 'Malcolm Avery', '1975-11-23', null);
insert into employees (employee_id, name, birthday, email) values (9, 'Marice Lehrahan', '1995-12-11', 'mlehrahan8@paypal.com');
insert into employees (employee_id, name, birthday, email) values (10, 'Tana Jost', '1981-04-29', 'tjost9@scientificamerican.com');
insert into employees (employee_id, name, birthday, email) values (11, 'Berky Gath', '1997-12-10', 'bgatha@shareasale.com');
insert into employees (employee_id, name, birthday, email) values (12, 'Nickola Kneebone', '1992-04-03', 'nkneeboneb@taobao.com');
insert into employees (employee_id, name, birthday, email) values (13, 'Charmain Spooner', null, 'cspoonerc@ovh.net');
insert into employees (employee_id, name, birthday, email) values (14, 'William Crottagh', '2000-11-19', 'wcrottaghd@addtoany.com');
insert into employees (employee_id, name, birthday, email) values (15, 'Lea Spoole', '1979-03-27', 'lspoolee@dailymotion.com');
insert into employees (employee_id, name, birthday, email) values (16, 'Bing Sharrem', '1995-02-10', 'bsharremf@opera.com');
insert into employees (employee_id, name, birthday, email) values (17, 'Caitrin Aldersey', null, 'calderseyg@oakley.com');
insert into employees (employee_id, name, birthday, email) values (18, 'Gilles MacGaughey', '1981-08-08', 'gmacgaugheyh@nydailynews.com');
insert into employees (employee_id, name, birthday, email) values (19, 'Allistir Flasby', '1982-06-12', 'aflasbyi@google.it');
insert into employees (employee_id, name, birthday, email) values (20, 'Sibyl Pelchat', '1991-09-22', null);
insert into employees (employee_id, name, birthday, email) values (21, 'Pauline Deery', null, 'pdeeryk@cpanel.net');
insert into employees (employee_id, name, birthday, email) values (22, 'Linea Yurocjhin', '1984-05-03', 'lyurocjhinl@ibm.com');
insert into employees (employee_id, name, birthday, email) values (23, 'Katinka Tiley', '1988-05-13', 'ktileym@multiply.com');
insert into employees (employee_id, name, birthday, email) values (24, 'Claire Iacobo', '2000-12-30', 'ciacobon@ft.com');
insert into employees (employee_id, name, birthday, email) values (25, 'Hazlett McFarland', '1997-04-17', 'hmcfarlando@ebay.com');
insert into employees (employee_id, name, birthday, email) values (26, 'Justinn Abramzon', '1993-01-31', 'jabramzonp@liveinternet.ru');
insert into employees (employee_id, name, birthday, email) values (27, 'Rivkah Addington', '1997-10-24', 'raddingtonq@bigcartel.com');
insert into employees (employee_id, name, birthday, email) values (28, 'Dex McCaughey', '1988-11-17', 'dmccaugheyr@businessinsider.com');
insert into employees (employee_id, name, birthday, email) values (29, 'Morgan Danielot', '1993-07-27', 'mdanielots@ftc.gov');
insert into employees (employee_id, name, birthday, email) values (30, 'Tulley Awcoate', '1986-07-18', null);
insert into employees (employee_id, name, birthday, email) values (31, 'Timothee Instrell', '1994-09-30', 'tinstrellu@java.com');
insert into employees (employee_id, name, birthday, email) values (32, 'Pierce Helbeck', '1991-11-03', 'phelbeckv@hubpages.com');
insert into employees (employee_id, name, birthday, email) values (33, 'Randene Kitman', '1996-08-30', 'rkitmanw@constantcontact.com');
insert into employees (employee_id, name, birthday, email) values (34, 'Mannie Grivori', '1998-09-07', 'mgrivorix@mediafire.com');
insert into employees (employee_id, name, birthday, email) values (35, 'Sargent Cadalleder', '1997-12-08', 'scadalledery@networksolutions.com');
insert into employees (employee_id, name, birthday, email) values (36, 'Sophi Rother', null, 'srotherz@dion.ne.jp');
insert into employees (employee_id, name, birthday, email) values (37, 'Tawsha Olpin', null, 'tolpin10@comsenz.com');
insert into employees (employee_id, name, birthday, email) values (38, 'Kalie Gallifont', '1999-08-13', 'kgallifont11@nature.com');
insert into employees (employee_id, name, birthday, email) values (39, 'Katharyn Guerra', '1978-02-04', 'kguerra12@comsenz.com');
insert into employees (employee_id, name, birthday, email) values (40, 'Dana Hannent', null, null);
insert into employees (employee_id, name, birthday, email) values (41, 'Waly Niemetz', '1998-12-26', 'wniemetz14@barnesandnoble.com');
insert into employees (employee_id, name, birthday, email) values (42, 'Wynn Reilinger', '2000-04-07', 'wreilinger15@mtv.com');
insert into employees (employee_id, name, birthday, email) values (43, 'Bruno Wooles', '2000-11-29', null);
insert into employees (employee_id, name, birthday, email) values (44, 'Leo Marklin', '1979-11-29', 'lmarklin17@businessweek.com');
insert into employees (employee_id, name, birthday, email) values (45, 'Marissa Hodgets', '2002-09-14', null);
insert into employees (employee_id, name, birthday, email) values (46, 'Tammie McGiven', '1995-03-15', 'tmcgiven19@sun.com');
insert into employees (employee_id, name, birthday, email) values (47, 'Fabio Haynesford', '1985-09-21', 'fhaynesford1a@tiny.cc');
insert into employees (employee_id, name, birthday, email) values (48, 'Donni Jarmyn', '1976-12-18', 'djarmyn1b@purevolume.com');
insert into employees (employee_id, name, birthday, email) values (49, 'Cordell Britnell', null, 'cbritnell1c@hao123.com');
insert into employees (employee_id, name, birthday, email) values (50, 'Chanda Van den Velde', '1979-12-13', null);

/* --------------------------------------------------------------------------------------------
   3) Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım. */
   
update employees set name = 'Ali Bozlak', birthday = '1992-01-20', email = 'bozlak@msn.com' where employee_id = 1;
update employees set email = 'lehrehan@paypal.com' where name = 'Marice Lehrahan'; -- <----- !! I must id (unic identity) ---------|
update employees set birthday = '1991-12-01' where employee_id = 31;
update employees set name = 'Ömer Bozlak', email = 'omer666bozlak@example.com', birthday = '1999-01-31' where employee_id = 42;

select * from employees where name = 'Sophi Rother'; -- -> employee_id = 36
update employees set birthday = '1992-04-28' where employee_id = 36;


/* ---------------------------------------------------------------------------------------------
   4) Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım. */
   
select * from employees where name = 'Mannie Grivori';  -- -> id = 34
delete from employees where employee_id = 34;

select name, birthday from employees where birthday > '2002-04-20'; -- --> checked before delete..
delete from employees where birthday > '2002-04-20';

select * from employees where name = 'Malcolm Avery';  -- -> id = 8
delete from employees where employee_id = 8;

select * from employees where email = 'cspoonerc@ovh.net';  -- --> id = 13
delete from employees where employee_id = 13;
