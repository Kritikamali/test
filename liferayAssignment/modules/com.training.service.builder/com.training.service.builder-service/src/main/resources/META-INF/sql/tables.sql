create table userext (
	uuid_ VARCHAR(75) null,
	userextId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	screenName VARCHAR(75) null,
	email VARCHAR(75) null,
	officeID LONG,
	officeLocation VARCHAR(75) null,
	officeDesignation VARCHAR(75) null,
	reportingTo VARCHAR(75) null
);