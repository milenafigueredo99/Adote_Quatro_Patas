CREATE DATABASE quatropatas;
use quatropatas;

CREATE TABLE tutor(
    id integer PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45) NULL,
    cpf VARCHAR(45) NULL UNIQUE,
    cidade VARCHAR(45) NULL,
    estado VARCHAR(45) NULL,
    email VARCHAR(45) NULL,
    telefone VARCHAR(45) NULL
);

CREATE TABLE pet(
    id integer PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45) NULL,
    idade INT NULL,
    especie VARCHAR(45) NULL,
    genero VARCHAR(45) NULL,
    peso VARCHAR(45) NULL,
    porte VARCHAR(45) NULL,
    cidade VARCHAR(45) NULL,
    estado VARCHAR(45) NULL,
    deficiencia VARCHAR(3) NULL,
    adotado boolean,
    tutor_id integer,
    CONSTRAINT fk_tutorPet FOREIGN KEY (tutor_id) REFERENCES tutor (id)
    );