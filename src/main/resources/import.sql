INSERT INTO "user" (login, password, first_name, last_name) VALUES ('admin', '123456', 'walter', 'white');
INSERT INTO "user" (login, password, first_name, last_name) VALUES ('user', '123456', 'jesse', 'pinkman');

INSERT INTO "role" (name) VALUES ('ROLE_ADMIN');
INSERT INTO "role" (name) VALUES ('ROLE_USER');

INSERT INTO "user_role" (user_id, role_id) VALUES (1, 1);
INSERT INTO "user_role" (user_id, role_id) VALUES (1, 2);
INSERT INTO "user_role" (user_id, role_id) VALUES (2, 2);

INSERT INTO "category" (title, link) VALUES ('Men', 'men');
INSERT INTO "category" (title, link) VALUES ('Women', 'women');
INSERT INTO "category" (title, link) VALUES ('Kids', 'kids');

INSERT INTO "post" (title, link, is_active, image_link, is_slider, text, author_id, created_date) VALUES ('1 Blog Post Title', '1-blog-link', true, 'images/bnr-1.jpg', true, 'Smartwatches require pairing to a smartphone for notification functionality. It’s important to understand that not all smartwatches will work with all smartphones. Most smartwatches are compatible with an Android or iOS device, or, in some instances, both. Some have their own operating systems and will only work with specific devices of the same brand. Others might be compatible with a select variety of operating systems. Since smartwatches are devised to accompany your smartphone, you’ll want to be sure it’s compatible with your phones existing operating system.', 1, '2017-01-01 03:14:07');
INSERT INTO "post" (title, link, is_active, image_link, is_slider, text, author_id, created_date) VALUES ('2 Blog Post Title', '2-blog-link', true, 'images/bnr-2.jpg', false, 'When choosing a smartwatch operating system, there are a few things to consider beyond basic compatibility. For the most part, Android Wear and Watch OS are more similar than not. Watch OS has a reputation for being quick, clean and consistent. Only apps that go through Apple''s strict approval process get released. Android Wear uses an open-source model, creating many customization options.', 2, '2017-01-01 03:14:07');
INSERT INTO "post" (title, link, is_active, image_link, is_slider, text, author_id, created_date) VALUES ('3 Blog Post Title', '3-blog-link', true, 'images/bnr-3.jpg', true, 'Tizen is a newer operating system used by Samsung and is similar to Android Wear. It too is an open-source platform for smartwatches, smartphones, tablets and more. Tizen has its own applications and allows for a user experience that you can take from device to device. The Microsoft Band 2 uses the Windows 10 operating system to deliver notifications, e-mail preview and calendar notifications. The Band will work with iOS, Android and Windows phone. When paired with Windows phone 8.1, Microsoft Band 2 also supports Cortana personal digital assistant functionality.', 1, '2017-01-01 03:14:07');
INSERT INTO "post" (title, link, is_active, image_link, is_slider, text, author_id, created_date) VALUES ('4 Blog Post Title', '4-blog-link', true, 'images/bnr-3.jpg', false, 'Samsung and is similar to Android Wear. When choosing a smartwatch operating system, there are a few things to consider beyond basic compatibility. For the most part, Android Wear and Watch OS are, It too is an open-source platform for smartwatches, smartphones, tablets and more. Tizen has its own applications and allows for a user experience that you can take from device to device. The Microsoft Band 2 uses the Windows 10 operating system to deliver notifications, e-mail preview and calendar notifications. The Band will work with iOS, Android and Windows phone. When paired with Windows phone 8.1, Microsoft Band 2 also supports Cortana personal digital assistant functionality.', 1, '2017-01-01 03:14:07');
INSERT INTO "post" (title, link, is_active, image_link, is_slider, text, author_id, created_date) VALUES ('5 Blog Post Title', '5-blog-link', true, 'images/bnr-1.jpg', true, 'To a smartphone operating system for notification functionality. It’s important to understand that not all smartwatches will work with all smartphones. Most smartwatches are compatible with an Android or iOS device, or, in some instances, both. Some have their own operating systems and will only work with specific devices of the same brand. Others might be compatible with a select variety of operating systems. Since smartwatches are devised to accompany your smartphone, you’ll want to be sure it’s compatible with your phones existing operating system.', 1, '2017-01-01 03:14:07');

