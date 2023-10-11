-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 04, 2023 at 05:22 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `blood_donation_center`
--

-- --------------------------------------------------------

--
-- Table structure for table `administrator`
--

DROP TABLE IF EXISTS `administrator`;
CREATE TABLE IF NOT EXISTS `administrator` (
  `Admin_ID` varchar(5) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `User_role` varchar(20) NOT NULL,
  `Tp` varchar(10) DEFAULT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(12) NOT NULL,
  PRIMARY KEY (`Admin_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `administrator`
--

INSERT INTO `administrator` (`Admin_ID`, `Name`, `Email`, `User_role`, `Tp`, `username`, `password`) VALUES
('002', 'Tashini Monasha', 'tashini@gmail.com', 'Nursing Officer', '0723000823', 'Tashini', '123'),
('001', 'sachi', 'sachi@gmail.com', 'Doctor', '0742563123', 'sachi', '123');

-- --------------------------------------------------------

--
-- Table structure for table `bloodcamp`
--

DROP TABLE IF EXISTS `bloodcamp`;
CREATE TABLE IF NOT EXISTS `bloodcamp` (
  `Camp_ID` int(11) NOT NULL,
  `Location` varchar(20) NOT NULL,
  `campdate` varchar(10) DEFAULT NULL,
  `starttime` varchar(7) DEFAULT NULL,
  `endtime` varchar(7) DEFAULT NULL,
  PRIMARY KEY (`Camp_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bloodcamp`
--

INSERT INTO `bloodcamp` (`Camp_ID`, `Location`, `campdate`, `starttime`, `endtime`) VALUES
(1, 'ahangama', '2023-10-03', '9.00am', '2.00pm');

-- --------------------------------------------------------

--
-- Table structure for table `bloodreciever`
--

DROP TABLE IF EXISTS `bloodreciever`;
CREATE TABLE IF NOT EXISTS `bloodreciever` (
  `Nicnumber` varchar(12) NOT NULL,
  `Name` varchar(40) NOT NULL,
  `Age` int(11) NOT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Email` varchar(30) NOT NULL,
  `TP` varchar(10) DEFAULT NULL,
  `bloodgroup` varchar(10) NOT NULL,
  PRIMARY KEY (`Nicnumber`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bloodreciever`
--

INSERT INTO `bloodreciever` (`Nicnumber`, `Name`, `Age`, `Address`, `Email`, `TP`, `bloodgroup`) VALUES
('200142563216', 'pasan', 26, 'panadura', 'pasan@gmail.com', '0745263123', 'B+'),
('2003702071', 'malindi chathumini', 23, 'mathara', 'mali@gmail.com', '0762050230', 'B+'),
('20053214523', 'naveen', 23, 'galle', 'naveen@gmail.com', '0782345671', 'O+');

-- --------------------------------------------------------

--
-- Table structure for table `bloodstock`
--

DROP TABLE IF EXISTS `bloodstock`;
CREATE TABLE IF NOT EXISTS `bloodstock` (
  `blood_group` varchar(10) NOT NULL,
  `stockcapacity` int(11) NOT NULL,
  PRIMARY KEY (`blood_group`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bloodstock`
--

INSERT INTO `bloodstock` (`blood_group`, `stockcapacity`) VALUES
('O-', 0),
('A+', 2),
('A-', 3),
('B+', 4),
('B-', 0),
('O+', 0),
('AB+', 0),
('AB-', 0);

-- --------------------------------------------------------

--
-- Table structure for table `doner`
--

DROP TABLE IF EXISTS `doner`;
CREATE TABLE IF NOT EXISTS `doner` (
  `D_ID` varchar(5) NOT NULL,
  `D_nic` varchar(15) NOT NULL,
  `D_name` varchar(20) NOT NULL,
  `D_age` int(11) NOT NULL,
  `D_address` varchar(40) DEFAULT NULL,
  `D_email` varchar(20) DEFAULT NULL,
  `D_tp` varchar(10) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `bloodtype` varchar(20) NOT NULL,
  `packets` varchar(2) NOT NULL,
  PRIMARY KEY (`D_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doner`
--

INSERT INTO `doner` (`D_ID`, `D_nic`, `D_name`, `D_age`, `D_address`, `D_email`, `D_tp`, `sex`, `bloodtype`, `packets`) VALUES
('004', '200123702082', 'Tashini Monasha', 23, 'galle', 'tashini@gmail.com', '0762050235', 'Female', 'B+', '2'),
('003', '20022367791', 'pavani', 23, 'Galle', 'pavni@gmail.com', '0723000823', 'Female', 'A-', '3'),
('002', '200123702081', 'Dineth Jay', 23, 'Galle', 'dineth@gmail.com', '0762050235', 'Male', 'A+', '2'),
('001', '200132236312', 'kasun', 34, 'mathara', 'kasun@gmail.com', '0745263125', 'Male', 'B+', '2');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
