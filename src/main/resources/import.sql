INSERT INTO "user" (login, password, first_name, last_name) VALUES ('admin', '123456', 'walter', 'white');
INSERT INTO "user" (login, password, first_name, last_name) VALUES ('user', '123456', 'jesse', 'pinkman');

INSERT INTO "category" (title, link) VALUES ('Men', '/men');
INSERT INTO "category" (title, link) VALUES ('Women', '/women');
INSERT INTO "category" (title, link) VALUES ('Kids', '/kids');

INSERT INTO "post" (title, link, is_active, image_link, is_slider, text, author_id, created_date) VALUES ('First Blog Post Title', '/1-blog-link', true, 'images/bnr-1.jpg', true, 'Smartwatches require pairing to a smartphone for notification functionality. It’s important to understand that not all smartwatches will work with all smartphones. Most smartwatches are compatible with an Android or iOS device, or, in some instances, both. Some have their own operating systems and will only work with specific devices of the same brand. Others might be compatible with a select variety of operating systems. Since smartwatches are devised to accompany your smartphone, you’ll want to be sure it’s compatible with your phones existing operating system.', 1, '2017-01-01 03:14:07');
INSERT INTO "post" (title, link, is_active, image_link, is_slider, text, author_id, created_date) VALUES ('Second Blog Post Title', '/2-blog-link', true, 'images/bnr-2.jpg', false, 'When choosing a smartwatch operating system, there are a few things to consider beyond basic compatibility. For the most part, Android Wear and Watch OS are more similar than not. Watch OS has a reputation for being quick, clean and consistent. Only apps that go through Apple''s strict approval process get released. Android Wear uses an open-source model, creating many customization options.', 2, '2017-01-01 03:14:07');
INSERT INTO "post" (title, link, is_active, image_link, is_slider, text, author_id, created_date) VALUES ('Third Blog Post Title', '/3-blog-link', true, 'images/bnr-3.jpg', true, 'Tizen is a newer operating system used by Samsung and is similar to Android Wear. It too is an open-source platform for smartwatches, smartphones, tablets and more. Tizen has its own applications and allows for a user experience that you can take from device to device. The Microsoft Band 2 uses the Windows 10 operating system to deliver notifications, e-mail preview and calendar notifications. The Band will work with iOS, Android and Windows phone. When paired with Windows phone 8.1, Microsoft Band 2 also supports Cortana personal digital assistant functionality.', 1, '2017-01-01 03:14:07');