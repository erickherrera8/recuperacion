CREATE DATABASE bibliotecavisual;

USE bibliotecavisual;

CREATE TABLE IF NOT EXISTS libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    isbn VARCHAR(50) NOT NULL,
    paginas INT NOT NULL,
    edicion INT NOT NULL,
    editorial VARCHAR(255) NOT NULL,
    lugar VARCHAR(255) NOT NULL,
    fecha_edicion VARCHAR(10) NOT NULL
);






DELIMITER $$
CREATE PROCEDURE AgregarLibro(
    IN p_titulo VARCHAR(255),
    IN p_autor VARCHAR(255),
    IN p_isbn VARCHAR(50),
    IN p_paginas INT,
    IN p_edicion INT,
    IN p_editorial VARCHAR(255),
    IN p_lugar VARCHAR(255),
    IN p_fecha_edicion VARCHAR(10)
)
BEGIN
    INSERT INTO libros (titulo, autor, isbn, paginas, edicion, editorial, lugar, fecha_edicion)
    VALUES (p_titulo, p_autor, p_isbn, p_paginas, p_edicion, p_editorial, p_lugar, p_fecha_edicion);
END$$






DELIMITER $$
CREATE PROCEDURE EditarLibro(
    IN p_id INT,
    IN p_titulo VARCHAR(255),
    IN p_autor VARCHAR(255),
    IN p_isbn VARCHAR(50),
    IN p_paginas INT,
    IN p_edicion INT,
    IN p_editorial VARCHAR(255),
    IN p_lugar VARCHAR(255),
    IN p_fecha_edicion VARCHAR(10)
)
BEGIN
    UPDATE libros
    SET titulo = p_titulo, autor = p_autor, isbn = p_isbn, paginas = p_paginas, edicion = p_edicion,
        editorial = p_editorial, lugar = p_lugar, fecha_edicion = p_fecha_edicion
    WHERE id = p_id;
END$$




DELIMITER $$
CREATE PROCEDURE EliminarLibro(IN p_id INT)
BEGIN
    DELETE FROM libros WHERE id = p_id;
END$$




CREATE PROCEDURE ListarLibros()
BEGIN
    SELECT * FROM libros
    ORDER BY titulo ASC;
END$$





DELIMITER $$
CREATE PROCEDURE BuscarLibrosPorTitulo(IN parteTitulo VARCHAR(255))
BEGIN
    SELECT * FROM libros WHERE titulo LIKE CONCAT('%', parteTitulo, '%');
END$$

DELIMITER ;
