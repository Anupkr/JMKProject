-- MySQL dump 10.13  Distrib 5.7.19, for Linux (x86_64)
--
-- Host: localhost    Database: jmk
-- ------------------------------------------------------
-- Server version	5.7.19-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `container_account`
--

DROP TABLE IF EXISTS `container_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `container_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `transaction_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `container_id` int(11) NOT NULL,
  `credit` int(11) NOT NULL,
  `debit` int(11) NOT NULL,
  `sec_money` int(11) NOT NULL,
  `current_balance` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_container_account_transaction_id` (`transaction_id`),
  KEY `fk_container_account_customer_id_idx` (`customer_id`),
  KEY `fk_container_account_container_id_idx` (`container_id`),
  CONSTRAINT `fk_container_account_container_id` FOREIGN KEY (`container_id`) REFERENCES `containers` (`container_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_container_account_customer_id` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_container_account_transaction_id` FOREIGN KEY (`transaction_id`) REFERENCES `customer_account` (`transaction_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `container_account`
--

LOCK TABLES `container_account` WRITE;
/*!40000 ALTER TABLE `container_account` DISABLE KEYS */;
INSERT INTO `container_account` VALUES (10,47,26,1,2,0,100,0),(11,47,26,3,2,0,0,0),(12,48,26,1,2,0,100,0),(13,48,26,3,4,0,0,0),(14,48,26,1,5,0,100,0),(15,50,27,1,4,0,100,0),(16,53,26,1,2,0,100,0),(17,53,27,1,2,0,100,0),(18,59,26,1,2,0,100,0),(19,60,26,1,15,0,100,0),(20,61,26,1,12,0,100,0),(21,61,26,1,20,0,100,0),(22,67,26,1,20,0,100,0),(23,68,26,1,10,0,100,0),(24,68,26,1,2,0,100,0),(28,77,26,1,0,2,100,0),(29,78,26,1,0,10,100,0),(31,80,26,1,0,5,100,0),(32,81,26,1,0,10,100,0),(33,87,26,1,0,5,100,0),(34,88,26,1,2,0,100,0),(35,88,26,1,15,0,100,0),(36,88,26,3,15,0,0,0),(37,90,26,1,0,7,100,0);
/*!40000 ALTER TABLE `container_account` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-24  8:16:54
