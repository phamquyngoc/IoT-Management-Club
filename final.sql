-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: gms
-- ------------------------------------------------------
-- Server version	8.0.41

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `info`
--

DROP TABLE IF EXISTS `info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `info` (
  `idInfo` int DEFAULT NULL,
  `history` varchar(8000) DEFAULT NULL,
  `achive` varchar(6000) DEFAULT NULL,
  `contact` varchar(2000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `info`
--

LOCK TABLES `info` WRITE;
/*!40000 ALTER TABLE `info` DISABLE KEYS */;
INSERT INTO `info` VALUES (NULL,'','',''),(NULL,'','',''),(NULL,'','',''),(NULL,'','',''),(NULL,'','',''),(1,'Câu lạc bộ IoT được thành lập vào ngày 6 tháng 5 năm 2025 bởi một đội ngũ sinh viên có niềm đam mê mãnh liệt với sáng tạo, tìm tòi và nghiên cứu. Câu lạc bộ ban đầu đơn thuần chỉ là tập hợp những sinh viên có chung đam mê với IoT, giờ đây, CLB đã trở thành một nơi giao lưu, mua bán và là nơi chọn mặt gửi vàng của hầu hết các công ty, tập đoàn lớn tại Việt Nam cũng như trên thế giới. ','- Bằng khen của Thủ tướng Chính phủ\n- Bằng khen của Bộ trưởng Bộ Khoa học công nghệ\n- Đối tác hàng đầu của Tập đoàn công nghệ Viettel\n- Nguồn cung số 1 cho Công ty Hwawei','Phạm Quý Ngọc - B21DCVT328\nTrần Hiền Lương - B21DCVT280\nNgô Văn Hải - B21DCVT176\nLương Ngọc Duy - B21DCVT160'),(1,'Câu lạc bộ IoT được thành lập vào ngày 6 tháng 5 năm 2025 bởi một đội ngũ sinh viên có niềm đam mê mãnh liệt với sáng tạo, tìm tòi và nghiên cứu. Câu lạc bộ ban đầu đơn thuần chỉ là tập hợp những sinh viên có chung đam mê với IoT, giờ đây, CLB đã trở thành một nơi giao lưu, mua bán và là nơi chọn mặt gửi vàng của hầu hết các công ty, tập đoàn lớn tại Việt Nam cũng như trên thế giới. ','- Bằng khen của Thủ tướng Chính phủ\n- Bằng khen của Bộ trưởng Bộ Khoa học công nghệ\n- Đối tác hàng đầu của Tập đoàn công nghệ Viettel\n- Nguồn cung số 1 cho Công ty Hwawei','Phạm Quý Ngọc - B21DCVT328\nTrần Hiền Lương - B21DCVT280\nNgô Văn Hải - B21DCVT176\nLương Ngọc Duy - B21DCVT160');
/*!40000 ALTER TABLE `info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `idMem` int NOT NULL,
  `nameMem` varchar(200) DEFAULT NULL,
  `mobileNum` bigint DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `idCard` bigint DEFAULT NULL,
  `age` int DEFAULT NULL,
  PRIMARY KEY (`idMem`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'Phạm Quý Ngọc',965280925,'phamngoc@gmail.com','Nam',12334543546543,22),(2,'Trần Hiền Lương ',232323343,'luongdan@gmail.com','Nam',32424232423,22),(3,'Ngô Văn Hải',2423422243,'nghai@gmail.com','Nam',32432423424,23),(4,'Lương Ngọc Duy',23424234,'ngduy@gmail.com','Nam',23423423424,33),(5,'Trần Thị B',23424223423,'bnfh@gmail.com','Nữ',243242424,23),(6,'Nguyễn Văn A',234242443,'ddff@gmail.com','Nam',4324324234,33);
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `news` (
  `idNews` int DEFAULT NULL,
  `header` varchar(400) DEFAULT NULL,
  `text` varchar(8000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (1,'Cập nhật dự án Nhà kính thông minh Green House','Dự án Nhà kính thông minh Green House đang đi đến những bước hoàn thiện cuối cùng. Hiện tại, đội ngũ phát triển phần mềm đang gặp một số trục trặc liên quan đến việc gửi dữ liệu về điện thoại'),(2,'Thông báo danh sách các nhà tài trợ cho CLB','Tập đoàn FPT\nTập đoàn Toyota\nTập đoàn Samsung\nCông ty Apple'),(3,'Thông báo tuyển thành viên cho CLB','Những ai có đam mê với tìm tòi, nghiên cứu, thích tìm hiểu những công nghệ mới trên thế giới, hãy đến với CLB chúng tôi, bạn sẽ được phát triển toàn diện về mọi mặt');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `idTrans` int NOT NULL,
  `idPro` int DEFAULT NULL,
  `date` date DEFAULT NULL,
  `persTrans` varchar(200) DEFAULT NULL,
  `sdt` bigint DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `cost` bigint DEFAULT NULL,
  `total` bigint DEFAULT '0',
  `namePro` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`idTrans`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (1,1,'2025-05-06','Viettel',3434343,'dfdsf@gmail.com',1000000,1000000,'Nhà thông minh Smart Home'),(2,2,'2025-05-06','FPT',23243244,'sds@fmail.com',2000000,3000000,'Bãi đỗ xe thông minh');
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `idPro` int NOT NULL,
  `namePro` varchar(200) DEFAULT NULL,
  `idMem1` int DEFAULT NULL,
  `idMem2` int DEFAULT NULL,
  `idMem3` int DEFAULT NULL,
  `idMem4` int DEFAULT NULL,
  `moTa` varchar(1000) DEFAULT NULL,
  `giaTien` bigint DEFAULT NULL,
  `date` date DEFAULT NULL,
  `soLuong` int DEFAULT NULL,
  PRIMARY KEY (`idPro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Nhà thông minh Smart Home',1,2,3,4,'đây là sản phẩm đầu tay của CLB',1000000,'2025-06-05',1),(2,'Bãi đỗ xe thông minh',2,3,4,7,'Sản phẩm mới chỉ là demo',2000000,'2025-06-05',2),(3,'Hệ thống chiếu sáng thông minh',2,1,5,6,'hệ thống này là hệ thống cao cấp',34343434,'2025-06-06',2);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project` (
  `idPj` int NOT NULL,
  `namePj` varchar(200) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `idMem1` int DEFAULT NULL,
  `nameMem1` varchar(200) DEFAULT NULL,
  `idMem2` int DEFAULT NULL,
  `nameMem2` varchar(200) DEFAULT NULL,
  `idMem3` int DEFAULT NULL,
  `nameMem3` varchar(200) DEFAULT NULL,
  `idMem4` int DEFAULT NULL,
  `nameMem4` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idPj`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (1,'Nhà kính thông minh Green House','2025-07-07',1,'Phạm Quý Ngọc',2,'Trần Hiền Lương',3,'Ngô Văn Hải',4,'Lương Ngọc Duy'),(2,'Bể cá thông minh','2025-07-08',2,'Trần Hiền Lương',3,'Ngô Văn Hải',4,'Lương Ngọc Duy',5,'Trần Thị B');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-15 13:28:35
