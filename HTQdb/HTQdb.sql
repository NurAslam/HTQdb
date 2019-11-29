-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 29, 2019 at 07:55 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aslam`
--

-- --------------------------------------------------------

--
-- Table structure for table `divisi`
--

CREATE TABLE `divisi` (
  `id_divisi` int(1) NOT NULL,
  `nama_divisi` varchar(20) DEFAULT NULL,
  `id_musaid` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `divisi`
--

INSERT INTO `divisi` (`id_divisi`, `nama_divisi`, `id_musaid`) VALUES
(1, 'Munaqosyah', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `extra`
--

CREATE TABLE `extra` (
  `id_extra` int(2) NOT NULL,
  `nama_extra` varchar(15) DEFAULT NULL,
  `jadwal` varchar(8) DEFAULT NULL,
  `id_ustadz` int(5) DEFAULT NULL,
  `divisi_pj` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `extra`
--

INSERT INTO `extra` (`id_extra`, `nama_extra`, `jadwal`, `id_ustadz`, `divisi_pj`) VALUES
(1, 'Kaligrafi', 'Senin', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `hafalan`
--

CREATE TABLE `hafalan` (
  `id_hafalan` int(5) NOT NULL,
  `tanggal_setoran` date NOT NULL,
  `divisi_pj` int(1) DEFAULT NULL,
  `id_mustami` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hafalan`
--

INSERT INTO `hafalan` (`id_hafalan`, `tanggal_setoran`, `divisi_pj`, `id_mustami`) VALUES
(10101, '2019-11-04', NULL, NULL),
(21001, '2019-01-01', 1, 182001);

-- --------------------------------------------------------

--
-- Table structure for table `jabatan_ustadz`
--

