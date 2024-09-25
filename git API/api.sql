-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 25 sep. 2024 à 07:49
-- Version du serveur : 10.4.32-MariaDB
-- Version de PHP : 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `api`
--

-- --------------------------------------------------------

--
-- Structure de la table `category_site`
--

CREATE TABLE `category_site` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` tinytext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `category_site`
--

INSERT INTO `category_site` (`id`, `name`, `description`) VALUES
(2, 'Réseaux Sociaux', 'Sites permettant aux utilisateurs de se connecter, de partager du contenu et d\'interagir avec d\'autres personnes en ligne'),
(3, 'E-commerce', 'Sites dédiés à la vente de produits et de services en ligne, souvent avec des fonctionnalités de panier d\'achat et de paiement.'),
(4, 'Actualités', 'Sites fournissant des informations sur les événements actuels, les nouvelles et les analyses dans divers domaines.'),
(5, 'Éducation', 'Sites offrant des ressources pédagogiques, des cours en ligne et des informations éducatives pour les apprenants.'),
(6, 'Divertissement', 'Sites axés sur les loisirs et les divertissements, y compris les films, la musique, les jeux et les contenus amusants.'),
(7, 'Blogs', 'Sites personnels ou professionnels où les utilisateurs publient des articles, des opinions et des réflexions sur divers sujets.'),
(8, 'Voyages', 'Sites fournissant des informations sur les destinations de voyage, les réservations d\'hôtels et les conseils pour les voyageurs.'),
(9, 'Santé', 'Sites dédiés aux informations sur la santé, les conseils médicaux et les ressources pour le bien-être physique et mental.'),
(10, 'Technologie', 'Sites couvrant les dernières nouvelles en matière de technologie, de gadgets, de logiciels et de tendances technologiques.'),
(11, 'Forum', 'Sites permettant aux utilisateurs de discuter, de poser des questions et de partager des informations sur divers sujets dans des forums en ligne.');

-- --------------------------------------------------------

--
-- Structure de la table `doctrine_migration_versions`
--

CREATE TABLE `doctrine_migration_versions` (
  `version` varchar(191) NOT NULL,
  `executed_at` datetime DEFAULT NULL,
  `execution_time` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `doctrine_migration_versions`
--

INSERT INTO `doctrine_migration_versions` (`version`, `executed_at`, `execution_time`) VALUES
('DoctrineMigrations\\Version20240826072012', '2024-08-26 07:20:27', 1362),
('DoctrineMigrations\\Version20240826073019', '2024-08-26 07:30:48', 415),
('DoctrineMigrations\\Version20240826073529', '2024-08-26 07:35:49', 1322),
('DoctrineMigrations\\Version20240826091401', '2024-08-26 09:14:22', 1745),
('DoctrineMigrations\\Version20240826120916', '2024-08-26 12:09:31', 3640),
('DoctrineMigrations\\Version20240826122249', '2024-08-26 12:22:55', 3699),
('DoctrineMigrations\\Version20240826122444', '2024-08-26 12:24:48', 2552),
('DoctrineMigrations\\Version20240827064612', '2024-08-27 06:47:08', 1220),
('DoctrineMigrations\\Version20240828070456', '2024-08-28 07:07:18', 4874),
('DoctrineMigrations\\Version20240828105119', '2024-08-28 10:51:58', 6537),
('DoctrineMigrations\\Version20240828105356', '2024-08-29 07:35:13', 6),
('DoctrineMigrations\\Version20240828110345', '2024-08-29 07:36:23', 7),
('DoctrineMigrations\\Version20240828111014', '2024-08-29 07:36:23', 4429),
('DoctrineMigrations\\Version20240828112321', '2024-08-29 07:41:51', 159),
('DoctrineMigrations\\Version20240829065320', '2024-08-29 07:41:51', 4207),
('DoctrineMigrations\\Version20240829071324', '2024-08-29 08:11:00', 9),
('DoctrineMigrations\\Version20240829080925', '2024-08-29 08:11:00', 655),
('DoctrineMigrations\\Version20240829084535', '2024-08-29 08:46:06', 3633),
('DoctrineMigrations\\Version20240830070159', '2024-08-30 07:02:48', 4246),
('DoctrineMigrations\\Version20240918084502', '2024-09-18 08:45:23', 1963),
('DoctrineMigrations\\Version20240918085159', '2024-09-18 08:52:04', 401),
('DoctrineMigrations\\Version20240920070341', '2024-09-20 07:05:19', 4982),
('DoctrineMigrations\\Version20240920072536', '2024-09-20 07:25:44', 2466),
('DoctrineMigrations\\Version20240920074848', '2024-09-20 07:50:54', 3580),
('DoctrineMigrations\\Version20240920075907', '2024-09-20 07:59:13', 8948);

-- --------------------------------------------------------

--
-- Structure de la table `login_site`
--

CREATE TABLE `login_site` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `name_site` varchar(255) NOT NULL,
  `login` varchar(255) NOT NULL,
  `mdp` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `login_site`
--

INSERT INTO `login_site` (`id`, `user_id`, `name_site`, `login`, `mdp`) VALUES
(17, 8, 'Instagram', 'abrahamhaendel8@gmail.com', '$2y$12$BRfS/4AojQFhpJ7ecxeME.r41IRgezyVcojMp09rr3ETTpWNO0g02'),
(18, 8, 'GitHub', 'bramwalker@gmail.com', '$2y$12$2xiP3jPQTiPYOcFssuwVAe6VY/NFsY1W5/HtbL0eALxQh3mPqC1Ce'),
(19, 18, 'Facebook', '0342277637', '$2y$12$9c5gE4mwkJzxcFkUrq04JOSVCXamhGC5d5MIAx6jPMgWPDYJ/v9Oi'),
(20, 18, 'GitHub', 'ClaudiusRkt', '$2y$12$2c.53nL5/a5VNfmezkr9yeBqypfPP/6SGd0kqOOor8KhjRERh0umK'),
(21, 18, 'Twiter', 'Null', '$2y$12$PzEh8YW..v3rPIcdNHSuUeAOoifZTJCc.SBJkb0ojkPA3JodDx/Ly'),
(22, 18, 'Stack Overflow', 'Null', '$2y$12$3qmwk8wj3SHRlYLKLozw2O7dSbSfWQ8QA6rcysMLTlOKBpbofbQNO'),
(23, 18, 'Instagram', 'Null', '$2y$12$/EWqnPdMv1AYPsa0er4AMuD2Fy5gDCUYIAOr9T1maYWIn/adLlUfi'),
(24, 18, 'Google', 'Null', '$2y$12$xAISlOuRsJbs61Y/hKdsZuVPDDpiFKxRVVjof9XReFiz9BkLJmEXO');

-- --------------------------------------------------------

--
-- Structure de la table `messenger_messages`
--

CREATE TABLE `messenger_messages` (
  `id` bigint(20) NOT NULL,
  `body` longtext NOT NULL,
  `headers` longtext NOT NULL,
  `queue_name` varchar(190) NOT NULL,
  `created_at` datetime NOT NULL COMMENT '(DC2Type:datetime_immutable)',
  `available_at` datetime NOT NULL COMMENT '(DC2Type:datetime_immutable)',
  `delivered_at` datetime DEFAULT NULL COMMENT '(DC2Type:datetime_immutable)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `permission`
--

CREATE TABLE `permission` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `created_at` datetime NOT NULL COMMENT '(DC2Type:datetime_immutable)',
  `site_id` int(11) NOT NULL,
  `is_authorized` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `permission`
--

INSERT INTO `permission` (`id`, `user_id`, `created_at`, `site_id`, `is_authorized`) VALUES
(2, 9, '2024-08-30 10:55:00', 7, 1),
(28, 8, '2024-09-05 08:02:00', 6, 1),
(31, 8, '2024-09-05 08:11:00', 10, 1),
(32, 9, '2024-09-05 08:12:00', 10, 1),
(33, 8, '2024-09-05 10:48:00', 7, 1),
(34, 12, '2024-09-06 05:21:00', 6, 1),
(35, 12, '2024-09-10 07:06:00', 10, 0),
(36, 12, '2024-09-10 07:06:00', 7, 0),
(37, 15, '2024-09-10 07:35:09', 6, 0),
(38, 15, '2024-09-10 07:35:09', 7, 1),
(39, 15, '2024-09-10 07:35:09', 10, 1),
(40, 8, '2024-09-10 08:01:01', 11, 1),
(41, 9, '2024-09-10 08:01:01', 11, 1),
(42, 11, '2024-09-10 08:01:01', 11, 1),
(43, 12, '2024-09-10 08:01:01', 11, 1),
(44, 15, '2024-09-10 08:01:01', 11, 1),
(45, 8, '2024-09-10 08:01:55', 12, 1),
(46, 9, '2024-09-10 08:01:55', 12, 1),
(47, 11, '2024-09-10 08:01:55', 12, 1),
(48, 12, '2024-09-10 08:01:55', 12, 1),
(49, 15, '2024-09-10 08:01:55', 12, 1),
(60, 8, '2024-09-12 11:34:44', 13, 1),
(61, 9, '2024-09-12 11:34:44', 13, 1),
(62, 11, '2024-09-12 11:34:44', 13, 1),
(63, 12, '2024-09-12 11:34:44', 13, 0),
(64, 15, '2024-09-12 11:34:44', 13, 0),
(66, 18, '2024-09-23 07:30:01', 6, 1),
(67, 18, '2024-09-23 07:30:01', 7, 1),
(68, 18, '2024-09-23 07:30:01', 10, 1),
(69, 18, '2024-09-23 07:30:01', 11, 1),
(70, 18, '2024-09-23 07:30:01', 12, 1),
(71, 18, '2024-09-23 07:30:01', 13, 1),
(78, 20, '2024-09-25 05:04:34', 6, 1),
(79, 20, '2024-09-25 05:04:34', 7, 1),
(80, 20, '2024-09-25 05:04:34', 10, 1),
(81, 20, '2024-09-25 05:04:34', 11, 1),
(82, 20, '2024-09-25 05:04:34', 12, 1),
(83, 20, '2024-09-25 05:04:34', 13, 1);

-- --------------------------------------------------------

--
-- Structure de la table `site`
--

CREATE TABLE `site` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `url` varchar(255) NOT NULL,
  `category_site_id` int(11) NOT NULL,
  `login_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `site`
