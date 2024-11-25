DROP TABLE IF EXISTS `computador`;
CREATE TABLE `computador` (
  `id` int NOT NULL AUTO_INCREMENT,
  `mac` varchar(45) NOT NULL,
  `local_host_name` varchar(45) NOT NULL,
  `data_de_instalacao` varchar(45) NOT NULL,
  `processador` varchar(50) NOT NULL,
  `ram_size` double NOT NULL,
  `sistema_operacional` varchar(50) NOT NULL,
  `ip` varchar(45) NOT NULL,
  `loja` varchar(5) NOT NULL,
  `data_atual` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
