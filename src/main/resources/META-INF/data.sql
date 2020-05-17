insert into users (id, login_name, password_hash, role_name) values (-1, 'user', 'PBKDF2WithHmacSHA256:2048:e9vXAAs/amAf2/PT/eVw2UbG6DcdtIZArf0FqMG8ClI=:UTOAQ8LsucZL3nua/RQj3VyDid3KhaSUFc5AaVI8T4A=', 'USER')
insert into users (id, login_name, password_hash, role_name) values (-2, 'manager', 'PBKDF2WithHmacSHA256:2048:e9vXAAs/amAf2/PT/eVw2UbG6DcdtIZArf0FqMG8ClI=:UTOAQ8LsucZL3nua/RQj3VyDid3KhaSUFc5AaVI8T4A=', 'MANAGER')
insert into users (id, login_name, password_hash, role_name) values (-3, 'admin', 'PBKDF2WithHmacSHA256:2048:e9vXAAs/amAf2/PT/eVw2UbG6DcdtIZArf0FqMG8ClI=:UTOAQ8LsucZL3nua/RQj3VyDid3KhaSUFc5AaVI8T4A=', 'ADMIN')

insert into stadiums (id, name, capacity,sponsor) values (1, 'OpelArena', 29785, 'Comarch');
insert into stadiums (id, name, capacity,sponsor) values (2, 'BayArena', 30125, 'Bayern');
insert into stadiums (id, name, capacity,sponsor) values (3, 'ProArena', 28245, 'SAP');

insert into cities (id, city_name, overview) values  (-1, 'Mainz', 'Old Family City');
insert into cities (id, city_name, overview) values  (-2, 'Leverkusen', 'Small city, with hotel in the stadium');
insert into cities (id, city_name, overview) values  (-3, 'Hoffeinhaim', 'City with 3000 thousand people');