--

INSERT INTO `site` (`id`, `user_id`, `name`, `url`, `category_site_id`, `login_id`) VALUES
(6, 8, 'Facebook', 'https://www.facebook.com', 2, 19),
(7, 8, 'Instagram', 'https://www.instagram.com', 2, 23),
(10, 8, 'Google', 'https://www.google.com', 2, 24),
(11, 8, 'GitHub', 'https://github.com/login', 10, 20),
(12, 8, 'Stack Overflow', 'https://stackoverflow.com/users/login', 2, 22),
(13, 8, 'Twitter', 'https://x.com/i/flow/login', 2, 21);

-- --------------------------------------------------------

--
-- Structure de la table `type_permission`
--

CREATE TABLE `type_permission` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `type_permission`
--

INSERT INTO `type_permission` (`id`, `name`, `description`) VALUES
(1, 'autorisé', 'Cela veut dire que l\'utilisateur a un accès à un site spécifique.'),
(2, 'no-autorisé', 'Cela veut dire que l\'utilisateur n\'a pas l\'accès à un site spécifique.');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `email` varchar(180) NOT NULL,
  `roles` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL CHECK (json_valid(`roles`)),
  `password` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `date_naissance` date NOT NULL,
  `lot` varchar(255) NOT NULL,
  `tel` int(11) NOT NULL,
  `image` varchar(255) DEFAULT NULL,
  `situation_familiale` varchar(255) NOT NULL,
  `lieu_naissance` varchar(255) NOT NULL,
  `genre` varchar(255) NOT NULL,
  `fonction` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `email`, `roles`, `password`, `name`, `surname`, `date_naissance`, `lot`, `tel`, `image`, `situation_familiale`, `lieu_naissance`, `genre`, `fonction`) VALUES
