-- phpMyAdmin SQL Dump
-- version 2.10.2
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 28-11-2013 a las 21:33:07
-- Versión del servidor: 5.0.45
-- Versión de PHP: 5.2.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Base de datos: `cibertec2013`
-- 

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `articulos`
-- 

DROP TABLE IF EXISTS `articulos`;
CREATE TABLE IF NOT EXISTS `articulos` (
  `art_cod` varchar(5) NOT NULL,
  `art_nom` varchar(30) default NULL,
  `art_uni` varchar(4) default NULL,
  `art_pre` decimal(10,0) default NULL,
  `art_stk` int(11) default NULL,
  `art_marca` varchar(4) default NULL,
  PRIMARY KEY  (`art_cod`),
  KEY `art_marca` (`art_marca`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `articulos`
-- 

INSERT INTO `articulos` VALUES ('A0001', 'MOUSE GENIOUS       ', 'UNI ', 25, 235, 'COMP');
INSERT INTO `articulos` VALUES ('A0002', 'PENTIUM III 600     ', 'UNI ', 150, 220, 'COMP');
INSERT INTO `articulos` VALUES ('A0003', 'PENTIUM IV 2.5 GB     ', 'UNI ', 150, 220, 'COMP');
INSERT INTO `articulos` VALUES ('A0004', 'FUNDAS NAYLON       ', 'MTS ', 40, 35, 'COMP');
INSERT INTO `articulos` VALUES ('A0005', 'MEMORIA ZIP 32      ', 'UNI ', 60, 80, 'COMP');
INSERT INTO `articulos` VALUES ('A0006', 'TINTA BJC21 B/N     ', 'CAJ ', 20, 20, 'COMP');
INSERT INTO `articulos` VALUES ('A0007', 'IMPRESORA EPSON 1234', 'UNI ', 355, 120, 'COMP');
INSERT INTO `articulos` VALUES ('A0008', 'MONITOR SYNMASTER 3N', 'UNI ', 300, 33, 'IBM');
INSERT INTO `articulos` VALUES ('A0009', 'MONITOR VIEWSONIC   ', 'UNI ', 450, 92, 'IBM');
INSERT INTO `articulos` VALUES ('A0010', 'PENTIUM MMX 260     ', 'UNI ', 120, 97, 'IBM');
INSERT INTO `articulos` VALUES ('A0011', 'MOUSE MICROSOFT     ', 'UNI ', 50, 320, 'IBM');
INSERT INTO `articulos` VALUES ('A0012', 'MEMORIA DIMM 64     ', 'UNI ', 60, 25, 'IBM');
INSERT INTO `articulos` VALUES ('A0013', 'MEMORIA DIMM 128    ', 'UNI ', 82, 25, 'IBM');
INSERT INTO `articulos` VALUES ('A0014', 'IMPRESORA CANON 1000', 'UNI ', 205, 200, 'IBM');
INSERT INTO `articulos` VALUES ('A0015', 'IMPRESORA Sansung Laser', 'UNI ', 1805, 200, 'IBM');
INSERT INTO `articulos` VALUES ('A0016', 'TINTA BJC21 COLOR   ', 'UNI ', 20, 120, 'IBM');
INSERT INTO `articulos` VALUES ('A0017', 'TINTA B/n  484   ', 'UNI ', 20, 120, 'IBM');
INSERT INTO `articulos` VALUES ('A0018', 'TINTA Color 624   ', 'UNI ', 20, 120, 'LENO');
INSERT INTO `articulos` VALUES ('A0019', 'TECLADO EPSON 102   ', 'UNI ', 75, 122, 'LENO');
INSERT INTO `articulos` VALUES ('A0020', 'MOUSE TECH          ', 'UNI ', 30, 190, 'LENO');
INSERT INTO `articulos` VALUES ('A0021', 'USB KISTON 128     ', 'UNI ', 160, 97, 'LENO');
INSERT INTO `articulos` VALUES ('A0022', 'USB DE 256         ', 'UNI ', 220, 20, 'LENO');
INSERT INTO `articulos` VALUES ('A0023', 'USB DE 512         ', 'UNI ', 260, 25, 'LENO');
INSERT INTO `articulos` VALUES ('A0024', 'AMPLIFICADOR TRINITON', 'UNI ', 100, 20, 'LENO');
INSERT INTO `articulos` VALUES ('A0025', 'PARLANTES DE 50 watss ', 'UNI ', 70, 12, 'LENO');
INSERT INTO `articulos` VALUES ('A0026', 'TECLADO EPSON 102   ', 'UNI ', 75, 122, 'LENO');
INSERT INTO `articulos` VALUES ('A0027', 'MOUSE TECH          ', 'UNI ', 30, 190, 'LENO');
INSERT INTO `articulos` VALUES ('A345', 'ARTICULO A', 'kg', NULL, 10, 'IBM');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `clientes`
-- 

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `cli_cod` varchar(5) NOT NULL,
  `cli_nom` varchar(35) default NULL,
  `cli_tel` varchar(8) default NULL,
  `cli_cor` varchar(30) default NULL,
  `cli_dir` varchar(30) default NULL,
  `cli_cre` decimal(10,0) default NULL,
  PRIMARY KEY  (`cli_cod`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `clientes`
-- 

INSERT INTO `clientes` VALUES ('C0001', 'Alvarez Pe', '123-4567', 'importa@hotmail.com', 'Av. La Marina 1234', 3500);
INSERT INTO `clientes` VALUES ('C0004', 'Tucto de Souza,Bernardo', '567-4566', '', 'Av. Principal 123 ', 1200);
INSERT INTO `clientes` VALUES ('C0005', 'Vilela Bustamante,Percy', '', 'obando@hotmail.com', 'Calle San Pedro 134', 600);
INSERT INTO `clientes` VALUES ('C0007', 'Montes Diaz, MIGUEL', '567-8356', 'importa02@hotmail.com', 'Jr. Naranjos 5689', 3100);
INSERT INTO `clientes` VALUES ('C0008', 'Rojas Gallo, Jorge', '789-4568', 'importa22@yahoo.com', 'Av. Habich 543    ', 2700);
INSERT INTO `clientes` VALUES ('C0009', 'Garcia La Riva,Guiliana', '789-4073', 'conde@idat.com', 'Av. Iquitos 228   ', 3400);
INSERT INTO `clientes` VALUES ('C0034', 'Tuouza,Bernardo', '567-4566', '', 'Av. Principal 123 ', 1200);
INSERT INTO `clientes` VALUES ('C0012', 'Li', '', 'redondo@hotmail.com', 'Av. Javier Prado 114', 600);
INSERT INTO `clientes` VALUES ('C0014', 'Bustamante Moptta, Diego', '567-4566', '', 'Av. Principal 123 ', 1200);
INSERT INTO `clientes` VALUES ('C0015', 'Alvarado Cueva, Guiliana', '456-3457', 'campos@yahoo.com', 'Jr. Dominico 554', 5000);
INSERT INTO `clientes` VALUES ('C0016', 'Antero Flores, Gregorio', '746-0647', 'ramirez@idat.com', 'Jr. Salavery 876  ', 2100);
INSERT INTO `clientes` VALUES ('C0017', 'Diaz Mal Partida,Jose', '567-4566', '', 'Av. Guardia Civil 123 ', 1200);
INSERT INTO `clientes` VALUES ('C0018', 'Gutierrez Pazos , Mauricio', '897-5783', 'importa04@hotmail.com', 'Av. Habich 4567   ', 800);
INSERT INTO `clientes` VALUES ('C0019', 'Mendoza Ramirez, Ester', '958-3569', 'importa05@yahoo.com', 'Av. Wilson 678    ', 2600);
INSERT INTO `clientes` VALUES ('C0020', 'Salazar Santiago, Merlo', '654-6534', 'pardo@walla.com', 'Av. Pardo 567     ', 4100);
INSERT INTO `clientes` VALUES ('C0021', 'Carrasco Lee, Laura', '267-8958', 'importa05@hotmail.com', 'Av. Wilson 1267   ', 700);
INSERT INTO `clientes` VALUES ('C0022', 'Rosas La Riva,Guiliana', '789-4073', 'conde@idat.com', 'Av. Iquitos 228   ', 400);
INSERT INTO `clientes` VALUES ('C0023', 'Caceres Atoccsa, Isarrael', '768-5704', '', 'Calle Cueva 432   ', 0);
INSERT INTO `clientes` VALUES ('C0024', 'Sanchez Brice', '', 'redondo@hotmail.com', 'Av. Javier Prado 114', 1600);
INSERT INTO `clientes` VALUES ('C0025', 'Mego Mendoza, Jose', '567-8466', 'importa03@hotmail.com', 'Jr. Pio XII 112   ', 0);
INSERT INTO `clientes` VALUES ('C0026', 'Bustamante Porta, Diego', '567-4566', '', 'Av. Principal 123 ', 1200);
INSERT INTO `clientes` VALUES ('C0027', 'Meza Cuadra, Guiliana', '456-3457', 'campos@yahoo.com', 'Jr. Dominico 554', 2000);
INSERT INTO `clientes` VALUES ('C0028', 'Portila Flores, Gregorio', '746-0647', 'ramirez@idat.com', 'Jr. Salavery 876  ', 2100);
INSERT INTO `clientes` VALUES ('C0010', 'Quiroz Salvador,Jose', '567-4566', '', 'Av. Guardia Civil 123 ', 1200);
INSERT INTO `clientes` VALUES ('C0006', 'Sotelo Mateo , Mauricio', '897-5783', 'importa04@hotmail.com', 'Av. Habich 4567   ', 800);
INSERT INTO `clientes` VALUES ('C0003', 'Mendez landeo, Ester', '958-3569', 'importa05@yahoo.com', 'Av. Wilson 678    ', 2600);
INSERT INTO `clientes` VALUES ('C0011', 'Inafuku Salazar, Merlo', '654-6534', 'pardo@walla.com', 'Av. Pardo 567     ', 4100);
INSERT INTO `clientes` VALUES ('C0002', 'Chuquizita Leonardo, Laura', '267-8958', 'importa05@hotmail.com', 'Av. Wilson 1267   ', 700);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `fac_cabe`
-- 

DROP TABLE IF EXISTS `fac_cabe`;
CREATE TABLE IF NOT EXISTS `fac_cabe` (
  `fac_num` varchar(12) NOT NULL,
  `fac_fec` datetime default NULL,
  `cli_cod` varchar(5) default NULL,
  `fac_igv` varchar(1) default NULL,
  `ven_cod` int(11) default NULL,
  PRIMARY KEY  (`fac_num`),
  KEY `cli_cod` (`cli_cod`),
  KEY `ven_cod` (`ven_cod`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `fac_cabe`
-- 

INSERT INTO `fac_cabe` VALUES ('F0001       ', '2005-02-02 00:00:00', 'C0007', 'S', 1);
INSERT INTO `fac_cabe` VALUES ('F0002       ', '2005-04-03 00:00:00', 'C0005', 'S', 2);
INSERT INTO `fac_cabe` VALUES ('F0003       ', '2005-05-03 00:00:00', 'C0016', 'N', 2);
INSERT INTO `fac_cabe` VALUES ('F0004       ', '2005-12-08 00:00:00', 'C0002', 'S', 1);
INSERT INTO `fac_cabe` VALUES ('F0005       ', '2005-06-08 00:00:00', 'C0005', 'N', 3);
INSERT INTO `fac_cabe` VALUES ('F0006       ', '2005-12-09 00:00:00', 'C0002', 'N', 4);
INSERT INTO `fac_cabe` VALUES ('F0007       ', '2005-09-10 00:00:00', 'C0016', 'N', 5);
INSERT INTO `fac_cabe` VALUES ('F0008       ', '2005-02-12 00:00:00', 'C0005', 'S', 5);
INSERT INTO `fac_cabe` VALUES ('F0009       ', '2005-11-12 00:00:00', 'C0020', 'N', 6);
INSERT INTO `fac_cabe` VALUES ('F0010       ', '2006-06-01 00:00:00', 'C0005', 'N', 7);
INSERT INTO `fac_cabe` VALUES ('F0011       ', '2006-07-01 00:00:00', 'C0012', 'N', 10);
INSERT INTO `fac_cabe` VALUES ('F0012       ', '2006-11-01 00:00:00', 'C0012', 'S', 7);
INSERT INTO `fac_cabe` VALUES ('F0013       ', '2006-10-02 00:00:00', 'C0002', 'S', 6);
INSERT INTO `fac_cabe` VALUES ('F0014       ', '2006-01-02 00:00:00', 'C0011', 'S', 11);
INSERT INTO `fac_cabe` VALUES ('F0015       ', '2006-12-03 00:00:00', 'C0018', 'N', 12);
INSERT INTO `fac_cabe` VALUES ('F0016       ', '2006-03-03 00:00:00', 'C0012', 'S', 11);
INSERT INTO `fac_cabe` VALUES ('F0017       ', '2006-08-03 00:00:00', 'C0001', 'N', 13);
INSERT INTO `fac_cabe` VALUES ('F0018       ', '2007-01-03 00:00:00', 'C0002', 'N', 13);
INSERT INTO `fac_cabe` VALUES ('F0019       ', '2007-01-11 00:00:00', 'C0001', 'S', 14);
INSERT INTO `fac_cabe` VALUES ('F0020       ', '2007-01-05 00:00:00', 'C0002', 'N', 15);
INSERT INTO `fac_cabe` VALUES ('F0021       ', '2007-01-07 00:00:00', 'C0003', 'S', 16);
INSERT INTO `fac_cabe` VALUES ('F0022       ', '2007-02-12 00:00:00', 'C0004', 'N', 17);
INSERT INTO `fac_cabe` VALUES ('F0023       ', '2007-02-10 00:00:00', 'C0005', 'S', 19);
INSERT INTO `fac_cabe` VALUES ('F0024       ', '2007-02-09 00:00:00', 'C0004', 'N', 19);
INSERT INTO `fac_cabe` VALUES ('F0025       ', '2007-03-03 00:00:00', 'C0005', 'S', 11);
INSERT INTO `fac_cabe` VALUES ('F0026       ', '2007-03-05 00:00:00', 'C0004', 'N', 14);
INSERT INTO `fac_cabe` VALUES ('F0027       ', '2007-04-05 00:00:00', 'C0005', 'N', 1);
INSERT INTO `fac_cabe` VALUES ('F0028       ', '2007-05-05 00:00:00', 'C0004', 'N', 10);
INSERT INTO `fac_cabe` VALUES ('F0029       ', '2007-05-05 00:00:00', 'C0005', 'N', 4);
INSERT INTO `fac_cabe` VALUES ('F0030       ', '2007-06-05 00:00:00', 'C0006', 'S', 3);
INSERT INTO `fac_cabe` VALUES ('F0031       ', '2007-07-05 00:00:00', 'C0004', 'N', 4);
INSERT INTO `fac_cabe` VALUES ('F0032       ', '2007-07-05 00:00:00', 'C0007', 'N', 8);
INSERT INTO `fac_cabe` VALUES ('F0033       ', '2007-08-05 00:00:00', 'C0008', 'S', 7);
INSERT INTO `fac_cabe` VALUES ('F0034       ', '2007-08-05 00:00:00', 'C0008', 'N', 6);
INSERT INTO `fac_cabe` VALUES ('F0035       ', '2007-09-05 00:00:00', 'C0004', 'N', 7);
INSERT INTO `fac_cabe` VALUES ('F0036       ', '2007-10-05 00:00:00', 'C0009', 'S', 4);
INSERT INTO `fac_cabe` VALUES ('F0037       ', '2007-10-05 00:00:00', 'C0010', 'N', 11);
INSERT INTO `fac_cabe` VALUES ('F0038       ', '2007-12-05 00:00:00', 'C0010', 'N', 11);
INSERT INTO `fac_cabe` VALUES ('F0039       ', '2008-01-05 00:00:00', 'C0015', 'S', 9);
INSERT INTO `fac_cabe` VALUES ('F0040       ', '2008-01-05 00:00:00', 'C0014', 'N', 1);
INSERT INTO `fac_cabe` VALUES ('F0041       ', '2008-01-05 00:00:00', 'C0005', 'S', 3);
INSERT INTO `fac_cabe` VALUES ('F0042       ', '2008-02-05 00:00:00', 'C0011', 'N', 6);
INSERT INTO `fac_cabe` VALUES ('F0043       ', '2008-02-05 00:00:00', 'C0014', 'S', 11);
INSERT INTO `fac_cabe` VALUES ('F0044       ', '2008-02-05 00:00:00', 'C0012', 'N', 12);
INSERT INTO `fac_cabe` VALUES ('F0045       ', '2008-02-13 00:00:00', 'C0007', 'N', 4);
INSERT INTO `fac_cabe` VALUES ('F0046       ', '2008-02-14 00:00:00', 'C0008', 'N', 4);
INSERT INTO `fac_cabe` VALUES ('F0047       ', '2008-02-08 00:00:00', 'C0009', 'N', 3);
INSERT INTO `fac_cabe` VALUES ('F0048       ', '2008-02-09 00:00:00', 'C0011', 'N', 7);
INSERT INTO `fac_cabe` VALUES ('F0049       ', '2008-02-10 00:00:00', 'C0019', 'N', 8);
INSERT INTO `fac_cabe` VALUES ('F0050       ', '2008-02-15 00:00:00', 'C0004', 'N', 2);
INSERT INTO `fac_cabe` VALUES ('F0057', '2009-01-01 00:00:00', 'C0002', 'N', 1);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `fac_deta`
-- 

DROP TABLE IF EXISTS `fac_deta`;
CREATE TABLE IF NOT EXISTS `fac_deta` (
  `fac_id` int(11) NOT NULL auto_increment,
  `fac_num` varchar(12) default NULL,
  `art_cod` varchar(5) default NULL,
  `art_can` int(11) default NULL,
  PRIMARY KEY  (`fac_id`),
  KEY `fac_num` (`fac_num`),
  KEY `art_cod` (`art_cod`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=85 ;

-- 
-- Volcar la base de datos para la tabla `fac_deta`
-- 

INSERT INTO `fac_deta` VALUES (1, 'F0001       ', 'A0001', 2);
INSERT INTO `fac_deta` VALUES (2, 'F0001       ', 'A0007', 3);
INSERT INTO `fac_deta` VALUES (3, 'F0002       ', 'A0002', 16);
INSERT INTO `fac_deta` VALUES (4, 'F0002       ', 'A0004', 4);
INSERT INTO `fac_deta` VALUES (5, 'F0002       ', 'A0005', 6);
INSERT INTO `fac_deta` VALUES (6, 'F0003       ', 'A0004', 5);
INSERT INTO `fac_deta` VALUES (7, 'F0004       ', 'A0002', 2);
INSERT INTO `fac_deta` VALUES (8, 'F0004       ', 'A0007', 3);
INSERT INTO `fac_deta` VALUES (9, 'F0005       ', 'A0006', 12);
INSERT INTO `fac_deta` VALUES (10, 'F0005       ', 'A0010', 11);
INSERT INTO `fac_deta` VALUES (11, 'F0005       ', 'A0011', 4);
INSERT INTO `fac_deta` VALUES (12, 'F0005       ', 'A0014', 11);
INSERT INTO `fac_deta` VALUES (13, 'F0006       ', 'A0007', 13);
INSERT INTO `fac_deta` VALUES (14, 'F0007       ', 'A0020', 23);
INSERT INTO `fac_deta` VALUES (15, 'F0008       ', 'A0020', 2);
INSERT INTO `fac_deta` VALUES (16, 'F0009       ', 'A0001', 2);
INSERT INTO `fac_deta` VALUES (17, 'F0010       ', 'A0005', 7);
INSERT INTO `fac_deta` VALUES (18, 'F0010       ', 'A0006', 8);
INSERT INTO `fac_deta` VALUES (19, 'F0010       ', 'A0011', 5);
INSERT INTO `fac_deta` VALUES (20, 'F0011       ', 'A0004', 4);
INSERT INTO `fac_deta` VALUES (21, 'F0011       ', 'A0005', 6);
INSERT INTO `fac_deta` VALUES (22, 'F0011       ', 'A0010', 13);
INSERT INTO `fac_deta` VALUES (23, 'F0012       ', 'A0002', 14);
INSERT INTO `fac_deta` VALUES (24, 'F0013       ', 'A0014', 21);
INSERT INTO `fac_deta` VALUES (25, 'F0014       ', 'A0014', 2);
INSERT INTO `fac_deta` VALUES (26, 'F0015       ', 'A0007', 3);
INSERT INTO `fac_deta` VALUES (27, 'F0016       ', 'A0006', 5);
INSERT INTO `fac_deta` VALUES (28, 'F0016       ', 'A0014', 2);
INSERT INTO `fac_deta` VALUES (29, 'F0017       ', 'A0006', 7);
INSERT INTO `fac_deta` VALUES (30, 'F0017       ', 'A0011', 5);
INSERT INTO `fac_deta` VALUES (31, 'F0018       ', 'A0002', 1);
INSERT INTO `fac_deta` VALUES (32, 'F0018       ', 'A0004', 4);
INSERT INTO `fac_deta` VALUES (33, 'F0018       ', 'A0005', 11);
INSERT INTO `fac_deta` VALUES (34, 'F0018       ', 'A0012', 4);
INSERT INTO `fac_deta` VALUES (35, 'F0019       ', 'A0006', 7);
INSERT INTO `fac_deta` VALUES (36, 'F0019       ', 'A0007', 6);
INSERT INTO `fac_deta` VALUES (37, 'F0019       ', 'A0008', 13);
INSERT INTO `fac_deta` VALUES (38, 'F0020       ', 'A0007', 6);
INSERT INTO `fac_deta` VALUES (39, 'F0020       ', 'A0009', 15);
INSERT INTO `fac_deta` VALUES (40, 'F0021       ', 'A0004', 2);
INSERT INTO `fac_deta` VALUES (41, 'F0021       ', 'A0007', 3);
INSERT INTO `fac_deta` VALUES (42, 'F0021       ', 'A0009', 11);
INSERT INTO `fac_deta` VALUES (43, 'F0022       ', 'A0001', 4);
INSERT INTO `fac_deta` VALUES (44, 'F0023       ', 'A0003', 5);
INSERT INTO `fac_deta` VALUES (45, 'F0023       ', 'A0006', 7);
INSERT INTO `fac_deta` VALUES (46, 'F0024       ', 'A0003', 15);
INSERT INTO `fac_deta` VALUES (47, 'F0024       ', 'A0007', 13);
INSERT INTO `fac_deta` VALUES (48, 'F0025       ', 'A0008', 11);
INSERT INTO `fac_deta` VALUES (49, 'F0026       ', 'A0010', 4);
INSERT INTO `fac_deta` VALUES (50, 'F0026       ', 'A0011', 3);
INSERT INTO `fac_deta` VALUES (51, 'F0027       ', 'A0001', 2);
INSERT INTO `fac_deta` VALUES (52, 'F0027       ', 'A0003', 1);
INSERT INTO `fac_deta` VALUES (53, 'F0028       ', 'A0006', 3);
INSERT INTO `fac_deta` VALUES (54, 'F0029       ', 'A0008', 4);
INSERT INTO `fac_deta` VALUES (55, 'F0030       ', 'A0009', 3);
INSERT INTO `fac_deta` VALUES (56, 'F0031       ', 'A0011', 2);
INSERT INTO `fac_deta` VALUES (57, 'F0032       ', 'A0010', 3);
INSERT INTO `fac_deta` VALUES (58, 'F0033       ', 'A0013', 1);
INSERT INTO `fac_deta` VALUES (59, 'F0033       ', 'A0014', 3);
INSERT INTO `fac_deta` VALUES (60, 'F0034       ', 'A0013', 2);
INSERT INTO `fac_deta` VALUES (61, 'F0035       ', 'A0012', 3);
INSERT INTO `fac_deta` VALUES (62, 'F0036       ', 'A0001', 4);
INSERT INTO `fac_deta` VALUES (63, 'F0037       ', 'A0003', 6);
INSERT INTO `fac_deta` VALUES (64, 'F0038       ', 'A0001', 5);
INSERT INTO `fac_deta` VALUES (65, 'F0039       ', 'A0004', 2);
INSERT INTO `fac_deta` VALUES (66, 'F0039       ', 'A0007', 1);
INSERT INTO `fac_deta` VALUES (67, 'F0040       ', 'A0001', 2);
INSERT INTO `fac_deta` VALUES (68, 'F0040       ', 'A0004', 2);
INSERT INTO `fac_deta` VALUES (69, 'F0041       ', 'A0005', 6);
INSERT INTO `fac_deta` VALUES (70, 'F0042       ', 'A0007', 2);
INSERT INTO `fac_deta` VALUES (71, 'F0042       ', 'A0011', 1);
INSERT INTO `fac_deta` VALUES (72, 'F0043       ', 'A0010', 2);
INSERT INTO `fac_deta` VALUES (73, 'F0044       ', 'A0012', 3);
INSERT INTO `fac_deta` VALUES (74, 'F0045       ', 'A0014', 2);
INSERT INTO `fac_deta` VALUES (75, 'F0046       ', 'A0012', 1);
INSERT INTO `fac_deta` VALUES (76, 'F0047       ', 'A0001', 2);
INSERT INTO `fac_deta` VALUES (77, 'F0048       ', 'A0004', 1);
INSERT INTO `fac_deta` VALUES (78, 'F0049       ', 'A0007', 2);
INSERT INTO `fac_deta` VALUES (79, 'F0050       ', 'A0011', 3);
INSERT INTO `fac_deta` VALUES (80, 'F0050       ', 'A0012', 4);
INSERT INTO `fac_deta` VALUES (81, 'F0057', 'A0001', 5);
INSERT INTO `fac_deta` VALUES (82, 'F0057', 'A0002', 1);
INSERT INTO `fac_deta` VALUES (83, 'F0057', 'A0025', 1);
INSERT INTO `fac_deta` VALUES (84, 'F0057', 'A0026', 1);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `marcas`
-- 

DROP TABLE IF EXISTS `marcas`;
CREATE TABLE IF NOT EXISTS `marcas` (
  `idmarca` varchar(4) NOT NULL,
  `desmarca` varchar(30) default NULL,
  PRIMARY KEY  (`idmarca`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `marcas`
-- 

INSERT INTO `marcas` VALUES ('IBM', 'IBM');
INSERT INTO `marcas` VALUES ('LENO', 'Lenovo');
INSERT INTO `marcas` VALUES ('COMP', 'Compac');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `vendedor`
-- 

DROP TABLE IF EXISTS `vendedor`;
CREATE TABLE IF NOT EXISTS `vendedor` (
  `Ven_cod` int(11) NOT NULL,
  `Ven_nom` varchar(25) default NULL,
  `FOTO` varchar(10) NOT NULL,
  `Ven_Fig` datetime default NULL,
  PRIMARY KEY  (`Ven_cod`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Volcar la base de datos para la tabla `vendedor`
-- 

INSERT INTO `vendedor` VALUES (2, 'Pardo Campos, carlos', '', '1979-05-11 00:00:00');
INSERT INTO `vendedor` VALUES (3, 'LEE Moreno,  claudia', '', '1979-06-12 00:00:00');
INSERT INTO `vendedor` VALUES (4, 'Mendoza OBANDO, Maria', '', '1982-04-11 00:00:00');
INSERT INTO `vendedor` VALUES (5, 'Narva Gomez, Mario', '', '1983-06-15 00:00:00');
INSERT INTO `vendedor` VALUES (6, 'Murillo Mancini, Juan', '', '1985-05-11 00:00:00');
INSERT INTO `vendedor` VALUES (7, 'Gonzales Vera, Erlinda', '', '1985-04-12 00:00:00');
INSERT INTO `vendedor` VALUES (8, 'Diaz Choque, Susy', '', '1998-12-11 00:00:00');
INSERT INTO `vendedor` VALUES (9, 'Huamani Rios, Liz', '', '1998-11-11 00:00:00');
INSERT INTO `vendedor` VALUES (10, 'Cama Peralta, Ana', '', '1999-02-10 00:00:00');
INSERT INTO `vendedor` VALUES (11, 'Campos Diaz, Juan', '', '1999-11-12 00:00:00');
INSERT INTO `vendedor` VALUES (12, 'Ramirez Cristobal, Pedro', '', '2000-11-13 00:00:00');
INSERT INTO `vendedor` VALUES (13, 'Camarena Rios, Daniel', '', '2000-03-12 00:00:00');
INSERT INTO `vendedor` VALUES (14, 'Perez Diaz, Juan', '', '2001-11-11 00:00:00');
INSERT INTO `vendedor` VALUES (15, 'Inga Lopez, Consuelo', '', '2001-12-12 00:00:00');
INSERT INTO `vendedor` VALUES (16, 'Cardenas Bacilio, Eva', '', '2002-10-11 00:00:00');
INSERT INTO `vendedor` VALUES (17, 'Cardenas Bacilio, Eva', '', '1998-10-11 00:00:00');
INSERT INTO `vendedor` VALUES (18, 'Martel Mendez, Mario', '', '1994-10-11 00:00:00');
INSERT INTO `vendedor` VALUES (19, 'Carrasco Lopez, Ana', '', '1996-10-11 00:00:00');
INSERT INTO `vendedor` VALUES (20, 'Porras Becerra, Eva', '', '2000-10-11 00:00:00');
INSERT INTO `vendedor` VALUES (21, 'Zamora Contreras, Flor', '', '2001-10-11 00:00:00');
INSERT INTO `vendedor` VALUES (1, 'Diaz Bacilio, Eva', '', '1996-10-11 00:00:00');
