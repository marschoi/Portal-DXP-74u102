/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.cmars.student.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentWrapper
	extends BaseModelWrapper<Student>
	implements ModelWrapper<Student>, Student {

	public StudentWrapper(Student student) {
		super(student);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("studentId", getStudentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("studentCode", getStudentCode());
		attributes.put("studentName", getStudentName());
		attributes.put("studentEmail", getStudentEmail());
		attributes.put("studentPhone", getStudentPhone());
		attributes.put("studentGender", getStudentGender());
		attributes.put("studentAddress", getStudentAddress());
		attributes.put("field1", getField1());
		attributes.put("field2", isField2());
		attributes.put("field3", getField3());
		attributes.put("field4", getField4());
		attributes.put("field5", getField5());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String studentCode = (String)attributes.get("studentCode");

		if (studentCode != null) {
			setStudentCode(studentCode);
		}

		String studentName = (String)attributes.get("studentName");

		if (studentName != null) {
			setStudentName(studentName);
		}

		String studentEmail = (String)attributes.get("studentEmail");

		if (studentEmail != null) {
			setStudentEmail(studentEmail);
		}

		String studentPhone = (String)attributes.get("studentPhone");

		if (studentPhone != null) {
			setStudentPhone(studentPhone);
		}

		String studentGender = (String)attributes.get("studentGender");

		if (studentGender != null) {
			setStudentGender(studentGender);
		}

		String studentAddress = (String)attributes.get("studentAddress");

		if (studentAddress != null) {
			setStudentAddress(studentAddress);
		}

		String field1 = (String)attributes.get("field1");

		if (field1 != null) {
			setField1(field1);
		}

		Boolean field2 = (Boolean)attributes.get("field2");

		if (field2 != null) {
			setField2(field2);
		}

		Integer field3 = (Integer)attributes.get("field3");

		if (field3 != null) {
			setField3(field3);
		}

		Date field4 = (Date)attributes.get("field4");

		if (field4 != null) {
			setField4(field4);
		}

		String field5 = (String)attributes.get("field5");

		if (field5 != null) {
			setField5(field5);
		}
	}

	@Override
	public Student cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this student.
	 *
	 * @return the company ID of this student
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this student.
	 *
	 * @return the create date of this student
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the field1 of this student.
	 *
	 * @return the field1 of this student
	 */
	@Override
	public String getField1() {
		return model.getField1();
	}

	/**
	 * Returns the field2 of this student.
	 *
	 * @return the field2 of this student
	 */
	@Override
	public boolean getField2() {
		return model.getField2();
	}

	/**
	 * Returns the field3 of this student.
	 *
	 * @return the field3 of this student
	 */
	@Override
	public int getField3() {
		return model.getField3();
	}

	/**
	 * Returns the field4 of this student.
	 *
	 * @return the field4 of this student
	 */
	@Override
	public Date getField4() {
		return model.getField4();
	}

	/**
	 * Returns the field5 of this student.
	 *
	 * @return the field5 of this student
	 */
	@Override
	public String getField5() {
		return model.getField5();
	}

	/**
	 * Returns the group ID of this student.
	 *
	 * @return the group ID of this student
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this student.
	 *
	 * @return the modified date of this student
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this student.
	 *
	 * @return the primary key of this student
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the student address of this student.
	 *
	 * @return the student address of this student
	 */
	@Override
	public String getStudentAddress() {
		return model.getStudentAddress();
	}

	/**
	 * Returns the student code of this student.
	 *
	 * @return the student code of this student
	 */
	@Override
	public String getStudentCode() {
		return model.getStudentCode();
	}

	/**
	 * Returns the student email of this student.
	 *
	 * @return the student email of this student
	 */
	@Override
	public String getStudentEmail() {
		return model.getStudentEmail();
	}

	/**
	 * Returns the student gender of this student.
	 *
	 * @return the student gender of this student
	 */
	@Override
	public String getStudentGender() {
		return model.getStudentGender();
	}

	/**
	 * Returns the student ID of this student.
	 *
	 * @return the student ID of this student
	 */
	@Override
	public long getStudentId() {
		return model.getStudentId();
	}

	/**
	 * Returns the student name of this student.
	 *
	 * @return the student name of this student
	 */
	@Override
	public String getStudentName() {
		return model.getStudentName();
	}

	/**
	 * Returns the student phone of this student.
	 *
	 * @return the student phone of this student
	 */
	@Override
	public String getStudentPhone() {
		return model.getStudentPhone();
	}

	/**
	 * Returns the user ID of this student.
	 *
	 * @return the user ID of this student
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this student.
	 *
	 * @return the user name of this student
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this student.
	 *
	 * @return the user uuid of this student
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this student.
	 *
	 * @return the uuid of this student
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this student is field2.
	 *
	 * @return <code>true</code> if this student is field2; <code>false</code> otherwise
	 */
	@Override
	public boolean isField2() {
		return model.isField2();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this student.
	 *
	 * @param companyId the company ID of this student
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this student.
	 *
	 * @param createDate the create date of this student
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the field1 of this student.
	 *
	 * @param field1 the field1 of this student
	 */
	@Override
	public void setField1(String field1) {
		model.setField1(field1);
	}

	/**
	 * Sets whether this student is field2.
	 *
	 * @param field2 the field2 of this student
	 */
	@Override
	public void setField2(boolean field2) {
		model.setField2(field2);
	}

	/**
	 * Sets the field3 of this student.
	 *
	 * @param field3 the field3 of this student
	 */
	@Override
	public void setField3(int field3) {
		model.setField3(field3);
	}

	/**
	 * Sets the field4 of this student.
	 *
	 * @param field4 the field4 of this student
	 */
	@Override
	public void setField4(Date field4) {
		model.setField4(field4);
	}

	/**
	 * Sets the field5 of this student.
	 *
	 * @param field5 the field5 of this student
	 */
	@Override
	public void setField5(String field5) {
		model.setField5(field5);
	}

	/**
	 * Sets the group ID of this student.
	 *
	 * @param groupId the group ID of this student
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this student.
	 *
	 * @param modifiedDate the modified date of this student
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this student.
	 *
	 * @param primaryKey the primary key of this student
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the student address of this student.
	 *
	 * @param studentAddress the student address of this student
	 */
	@Override
	public void setStudentAddress(String studentAddress) {
		model.setStudentAddress(studentAddress);
	}

	/**
	 * Sets the student code of this student.
	 *
	 * @param studentCode the student code of this student
	 */
	@Override
	public void setStudentCode(String studentCode) {
		model.setStudentCode(studentCode);
	}

	/**
	 * Sets the student email of this student.
	 *
	 * @param studentEmail the student email of this student
	 */
	@Override
	public void setStudentEmail(String studentEmail) {
		model.setStudentEmail(studentEmail);
	}

	/**
	 * Sets the student gender of this student.
	 *
	 * @param studentGender the student gender of this student
	 */
	@Override
	public void setStudentGender(String studentGender) {
		model.setStudentGender(studentGender);
	}

	/**
	 * Sets the student ID of this student.
	 *
	 * @param studentId the student ID of this student
	 */
	@Override
	public void setStudentId(long studentId) {
		model.setStudentId(studentId);
	}

	/**
	 * Sets the student name of this student.
	 *
	 * @param studentName the student name of this student
	 */
	@Override
	public void setStudentName(String studentName) {
		model.setStudentName(studentName);
	}

	/**
	 * Sets the student phone of this student.
	 *
	 * @param studentPhone the student phone of this student
	 */
	@Override
	public void setStudentPhone(String studentPhone) {
		model.setStudentPhone(studentPhone);
	}

	/**
	 * Sets the user ID of this student.
	 *
	 * @param userId the user ID of this student
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this student.
	 *
	 * @param userName the user name of this student
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this student.
	 *
	 * @param userUuid the user uuid of this student
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this student.
	 *
	 * @param uuid the uuid of this student
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected StudentWrapper wrap(Student student) {
		return new StudentWrapper(student);
	}

}