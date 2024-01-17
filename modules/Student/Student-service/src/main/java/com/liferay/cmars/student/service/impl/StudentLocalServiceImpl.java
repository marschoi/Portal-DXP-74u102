/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.cmars.student.service.impl;

import com.liferay.cmars.student.exception.NoSuchStudentException;
import com.liferay.cmars.student.model.Student;
import com.liferay.cmars.student.service.base.StudentLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;


/**
 * @author CMARS [cmars@triangles.co.kr]
 */
@Component(
	property = "model.class.name=com.liferay.cmars.student.model.Student",
	service = AopService.class
)
public class StudentLocalServiceImpl extends StudentLocalServiceBaseImpl {
	public Student addStudent(long userId, String studentCode, String studentName, String studentEmail, String studentPhone,
							  String studentGender, String studentAddress, ServiceContext serviceContext) throws PortalException {

		// Get the User and Group ID
		User user = userLocalService.getUserById(userId);
		long groupId = serviceContext.getScopeGroupId();

		// Generate a primary key for the student
		long studentId = counterLocalService.increment(Student.class.getName());

		// Create the student object
		Student student = studentPersistence.create(studentId);

		// Populate fields
		student.setUuid(serviceContext.getUuid());
		student.setUserId(userId);
		student.setGroupId(groupId);
		student.setCompanyId(user.getCompanyId());
		student.setUserName(user.getFullName());
		student.setCreateDate(serviceContext.getCreateDate(new Date()));
		student.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		student.setStudentCode(studentCode);
		student.setStudentName(studentName);
		student.setStudentEmail(studentEmail);
		student.setStudentPhone(studentPhone);
		student.setStudentGender(studentGender);
		student.setStudentAddress(studentAddress);

		return studentPersistence.update(student);
	}

	public Student updateStudent(long studentId, String studentCode, String studentName, String studentEmail, String studentPhone,
								 String studentGender, String studentAddress, ServiceContext serviceContext) throws PortalException {

		Student student = studentPersistence.findByPrimaryKey(studentId);
		student.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		student.setStudentCode(studentCode);
		student.setStudentName(studentName);
		student.setStudentEmail(studentEmail);
		student.setStudentPhone(studentPhone);
		student.setStudentGender(studentGender);
		student.setStudentAddress(studentAddress);

		return studentPersistence.update(student);

	}

	public Student deleteStudent(long studentId) throws PortalException {
		// Fetch the student to be deleted
		Student student = getStudent(studentId);

		// Additional logic before deletion (e.g., asset deletion, deindexing)
		// Delete the student
		studentPersistence.remove(student);

		return student;
	}

	/*------------------------------------------------- Search -----------------------------------------------------------------------*/

	public List<Student> searchStudentByGroupId(long groupId) {
		return studentPersistence.findByGroupId(groupId);
	}

	public List<Student> searchStudentByGroupId(long groupId, int start, int end) {
		return studentPersistence.findByGroupId(groupId, start, end);
	}

	public List<Student> searchStudentByGroupId(long groupId, int start, int end, OrderByComparator<Student> comparator) {
		return studentPersistence.findByGroupId(groupId, start, end, comparator);
	}

	public List<Student> searchStudentCode(String studentCode) throws NoSuchStudentException {
		return studentPersistence.findByStudentName(studentCode);
	}

	public List<Student> searchStudentCode(String studentCode, int start, int end) throws NoSuchStudentException {
		return studentPersistence.findByStudentName(studentCode, start, end);
	}

	public List<Student> searchStudentCode(String studentCode, int start, int end, OrderByComparator<Student> comparator) throws NoSuchStudentException {
		return studentPersistence.findByStudentName(studentCode, start, end, comparator);
	}


	public List<Student> searchStudentName(String studentName) throws NoSuchStudentException {
		return studentPersistence.findByStudentName(studentName);
	}

	public List<Student> searchStudentName(String studentName, int start, int end) throws NoSuchStudentException {
		return studentPersistence.findByStudentName(studentName, start, end);
	}

