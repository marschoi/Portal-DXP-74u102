/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.cmars.student.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;CMARS_Student&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentTable extends BaseTable<StudentTable> {

	public static final StudentTable INSTANCE = new StudentTable();

	public final Column<StudentTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentTable, Long> studentId = createColumn(
		"studentId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<StudentTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<StudentTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<StudentTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<StudentTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<StudentTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<StudentTable, String> studentCode = createColumn(
		"studentCode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentTable, String> studentName = createColumn(
		"studentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentTable, String> studentEmail = createColumn(
		"studentEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentTable, String> studentPhone = createColumn(
		"studentPhone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentTable, String> studentGender = createColumn(
		"studentGender", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentTable, String> studentAddress = createColumn(
		"studentAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentTable, String> field1 = createColumn(
		"field1", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentTable, Boolean> field2 = createColumn(
		"field2", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<StudentTable, Integer> field3 = createColumn(
		"field3", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<StudentTable, Date> field4 = createColumn(
		"field4", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<StudentTable, String> field5 = createColumn(
		"field5", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private StudentTable() {
		super("CMARS_Student", StudentTable::new);
	}

}