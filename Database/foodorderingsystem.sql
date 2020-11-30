-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 29, 2020 at 07:06 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `foodorderingsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `orderbill`
--

CREATE TABLE `orderbill` (
  `OrderID` int(10) NOT NULL,
  `OrderType` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orderbill`
--

INSERT INTO `orderbill` (`OrderID`, `OrderType`) VALUES
(1, 'take');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `ProductID` int(11) NOT NULL,
  `ProductDescription` varchar(100) NOT NULL,
  `ProductPrice` decimal(10,0) NOT NULL,
  `ProductQty` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`ProductID`, `ProductDescription`, `ProductPrice`, `ProductQty`) VALUES
(1, 'White Rice with Chicken', '130', 150),
(2, 'WhiteRice With Egg', '110', 150),
(3, 'BrownRice with Egg', '110', 150),
(4, 'Brown Rice with Chicken', '130', 150),
(5, 'Fried Rice with chicken', '210', 150),
(6, 'Fried Rice with Egg', '200', 150),
(7, 'Kottu with Chicken', '220', 150),
(8, 'Kottu with Egg', '190', 150),
(9, 'Kottu with Chicken and cheese', '260', 150),
(10, 'Chicken Burger', '200', 1),
(11, 'Submarine', '200', 1),
(12, 'Hot Dog', '150', 1),
(13, 'Pizza', '150', 1),
(14, 'Sandwich', '100', 1),
(15, 'Donut', '60', 1);

-- --------------------------------------------------------

--
-- Table structure for table `salesorder`
--

CREATE TABLE `salesorder` (
  `ItemNo` int(11) NOT NULL,
  `CustID` int(11) DEFAULT NULL,
  `Product` varchar(100) DEFAULT NULL,
  `QTY` int(11) DEFAULT NULL,
  `Total` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `salesorder`
--

INSERT INTO `salesorder` (`ItemNo`, `CustID`, `Product`, `QTY`, `Total`) VALUES
(105, 1000, 'Chicken Burger', 1, '200'),
(106, 1000, 'Submarine', 1, '200');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`ProductID`),
  ADD UNIQUE KEY `ProductID` (`ProductID`);

--
-- Indexes for table `salesorder`
--
ALTER TABLE `salesorder`
  ADD PRIMARY KEY (`ItemNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `salesorder`
--
ALTER TABLE `salesorder`
  MODIFY `ItemNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=107;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
