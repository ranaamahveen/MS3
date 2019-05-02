# MS3
Instructions to run the program
------------------------------------------------------------------------------------------------------------------------------
1.	Navigate to repository https://github.com/ranaamahveen/MS3.git 
2.	Download the source files and Jar file from git repository
3.	Open command prompt and navigate to the downloaded file location
4.	Run the ‘import2SQLite.jar’ using the below command
  java -jar import2SQLite.jar
5.	Enter the csv file name with path that needs to be parsed and inserted to SQLite DB and press enter
6.	After successful run, ms3log.txt and ms3.db will be created in your working directory
7.	Load ms3.db to check the inserted table using SQLite manager add on or SQLite DB manager

Technologies and Versions
-----------------------------------------------------------------------------------------------------------------------------
I used the following technologies: Java, JDBC, log4j for logging purposes, DB browser for SQLite for testing and Eclipse IDE
Jdk – jdk-10
SQLite JDBC driver - sqlite-jdbc-3.8.6.jar
Log4j – log4j-1.2.17.jar

Requirements
------------------------------------------------------------------------------------------------------------------------------
1.	CSV file is inserted into the SQLite DB
2.	Records with any blank cells or records containing more than the given number of columns are verified and written to bad-data-<timestamp>.csv
3.	Mentioned statistics are written to log file named ms3log.txt

Approach
-----------------------------------------------------------------------------------------------------------------------------------
Eclipse IDE is used to code the project, I explored a little about SQLite DB 
After reading the programming challenge instruction file, I researched about SQLite DB and JDBC connection to SQLite. I tried both SQLite manager addon for google chrome and SQLite DB browser to get familiar with SQLite. Then, I proceeded with the code to parse the CSV and used SQLite JDBC driver to initiate the connection between java and SQLIte.

I had a little difficulty in parsing the column value which was separated with comma within the same column, but I figured it out after re-reading the instructions. I used log4j for logging the statistics to the log file.
