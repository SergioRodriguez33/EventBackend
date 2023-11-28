# EventBackend
This is the submodule to be added to the main repo WRX2 for our web dev project. It handles the event creation html form and sends the user input to a mysql database.

Use the following script in your mysql database:
-----------------------------------------------
CREATE DATABASE IF NOT EXISTS eventDatabase;

USE eventDatabase;

CREATE TABLE IF NOT EXISTS ccEvent (
    id INT AUTO_INCREMENT PRIMARY KEY,
    start_time VARCHAR(255),
    end_time VARCHAR(255),
    event_location VARCHAR(255),
    event_cost INT,
    volunteer_amount INT,
    event_name VARCHAR(255),
    event_description VARCHAR(255),
    event_date VARCHAR(255)
);
-----------------------------------------------
This script will create a database in your machine to which the user input will be logged.
A
Also ensure that your application properties file is set to the appropriate parameters and specific to your machine. ie username and password.
