DROP TABLE words;
CREATE TABLE words (id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
                    word varchar(25) NOT NULL,
                    word_type varchar(20) NOT NULL,
                    description text NOT NULL);
RUNSCRIPT FROM 'classpath:import2.sql';
RUNSCRIPT FROM 'classpath:import3.sql';
RUNSCRIPT FROM 'classpath:import4.sql';
RUNSCRIPT FROM 'classpath:import5.sql';
RUNSCRIPT FROM 'classpath:import6.sql';
RUNSCRIPT FROM 'classpath:import7.sql';
RUNSCRIPT FROM 'classpath:import8.sql';
RUNSCRIPT FROM 'classpath:import9.sql';
RUNSCRIPT FROM 'classpath:import10.sql';
RUNSCRIPT FROM 'classpath:import11.sql';
RUNSCRIPT FROM 'classpath:import12.sql';
RUNSCRIPT FROM 'classpath:import13.sql';
RUNSCRIPT FROM 'classpath:import14.sql';
RUNSCRIPT FROM 'classpath:import15.sql';
RUNSCRIPT FROM 'classpath:import16.sql';
RUNSCRIPT FROM 'classpath:import17.sql';
RUNSCRIPT FROM 'classpath:import18.sql';