CREATE TABLE `jabatan_ustadz` (
  `id_jabatan_ustadz` int(2) NOT NULL,
  `nama_jabatan_ustadz` varchar(15) NOT NULL,
  `gaji` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jabatan_ustadz`
--

INSERT INTO `jabatan_ustadz` (`id_jabatan_ustadz`, `nama_jabatan_ustadz`, `gaji`) VALUES
(1, 'Pembina', 3000000),
(2, 'Pengajar', 250000);

-- --------------------------------------------------------

--
-- Table structure for table `kelompok`
--

CREATE TABLE `kelompok` (
  `no_kelompok` int(2) NOT NULL,
  `id_mustami` int(5) DEFAULT NULL,
  `id_mahasantri` int(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kelompok`
--

INSERT INTO `kelompok` (`no_kelompok`, `id_mustami`, `id_mahasantri`) VALUES
(2, 182001, 19002);

-- --------------------------------------------------------

--
-- Table structure for table `log`
--

CREATE TABLE `log` (
  `id` bigint(18) NOT NULL,
  `id_user` varchar(50) NOT NULL,
  `waktu_login` timestamp NOT NULL DEFAULT current_timestamp(),
  `waktu_logout` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `mabna`
--

CREATE TABLE `mabna` (
  `id_mabna` int(2) NOT NULL,
  `nama_mabna` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mabna`
--

INSERT INTO `mabna` (`id_mabna`, `nama_mabna`) VALUES
(21, 'Fatimah');

-- --------------------------------------------------------

--
-- Table structure for table `mahasantri`
--

CREATE TABLE `mahasantri` (
  `id_mahasantri` int(6) NOT NULL,
  `nama` char(20) NOT NULL,
  `nim_mahasantri` int(8) DEFAULT NULL,
  `id_mabna` int(2) NOT NULL,
  `jenis_kelamin` enum('Akhi','Ukhti') NOT NULL,
  `no_hp` varchar(15) DEFAULT NULL,
  `jumlah_hafalan` int(2) DEFAULT NULL,
  `id_hafalan` int(5) DEFAULT NULL,
  `no_kelompok` int(2) DEFAULT NULL,
  `tgl_sekarang` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mahasantri`
--

INSERT INTO `mahasantri` (`id_mahasantri`, `nama`, `nim_mahasantri`, `id_mabna`, `jenis_kelamin`, `no_hp`, `jumlah_hafalan`, `id_hafalan`, `no_kelompok`, `tgl_sekarang`) VALUES
(1, 'Aslam', 18650042, 21, '', '085255792323', 12, 10101, 2, '2019-11-06'),
(123, 'd', 3, 21, 'Akhi', '1', 3, NULL, NULL, '2019-11-29'),
(1222, 'xx', 2, 21, 'Akhi', '22', 3, NULL, NULL, '2019-11-29'),
(1223, 'Ichlas', 187771, 21, 'Akhi', '0018880', 21, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `musaid`
--

CREATE TABLE `musaid` (
  `id_musaid` int(5) NOT NULL,
  `nama_musaid` varchar(20) NOT NULL,
  `nim_musaid` int(8) NOT NULL,
  `password` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `musaid`
--

INSERT INTO `musaid` (`id_musaid`, `nama_musaid`, `nim_musaid`, `password`) VALUES
(18301, 'Yusuf Anshori', 18650041, '12345');

-- --------------------------------------------------------

--
-- Table structure for table `mustami`
--

CREATE TABLE `mustami` (
  `id_mustami` int(5) NOT NULL,
  `nama_mustami` varchar(20) DEFAULT NULL,
  `nim_mustami` int(8) DEFAULT NULL,
  `jenis_kelamin_mustami` varchar(1) DEFAULT NULL,
  `no_hp_mustami` varchar(13) DEFAULT NULL,
  `jumlah_hafalan_mustami` int(2) DEFAULT NULL,
  `halaman` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mustami`
--

INSERT INTO `mustami` (`id_mustami`, `nama_mustami`, `nim_mustami`, `jenis_kelamin_mustami`, `no_hp_mustami`, `jumlah_hafalan_mustami`, `halaman`) VALUES
(1, 'Aslam', 18650042, 'L', '085255792323', 1, 0),
(182001, 'Hida Muhimmatul H', 18650115, 'P', '0812345678', 29, 0);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` varchar(50) NOT NULL,
  `password` char(32) DEFAULT NULL,
  `nama` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `password`, `nama`) VALUES
('admin', '1a1dc91c907325c69271ddf0c944bc72', 'Aslam');

-- --------------------------------------------------------

--
-- Table structure for table `ustadz`
--

CREATE TABLE `ustadz` (
  `id_ustadz` int(5) NOT NULL,
  `nama_ustadz` varchar(20) NOT NULL,
  `id_jabatan_ustadz` int(1) NOT NULL,
  `nip` int(30) DEFAULT NULL,
  `alamat` varchar(20) DEFAULT NULL,
  `no_hp` varchar(14) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ustadz`
--

INSERT INTO `ustadz` (`id_ustadz`, `nama_ustadz`, `id_jabatan_ustadz`, `nip`, `alamat`, `no_hp`) VALUES
(18101, 'Muh Nur Aslam', 2, NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `divisi`
--
ALTER TABLE `divisi`
  ADD PRIMARY KEY (`id_divisi`),
  ADD KEY `divisi_musaid` (`id_musaid`);

--
-- Indexes for table `extra`
--
ALTER TABLE `extra`
  ADD PRIMARY KEY (`id_extra`),
  ADD KEY `extra_ustadz` (`id_ustadz`),
  ADD KEY `extra_musaid` (`divisi_pj`);

--
-- Indexes for table `hafalan`
--
ALTER TABLE `hafalan`
  ADD PRIMARY KEY (`id_hafalan`),
  ADD KEY `hafalan_divisi` (`divisi_pj`),
  ADD KEY `hafalan_mustami` (`id_mustami`);

--
-- Indexes for table `jabatan_ustadz`
--
ALTER TABLE `jabatan_ustadz`
  ADD PRIMARY KEY (`id_jabatan_ustadz`);

--
-- Indexes for table `kelompok`
--
ALTER TABLE `kelompok`
  ADD PRIMARY KEY (`no_kelompok`),
  ADD KEY `kelompok_mustami` (`id_mustami`),
  ADD KEY `kelompok_mahasantri` (`id_mahasantri`);

--
-- Indexes for table `log`
--
ALTER TABLE `log`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mabna`
--
ALTER TABLE `mabna`
  ADD PRIMARY KEY (`id_mabna`);

--
-- Indexes for table `mahasantri`
--
ALTER TABLE `mahasantri`
  ADD PRIMARY KEY (`id_mahasantri`),
  ADD UNIQUE KEY `nim_mahasiswa` (`nim_mahasantri`),
  ADD KEY `mahasantri_id_mabna_idx` (`id_mabna`),
  ADD KEY `jumlah_hafalan` (`jumlah_hafalan`),
  ADD KEY `relasi_hafalan` (`id_hafalan`),
  ADD KEY `relasi_kelompok` (`no_kelompok`);

--
-- Indexes for table `musaid`
--
ALTER TABLE `musaid`
  ADD PRIMARY KEY (`id_musaid`),
  ADD UNIQUE KEY `nim_musaidah` (`nim_musaid`);

--
-- Indexes for table `mustami`
--
ALTER TABLE `mustami`
  ADD PRIMARY KEY (`id_mustami`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `ustadz`
--
ALTER TABLE `ustadz`
  ADD PRIMARY KEY (`id_ustadz`),
  ADD KEY `ustadz_jabatan` (`id_jabatan_ustadz`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `log`
--
ALTER TABLE `log`
  MODIFY `id` bigint(18) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mahasantri`
--
ALTER TABLE `mahasantri`
  MODIFY `id_mahasantri` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1225;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `divisi`
--
ALTER TABLE `divisi`
  ADD CONSTRAINT `divisi_musaid` FOREIGN KEY (`id_musaid`) REFERENCES `musaid` (`id_musaid`);

--
-- Constraints for table `extra`
--
ALTER TABLE `extra`
  ADD CONSTRAINT `extra_musaid` FOREIGN KEY (`divisi_pj`) REFERENCES `divisi` (`id_divisi`),
  ADD CONSTRAINT `extra_ustadz` FOREIGN KEY (`id_ustadz`) REFERENCES `ustadz` (`id_ustadz`);

--
-- Constraints for table `hafalan`
--
ALTER TABLE `hafalan`
  ADD CONSTRAINT `hafalan_divisi` FOREIGN KEY (`divisi_pj`) REFERENCES `divisi` (`id_divisi`),
  ADD CONSTRAINT `hafalan_mustami` FOREIGN KEY (`id_mustami`) REFERENCES `mustami` (`id_mustami`);

--
-- Constraints for table `kelompok`
--
ALTER TABLE `kelompok`
  ADD CONSTRAINT `kelompok_mustami` FOREIGN KEY (`id_mustami`) REFERENCES `mustami` (`id_mustami`);

--
-- Constraints for table `mahasantri`
--
ALTER TABLE `mahasantri`
  ADD CONSTRAINT `relasi_hafalan` FOREIGN KEY (`id_hafalan`) REFERENCES `hafalan` (`id_hafalan`),
  ADD CONSTRAINT `relasi_kelompok` FOREIGN KEY (`no_kelompok`) REFERENCES `kelompok` (`no_kelompok`),
  ADD CONSTRAINT `relasi_mabna` FOREIGN KEY (`id_mabna`) REFERENCES `mabna` (`id_mabna`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `ustadz`
--
ALTER TABLE `ustadz`
  ADD CONSTRAINT `ustadz_jabatan` FOREIGN KEY (`id_jabatan_ustadz`) REFERENCES `jabatan_ustadz` (`id_jabatan_ustadz`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
