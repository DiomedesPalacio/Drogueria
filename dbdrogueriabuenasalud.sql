-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 17-07-2020 a las 07:34:04
-- Versión del servidor: 8.0.17
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbdrogueriabuenasalud`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idCli` int(3) NOT NULL,
  `cedula` int(15) DEFAULT NULL,
  `nombres` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `edad` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `direccion` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `celular` varchar(15) DEFAULT NULL,
  `eps` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idCli`, `cedula`, `nombres`, `edad`, `direccion`, `celular`, `eps`) VALUES
(1, 79990290, 'Diomedes Palacio Palacio', '37', 'Calle 47 sur Nº 78 g 12', '3176796816', 'Compresar'),
(2, 1010164516, 'Yessica Villamil Ortiz', '34', 'Calle 52 Nº 65 -45', '3174852690', 'Fabizonal'),
(3, 52978145, 'Nini Palacio', '34', 'Calle 15 Nº 84 - 12', '3215478958', 'Salud Completa'),
(4, 79825478, 'Freddy Guzman', '48', 'Carrera 78 Nº 12 a 85', '3175894625', 'Compresar'),
(5, 98124568, 'Gonzalo Valdes', '68', 'Av 1 Nº 24 - 45', '3204569854', 'Fabizonal'),
(6, 3125487, 'Ligia Beltran', '68', 'Diagonal 78 Nº 54 - 85', '3205489786', 'Salud Completa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id` int(3) NOT NULL,
  `cedula` int(12) DEFAULT NULL,
  `nombres` varchar(45) DEFAULT NULL,
  `cargo` varchar(30) DEFAULT NULL,
  `usuario` varchar(20) DEFAULT NULL,
  `contrasena` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id`, `cedula`, `nombres`, `cargo`, `usuario`, `contrasena`) VALUES
(1, 79990280, 'Juan Mejia', 'Propietario', 'administrador', '12345'),
(2, 1010154678, 'Santiago Moya', 'Auxiliar 1', 'Santiago', 'santi'),
(3, 79210548, 'Oscar Mora', 'Auxiliar 2', 'Oscar', 'oscar12'),
(4, 52468975, 'Nini Arevalo', 'Jefe de Bodega', 'Nini', 'nini2014');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entregas`
--

CREATE TABLE `entregas` (
  `id` int(4) NOT NULL,
  `nombreCli` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `direccion` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `celular` varchar(15) DEFAULT NULL,
  `eps` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `nombreProd` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `tipo` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `presentacion` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `cantidad` int(3) DEFAULT NULL,
  `fechaEntrega` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `entregas`
--

INSERT INTO `entregas` (`id`, `nombreCli`, `direccion`, `celular`, `eps`, `nombreProd`, `tipo`, `presentacion`, `cantidad`, `fechaEntrega`) VALUES
(2, 'Diomedes Palacio Palacio', 'Calle 47 sur Nº 78 g 12', '3176796816', 'Compresar', 'Dolex Gripa', 'Analgesico', 'Ampolletas', 5, '2020-07-15'),
(3, 'Diomedes Palacio Palacio', 'Calle 47 sur Nº 78 g 12', '3176796816', 'Compresar', 'Dolex Gripa', 'Analgesico', 'Ampolletas', 10, '2020-07-16'),
(4, 'Yessica Villamil Ortiz', 'Calle 52 Nº 65 -45', '3174852690', 'Fabizonal', 'Desenfriolito1', 'Antibiotico1', 'Ampolletas', 21, '2020-07-16'),
(5, 'Diomedes Palacio Palacio', 'Calle 47 sur Nº 78 g 12', '3176796816', 'Compresar', 'Acetaminofen', 'Analgesico', 'Pastas', 10, '2020-07-02'),
(6, 'Freddy Guzman', 'Carrera 78 Nº 12 a 85', '3175894625', 'Compresar', 'Ranitidina', 'Antiacido', 'Ampolletas', 2, '2020-05-01'),
(7, 'Nini Palacio', 'Calle 15 Nº 84 - 12', '3215478958', 'Salud Completa', 'Paracetamol', 'Antipiretico', 'Jarabe', 20, '2020-02-15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `idProd` int(3) NOT NULL,
  `codigoProd` varchar(5) DEFAULT NULL,
  `nombreProd` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `tipoProd` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `presentacionProd` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `cantidadProd` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`idProd`, `codigoProd`, `nombreProd`, `tipoProd`, `presentacionProd`, `cantidadProd`) VALUES
(8, '001', 'Dolex', 'Antialergico', 'Ampolletas', 30),
(9, '0021', 'Desenfriolito1', 'Antibiotico1', 'Ampolletas', 501),
(10, '002', 'Ibuprofeno', 'Antipiretico', 'Pastas', 200),
(11, '003', 'Paracetamol', 'Antipiretico', 'Jarabe', 20),
(12, '004', 'Omeprazol', 'Antiacido', 'Pastas', 100),
(13, '005', 'Ranitidina', 'Antiacido', 'Ampolletas', 20),
(14, '006', 'Acetaminofen', 'Analgesico', 'Pastas', 100);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idCli`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `entregas`
--
ALTER TABLE `entregas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`idProd`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idCli` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `entregas`
--
ALTER TABLE `entregas`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `idProd` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
