use db_system_stock;
SELECT DATABASE();

-- Agregar Usuarios --------------------------------------------------------------------

-- Usuario 1
INSERT INTO db_system_stock.user
(id_user,
enabled,
password,
user_name)
VALUES
(1,1,'$2a$10$AP0Rjbpndw4j1965RF3zZO3eZGMVA9aAFrsZQVvJnuXaX16p375A6',"luciano"); -- pass : moliterno

-- Usuario 2
INSERT INTO db_system_stock.user
(id_user,
enabled,
password,
user_name)
VALUES
(2,1,'$2a$10$2uQZmcq6Hr.GQQOGWEtPt.h0HN2PrS1Wfpz7956iMhNFt9WVPXugW',"braian"); -- pass: otondo
-- Usuario 3 
INSERT INTO db_system_stock.user
(id_user,
enabled,
password,
user_name)
VALUES
(3,1,'$2a$10$i7uQhiejMSfZGO.d7GLUte3Wtbh.IA/mL9YoZHJb.fqd202ofOVlC',"gustavo"); -- pass : siciliano
-- Agregar Roles
INSERT INTO db_system_stock.user_role
(id_user_role,
name_role,
user_id)
VALUES
(1,"ROLE_ADMIN",1);
INSERT INTO db_system_stock.user_role
(id_user_role,
name_role,
user_id)
VALUES
(2,"ROLE_ADMIN",2);
INSERT INTO db_system_stock.user_role
(id_user_role,
name_role,
user_id)
VALUES
(3,"ROLE_USER",3);

-- Agregar Productos ------------------------------------------
INSERT INTO `db_system_stock`.`product` (`id_product`, `name`, `selling_price`) VALUES
(1, 'Smartphone', 699.99),
(2, 'Laptop', 1199.99),
(3, 'Tablet', 499.99),
(4, 'Smartwatch', 199.99),
(5, 'Headphones', 149.99),
(6, 'Gaming Console', 299.99),
(7, 'Smart TV', 799.99),
(8, 'Bluetooth Speaker', 99.99),
(9, 'Digital Camera', 599.99),
(10, 'External Hard Drive', 89.99);

-- Insertar stocks correspondientes
INSERT INTO `db_system_stock`.`stock` (`id_stock`, `quantity`, `quantity_min`, `product_id`) VALUES
(1, 50, 5, 1),
(2, 30, 5, 2),
(3, 40, 5, 3),
(4, 60, 5, 4),
(5, 70, 5, 5),
(6, 20, 5, 6),
(7, 15, 5, 7),
(8, 80, 5, 8),
(9, 25, 5, 9),
(10, 100, 5, 10);