-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2020 at 06:57 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `paf-project`
--
CREATE DATABASE IF NOT EXISTS `paf-project` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `paf-project`;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `pat_id` int(8) NOT NULL,
  `pat_nic` varchar(10) NOT NULL,
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `PhoneNumber` int(10) NOT NULL,
  `Birthday` date NOT NULL,
  `Address` varchar(30) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`pat_id`, `pat_nic`, `FirstName`, `LastName`, `Email`, `PhoneNumber`, `Birthday`, `Address`, `Password`) VALUES
(1, '696840845V', 'Ranjani', 'Diyagala', 'ranjani@yahoo.com', 777778901, '1969-01-10', 'No.78/1,Haritha Uyana,Colombo', 'raa222'),
(4, '975845412V', 'Ms.Thilini', 'Madhushika', 'thilini@outlook.com', 717845362, '1997-11-05', 'No:16,payagala,kalutara', '123456'),
(100, '940654519V', 'Sanduni', 'Hansamali', 'sanduni@yahoo.com', 715416851, '2018-01-17', 'Kegalle', '123456789'),
(200, '890654519V', 'Lahiru', 'Hansamal', 'lahi@yahoo.com', 715416851, '2018-01-17', 'Matara', '123456789'),
(201, '960321535V', 'Malaka', 'Disanayaka', 'malDi@mail.com', 711453008, '1994-07-13', 'Payagala South, Kalutara', '123456'),
(202, '920321535V', 'Dinu', 'Bhagya', 'dinu@mail.com', 71453565, '1989-03-04', 'sdgsgsdgsg', 'sdgsdgsdg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`pat_id`),
  ADD UNIQUE KEY `pat_nic` (`pat_nic`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `pat_id` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=204;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
