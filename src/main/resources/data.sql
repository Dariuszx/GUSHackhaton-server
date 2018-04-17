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


INSERT INTO product(id, name, points, health_indicator, code) VALUES ('000000000017', 'Chleb', 3, 8, 'CP01113A');
INSERT INTO product(id, name, points, health_indicator, code) VALUES ('000000000024', 'Jajko', 5, 7, 'CP01147A');
INSERT INTO product(id, name, points, health_indicator, code) VALUES ('000000000031', 'Platki sniadaniowe', 15, 9, 'CP01112B');
INSERT INTO product(id, name, points, health_indicator, code) VALUES ('000000000048', 'Losos', 25, 7, 'CP01131A');
INSERT INTO product(id, name, points, health_indicator, code) VALUES ('000000000055', 'Ryz', 5, 4, 'CP01111A');
INSERT INTO product(id, name, points, health_indicator, code) VALUES ('000000000062', 'Oliwki', 15, 8, 'CP01153A');
INSERT INTO product(id, name, points, health_indicator, code) VALUES ('000000000079', 'Ser', 8, 4, 'CP01145A');

INSERT INTO nutritional_value(id, calories, carbohydrate, fat, protein, sugar, fk_product_id) VALUES (1, 264, 49, 3.2, 9, 5, '000000000017');

INSERT INTO nutritional_value(id, calories, carbohydrate, fat, protein, sugar, fk_product_id) VALUES (2, 155, 1.1, 11, 13, 1.1, '000000000024');
INSERT INTO nutritional_value(id, calories, carbohydrate, fat, protein, sugar, fk_product_id) VALUES (3, 357, 84, 0.4, 8, 10, '000000000031');
INSERT INTO nutritional_value(id, calories, carbohydrate, fat, protein, sugar, fk_product_id) VALUES (4, 208, 0, 13, 20, 0, '000000000048');
INSERT INTO nutritional_value(id, calories, carbohydrate, fat, protein, sugar, fk_product_id) VALUES (5, 130, 28, 0.3, 2.7, 0.1, '000000000055');
INSERT INTO nutritional_value(id, calories, carbohydrate, fat, protein, sugar, fk_product_id) VALUES (6, 115, 6, 11, 0.8, 0, '000000000062');
INSERT INTO nutritional_value(id, calories, carbohydrate, fat, protein, sugar, fk_product_id) VALUES (7, 402, 1.3, 33, 25, 0.5, '000000000079');


INSERT INTO question(id, question) VALUES (1, 'Gdzie najtaniej mozna kupic jajka?');

INSERT INTO answer(id, is_correct, value, question_id) VALUES (1, 1, 'Hiszpania', 1);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (2, 0, 'Chorwacja', 1);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (3, 0, 'Polska', 1);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (4, 0, 'Wlochy', 1);

INSERT INTO question(id, question) VALUES (2, 'Który z poznizszych produktow ma najwyzsza wartosc energetyczna?');

INSERT INTO answer(id, is_correct, value, question_id) VALUES (5, 0, 'Platki sniadaniowe', 2);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (6, 0, 'Ryz', 2);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (7, 1, 'Ser', 2);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (8, 0, 'Jajka', 2);

INSERT INTO question(id, question) VALUES (3, 'Losos to ryba bogata w nienasycone kwasy tluszczowe. W jakim kraju mozna ja kupic najtaniej?');

INSERT INTO answer(id, is_correct, value, question_id) VALUES (9, 0, 'Wlochy', 3);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (10, 0, 'Polska', 3);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (11, 1, 'Chorwacja', 3);
INSERT INTO answer(id, is_correct, value, question_id) VALUES (12, 0, 'Hiszpiania', 3);

INSERT INTO question_dependency(dependency_id, question_id) VALUES (3, 2);