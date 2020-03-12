DROP TABLE IF EXISTS flight;
 
CREATE TABLE flight (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  source varchar(100) not null,
  destination varchar(100) not null,
  airlinesName VARCHAR(250) NOT NULL,
  travelDate datetime(3) NOT NULL
);
 
INSERT INTO flight(source , destination, airlinesName, travelDate) VALUES   ('src1', 'dest1','airline1', '2017-01-01 00:00:00');
INSERT INTO flight(source , destination, airlinesName, travelDate) VALUES   ('src2', 'dest2','airline2', '2017-01-03 00:00:00');
INSERT INTO flight(source , destination, airlinesName, travelDate) VALUES   ('src1', 'dest1','airline3', '2017-01-01 00:00:00');
INSERT INTO flight(source , destination, airlinesName, travelDate) VALUES   ('src4', 'dest4','airline4', '2017-01-02 00:00:00');
INSERT INTO flight(source , destination, airlinesName, travelDate) VALUES   ('src2', 'dest2','airline2', '2017-01-03 00:00:00');
INSERT INTO flight(source , destination, airlinesName, travelDate) VALUES   ('src5', 'dest5','airline4', '2017-01-04 00:00:00');

INSERT INTO flight(source , destination, airlinesName, travelDate) VALUES   ('src5', 'dest5','airline3', '2017-01-01 00:00:00');
INSERT INTO flight(source , destination, airlinesName, travelDate) VALUES   ('src2', 'dest2','airline2', '2017-01-04 00:00:00');
INSERT INTO flight(source , destination, airlinesName, travelDate) VALUES   ('src1', 'dest1','airline5', '2017-01-01 00:00:00');
INSERT INTO flight(source , destination, airlinesName, travelDate) VALUES   ('src4', 'dest4','airline5', '2017-01-02 00:00:00');
INSERT INTO flight(source , destination, airlinesName, travelDate) VALUES   ('src4', 'dest4','airline2', '2017-01-03 00:00:00');
INSERT INTO flight(source , destination, airlinesName, travelDate) VALUES   ('src5', 'dest5','airline2', '2017-01-04 00:00:00');



DROP TABLE IF EXISTS booking;
 
CREATE TABLE booking (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  source varchar(100) not null,
  destination varchar(100) not null,
  bookingdate datetime(3) NOT NULL,
  traveldate datetime(3) NOT NULL,
  flightid long not null,
  airlinesname varchar(100)	

);


INSERT INTO booking (source , destination, bookingdate , traveldate ,flightid , airlinesname) VALUES   ('src1', 'dest1', '2016-01-01 00:00:00', '2017-01-01 00:00:00' ,1,'airline1');
INSERT INTO booking (source , destination, bookingdate , traveldate ,flightid , airlinesname) VALUES   ('src1', 'dest1','2016-01-01 00:00:00' ,'2017-01-01 00:00:00',9, 'airline5');
INSERT INTO booking (source , destination, bookingdate , traveldate ,flightid , airlinesname) VALUES   ('src4', 'dest4','2016-01-01 00:00:00' ,'2017-01-02 00:00:00', 4,'airline4');
INSERT INTO booking (source , destination, bookingdate , traveldate ,flightid , airlinesname) VALUES   ('src4', 'dest4','2016-01-01 00:00:00' ,'2017-01-02 00:00:00', 4,'airline5');
 
DROP TABLE IF EXISTS passenger;
 
CREATE TABLE passenger (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name varchar(250) not null,  
  dob timestamp NOT NULL,
  bookingId long not null 
);
