-- --------------------------------------------------------
-- Anfitrião:                    127.0.0.1
-- Versão do servidor:           8.0.23 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Versão:              11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for dbpos
DROP DATABASE IF EXISTS `dbpos`;
CREATE DATABASE IF NOT EXISTS `dbpos` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `dbpos`;

-- Dumping structure for table dbpos.detalhe
DROP TABLE IF EXISTS `detalhe`;
CREATE TABLE IF NOT EXISTS `detalhe` (
  `iddetalhe` int NOT NULL AUTO_INCREMENT,
  `idpedido` int NOT NULL DEFAULT '0',
  `descricao` varchar(20) NOT NULL DEFAULT '0',
  `quantidade` int NOT NULL DEFAULT '0',
  `preco` float NOT NULL DEFAULT '0',
  PRIMARY KEY (`iddetalhe`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table dbpos.detalhe: ~5 rows (approximately)
/*!40000 ALTER TABLE `detalhe` DISABLE KEYS */;
REPLACE INTO `detalhe` (`iddetalhe`, `idpedido`, `descricao`, `quantidade`, `preco`) VALUES
	(1, 3, 'Galão', 1, 0.95),
	(2, 3, 'Descafeinado', 1, 0.7),
	(3, 3, 'Carioca', 1, 0.95),
	(4, 3, 'Salgado', 1, 1.3),
	(5, 3, 'Bolo', 1, 1.6);
/*!40000 ALTER TABLE `detalhe` ENABLE KEYS */;

-- Dumping structure for table dbpos.pedidos
DROP TABLE IF EXISTS `pedidos`;
CREATE TABLE IF NOT EXISTS `pedidos` (
  `idpedido` int NOT NULL AUTO_INCREMENT,
  `data` varchar(10) DEFAULT NULL,
  `total` float DEFAULT NULL,
  PRIMARY KEY (`idpedido`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table dbpos.pedidos: ~3 rows (approximately)
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
REPLACE INTO `pedidos` (`idpedido`, `data`, `total`) VALUES
	(1, '04-02-2021', 6.1),
	(2, '04-02-2021', 4.15),
	(3, '04-02-2021', 5.5);
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
