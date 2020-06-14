insert into users (id, login_name, password_hash, role_name) values (-1, 'user', 'PBKDF2WithHmacSHA256:2048:e9vXAAs/amAf2/PT/eVw2UbG6DcdtIZArf0FqMG8ClI=:UTOAQ8LsucZL3nua/RQj3VyDid3KhaSUFc5AaVI8T4A=', 'USER');
insert into users (id, login_name, password_hash, role_name) values (-2, 'manager', 'PBKDF2WithHmacSHA256:2048:e9vXAAs/amAf2/PT/eVw2UbG6DcdtIZArf0FqMG8ClI=:UTOAQ8LsucZL3nua/RQj3VyDid3KhaSUFc5AaVI8T4A=', 'MANAGER');
insert into users (id, login_name, password_hash, role_name) values (-3, 'admin', 'PBKDF2WithHmacSHA256:2048:e9vXAAs/amAf2/PT/eVw2UbG6DcdtIZArf0FqMG8ClI=:UTOAQ8LsucZL3nua/RQj3VyDid3KhaSUFc5AaVI8T4A=', 'ADMIN');

insert into stadiums (id, name, capacity,sponsor, city_id) values (-1, 'OpelArena', 29785, 'Comarch',-1);
insert into stadiums (id, name, capacity,sponsor, city_id) values (-2, 'BayArena', 30125, 'Bayern', -2);
insert into stadiums (id, name, capacity,sponsor, city_id) values (-3, 'ProArena', 28245, 'SAP',-3);
insert into stadiums (id, name, capacity,sponsor, city_id) values (-4, 'Bernadeu', 81044, 'Emirates', -4);
insert into stadiums (id, name, capacity,sponsor, city_id) values (-5, 'Wanda Metropalitona', 68000, 'Plus500', -4);
insert into stadiums (id, name, capacity,sponsor, city_id) values (-6, 'Camp Nou', 99354, 'Rakuten', -4);
insert into stadiums (id, name, capacity,sponsor, city_id) values (-7, 'Old Trafford', 77632, 'Chevrolet', -6);
insert into stadiums (id, name, capacity,sponsor, city_id) values (-8, 'Etihad', 54320, 'Etihad', -6);

insert into countries (id, country_name) values (-1,'Germany');
insert into countries (id, country_name) values (-2,'Spain');
insert into countries (id, country_name) values (-3,'Great Britain');




insert into cities (id, city_name, overview, country_id) values  (-1, 'Mainz', 'Old Family City',-1);
insert into cities (id, city_name, overview, country_id) values  (-2, 'Leverkusen', 'Small city, with hotel in the stadium',-1);
insert into cities (id, city_name, overview,country_id) values  (-3, 'Hoffeinhaim', 'City with 3000 thousand people',-1);
insert into cities (id, city_name, overview,country_id) values  ( -4,'Madrid', 'Two stadiums, best players', -2);
insert into cities (id, city_name, overview, country_id) values  ( -5,'Barcelona', 'Need to go, to see Messi in life', -2);
insert into cities (id, city_name, overview, country_id) values  ( -6,'Manchester', 'History vs Money, Two stadiums', -3);

insert into comments (id,user_id, stadium_id, comment) values (-1, -1, -4, 'great');

insert into plans (id, planed_date, description, stadium_name ) values (-1, to_date('05/09/2020', 'DD/MM/YYYY'), 'Cristiano in live  for Alianz', 'Alianz Stadium');
insert into plans (id, planed_date, description, stadium_name) values (-2, to_date('10/07/2020', 'DD/MM/YYYY'), 'New stadium of Atletico Madrid', 'Wanda Metropalitona');
insert into plans (id, planed_date, description,stadium_name) values (-3, to_date('19/08/2020', 'DD/MM/YYYY'), 'Liverpool future champions VOTE', 'Enfield');


insert into visits (id, title,visits_date,my_impression,stadium_id) values (-1, 'OpelArena', to_date('28/09/2019','DD/MM/YYYY'), 'first stadium, amazing atmosphere', -1);
insert into visits (id, title,visits_date,my_impression,stadium_id) values (-2, 'BayArena',to_date('23/11/2019', 'DD/MM/YYYY'), 'i live on the stadium tribune', -2);
insert into visits (id, title,visits_date,my_impression,stadium_id) values (-3, 'Pro Arena',to_date('24/11/2019','DD/MM/YYYY') , 'stadium in the village with 3000 people, but on the game abou 290000', -3);
insert into visits (id, title,visits_date,my_impression,stadium_id) values (-4, 'Old Trafford', to_date('17/01/2020','DD/MM/YYYY'), 'Big big history', -7);
insert into visits (id, title,visits_date,my_impression,stadium_id) values (-5, 'Etihad', to_date('18/01/2020','DD/MM/YYYY'), 'a lot of Money, big money', -8);
insert into visits (id, title,visits_date,my_impression,stadium_id) values (-6, 'King Power', to_date('19/01/2020','DD/MM/YYYY'), 'Impossible is possible', -9);


insert into votes (id,user_id,stadium_id) values  (-1,-1, -10);