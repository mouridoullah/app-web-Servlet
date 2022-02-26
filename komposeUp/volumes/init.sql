-- Version de PHP :  7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `artintelll`
--

DROP DATABASE IF EXISTS `ArtIntell`;
CREATE DATABASE `ArtIntell`;
COMMIT;


-- --------------------------------------------------------

--
-- Structure de la table `projet`
--

CREATE TABLE `DemandeDeProjet` (
  `id_projet` varchar(100) NOT NULL,
  `nom` varchar(100) NOT NULL,
  `dEtude` varchar(100) NOT NULL,
  `statut` varchar(100) NOT NULL,
  `taille` varchar(100) NOT NULL,
  `prenomClient` varchar(100) NOT NULL,
  `nomClient` varchar(50) NOT NULL,
  `chef_projet` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `projet`
--
ALTER TABLE `DemandeDeProjet`
  ADD PRIMARY KEY (`id_projet`);
COMMIT;



CREATE TABLE `projet` (
  `id_projet` varchar(100) NOT NULL,
  `nom` varchar(100) NOT NULL,
  `dEtude` varchar(100) NOT NULL,
  `statut` varchar(100) NOT NULL,
  `taille` varchar(100) NOT NULL,
  `prenomClient` varchar(100) NOT NULL,
  `nomClient` varchar(50) NOT NULL,
  `chef_projet` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `projet`
--
ALTER TABLE `projet`
  ADD PRIMARY KEY (`id_projet`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;