(8, 'bramwalker@gmail.com', '[\"ROLE_ADMIN\", \"ROLE_EDITOR\", \"ROLE_USER\"]', '$2y$13$LZioMNEU/7EYrhoM6UbvJOFiWoA3LfkhQZSNVGNm1VOGtn881MgB6', 'Haendel', 'abraham', '2003-10-01', 'ambohipo', 338533929, '92642319-315079699465067-6273181399486824448-n_66cd8aa87b1ca.jpg', 'Célibataire', 'Manambaro', 'masculin', 'Développeur'),
(9, 'avotra@gmail.com', '[\"ROLE_USER\"]', '$2y$13$IEbbKptj4yT9CMI6Q7uJeeqZnIW6kM8/9Cv7f48T18yaMuDOcrNUy', 'Avotra', 'Abraham', '2006-07-27', 'Ampasikabo FD', 338533929, '450516227-490184076713596-6653462302200970605-n_66cee3c3b76a3.jpg', 'Célibataire', 'Manambaro', 'masculin', 'Etudiant'),
(11, 'debryne@gmail.com', '[\"ROLE_USER\"]', '$2y$13$trLjsadXpa7EDFANdVBYzuwj3xSQSL.8xQDbySwhJZVLCUl0Ogbs6', 'De', 'Bruyne', '2024-09-05', 'belgique', 338533929, 'de-bruyne_66d985a0602c7.jpg', 'en couple', 'belgique', 'masculin', 'footballeur'),
(12, 'bramwalker2@gmail.com', '[\"ROLE_USER\"]', '$2y$13$/WuUlc46YNV5odjrih7FaOG4r/sof1UYcwrJx/FoaCgta7CyKGzW2', 'braham', 'bram', '2024-09-06', 'argentine', 338533929, 'messi_66da8f96de0e3.jpg', 'en couple', 'argentine', 'masculin', 'footballeur'),
(15, 'marina@gmail.com', '[\"ROLE_USER\"]', '$2y$13$/wYPT1LxxqVjutLQYhWnVe.7gcGN91jLi3aavXox2liKU07hBRKbm', 'Manambina Fanomezantsoa', 'marina', '2024-09-10', 'Fort-Dauphin', 385431314, 'marina_66dff6adccd9f.jpg', 'Célibataire', 'Ranopiso', 'féminin', 'Etudiante'),
(18, 'rakotonirinaclaudius@gmail.com', '[\"ROLE_ADMIN\", \"ROLE_EDITOR\", \"ROLE_USER\"]', '$2y$13$gLhVV1qGIMSRFK/RyTuD..xoVXpCjp3ikGii1B1v0jTKhbpqUgbWS', 'RAKOTONIRINAMPIJORO', 'Rojoniaina Claudius', '2005-01-13', 'By Pass', 388065251, 'pexels-sohi-807598_66f0fcd945efb.jpg', 'celibataire', 'Vinanitelo', 'masculin', 'developpeur desktop'),
(20, 'test@gmail.com', '[\"ROLE_USER\"]', '$2y$13$d5z5HSneieOZFY7HD4QVwO/HO9LddfxJaC/2pCWiy7N6jHsJe67RK', 'test', 'pretest', '2024-09-25', 'Alarobia', 342277637, 'pexels-souvenirpixels-417074_66f37dc1dfad9.jpg', 'célibataire', 'Alarobia', 'masculin', 'testeur');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `category_site`
--
ALTER TABLE `category_site`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `doctrine_migration_versions`
--
ALTER TABLE `doctrine_migration_versions`
  ADD PRIMARY KEY (`version`);

