SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */





/* Drop Tables */


DROP TABLE IF EXISTS t_address;
DROP TABLE IF EXISTS t_category;
DROP TABLE IF EXISTS t_contact;

DROP TABLE IF EXISTS t_provider_category;
DROP TABLE IF EXISTS t_provider_feedback;
DROP TABLE IF EXISTS t_social;
DROP TABLE IF EXISTS t_provider;



/* Create Tables */
CREATE TABLE t_provider
(
	-- Id for company
	providerId binary(16) NOT NULL COMMENT 'Id for company',
	-- name of company, service provider
	providerName varchar(100) NOT NULL COMMENT 'name of company, service provider',
	email varchar(200) NOT NULL,
	verified bit(1) DEFAULT b'0' NOT NULL,
	status bit(1) DEFAULT b'1'  NOT NULL,
	createdOn timestamp DEFAULT CURRENT_TIMESTAMP,
	modifiedOn timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	modifiedBy varchar(50),
	shortDescription varchar(300),
	PRIMARY KEY (providerId)
)DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE t_address 
(
	addressId binary(16) NOT NULL ,
	providerId binary(16) NOT NULL,
	postcode smallint(10) NOT NULL,
	street varchar(100) NOT NULL,
	number varchar(200) NOT NULL,
	createdOn timestamp DEFAULT CURRENT_TIMESTAMP,
	modifiedOn timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	modifiedBy varchar(50),
	PRIMARY KEY (addressId),
	FOREIGN KEY (providerId) REFERENCES t_provider(providerId)
)DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE t_contact
(
	contactId binary(16) NOT NULL,
	providerId binary(16) NOT NULL,
	contactName varchar(100) NOT NULL,
	phone varchar(20),
	email varchar(200),
	status bit(1) DEFAULT b'1' NOT NULL,
	createdOn timestamp DEFAULT CURRENT_TIMESTAMP,
	modifiedOn timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	modifiedBy varchar(50),
	PRIMARY KEY (contactId),
	FOREIGN KEY (providerId) REFERENCES t_provider(providerId)
)DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE t_category
(
	categoryId binary(16) NOT NULL,
	categoryName varchar(100) NOT NULL,
	categoryInfo varchar(300) NOT NULL,
	status bit(1) DEFAULT b'1' NOT NULL,
	categoryParentId binary(16) DEFAULT 0 NOT NULL,
	createdOn timestamp DEFAULT CURRENT_TIMESTAMP,
	modifiedOn timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	modifiedBy varchar(50),
	PRIMARY KEY (categoryId),
	UNIQUE (categoryName)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;





CREATE TABLE t_provider_category
(
	providerId binary(16) NOT NULL,
	categoryId binary(16) NOT NULL,
	status bit(1) DEFAULT b'1' NOT NULL,
	PRIMARY KEY (providerId, categoryId)
)DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;



CREATE TABLE t_provider_feedback
(
	providerId binary(16) NOT NULL,
	feedbackId smallint NOT NULL,
	-- good/bad/na
	feedbackType char(1) NOT NULL COMMENT 'good/bad/na',
	reviewedBy varchar(200),
	feedback varchar(2000) NOT NULL,
	createdOn timestamp DEFAULT CURRENT_TIMESTAMP,
	modifiedOn timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	modifiedBy varchar(50),
	PRIMARY KEY (providerId, feedbackId)
)DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE t_social
(
	socialId binary(16) NOT NULL,
	socialType tinyint(2) NOT NULL,
	socialLoginId varchar(100) NOT NULL,
	providerId binary(16) NOT NULL,
	createdOn timestamp DEFAULT CURRENT_TIMESTAMP,
	modifiedOn timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	modifiedBy varchar(50),
	PRIMARY KEY (socialId, providerId)
)DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;



/* Create Indexes */





