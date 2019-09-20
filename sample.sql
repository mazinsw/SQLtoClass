SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `dbtest` ;
CREATE SCHEMA IF NOT EXISTS `dbtest` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `dbtest` ;

-- -----------------------------------------------------
-- Table `TEmpresas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TEmpresas` ;

CREATE TABLE IF NOT EXISTS `TEmpresas` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Fantasia` VARCHAR(100) NOT NULL COMMENT '[N:Nome fantasia][G:o]',
  `RazaoSocial` VARCHAR(100) NULL DEFAULT NULL COMMENT '[N:Razão social]',
  `Email` VARCHAR(60) NOT NULL COMMENT '[N:E-mail][G:o]',
  `Senha` VARCHAR(12) NOT NULL COMMENT '[P]',
  `CNPJ` VARCHAR(20) NULL DEFAULT NULL,
  `EstadoID` INT NOT NULL,
  `CidadeID` INT NOT NULL,
  `Endereco` VARCHAR(100) NULL,
  `Fone1` VARCHAR(12) NOT NULL,
  `Fone2` VARCHAR(12) NULL DEFAULT NULL,
  `Site` VARCHAR(100) NULL DEFAULT NULL,
  `GUID` VARCHAR(36) NULL DEFAULT NULL,
  `DataCadastro` DATETIME NOT NULL,
  `DataAtualizacao` DATETIME NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `Fantasia_UNIQUE` (`Fantasia` ASC),
  INDEX `IDX_Empresa_DataAtualizacao` (`DataAtualizacao` ASC),
  UNIQUE INDEX `CNPJ_UNIQUE` (`CNPJ` ASC),
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC),
  UNIQUE INDEX `GUID_UNIQUE` (`GUID` ASC))
ENGINE = InnoDB
COMMENT = 'Informações da empresa Informações da empresa Informações da empresa Informações da empresa Informações da empresa[N:Ámpresa|Empresas]';

-- -----------------------------------------------------
-- Table `TDispositivos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TDispositivos` ;

CREATE TABLE IF NOT EXISTS `TDispositivos` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `EmpresaID` INT NOT NULL,
  `DeviceID` VARCHAR(15) NOT NULL,
  `Type` ENUM('Computer', 'Tablet') NOT NULL COMMENT 'Tipo de dispositivo[N:Type of device][E:Personal computer|Portable tablet]',
  `Descricao` VARCHAR(45) NOT NULL COMMENT '[N:Descrição][S]',
  `Modelo` VARCHAR(45) NOT NULL,
  `DataCadastro` DATETIME NOT NULL,
  `DataAtualizacao` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `UK_Dispositivo` (`EmpresaID` ASC, `DeviceID` ASC),
  INDEX `IDX_Dispositivo_DataAtualizacao` (`DataAtualizacao` ASC),
  CONSTRAINT `FK_Dispositivo_Empresa`
    FOREIGN KEY (`EmpresaID`)
    REFERENCES `TEmpresas` (`ID`)
    ON DELETE SET NULL
    ON UPDATE CASCADE)
ENGINE = InnoDB
COMMENT = '[N:Device|Devices][G:o]';


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
