create index IX_E090B0B0 on CMARS_Student (groupId);
create index IX_C2DEF1A7 on CMARS_Student (studentAddress[$COLUMN_LENGTH:75$]);
create index IX_76D445FE on CMARS_Student (studentCode[$COLUMN_LENGTH:75$]);
create index IX_C9EFC38F on CMARS_Student (studentEmail[$COLUMN_LENGTH:75$]);
create index IX_B27F9A12 on CMARS_Student (studentGender[$COLUMN_LENGTH:75$]);
create index IX_81388E1 on CMARS_Student (studentPhone[$COLUMN_LENGTH:75$]);
create index IX_4F0B6CAE on CMARS_Student (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_8C4346B0 on CMARS_Student (uuid_[$COLUMN_LENGTH:75$], groupId);