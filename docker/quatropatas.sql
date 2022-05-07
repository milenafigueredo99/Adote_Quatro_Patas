DROP DATABASE quatropatas;
CREATE DATABASE quatropatas;
use quatropatas;

 CREATE TABLE `pet` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `idade` INT NULL,
  `especie` VARCHAR(45) NULL,
  `genero` VARCHAR(45) NULL,
  `peso` double NULL,
  `porte` VARCHAR(45) NULL,
  `endereco` VARCHAR(45) NULL,
  `deficiencia` VARCHAR(3) NULL,
  PRIMARY KEY (`id`));
  
   CREATE TABLE `tutor` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `cpf` VARCHAR(45) NULL UNIQUE,
  `endereco` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `telefone` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));