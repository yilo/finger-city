SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX postcode_index ON t_address;
DROP INDEX category_name_index ON t_category;
DROP INDEX name_index ON t_provider;



/* Drop Tables */

DROP TABLE IF EXISTS t_address;
DROP TABLE IF EXISTS t_category;
DROP TABLE IF EXISTS t_contact;
DROP TABLE IF EXISTS t_provider;
DROP TABLE IF EXISTS t_provider_address;
DROP TABLE IF EXISTS t_provider_category;
DROP TABLE IF EXISTS t_provider_contact;
DROP TABLE IF EXISTS t_provider_feedback;
DROP TABLE IF EXISTS t_social;




/* Create Tables */

CREATE TABLE t_address
(
	addressId smallint NOT NULL AUTO_INCREMENT,
	postcode smallint(10) NOT NULL,
	street varchar(100) NOT NULL,
	number varchar(200) NOT NULL,
	PRIMARY KEY (addressId)
);


CREATE TABLE t_category
(
	categoryId smallint NOT NULL,
	categoryName varchar(100) NOT NULL,
	categoryInfo varchar(300) NOT NULL,
	status bit(1) DEFAULT 1 NOT NULL,
	categoryParentId smallint DEFAULT 0 NOT NULL,
	PRIMARY KEY (categoryId),
	UNIQUE (categoryName)
);


CREATE TABLE t_contact
(
	contactId smallint NOT NULL,
	contactName varchar(100) NOT NULL,
	phone varchar(20),
	email varchar(200),
	status bit(1) DEFAULT 1 NOT NULL,
	PRIMARY KEY (contactId)
);


CREATE TABLE t_provider
(
	-- Id for company
	providerId smallint NOT NULL AUTO_INCREMENT COMMENT 'Id for company',
	-- name of company, service provider
	providerName varchar(100) NOT NULL COMMENT 'name of company, service provider',
	email varchar(200) NOT NULL,
	verified bit(1) DEFAULT 0 NOT NULL,
	status bit(1) DEFAULT 1  NOT NULL,
	createdOn timestamp NOT NULL,
	modifiedOn timestamp,
	modifiedBy varchar(50),
	shortDescription varchar(300),
	PRIMARY KEY (providerId)
);


CREATE TABLE t_provider_address
(
	providerId smallint NOT NULL,
	addressId smallint NOT NULL,
	status bit(1) DEFAULT 1 NOT NULL,
	PRIMARY KEY (providerId, addressId)
);


CREATE TABLE t_provider_category
(
	providerId smallint NOT NULL,
	categoryId smallint NOT NULL,
	status bit(1) DEFAULT 1 NOT NULL,
	PRIMARY KEY (providerId, categoryId)
);


CREATE TABLE t_provider_contact
(
	providerId smallint NOT NULL,
	contactId smallint NOT NULL,
	status bit(1) DEFAULT 1 NOT NULL,
	PRIMARY KEY (providerId, contactId)
);


CREATE TABLE t_provider_feedback
(
	providerId smallint NOT NULL,
	feedbackId smallint NOT NULL,
	-- good/bad/na
	feedbackType char(1) NOT NULL COMMENT 'good/bad/na',
	createdOn timestamp NOT NULL,
	reviewedBy varchar(200),
	feedback varchar(2000) NOT NULL,
	PRIMARY KEY (providerId, feedbackId)
);


CREATE TABLE t_social
(
	socialId smallint NOT NULL,
	socialType tinyint(2) NOT NULL,
	socialLoginId varchar(100) NOT NULL,
	providerId smallint NOT NULL,
	PRIMARY KEY (socialId, providerId)
);



/* Create Indexes */

CREATE INDEX postcode_index ON t_address (postcode ASC);
CREATE UNIQUE INDEX category_name_index ON t_category (categoryName ASC);
CREATE UNIQUE INDEX provider_name_index ON t_provider (providerName ASC);



