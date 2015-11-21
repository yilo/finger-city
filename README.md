# finger-city
- launch ec2 micro
- install mysql
sudo apt-get update
sudo apt-get install mysql-server
 create database fcity;
 CREATE USER 'fcity'@'0.0.0.0' IDENTIFIED BY '********';
 grant ALL on fcity.* to 'fcity'@'0.0.0.0'
 CREATE USER 'fcity'@'%' IDENTIFIED BY 'fCity1121';
 grant ALL on fcity.* to 'fcity'@'%';
- install git
sudo apt-get install git
- install JDK
wget --no-check-certificate --no-cookies --header "Cookie: oraclelicense=accept-securebackup-cookie"