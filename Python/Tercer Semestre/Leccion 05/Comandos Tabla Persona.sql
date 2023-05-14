/*Ver todos los datos de la tabla persona*/
SELECT * FROM persona

/*ver los datos de la tabla persona que sus id corresponden a*/
SELECT * FROM persona WHERE id_persona in (1,2)

--Insertar información
INSERT INTO persona(nombre, apellido,email) VALUES ('Susana', 'Lara', 'slara@mail.com');

--ACTUALIZAR INFORMACIÓN
UPDATE persona SET nombre = 'Ivone', apellido = 'Esperanza', email = 'iesperanza@mail.com'WHERE id_persona = 4

--Eliminar información
DELETE FROM persona WHERE id_persona = 4