--
-- Index pour la table `login_site`
--
ALTER TABLE `login_site`
  ADD PRIMARY KEY (`id`),
  ADD KEY `IDX_AF3182A1A76ED395` (`user_id`);

--
-- Index pour la table `messenger_messages`
--
ALTER TABLE `messenger_messages`
  ADD PRIMARY KEY (`id`),
  ADD KEY `IDX_75EA56E0FB7336F0` (`queue_name`),
  ADD KEY `IDX_75EA56E0E3BD61CE` (`available_at`),
  ADD KEY `IDX_75EA56E016BA31DB` (`delivered_at`);

--
-- Index pour la table `permission`
--
ALTER TABLE `permission`
  ADD PRIMARY KEY (`id`),
  ADD KEY `IDX_E04992AAA76ED395` (`user_id`),
  ADD KEY `IDX_E04992AAF6BD1646` (`site_id`);

--
-- Index pour la table `site`
--
ALTER TABLE `site`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UNIQ_694309E45CB2E05D` (`login_id`),
  ADD KEY `IDX_694309E4A76ED395` (`user_id`),
  ADD KEY `IDX_694309E431655638` (`category_site_id`);

--
-- Index pour la table `type_permission`
--
ALTER TABLE `type_permission`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UNIQ_IDENTIFIER_EMAIL` (`email`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `category_site`
--
ALTER TABLE `category_site`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT pour la table `login_site`
--
ALTER TABLE `login_site`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT pour la table `messenger_messages`
--
ALTER TABLE `messenger_messages`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `permission`
--
ALTER TABLE `permission`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=84;

--
-- AUTO_INCREMENT pour la table `site`
--
ALTER TABLE `site`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT pour la table `type_permission`
--
ALTER TABLE `type_permission`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `login_site`
--
ALTER TABLE `login_site`
  ADD CONSTRAINT `FK_AF3182A1A76ED395` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);

--
-- Contraintes pour la table `permission`
--
ALTER TABLE `permission`
  ADD CONSTRAINT `FK_E04992AAA76ED395` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `FK_E04992AAF6BD1646` FOREIGN KEY (`site_id`) REFERENCES `site` (`id`);

--
-- Contraintes pour la table `site`
--
ALTER TABLE `site`
  ADD CONSTRAINT `FK_694309E431655638` FOREIGN KEY (`category_site_id`) REFERENCES `category_site` (`id`),
  ADD CONSTRAINT `FK_694309E45CB2E05D` FOREIGN KEY (`login_id`) REFERENCES `login_site` (`id`),
  ADD CONSTRAINT `FK_694309E4A76ED395` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