	public List<Student> searchStudentName(String studentName, int start, int end, OrderByComparator<Student> comparator) throws NoSuchStudentException {
		return studentPersistence.findByStudentName(studentName, start, end, comparator);
	}


	public List<Student> searchStudentEmail(String studentEmail) throws NoSuchStudentException {
		return studentPersistence.findByStudentEmail(studentEmail);
	}

	public List<Student> searchStudentEmail(String studentEmail, int start, int end) throws NoSuchStudentException {
		return studentPersistence.findByStudentEmail(studentEmail, start, end);
	}

	public List<Student> searchStudentEmail(String studentEmail, int start, int end, OrderByComparator<Student> comparator) throws NoSuchStudentException {
		return studentPersistence.findByStudentEmail(studentEmail, start, end, comparator);
	}


	public List<Student> searchStudentPhone(String studentPhone) throws NoSuchStudentException {
		return studentPersistence.findByStudentPhone(studentPhone);
	}

	public List<Student> searchStudentPhone(String studentPhone, int start, int end) throws NoSuchStudentException {
		return studentPersistence.findByStudentPhone(studentPhone, start, end);
	}

	public List<Student> searchStudentPhone(String studentPhone, int start, int end, OrderByComparator<Student> comparator) throws NoSuchStudentException {
		return studentPersistence.findByStudentPhone(studentPhone, start, end, comparator);
	}

	public List<Student> searchStudentGender(String studentGender) throws NoSuchStudentException {
		return studentPersistence.findByStudentGender(studentGender);
	}

	public List<Student> searchStudentGender(String studentGender, int start, int end) throws NoSuchStudentException {
		return studentPersistence.findByStudentGender(studentGender, start, end);
	}

	public List<Student> searchStudentGender(String studentGender, int start, int end, OrderByComparator<Student> comparator) throws NoSuchStudentException {
		return studentPersistence.findByStudentGender(studentGender, start, end, comparator);
	}


	public List<Student> searchStudentAddress(String studentAddress) throws NoSuchStudentException {
		return studentPersistence.findByStudentAddress(studentAddress);
	}

	public List<Student> searchStudentAddress(String studentAddress, int start, int end) throws NoSuchStudentException {
		return studentPersistence.findByStudentAddress(studentAddress, start, end);
	}

	public List<Student> searchStudentAddress(String studentAddress, int start, int end, OrderByComparator<Student> comparator) throws NoSuchStudentException {
		return studentPersistence.findByStudentAddress(studentAddress, start, end, comparator);
	}


	/* Keyword Search */
	public List<Student> searchStudentByKeyWords(long groupId, String keywords, int start, int end, OrderByComparator<Student> comparator) {
		return studentLocalService.dynamicQuery(dynamicQueryByKeywords(groupId, keywords), start, end, comparator);
	}

	public long searchStudentsCountByKeywords(long groupId, String keywords) {
		return studentLocalService.dynamicQueryCount(dynamicQueryByKeywords(groupId, keywords));
	}

	private DynamicQuery dynamicQueryByKeywords(long groupId, String keywords) {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Student.class, getClassLoader());
		Property groupIdProperty = PropertyFactoryUtil.forName("groupId");
		dynamicQuery.add(groupIdProperty.eq(groupId));

		if (Validator.isNotNull(keywords)) {
			Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
			disjunction.add(RestrictionsFactoryUtil.like("StudentCode", "%" + keywords + "%"));
			disjunction.add(RestrictionsFactoryUtil.like("StudentName", "%" + keywords + "%"));
			disjunction.add(RestrictionsFactoryUtil.like("StudentPhone", "%" + keywords + "%"));
			disjunction.add(RestrictionsFactoryUtil.like("StudentEmail", "%" + keywords + "%"));
			disjunction.add(RestrictionsFactoryUtil.like("StudentAddress", "%" + keywords + "%"));
		}
		return dynamicQuery;
	}


}