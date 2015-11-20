create table fcity.users(
	ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	UserName VARCHAR(255) NOT NULL,
	UserType INTEGER  NOT NULL, --service provider/requestor
	EMail VARCHAR(255) NOT NULL,
	IsVerified INTEGER  NOT NULL,
	CreatedOn DATETIME NOT NULL,
	LastLogOn DATETIME ,
CONSTRAINT primary_key PRIMARY KEY (ID),
CONSTRAINT usertype_range CHECK (UserType in (0,1)),
CONSTRAINT verified_range CHECK (IsVerified in (0,1)));
