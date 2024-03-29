CREATE TABLE Albumes (
	id INT AUTO_INCREMENT,
	nombre VARCHAR(255) NOT NULL,
	autor VARCHAR(255) NOT NULL,
	anio INT,
	duracion VARCHAR(10),
	PRIMARY KEY (id)
);

CREATE TABLE Canciones (
	id INT AUTO_INCREMENT,
	titulo VARCHAR(255) NOT NULL,
	autor VARCHAR(255) NOT NULL,
	album_id INT NOT NULL,
	anio INT,
	duracion VARCHAR(10),
	precio FLOAT,
	PRIMARY KEY (id),
	FOREIGN KEY (album_id) REFERENCES Albumes(id)
);

CREATE TABLE Usuarios (
  id INT AUTO_INCREMENT,
  nombre VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  mensaje VARCHAR(255),
  PRIMARY KEY (id)
);

CREATE TABLE Listas (
	id INT AUTO_INCREMENT,
	nombre VARCHAR(255) NOT NULL,
	cancion INT,
	PRIMARY KEY (id),
	FOREIGN KEY (cancion) REFERENCES Canciones(id)
);

INSERT INTO Albumes (nombre, autor, anio, duracion)
VALUES ('Guitar Gansters & Cadillac Blood', 'Volbeat', 2008, '48:00');
INSERT INTO Albumes (nombre, autor, anio, duracion)
VALUES ('One-X', 'Three Days Grace', 2006, '43:00');

INSERT INTO Canciones (titulo, autor, album_id, anio, duracion, precio)
VALUES ('Still Counting', 'Volbeat', 1, 2008, '4:21', 3.99);
INSERT INTO Canciones (titulo, autor, album_id, anio, duracion, precio)
VALUES ('Pain', 'Three Days Grace', 2, 2006, '3:22', 4.50);
INSERT INTO Canciones (titulo, autor, album_id, anio, duracion, precio)
VALUES ('Animal I Have Become', 'Three Days Grace', 2, 2006, '3:51', 4.50);

INSERT INTO Usuarios (nombre, password)
VALUES ('Perico', 'Palotes');
INSERT INTO Usuarios (nombre, password)
VALUES ('Periquito', 'Palos');

INSERT INTO Listas(nombre, cancion)
VALUES ('Mix2017',2);
INSERT INTO Listas(nombre)
VALUES ('Perquito');
