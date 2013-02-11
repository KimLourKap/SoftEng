-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Σύστημα: localhost
-- Χρόνος δημιουργίας: 11 Φεβρουαρίου 2013 στις 00:09:39
-- Έκδοση Διακομιστή: 5.5.8
-- Έκδοση PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Βάση: `db_klk`
--

-- --------------------------------------------------------

--
-- Δομή Πίνακα για τον Πίνακα `table_klk`
--

CREATE TABLE IF NOT EXISTS `table_klk` (
  `userName` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `totalPosts` int(128) NOT NULL,
  `trusted` int(128) NOT NULL,
  `review` varchar(400) NOT NULL,
  `rev_id` int(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Άδειασμα δεδομένων του πίνακα `table_klk`
--

INSERT INTO `table_klk` (`userName`, `password`, `totalPosts`, `trusted`, `review`, `rev_id`) VALUES
('nikos', '123', 3, 0, 'poly kalh epilogh', 1),
('giwrgos', '1234', 11, 1, 'to eixa parei prosfata, poly kalo,alla kanei ligo thoryvo to fan', 1),
('giannis', '12345', 8, 0, 'kalh epilogh se ayta ta xrhmata.an k exw meinei sth seira 4 ths AMD, isws kapoia stigmh kanw anavathmish', 2),
('guest', '', 1, 0, 'arketa kalh h karta grafikwn', 2);
