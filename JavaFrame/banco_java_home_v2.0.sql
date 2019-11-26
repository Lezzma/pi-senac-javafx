-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.8-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para lojamoveis
CREATE DATABASE IF NOT EXISTS `lojamoveis` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `lojamoveis`;

-- Copiando estrutura para tabela lojamoveis.carrinho
CREATE TABLE IF NOT EXISTS `carrinho` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_prod` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_prod` (`id_prod`),
  CONSTRAINT `carrinho_ibfk_1` FOREIGN KEY (`id_prod`) REFERENCES `produto` (`id_prod`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela lojamoveis.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cpf` varchar(50) NOT NULL DEFAULT '',
  `nome` varchar(50) NOT NULL,
  `data_nasc` tinyblob DEFAULT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `cel` varchar(50) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `est_civil` varchar(50) DEFAULT NULL,
  `email` varchar(30) NOT NULL,
  `cep` varchar(50) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `rua` varchar(50) DEFAULT NULL,
  `complemento` char(2) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf_cli` (`cpf`),
  UNIQUE KEY `email_cli` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela lojamoveis.produto
CREATE TABLE IF NOT EXISTS `produto` (
  `id_prod` int(11) NOT NULL AUTO_INCREMENT,
  `nome_prod` varchar(50) NOT NULL,
  `descr_prod` varchar(100) DEFAULT NULL,
  `preco_prod` double(50,2) NOT NULL,
  `marca_prod` varchar(50) DEFAULT NULL,
  `qtde_estoq_prod` int(11) NOT NULL,
  `Codigo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_prod`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela lojamoveis.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usu` int(11) NOT NULL AUTO_INCREMENT,
  `nome_usu` varchar(50) NOT NULL,
  `rg_usu` int(10) NOT NULL,
  `cpf_usu` int(11) NOT NULL,
  `email_usu` varchar(20) NOT NULL,
  `senha_usu` varchar(50) NOT NULL,
  `setor_usu` enum('admin','vendedor') NOT NULL,
  PRIMARY KEY (`id_usu`),
  UNIQUE KEY `email_usu` (`email_usu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela lojamoveis.venda
CREATE TABLE IF NOT EXISTS `venda` (
  `id_venda` int(11) NOT NULL AUTO_INCREMENT,
  `id_cli` int(11) NOT NULL,
  `id_vendedor` int(11) DEFAULT NULL,
  `id_carrinho` int(11) NOT NULL,
  `valor_total` double(50,2) NOT NULL,
  `qtd_produtos` int(11) NOT NULL,
  `data_venda` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id_venda`),
  KEY `id_vendedor` (`id_vendedor`),
  KEY `id_cli` (`id_cli`),
  KEY `fk_carrinho` (`id_carrinho`),
  CONSTRAINT `fk_carrinho` FOREIGN KEY (`id_carrinho`) REFERENCES `carrinho` (`id`),
  CONSTRAINT `fk_cliente` FOREIGN KEY (`id_cli`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;

-- Exportação de dados foi desmarcado.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
