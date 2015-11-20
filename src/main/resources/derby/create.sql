drop table fcity.T_Provider;
create table fcity.T_Provider (
	providerId SMALLINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	providerName VARCHAR(255) NOT NULL,
	EMail VARCHAR(255) NOT NULL,
	Score SMALLINT NOT NULL, -- used to control
	IsVerified CHAR(1)  NOT NULL,
	Description VARCHAR(1000),
	CreatedOn TIMESTAMP NOT NULL,
	LastLogOn TIMESTAMP ,
CONSTRAINT verified_range CHECK (IsVerified in ('0','1')));

drop table fcity.T_Address;
create table fcity.T_Address (
	addressId INTEGER  PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	postCode INTEGER NOT NULL,
	addressName VARCHAR(255)
);

create index post_code_index ON fcity.T_Address (postCode);

drop table fcity.T_Provider_Address;
create table fcity.T_Provider_Address (
	providerId INTEGER NOT NULL, -- provider ID or requestor ID
	addressId INTEGER  NOT NULL
);

drop table fcity.T_Category;
create table fcity.T_Category (
	categoryId INTEGER  PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	categoryName VARCHAR(50) NOT NULL,
	categoryInfo VARCHAR(200)
);

drop table fcity.T_Provider_Category;
create table fcity.T_Provider_Category (
	providerId INTEGER NOT NULL,
	categoryId INTEGER NOT NULL
);

create table fcity.T_Contact (
	contactId INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	linkId INTEGER NOT NULL,
	contactName VARCHAR(100) NOT NULL,
	contactPhone VARCHAR(20),
	contactEMail VARCHAR(100),
	contactStatus CHAR(1),
CONSTRAINT contact_status_range CHECK (contactStatus in ('0','1')) -- alive or not
);

drop table fcity.T_Provider_Feedback;
create table fcity.T_Provider_Feedback (
     providerId INT NOT NULL,
     feedbackId INT NOT NULL,
     feedbackType INT NOT NULL,
     feedback VARCHAR(2000) NOT NULL,
     CreatedOn TIMESTAMP NOT NULL,
     ModifiedOn TIMESTAMP
CONSTRAINT PRIMARY_KEY PRIMARY KEY (providerId,feedbackId),
CONSTRAINT feedbackType_range CHECK (feedbackType in (0,1,2)) -- good,bad,na
);