/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.cmars.student.service;

import com.liferay.cmars.student.exception.NoSuchStudentException;
import com.liferay.cmars.student.model.Student;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for Student. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see StudentServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface StudentService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.liferay.cmars.student.service.impl.StudentServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the student remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link StudentServiceUtil} if injection and service tracking are not available.
	 */
	public Student addStudent(
			long userId, String studentCode, String studentName,
			String studentEmail, String studentPhone, String studentGender,
			String studentAddress, ServiceContext serviceContext)
		throws PortalException;

	public Student deleteStudent(long studentId, ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentAddress(String studentAddress)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentAddress(
			String studentAddress, int start, int end)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentAddress(
			String studentAddress, int start, int end,
			OrderByComparator<Student> comparator)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentByGroupId(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentByGroupId(
		long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Student> comparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentByKeyWords(
		long groupId, String keywords, int start, int end,
		OrderByComparator<Student> comparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentCode(String studentCode)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentCode(
			String studentCode, int start, int end)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentCode(
			String studentCode, int start, int end,
			OrderByComparator<Student> comparator)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentEmail(String studentEmail)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentEmail(
			String studentEmail, int start, int end)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentEmail(
			String studentEmail, int start, int end,
			OrderByComparator<Student> comparator)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentGender(String studentGender)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentGender(
			String studentGender, int start, int end)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentGender(
			String studentGender, int start, int end,
			OrderByComparator<Student> comparator)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentName(String studentName)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentName(
			String studentName, int start, int end)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentName(
			String studentName, int start, int end,
			OrderByComparator<Student> comparator)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentPhone(String studentPhone)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentPhone(
			String studentPhone, int start, int end)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Student> searchStudentPhone(
			String studentPhone, int start, int end,
			OrderByComparator<Student> comparator)
		throws NoSuchStudentException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long searchStudentsCountByKeywords(long groupId, String keywords);

	public Student updateStudent(
			long studentId, String studentCode, String studentName,
			String studentEmail, String studentPhone, String studentGender,
			String studentAddress, ServiceContext serviceContext)
		throws PortalException;

}