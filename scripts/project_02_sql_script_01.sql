create database movies_db;

use movies_db;

create table `movies_db`.`movies` (
  `id` int not null auto_increment,
  `name` VARCHAR(75) not null,
  `description` VARCHAR(200) not null,
  `year` int not null,
  primary key(`id`)
);

INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('The Shawshank Redemption', 'Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.', 1994);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('The Godfather', 'The aging patriarch of an organized crime dynasty in postwar New York City transfers control of his clandestine empire to his reluctant youngest son.', 1972);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('The Dark Knight', 'When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.', 2008);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('The Godfather Part II', 'The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.', 1974);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('12 Angry Men', 'The jury in a New York City murder trial is frustrated by a single member whose skeptical caution forces them to more carefully consider the evidence before jumping to a hasty verdict.', 1957);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('Schindlers List', 'In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.', 1993);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('The Lord of the Rings: The Return of the King', 'Gandalf and Aragorn lead the World of Men against Saurons army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.', 2003);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('Pulp Fiction', 'The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.', 1994);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('The Lord of the Rings: The Fellowship of the Ring', 'A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.', 2001);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('The Good, the Bad and the Ugly', 'A bounty hunting scam joins two men in an uneasy alliance against a third in a race to find a fortune in gold buried in a remote cemetery.', 1966);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('Forrest Gump', 'The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal and other historical events unfold from the perspective of an Alabama man with an IQ of 75, whose only desire is to be reunited with his childhood sweetheart.', 1994);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('Fight Club', 'An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.', 1999);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('Inception', 'A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O., but his tragic past may doom the project and his team to disaster.', 2010);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('The Lord of the Rings: The Two Towers', 'While Frodo and Sam edge closer to Mordor with the help of the shifty Gollum, the divided fellowship makes a stand against Saurons new ally, Saruman, and his hordes of Isengard.', 2002);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('Star Wars: Episode V - The Empire Strikes Back', 'After the Rebels are brutally overpowered by the Empire on the ice planet Hoth, Luke Skywalker begins Jedi training with Yoda, while his friends are pursued across the galaxy by Darth Vader and bounty hunter Boba Fett.', 1980);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('The Matrix', 'When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence.', 1999);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('Goodfellas ', 'The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners Jimmy Conway and Tommy DeVito in the Italian-American crime syndicate.', 1990);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('One Flew Over the Cuckoos Nest', 'A criminal pleads insanity and is admitted to a mental institution, where he rebels against the oppressive nurse and rallies up the scared patients.', 1975);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('Se7en', 'Two detectives, a rookie and a veteran, hunt a serial killer who uses the seven deadly sins as his motives.', 1995);
INSERT INTO `movies_db`.`movies` (`name`,`description`,`year`) VALUES ('Seven Samurai', 'A poor village under attack by bandits recruits seven unemployed samurai to help them defend themselves.', 1954);




