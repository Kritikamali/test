create index IX_AFC09B10 on userext (email[$COLUMN_LENGTH:75$]);
create index IX_F71B53C7 on userext (officeID);
create index IX_81648FB0 on userext (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_512D4232 on userext (uuid_[$COLUMN_LENGTH:75$], groupId);