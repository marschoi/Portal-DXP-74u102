/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.cmars.student.service.persistence;

import com.liferay.cmars.student.exception.NoSuchStudentException;
import com.liferay.cmars.student.model.Student;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentUtil
 * @generated
 */
@ProviderType
public interface StudentPersistence extends BasePersistence<Student> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StudentUtil} to access the student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the students where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching students
	 */
	public java.util.List<Student> findByUuid(String uuid);

	/**
	 * Returns a range of all the students where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of matching students
	 */
	public java.util.List<Student> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the students where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns an ordered range of all the students where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first student in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the first student in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the last student in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the last student in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the students before and after the current student in the ordered set where uuid = &#63;.
	 *
	 * @param studentId the primary key of the current student
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student
	 * @throws NoSuchStudentException if a student with the primary key could not be found
	 */
	public Student[] findByUuid_PrevAndNext(
			long studentId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Removes all the students where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of students where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching students
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the student where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchStudentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByUUID_G(String uuid, long groupId)
		throws NoSuchStudentException;

	/**
	 * Returns the student where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the student where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the student where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the student that was removed
	 */
	public Student removeByUUID_G(String uuid, long groupId)
		throws NoSuchStudentException;

	/**
	 * Returns the number of students where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching students
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the students where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching students
	 */
	public java.util.List<Student> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the students where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of matching students
	 */
	public java.util.List<Student> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the students where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns an ordered range of all the students where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first student in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the first student in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the last student in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the last student in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the students before and after the current student in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param studentId the primary key of the current student
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student
	 * @throws NoSuchStudentException if a student with the primary key could not be found
	 */
	public Student[] findByUuid_C_PrevAndNext(
			long studentId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Removes all the students where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of students where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching students
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the students where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching students
	 */
	public java.util.List<Student> findByGroupId(long groupId);

	/**
	 * Returns a range of all the students where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of matching students
	 */
	public java.util.List<Student> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the students where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns an ordered range of all the students where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first student in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the first student in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the last student in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the last student in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the students before and after the current student in the ordered set where groupId = &#63;.
	 *
	 * @param studentId the primary key of the current student
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student
	 * @throws NoSuchStudentException if a student with the primary key could not be found
	 */
	public Student[] findByGroupId_PrevAndNext(
			long studentId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Removes all the students where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of students where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching students
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the students where studentCode = &#63;.
	 *
	 * @param studentCode the student code
	 * @return the matching students
	 */
	public java.util.List<Student> findByStudentCode(String studentCode);

	/**
	 * Returns a range of all the students where studentCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentCode the student code
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of matching students
	 */
	public java.util.List<Student> findByStudentCode(
		String studentCode, int start, int end);

	/**
	 * Returns an ordered range of all the students where studentCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentCode the student code
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByStudentCode(
		String studentCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns an ordered range of all the students where studentCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentCode the student code
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByStudentCode(
		String studentCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first student in the ordered set where studentCode = &#63;.
	 *
	 * @param studentCode the student code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByStudentCode_First(
			String studentCode,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the first student in the ordered set where studentCode = &#63;.
	 *
	 * @param studentCode the student code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByStudentCode_First(
		String studentCode,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the last student in the ordered set where studentCode = &#63;.
	 *
	 * @param studentCode the student code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByStudentCode_Last(
			String studentCode,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the last student in the ordered set where studentCode = &#63;.
	 *
	 * @param studentCode the student code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByStudentCode_Last(
		String studentCode,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the students before and after the current student in the ordered set where studentCode = &#63;.
	 *
	 * @param studentId the primary key of the current student
	 * @param studentCode the student code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student
	 * @throws NoSuchStudentException if a student with the primary key could not be found
	 */
	public Student[] findByStudentCode_PrevAndNext(
			long studentId, String studentCode,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Removes all the students where studentCode = &#63; from the database.
	 *
	 * @param studentCode the student code
	 */
	public void removeByStudentCode(String studentCode);

	/**
	 * Returns the number of students where studentCode = &#63;.
	 *
	 * @param studentCode the student code
	 * @return the number of matching students
	 */
	public int countByStudentCode(String studentCode);

	/**
	 * Returns all the students where studentCode = &#63;.
	 *
	 * @param studentCode the student code
	 * @return the matching students
	 */
	public java.util.List<Student> findByStudentName(String studentCode);

	/**
	 * Returns a range of all the students where studentCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentCode the student code
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of matching students
	 */
	public java.util.List<Student> findByStudentName(
		String studentCode, int start, int end);

	/**
	 * Returns an ordered range of all the students where studentCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentCode the student code
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByStudentName(
		String studentCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns an ordered range of all the students where studentCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentCode the student code
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByStudentName(
		String studentCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first student in the ordered set where studentCode = &#63;.
	 *
	 * @param studentCode the student code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByStudentName_First(
			String studentCode,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the first student in the ordered set where studentCode = &#63;.
	 *
	 * @param studentCode the student code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByStudentName_First(
		String studentCode,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the last student in the ordered set where studentCode = &#63;.
	 *
	 * @param studentCode the student code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByStudentName_Last(
			String studentCode,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the last student in the ordered set where studentCode = &#63;.
	 *
	 * @param studentCode the student code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByStudentName_Last(
		String studentCode,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the students before and after the current student in the ordered set where studentCode = &#63;.
	 *
	 * @param studentId the primary key of the current student
	 * @param studentCode the student code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student
	 * @throws NoSuchStudentException if a student with the primary key could not be found
	 */
	public Student[] findByStudentName_PrevAndNext(
			long studentId, String studentCode,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Removes all the students where studentCode = &#63; from the database.
	 *
	 * @param studentCode the student code
	 */
	public void removeByStudentName(String studentCode);

	/**
	 * Returns the number of students where studentCode = &#63;.
	 *
	 * @param studentCode the student code
	 * @return the number of matching students
	 */
	public int countByStudentName(String studentCode);

	/**
	 * Returns all the students where studentEmail = &#63;.
	 *
	 * @param studentEmail the student email
	 * @return the matching students
	 */
	public java.util.List<Student> findByStudentEmail(String studentEmail);

	/**
	 * Returns a range of all the students where studentEmail = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentEmail the student email
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of matching students
	 */
	public java.util.List<Student> findByStudentEmail(
		String studentEmail, int start, int end);

	/**
	 * Returns an ordered range of all the students where studentEmail = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentEmail the student email
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByStudentEmail(
		String studentEmail, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns an ordered range of all the students where studentEmail = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentEmail the student email
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByStudentEmail(
		String studentEmail, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first student in the ordered set where studentEmail = &#63;.
	 *
	 * @param studentEmail the student email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByStudentEmail_First(
			String studentEmail,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the first student in the ordered set where studentEmail = &#63;.
	 *
	 * @param studentEmail the student email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByStudentEmail_First(
		String studentEmail,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the last student in the ordered set where studentEmail = &#63;.
	 *
	 * @param studentEmail the student email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByStudentEmail_Last(
			String studentEmail,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the last student in the ordered set where studentEmail = &#63;.
	 *
	 * @param studentEmail the student email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByStudentEmail_Last(
		String studentEmail,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the students before and after the current student in the ordered set where studentEmail = &#63;.
	 *
	 * @param studentId the primary key of the current student
	 * @param studentEmail the student email
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student
	 * @throws NoSuchStudentException if a student with the primary key could not be found
	 */
	public Student[] findByStudentEmail_PrevAndNext(
			long studentId, String studentEmail,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Removes all the students where studentEmail = &#63; from the database.
	 *
	 * @param studentEmail the student email
	 */
	public void removeByStudentEmail(String studentEmail);

	/**
	 * Returns the number of students where studentEmail = &#63;.
	 *
	 * @param studentEmail the student email
	 * @return the number of matching students
	 */
	public int countByStudentEmail(String studentEmail);

	/**
	 * Returns all the students where studentPhone = &#63;.
	 *
	 * @param studentPhone the student phone
	 * @return the matching students
	 */
	public java.util.List<Student> findByStudentPhone(String studentPhone);

	/**
	 * Returns a range of all the students where studentPhone = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentPhone the student phone
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of matching students
	 */
	public java.util.List<Student> findByStudentPhone(
		String studentPhone, int start, int end);

	/**
	 * Returns an ordered range of all the students where studentPhone = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentPhone the student phone
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByStudentPhone(
		String studentPhone, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns an ordered range of all the students where studentPhone = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentPhone the student phone
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByStudentPhone(
		String studentPhone, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first student in the ordered set where studentPhone = &#63;.
	 *
	 * @param studentPhone the student phone
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByStudentPhone_First(
			String studentPhone,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the first student in the ordered set where studentPhone = &#63;.
	 *
	 * @param studentPhone the student phone
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByStudentPhone_First(
		String studentPhone,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the last student in the ordered set where studentPhone = &#63;.
	 *
	 * @param studentPhone the student phone
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByStudentPhone_Last(
			String studentPhone,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the last student in the ordered set where studentPhone = &#63;.
	 *
	 * @param studentPhone the student phone
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByStudentPhone_Last(
		String studentPhone,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the students before and after the current student in the ordered set where studentPhone = &#63;.
	 *
	 * @param studentId the primary key of the current student
	 * @param studentPhone the student phone
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student
	 * @throws NoSuchStudentException if a student with the primary key could not be found
	 */
	public Student[] findByStudentPhone_PrevAndNext(
			long studentId, String studentPhone,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Removes all the students where studentPhone = &#63; from the database.
	 *
	 * @param studentPhone the student phone
	 */
	public void removeByStudentPhone(String studentPhone);

	/**
	 * Returns the number of students where studentPhone = &#63;.
	 *
	 * @param studentPhone the student phone
	 * @return the number of matching students
	 */
	public int countByStudentPhone(String studentPhone);

	/**
	 * Returns all the students where studentGender = &#63;.
	 *
	 * @param studentGender the student gender
	 * @return the matching students
	 */
	public java.util.List<Student> findByStudentGender(String studentGender);

	/**
	 * Returns a range of all the students where studentGender = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentGender the student gender
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of matching students
	 */
	public java.util.List<Student> findByStudentGender(
		String studentGender, int start, int end);

	/**
	 * Returns an ordered range of all the students where studentGender = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentGender the student gender
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByStudentGender(
		String studentGender, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns an ordered range of all the students where studentGender = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentGender the student gender
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByStudentGender(
		String studentGender, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first student in the ordered set where studentGender = &#63;.
	 *
	 * @param studentGender the student gender
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByStudentGender_First(
			String studentGender,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the first student in the ordered set where studentGender = &#63;.
	 *
	 * @param studentGender the student gender
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByStudentGender_First(
		String studentGender,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the last student in the ordered set where studentGender = &#63;.
	 *
	 * @param studentGender the student gender
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByStudentGender_Last(
			String studentGender,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the last student in the ordered set where studentGender = &#63;.
	 *
	 * @param studentGender the student gender
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByStudentGender_Last(
		String studentGender,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the students before and after the current student in the ordered set where studentGender = &#63;.
	 *
	 * @param studentId the primary key of the current student
	 * @param studentGender the student gender
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student
	 * @throws NoSuchStudentException if a student with the primary key could not be found
	 */
	public Student[] findByStudentGender_PrevAndNext(
			long studentId, String studentGender,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Removes all the students where studentGender = &#63; from the database.
	 *
	 * @param studentGender the student gender
	 */
	public void removeByStudentGender(String studentGender);

	/**
	 * Returns the number of students where studentGender = &#63;.
	 *
	 * @param studentGender the student gender
	 * @return the number of matching students
	 */
	public int countByStudentGender(String studentGender);

	/**
	 * Returns all the students where studentAddress = &#63;.
	 *
	 * @param studentAddress the student address
	 * @return the matching students
	 */
	public java.util.List<Student> findByStudentAddress(String studentAddress);

	/**
	 * Returns a range of all the students where studentAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentAddress the student address
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of matching students
	 */
	public java.util.List<Student> findByStudentAddress(
		String studentAddress, int start, int end);

	/**
	 * Returns an ordered range of all the students where studentAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentAddress the student address
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByStudentAddress(
		String studentAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns an ordered range of all the students where studentAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param studentAddress the student address
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching students
	 */
	public java.util.List<Student> findByStudentAddress(
		String studentAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first student in the ordered set where studentAddress = &#63;.
	 *
	 * @param studentAddress the student address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByStudentAddress_First(
			String studentAddress,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the first student in the ordered set where studentAddress = &#63;.
	 *
	 * @param studentAddress the student address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByStudentAddress_First(
		String studentAddress,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the last student in the ordered set where studentAddress = &#63;.
	 *
	 * @param studentAddress the student address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public Student findByStudentAddress_Last(
			String studentAddress,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Returns the last student in the ordered set where studentAddress = &#63;.
	 *
	 * @param studentAddress the student address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student, or <code>null</code> if a matching student could not be found
	 */
	public Student fetchByStudentAddress_Last(
		String studentAddress,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns the students before and after the current student in the ordered set where studentAddress = &#63;.
	 *
	 * @param studentId the primary key of the current student
	 * @param studentAddress the student address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student
	 * @throws NoSuchStudentException if a student with the primary key could not be found
	 */
	public Student[] findByStudentAddress_PrevAndNext(
			long studentId, String studentAddress,
			com.liferay.portal.kernel.util.OrderByComparator<Student>
				orderByComparator)
		throws NoSuchStudentException;

	/**
	 * Removes all the students where studentAddress = &#63; from the database.
	 *
	 * @param studentAddress the student address
	 */
	public void removeByStudentAddress(String studentAddress);

	/**
	 * Returns the number of students where studentAddress = &#63;.
	 *
	 * @param studentAddress the student address
	 * @return the number of matching students
	 */
	public int countByStudentAddress(String studentAddress);

	/**
	 * Caches the student in the entity cache if it is enabled.
	 *
	 * @param student the student
	 */
	public void cacheResult(Student student);

	/**
	 * Caches the students in the entity cache if it is enabled.
	 *
	 * @param students the students
	 */
	public void cacheResult(java.util.List<Student> students);

	/**
	 * Creates a new student with the primary key. Does not add the student to the database.
	 *
	 * @param studentId the primary key for the new student
	 * @return the new student
	 */
	public Student create(long studentId);

	/**
	 * Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the student
	 * @return the student that was removed
	 * @throws NoSuchStudentException if a student with the primary key could not be found
	 */
	public Student remove(long studentId) throws NoSuchStudentException;

	public Student updateImpl(Student student);

	/**
	 * Returns the student with the primary key or throws a <code>NoSuchStudentException</code> if it could not be found.
	 *
	 * @param studentId the primary key of the student
	 * @return the student
	 * @throws NoSuchStudentException if a student with the primary key could not be found
	 */
	public Student findByPrimaryKey(long studentId)
		throws NoSuchStudentException;

	/**
	 * Returns the student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentId the primary key of the student
	 * @return the student, or <code>null</code> if a student with the primary key could not be found
	 */
	public Student fetchByPrimaryKey(long studentId);

	/**
	 * Returns all the students.
	 *
	 * @return the students
	 */
	public java.util.List<Student> findAll();

	/**
	 * Returns a range of all the students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of students
	 */
	public java.util.List<Student> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of students
	 */
	public java.util.List<Student> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator);

	/**
	 * Returns an ordered range of all the students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of students
	 */
	public java.util.List<Student> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the students from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of students.
	 *
	 * @return the number of students
	 */
	public int countAll();

}