create DATABASE librosh;

CREATE TABLE `librosh`.`libro` (
  `idlibro` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `autor` VARCHAR(45) NULL,
  `anioPublicacion` VARCHAR(4) NULL,
  `editorial` VARCHAR(15) NULL,
  `sinopsis` LONGTEXT NULL,
  `tematica` VARCHAR(500) NULL,
  PRIMARY KEY (`idlibro`));