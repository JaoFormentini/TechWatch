DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` varchar(250) NOT NULL,
  `login` varchar(250) NOT NULL,
  `password` longtext NOT NULL,
  `role` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login_UNIQUE` (`login`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
