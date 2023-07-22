-- Crear base de datos
CREATE database estudiantes;

-- Usar la base de datos
USE estudiantes;

-- Crear la tabla 
CREATE TABLE `estudiantes`.`estudiantes2022` (
  `idestudiantes2022` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`idestudiantes2022`));

-- Comenzamos con el CRUD: create(insertar), read(leer), update(actualizar), delete(eliminar)
-- Listar los estudiantes de la tabla
SELECT * FROM estudiantes.estudiantes2022;

-- Insertar estudiante
INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES ("Juan", "Perez", "23526362345", "juan@mail.com");

-- Actualizar estudiante
UPDATE estudiantes2022 SET nombre= "Juan Carlos", apellido="Garcia" WHERE idestudiantes2022=1;