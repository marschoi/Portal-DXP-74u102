/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.cmars.student.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link StudentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StudentLocalService
 * @generated
 */
public class StudentLocalServiceWrapper
	implements ServiceWrapper<StudentLocalService>, StudentLocalService {

	public StudentLocalServiceWrapper() {
		this(null);
	}

	public StudentLocalServiceWrapper(StudentLocalService studentLocalService) {
		_studentLocalService = studentLocalService;
	}

	@Override
	public com.liferay.cmars.student.model.Student addStudent(
			long userId, String studentCode, String studentName,
			String studentEmail, String studentPhone, String studentGender,
			String studentAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.addStudent(
			userId, studentCode, studentName, studentEmail, studentPhone,
			studentGender, studentAddress, serviceContext);
	}

	/**
	 * Adds the student to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StudentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param student the student
	 * @return the student that was added
	 */
	@Override
	public com.liferay.cmars.student.model.Student addStudent(
		com.liferay.cmars.student.model.Student student) {

		return _studentLocalService.addStudent(student);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new student with the primary key. Does not add the student to the database.
	 *
	 * @param studentId the primary key for the new student
	 * @return the new student
	 */
	@Override
	public com.liferay.cmars.student.model.Student createStudent(
		long studentId) {

		return _studentLocalService.createStudent(studentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StudentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param studentId the primary key of the student
	 * @return the student that was removed
	 * @throws PortalException if a student with the primary key could not be found
	 */
	@Override
	public com.liferay.cmars.student.model.Student deleteStudent(long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.deleteStudent(studentId);
	}

	/**
	 * Deletes the student from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StudentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param student the student
	 * @return the student that was removed
	 */
	@Override
	public com.liferay.cmars.student.model.Student deleteStudent(
		com.liferay.cmars.student.model.Student student) {

		return _studentLocalService.deleteStudent(student);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _studentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _studentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _studentLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _studentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.cmars.student.model.impl.StudentModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _studentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.cmars.student.model.impl.StudentModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _studentLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _studentLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _studentLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.cmars.student.model.Student fetchStudent(
		long studentId) {

		return _studentLocalService.fetchStudent(studentId);
	}

	/**
	 * Returns the student matching the UUID and group.
	 *
	 * @param uuid the student's UUID
	 * @param groupId the primary key of the group
	 * @return the matching student, or <code>null</code> if a matching student could not be found
	 */
	@Override
	public com.liferay.cmars.student.model.Student fetchStudentByUuidAndGroupId(
		String uuid, long groupId) {

		return _studentLocalService.fetchStudentByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _studentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _studentLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _studentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _studentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the student with the primary key.
	 *
	 * @param studentId the primary key of the student
	 * @return the student
	 * @throws PortalException if a student with the primary key could not be found
	 */
	@Override
	public com.liferay.cmars.student.model.Student getStudent(long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.getStudent(studentId);
	}

	/**
	 * Returns the student matching the UUID and group.
	 *
	 * @param uuid the student's UUID
	 * @param groupId the primary key of the group
	 * @return the matching student
	 * @throws PortalException if a matching student could not be found
	 */
	@Override
	public com.liferay.cmars.student.model.Student getStudentByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.getStudentByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.cmars.student.model.impl.StudentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of students
	 */
	@Override
	public java.util.List<com.liferay.cmars.student.model.Student> getStudents(
		int start, int end) {

		return _studentLocalService.getStudents(start, end);
	}

	/**
	 * Returns all the students matching the UUID and company.
	 *
	 * @param uuid the UUID of the students
	 * @param companyId the primary key of the company
	 * @return the matching students, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
		getStudentsByUuidAndCompanyId(String uuid, long companyId) {

		return _studentLocalService.getStudentsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of students matching the UUID and company.
	 *
	 * @param uuid the UUID of the students
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching students, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
		getStudentsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.cmars.student.model.Student> orderByComparator) {

		return _studentLocalService.getStudentsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of students.
	 *
	 * @return the number of students
	 */
	@Override
	public int getStudentsCount() {
		return _studentLocalService.getStudentsCount();
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentAddress(String studentAddress)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentAddress(studentAddress);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentAddress(String studentAddress, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentAddress(
			studentAddress, start, end);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentAddress(
				String studentAddress, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentAddress(
			studentAddress, start, end, comparator);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
		searchStudentByGroupId(long groupId) {

		return _studentLocalService.searchStudentByGroupId(groupId);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
		searchStudentByGroupId(long groupId, int start, int end) {

		return _studentLocalService.searchStudentByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
		searchStudentByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.cmars.student.model.Student> comparator) {

		return _studentLocalService.searchStudentByGroupId(
			groupId, start, end, comparator);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
		searchStudentByKeyWords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.cmars.student.model.Student> comparator) {

		return _studentLocalService.searchStudentByKeyWords(
			groupId, keywords, start, end, comparator);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentCode(String studentCode)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentCode(studentCode);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentCode(String studentCode, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentCode(studentCode, start, end);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentCode(
				String studentCode, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentCode(
			studentCode, start, end, comparator);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentEmail(String studentEmail)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentEmail(studentEmail);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentEmail(String studentEmail, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentEmail(
			studentEmail, start, end);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentEmail(
				String studentEmail, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentEmail(
			studentEmail, start, end, comparator);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentGender(String studentGender)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentGender(studentGender);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentGender(String studentGender, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentGender(
			studentGender, start, end);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentGender(
				String studentGender, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentGender(
			studentGender, start, end, comparator);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentName(String studentName)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentName(studentName);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentName(String studentName, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentName(studentName, start, end);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentName(
				String studentName, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentName(
			studentName, start, end, comparator);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentPhone(String studentPhone)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentPhone(studentPhone);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentPhone(String studentPhone, int start, int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentPhone(
			studentPhone, start, end);
	}

	@Override
	public java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentPhone(
				String studentPhone, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		return _studentLocalService.searchStudentPhone(
			studentPhone, start, end, comparator);
	}

	@Override
	public long searchStudentsCountByKeywords(long groupId, String keywords) {
		return _studentLocalService.searchStudentsCountByKeywords(
			groupId, keywords);
	}

	@Override
	public com.liferay.cmars.student.model.Student updateStudent(
			long studentId, String studentCode, String studentName,
			String studentEmail, String studentPhone, String studentGender,
			String studentAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentLocalService.updateStudent(
			studentId, studentCode, studentName, studentEmail, studentPhone,
			studentGender, studentAddress, serviceContext);
	}

	/**
	 * Updates the student in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StudentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param student the student
	 * @return the student that was updated
	 */
	@Override
	public com.liferay.cmars.student.model.Student updateStudent(
		com.liferay.cmars.student.model.Student student) {

		return _studentLocalService.updateStudent(student);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _studentLocalService.getBasePersistence();
	}

	@Override
	public StudentLocalService getWrappedService() {
		return _studentLocalService;
	}

	@Override
	public void setWrappedService(StudentLocalService studentLocalService) {
		_studentLocalService = studentLocalService;
	}

	private StudentLocalService _studentLocalService;

}