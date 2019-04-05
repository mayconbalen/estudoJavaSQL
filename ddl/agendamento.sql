CREATE TABLE `agendamento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `horarioinicial` datetime DEFAULT NULL,
  `horariofim` datetime DEFAULT NULL,
  `participante_id` int(11) DEFAULT NULL,
  `local` varchar(200) DEFAULT NULL,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
