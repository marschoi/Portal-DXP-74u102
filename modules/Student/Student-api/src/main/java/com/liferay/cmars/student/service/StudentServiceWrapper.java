/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.cmars.student.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StudentService}.
 *
 * @author Brian Wing Shun Chan
 * @see StudentService
 * @generated
 */
public class StudentServiceWrapper
	implements ServiceWrapper<StudentService>, StudentService {

	public StudentServiceWrapper() {
		this(null);
	}

	public StudentServiceWrapper(StudentService studentService) {
		_studentService = studentService;
	}

	@Override
	public com.liferay.cmars.student.model.Student addStudent(
			long userId, String studentCode, String studentName,
			String studentEmail, String studentPhone, String studentGender,
			String studentAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentService.addStudent(
			userId, studentCode, studentName, studentEmail, studentPhone,
			studentGender, studentAddress, serviceContext);
	}

	@Override
	public com.liferay.cmars.student.model.Student deleteStudent(
			long studentId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentService.deleteStudent(studentId, serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _studentService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentAddress(String studentAddress)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentAddress(studentAddress);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentAddress(String studentAddress, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentAddress(studentAddress, start, end);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentAddress(
				String studentAddress, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentAddress(
			studentAddress, start, end, comparator);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
		searchStudentByGroupId(long groupId) {

		return _studentService.searchStudentByGroupId(groupId);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
		searchStudentByGroupId(long groupId, int start, int end) {

		return _studentService.searchStudentByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
		searchStudentByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.cmars.student.model.Student> comparator) {

		return _studentService.searchStudentByGroupId(
			groupId, start, end, comparator);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
		searchStudentByKeyWords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.cmars.student.model.Student> comparator) {

		return _studentService.searchStudentByKeyWords(
			groupId, keywords, start, end, comparator);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentCode(String studentCode)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentCode(studentCode);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentCode(String studentCode, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentCode(studentCode, start, end);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentCode(
				String studentCode, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentCode(
			studentCode, start, end, comparator);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentEmail(String studentEmail)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentEmail(studentEmail);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentEmail(String studentEmail, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentEmail(studentEmail, start, end);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentEmail(
				String studentEmail, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentEmail(
			studentEmail, start, end, comparator);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentGender(String studentGender)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentGender(studentGender);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentGender(String studentGender, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentGender(studentGender, start, end);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentGender(
				String studentGender, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentGender(
			studentGender, start, end, comparator);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentName(String studentName)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentName(studentName);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentName(String studentName, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentName(studentName, start, end);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentName(
				String studentName, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentName(
			studentName, start, end, comparator);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentPhone(String studentPhone)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentPhone(studentPhone);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentPhone(String studentPhone, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentPhone(studentPhone, start, end);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentPhone(
				String studentPhone, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentService.searchStudentPhone(
			studentPhone, start, end, comparator);
	}

	@Override
	public long searchStudentsCountByKeywords(long groupId, String keywords) {
		return _studentService.searchStudentsCountByKeywords(groupId, keywords);
	}

	@Override
	public com.liferay.cmars.student.model.Student updateStudent(
			long studentId, String studentCode, String studentName,
			String studentEmail, String studentPhone, String studentGender,
			String studentAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentService.updateStudent(
			studentId, studentCode, studentName, studentEmail, studentPhone,
			studentGender, studentAddress, serviceContext);
	}

	@Override
	public StudentService getWrappedService() {
		return _studentService;
	}

	@Override
	public void setWrappedService(StudentService studentService) {
		_studentService = studentService;
	}

	private StudentService _studentService;

}