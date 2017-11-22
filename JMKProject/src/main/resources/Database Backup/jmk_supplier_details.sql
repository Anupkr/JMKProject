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
-- Table structure for table `supplier_details`
--

DROP TABLE IF EXISTS `supplier_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `address1` varchar(100) DEFAULT NULL,
  `address2` varchar(100) DEFAULT NULL,
  `mobile1` varchar(45) DEFAULT NULL,
  `mobile2` varchar(45) DEFAULT NULL,
  `arrival_type` varchar(45) DEFAULT NULL,
  `email_id` varchar(45) DEFAULT NULL,
  `id_type` varchar(45) DEFAULT NULL,
  `id_number` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `mobile1_UNIQUE` (`mobile1`),
  UNIQUE KEY `mobile2_UNIQUE` (`mobile2`),
  UNIQUE KEY `email_id_UNIQUE` (`email_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier_details`
--

LOCK TABLES `supplier_details` WRITE;
/*!40000 ALTER TABLE `supplier_details` DISABLE KEYS */;
INSERT INTO `supplier_details` VALUES (1,'Mulayam','Tetulmari,Dhanbad,Jharkhand','Hyderabad','8235165187','8745879865','Party Stock','abcd@gmail.com','ADHAR','546981798789'),(2,'Anup Kumar','dhanbad','jfklajl','7897917987','879817987','Self Purchase','anup@gmail.com','ADHAR','564654168464'),(3,'Junaid','dhanbad','jfklajl','9874884578','9478541256','Self Purchase','junaid@gmail.com','ADHAR','564654168464'),(4,'Sumit Kumar','Dhanbad','Dhanbad','654164654','65465465','Party Stock','sumit@gmaill.com','ADHAR','54654654'),(5,'Pranav','abc','abc','5611798798','879817','Self Purchase','987987','ADHAR','345345345'),(8,'Deepak','abc','abc','78547855447','8798177845','Self Purchase','a@gmail.com','ADHAR','345345345'),(9,'Mukesh','abc','abc','78547855433','8798177842','Self Purchase','ab@gmail.com','ADHAR','345345345'),(10,'Suresh','fasfd','fasdd','78965478','888888887','Party Stock','abc@gmail.com','ADHAR','465465465'),(12,'Murari','fasjkh','fhasjkh','78964878','798798145','Party Stock','m@gmail.com','ADHAR','5456456'),(14,'Ajeet','54654','4654','78975547','8785645498','Party Stock','aj@gamail.com','ADHAR','545'),(19,'Ajeet','54654','4654','789755473','87856454983','Party Stock','aaj@gamail.com','ADHAR','545');
/*!40000 ALTER TABLE `supplier_details` ENABLE KEYS */;
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
