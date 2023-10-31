


CREATE TABLE vehiculos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    placa VARCHAR(6) NOT NULL,
    hora_entrada INT NOT NULL,
    hora_salida INT,
    ubicacion VARCHAR(255),
    tipo_vehiculo VARCHAR(20)
);

CREATE TABLE tipos_vehiculo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL
);
