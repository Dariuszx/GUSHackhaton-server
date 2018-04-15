INSERT INTO user(id, password, points, username) VALUES (1, 'poziom99', 0, 'Dariusz');
INSERT INTO user(id, password, points, username) VALUES (2, 'poziom99', 20, 'Michal');
INSERT INTO user(id, password, points, username) VALUES (3, 'poziom99', 30, 'Radek');
INSERT INTO user(id, password, points, username) VALUES (4, 'poziom99', 50, 'Konrad');
INSERT INTO user(id, password, points, username) VALUES (5, 'poziom99', 50, 'Kasia');
INSERT INTO user(id, password, points, username) VALUES (6, 'poziom99', 50, 'Zofia');
INSERT INTO user(id, password, points, username) VALUES (7, 'poziom99', 50, 'Julia');
INSERT INTO user(id, password, points, username) VALUES (8, 'poziom99', 50, 'Piotr');
INSERT INTO user(id, password, points, username) VALUES (9, 'poziom99', 50, 'Janusz');
INSERT INTO user(id, password, points, username) VALUES (10, 'poziom99', 50, 'Tomasz');


INSERT INTO product(id, name, points) VALUES ('000000000017', 'Mleko', 8);
INSERT INTO product(id, name) VALUES ('000000000024', 'Banan');
INSERT INTO product(id, name) VALUES ('000000000031', 'Jabłko');
INSERT INTO product(id, name) VALUES ('000000000048', 'Lays');
INSERT INTO product(id, name) VALUES ('000000000055', 'Nutella');
INSERT INTO product(id, name) VALUES ('000000000062', 'Sok marchwiowy');
INSERT INTO product(id, name) VALUES ('000000000079', 'Kawa');
INSERT INTO product(id, name) VALUES ('000000000086', 'Herbata');
INSERT INTO product(id, name) VALUES ('000000000093', 'Arbuz');

INSERT INTO nutritional_value(id, calories, carbohydrate, fat, protein, sugar, fk_product_id) VALUES (1, 64, 5, 3.5, 3.3, 4, '000000000017');

INSERT INTO question(id, question) VALUES (1, 'Janek pracuje na umowie śmieciowej i zarabia 6zł/godzinę ile kupi za to jabłek po miesiącu pracy?');

INSERT INTO answer(id, is_correct, value, question_id) VALUES (1, 1, '1000 kg', 1);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (2, 0, '100 kg', 1);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (3, 0, '10 kg', 1);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (4, 0, '380 kg', 1);

INSERT INTO question(id, question) VALUES (2, 'What is BESTthe answer?');

INSERT INTO answer(id, is_correct, value, question_id) VALUES (5, 0, 'A', 2);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (6, 0, 'B', 2);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (7, 1, 'C', 2);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (8, 0, 'D', 2);