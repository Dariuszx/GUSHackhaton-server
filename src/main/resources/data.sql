INSERT INTO user(id, password, points, username) VALUES (1, 'poziom99', 0, 'dariusz');


INSERT INTO product(id, name) VALUES ('000000000017', 'Soplica');
INSERT INTO product(id, name) VALUES ('000000000024', 'Banan');
INSERT INTO product(id, name) VALUES ('000000000031', 'Jabłko');
INSERT INTO product(id, name) VALUES ('000000000048', 'Lays');
INSERT INTO product(id, name) VALUES ('000000000055', 'Nutella');
INSERT INTO product(id, name) VALUES ('000000000062', 'Sok marchwiowy');
INSERT INTO product(id, name) VALUES ('000000000079', 'Kawa');
INSERT INTO product(id, name) VALUES ('000000000086', 'Herbata');
INSERT INTO product(id, name) VALUES ('000000000093', 'Arbuz');

INSERT INTO nutritional_value(id, calories, carbohydrate, fat, protein, sugar, fk_product_id) VALUES (1, 0, 0, 0, 0, 0, '000000000017');

INSERT INTO question(id, question) VALUES (1, 'What is the answer?');

INSERT INTO answer(id, is_correct, value, question_id) VALUES (1, 0, 'A', 1);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (2, 0, 'B', 1);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (3, 1, 'C', 1);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (4, 0, 'D', 1);