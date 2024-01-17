/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.cmars.student.model.impl;

import com.liferay.cmars.student.model.Student;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StudentCacheModel implements CacheModel<Student>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof StudentCacheModel)) {
			return false;
		}

		StudentCacheModel studentCacheModel = (StudentCacheModel)object;

		if (studentId == studentCacheModel.studentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, studentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", studentId=");
		sb.append(studentId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", studentCode=");
		sb.append(studentCode);
		sb.append(", studentName=");
		sb.append(studentName);
		sb.append(", studentEmail=");
		sb.append(studentEmail);
		sb.append(", studentPhone=");
		sb.append(studentPhone);
		sb.append(", studentGender=");
		sb.append(studentGender);
		sb.append(", studentAddress=");
		sb.append(studentAddress);
		sb.append(", field1=");
		sb.append(field1);
		sb.append(", field2=");
		sb.append(field2);
		sb.append(", field3=");
		sb.append(field3);
		sb.append(", field4=");
		sb.append(field4);
		sb.append(", field5=");
		sb.append(field5);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Student toEntityModel() {
		StudentImpl studentImpl = new StudentImpl();

		if (uuid == null) {
			studentImpl.setUuid("");
		}
		else {
			studentImpl.setUuid(uuid);
		}

		studentImpl.setStudentId(studentId);
		studentImpl.setGroupId(groupId);
		studentImpl.setCompanyId(companyId);
		studentImpl.setUserId(userId);

		if (userName == null) {
			studentImpl.setUserName("");
		}
		else {
			studentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			studentImpl.setCreateDate(null);
		}
		else {
			studentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			studentImpl.setModifiedDate(null);
		}
		else {
			studentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (studentCode == null) {
			studentImpl.setStudentCode("");
		}
		else {
			studentImpl.setStudentCode(studentCode);
		}

		if (studentName == null) {
			studentImpl.setStudentName("");
		}
		else {
			studentImpl.setStudentName(studentName);
		}

		if (studentEmail == null) {
			studentImpl.setStudentEmail("");
		}
		else {
			studentImpl.setStudentEmail(studentEmail);
		}

		if (studentPhone == null) {
			studentImpl.setStudentPhone("");
		}
		else {
			studentImpl.setStudentPhone(studentPhone);
		}

		if (studentGender == null) {
			studentImpl.setStudentGender("");
		}
		else {
			studentImpl.setStudentGender(studentGender);
		}

		if (studentAddress == null) {
			studentImpl.setStudentAddress("");
		}
		else {
			studentImpl.setStudentAddress(studentAddress);
		}

		if (field1 == null) {
			studentImpl.setField1("");
		}
		else {
			studentImpl.setField1(field1);
		}

		studentImpl.setField2(field2);
		studentImpl.setField3(field3);

		if (field4 == Long.MIN_VALUE) {
			studentImpl.setField4(null);
		}
		else {
			studentImpl.setField4(new Date(field4));
		}

		if (field5 == null) {
			studentImpl.setField5("");
		}
		else {
			studentImpl.setField5(field5);
		}

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		studentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		studentCode = objectInput.readUTF();
		studentName = objectInput.readUTF();
		studentEmail = objectInput.readUTF();
		studentPhone = objectInput.readUTF();
		studentGender = objectInput.readUTF();
		studentAddress = objectInput.readUTF();
		field1 = objectInput.readUTF();

		field2 = objectInput.readBoolean();

		field3 = objectInput.readInt();
		field4 = objectInput.readLong();
		field5 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(studentId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (studentCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(studentCode);
		}

		if (studentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(studentName);
		}

		if (studentEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(studentEmail);
		}

		if (studentPhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(studentPhone);
		}

		if (studentGender == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(studentGender);
		}

		if (studentAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(studentAddress);
		}

		if (field1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(field1);
		}

		objectOutput.writeBoolean(field2);

		objectOutput.writeInt(field3);
		objectOutput.writeLong(field4);

		if (field5 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(field5);
		}
	}

	public String uuid;
	public long studentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String studentCode;
	public String studentName;
	public String studentEmail;
	public String studentPhone;
	public String studentGender;
	public String studentAddress;
	public String field1;
	public boolean field2;
	public int field3;
	public long field4;
	public String field5;

}