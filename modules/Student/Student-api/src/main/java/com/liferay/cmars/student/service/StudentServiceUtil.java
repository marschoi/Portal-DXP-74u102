/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.cmars.student.service;

import com.liferay.cmars.student.model.Student;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.List;

/**
 * Provides the remote service utility for Student. This utility wraps
 * <code>com.liferay.cmars.student.service.impl.StudentServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see StudentService
 * @generated
 */
public class StudentServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.cmars.student.service.impl.StudentServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Student addStudent(
			long userId, String studentCode, String studentName,
			String studentEmail, String studentPhone, String studentGender,
			String studentAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addStudent(
			userId, studentCode, studentName, studentEmail, studentPhone,
			studentGender, studentAddress, serviceContext);
	}

	public static Student deleteStudent(
			long studentId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().deleteStudent(studentId, serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static List<Student> searchStudentAddress(String studentAddress)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentAddress(studentAddress);
	}

	public static List<Student> searchStudentAddress(
			String studentAddress, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentAddress(studentAddress, start, end);
	}

	public static List<Student> searchStudentAddress(
			String studentAddress, int start, int end,
			OrderByComparator<Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentAddress(
			studentAddress, start, end, comparator);
	}

	public static List<Student> searchStudentByGroupId(long groupId) {
		return getService().searchStudentByGroupId(groupId);
	}

	public static List<Student> searchStudentByGroupId(
		long groupId, int start, int end) {

		return getService().searchStudentByGroupId(groupId, start, end);
	}

	public static List<Student> searchStudentByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Student> comparator) {

		return getService().searchStudentByGroupId(
			groupId, start, end, comparator);
	}

	public static List<Student> searchStudentByKeyWords(
		long groupId, String keywords, int start, int end,
		OrderByComparator<Student> comparator) {

		return getService().searchStudentByKeyWords(
			groupId, keywords, start, end, comparator);
	}

	public static List<Student> searchStudentCode(String studentCode)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentCode(studentCode);
	}

	public static List<Student> searchStudentCode(
			String studentCode, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentCode(studentCode, start, end);
	}

	public static List<Student> searchStudentCode(
			String studentCode, int start, int end,
			OrderByComparator<Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentCode(
			studentCode, start, end, comparator);
	}

	public static List<Student> searchStudentEmail(String studentEmail)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentEmail(studentEmail);
	}

	public static List<Student> searchStudentEmail(
			String studentEmail, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentEmail(studentEmail, start, end);
	}

	public static List<Student> searchStudentEmail(
			String studentEmail, int start, int end,
			OrderByComparator<Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentEmail(
			studentEmail, start, end, comparator);
	}

	public static List<Student> searchStudentGender(String studentGender)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentGender(studentGender);
	}

	public static List<Student> searchStudentGender(
			String studentGender, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentGender(studentGender, start, end);
	}

	public static List<Student> searchStudentGender(
			String studentGender, int start, int end,
			OrderByComparator<Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentGender(
			studentGender, start, end, comparator);
	}

	public static List<Student> searchStudentName(String studentName)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentName(studentName);
	}

	public static List<Student> searchStudentName(
			String studentName, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentName(studentName, start, end);
	}

	public static List<Student> searchStudentName(
			String studentName, int start, int end,
			OrderByComparator<Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentName(
			studentName, start, end, comparator);
	}

	public static List<Student> searchStudentPhone(String studentPhone)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentPhone(studentPhone);
	}

	public static List<Student> searchStudentPhone(
			String studentPhone, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentPhone(studentPhone, start, end);
	}

	public static List<Student> searchStudentPhone(
			String studentPhone, int start, int end,
			OrderByComparator<Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return getService().searchStudentPhone(
			studentPhone, start, end, comparator);
	}

	public static long searchStudentsCountByKeywords(
		long groupId, String keywords) {

		return getService().searchStudentsCountByKeywords(groupId, keywords);
	}

	public static Student updateStudent(
			long studentId, String studentCode, String studentName,
			String studentEmail, String studentPhone, String studentGender,
			String studentAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateStudent(
			studentId, studentCode, studentName, studentEmail, studentPhone,
			studentGender, studentAddress, serviceContext);
	}

	public static StudentService getService() {
		return _service;
	}

	public static void setService(StudentService service) {
		_service = service;
	}

	private static volatile StudentService _service;

}