INSERT INTO "product" (title, price, text, discount) VALUES ('INVICTA', 1099.00, 'BAUME ET MERCIER Baume and Mercier Hampton Silver Dial Brown Leather Ladies Watch', 0);
INSERT INTO "product" (title, price, text, discount) VALUES ('AUDEMARS PIGUET', 1195.00, 'BAUME ET MERCIER Baume and Mercier Hampton Silver Dial Brown Leather Ladies Watch', 0);
INSERT INTO "product" (title, price, text, discount) VALUES ('CITIZEN', 3575.00, 'BAUME ET MERCIER Baume and Mercier Hampton Silver Dial Brown Leather Ladies Watch', 10);
INSERT INTO "product" (title, price, text, discount) VALUES ('GLYCINE', 318.00, 'BAUME ET MERCIER Baume and Mercier Hampton Silver Dial Brown Leather Ladies Watch', 15);
INSERT INTO "product" (title, price, text, discount) VALUES ('AUDEMARS PIGUET', 199.00, 'BAUME ET MERCIER Baume and Mercier Hampton Silver Dial Brown Leather Ladies Watch', 5);
INSERT INTO "product" (title, price, text, discount) VALUES ('SEVENFRIDAY', 1895.00, 'BAUME ET MERCIER Baume and Mercier Hampton Silver Dial Brown Leather Ladies Watch', 2);
INSERT INTO "product" (title, price, text, discount) VALUES ('BAUME ET MERCIER', 1495.00, 'BAUME ET MERCIER Baume and Mercier Hampton Silver Dial Brown Leather Ladies Watch', 0);
INSERT INTO "product" (title, price, text, discount) VALUES ('BAUME ET MERCIER', 1540.00, 'BAUME ET MERCIER Baume and Mercier Hampton Silver Dial Brown Leather Ladies Watch', 0);
INSERT INTO "product" (title, price, text, discount) VALUES ('SEVENFRIDAY', 1895.00, 'BAUME ET MERCIER Baume and Mercier Hampton Silver Dial Brown Leather Ladies Watch', 50);
INSERT INTO "product" (title, price, text, discount) VALUES ('AUDEMARS PIGUET', 318.00, 'BAUME ET MERCIER Baume and Mercier Hampton Silver Dial Brown Leather Ladies Watch', 10);
INSERT INTO "product" (title, price, text, discount) VALUES ('GLYCINE', 3575.00, 'BAUME ET MERCIER Baume and Mercier Hampton Silver Dial Brown Leather Ladies Watch', 0);
INSERT INTO "product" (title, price, text, discount) VALUES ('CITIZEN', 1195.00, 'BAUME ET MERCIER Baume and Mercier Hampton Silver Dial Brown Leather Ladies Watch', 10);
INSERT INTO "product" (title, price, text, discount) VALUES ('AUDEMARS PIGUET', 1099.00, 'BAUME ET MERCIER Baume and Mercier Hampton Silver Dial Brown Leather Ladies Watch', 8);

INSERT INTO "image" (link, alt, product_id) VALUES ('images/s-1.jpg', 'Good 1 Watch!', 1);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/s-2.jpg', 'Good 2 Watch!', 1);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/s-3.jpg', 'Good 3 Watch!', 1);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/p-2.png', 'Good 2 Watch!', 2);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/p-3.png', 'Good 3 Watch!', 3);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/p-4.png', 'Good 4 Watch!', 4);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/p-5.png', 'Good 5 Watch!', 5);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/p-6.png', 'Good 6 Watch!', 6);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/p-7.png', 'Good 7 Watch!', 7);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/p-16.jpg', 'Good 8 Watch!', 8);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/p-17.jpg', 'Good 9 Watch!', 9);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/p-10.jpeg', 'Good 10 Watch!', 10);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/p-11.jpg', 'Good 11 Watch!', 11);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/p-12.jpg', 'Good 12 Watch!', 12);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/p-13.jpg', 'Good 13 Watch!', 10);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/p-14.jpg', 'Good 14 Watch!', 11);
INSERT INTO "image" (link, alt, product_id) VALUES ('images/p-15.jpg', 'Good 15 Watch!', 13);

INSERT INTO "category_product" (product_id, category_id) VALUES (1, 1);
INSERT INTO "category_product" (product_id, category_id) VALUES (2, 2);
INSERT INTO "category_product" (product_id, category_id) VALUES (3, 1);
INSERT INTO "category_product" (product_id, category_id) VALUES (4, 3);
INSERT INTO "category_product" (product_id, category_id) VALUES (5, 3);
INSERT INTO "category_product" (product_id, category_id) VALUES (6, 2);
INSERT INTO "category_product" (product_id, category_id) VALUES (7, 1);
INSERT INTO "category_product" (product_id, category_id) VALUES (8, 1);
INSERT INTO "category_product" (product_id, category_id) VALUES (9, 1);
INSERT INTO "category_product" (product_id, category_id) VALUES (10, 1);
INSERT INTO "category_product" (product_id, category_id) VALUES (11, 1);
INSERT INTO "category_product" (product_id, category_id) VALUES (12, 1);
INSERT INTO "category_product" (product_id, category_id) VALUES (13, 1);
