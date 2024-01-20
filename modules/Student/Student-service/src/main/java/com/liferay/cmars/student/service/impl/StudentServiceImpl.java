/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.cmars.student.service.impl;

import com.liferay.cmars.student.exception.NoSuchStudentException;
import com.liferay.cmars.student.model.Student;
import com.liferay.cmars.student.service.base.StudentServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author CMARS [cmars@triangles.co.kr]
 */
@Component(
        property = {
                "json.web.service.context.name=cmars",
                "json.web.service.context.path=Student"
        },
        service = AopService.class
)
public class StudentServiceImpl extends StudentServiceBaseImpl {
    @Override
    public Student addStudent(long userId, String studentCode, String studentName, String studentEmail, String studentPhone,
                              String studentGender, String studentAddress, ServiceContext serviceContext) throws PortalException {
        _permissionChecker(serviceContext);
        return studentLocalService.addStudent(userId, studentCode, studentName, studentEmail, studentPhone, studentGender, studentAddress, serviceContext);
    }


    @Override
    public Student updateStudent(long studentId, String studentCode, String studentName, String studentEmail, String studentPhone,
                                 String studentGender, String studentAddress, ServiceContext serviceContext) throws PortalException {

        _permissionChecker(serviceContext);
        return studentLocalService.updateStudent(studentId, studentCode, studentName, studentEmail, studentPhone, studentGender, studentAddress, serviceContext);
    }

    @Override
    public Student deleteStudent(long studentId, ServiceContext serviceContext) throws PortalException {

        _permissionChecker(serviceContext);
        return studentLocalService.deleteStudent(studentId);
    }

    public Student getStudent(long studentId) throws PortalException {
        return studentLocalService.getStudent(studentId);
    }

    private void _permissionChecker(ServiceContext serviceContext) throws PortalException {
        User user = getUser();
        PermissionChecker permissionChecker = getPermissionChecker();

        if (!permissionChecker.hasPermission(
                serviceContext.getScopeGroupId(), Student.class.getName(), serviceContext.getScopeGroupId(), ActionKeys.ADD_ENTRY)) {

            throw new PrincipalException.MustHavePermission(
                    permissionChecker, Student.class.getName(), serviceContext.getScopeGroupId(), ActionKeys.ADD_ENTRY);
        }
    }


    /*------------------------------------------------- Search -----------------------------------------------------------------------*/

    public List<Student> searchStudentByGroupId(long groupId) {
        return studentLocalService.searchStudentByGroupId(groupId);
    }

    public List<Student> searchStudentByGroupId(long groupId, int start, int end) {
        return studentLocalService.searchStudentByGroupId(groupId, start, end);
    }

    public List<Student> searchStudentByGroupId(long groupId, int start, int end, OrderByComparator<Student> comparator) {
        return studentLocalService.searchStudentByGroupId(groupId, start, end, comparator);
    }

    public List<Student> searchStudentCode(String studentCode) throws NoSuchStudentException {
        return studentLocalService.searchStudentCode(studentCode);
    }

    public List<Student> searchStudentCode(String studentCode, int start, int end) throws NoSuchStudentException {
        return studentLocalService.searchStudentCode(studentCode, start, end);
    }

    public List<Student> searchStudentCode(String studentCode, int start, int end, OrderByComparator<Student> comparator) throws NoSuchStudentException {
        return studentLocalService.searchStudentCode(studentCode, start, end, comparator);
    }


    public List<Student> searchStudentName(String studentName) throws NoSuchStudentException {
        return studentLocalService.searchStudentName(studentName);
    }

    public List<Student> searchStudentName(String studentName, int start, int end) throws NoSuchStudentException {
        return studentLocalService.searchStudentName(studentName, start, end);
    }

    public List<Student> searchStudentName(String studentName, int start, int end, OrderByComparator<Student> comparator) throws NoSuchStudentException {
        return studentLocalService.searchStudentName(studentName, start, end, comparator);
    }


    public List<Student> searchStudentEmail(String studentEmail) throws NoSuchStudentException {
        return studentLocalService.searchStudentEmail(studentEmail);
    }

    public List<Student> searchStudentEmail(String studentEmail, int start, int end) throws NoSuchStudentException {
        return studentLocalService.searchStudentEmail(studentEmail, start, end);
    }

    public List<Student> searchStudentEmail(String studentEmail, int start, int end, OrderByComparator<Student> comparator) throws NoSuchStudentException {
        return studentLocalService.searchStudentEmail(studentEmail, start, end, comparator);
    }


    public List<Student> searchStudentPhone(String studentPhone) throws NoSuchStudentException {
        return studentLocalService.searchStudentPhone(studentPhone);
    }

    public List<Student> searchStudentPhone(String studentPhone, int start, int end) throws NoSuchStudentException {
        return studentLocalService.searchStudentPhone(studentPhone, start, end);
    }

    public List<Student> searchStudentPhone(String studentPhone, int start, int end, OrderByComparator<Student> comparator) throws NoSuchStudentException {
        return studentLocalService.searchStudentPhone(studentPhone, start, end, comparator);
    }

    public List<Student> searchStudentGender(String studentGender) throws NoSuchStudentException {
        return studentLocalService.searchStudentGender(studentGender);
    }

    public List<Student> searchStudentGender(String studentGender, int start, int end) throws NoSuchStudentException {
        return studentLocalService.searchStudentGender(studentGender, start, end);
    }

    public List<Student> searchStudentGender(String studentGender, int start, int end, OrderByComparator<Student> comparator) throws NoSuchStudentException {
        return studentLocalService.searchStudentGender(studentGender, start, end, comparator);
    }


    public List<Student> searchStudentAddress(String studentAddress) throws NoSuchStudentException {
        return studentLocalService.searchStudentAddress(studentAddress);
    }

    public List<Student> searchStudentAddress(String studentAddress, int start, int end) throws NoSuchStudentException {
        return studentLocalService.searchStudentAddress(studentAddress, start, end);
    }

    public List<Student> searchStudentAddress(String studentAddress, int start, int end, OrderByComparator<Student> comparator) throws NoSuchStudentException {
        return studentLocalService.searchStudentAddress(studentAddress, start, end, comparator);
    }


    /* Search Keywords */
    public List<Student> searchStudentByKeyWords(long groupId, String keywords, int start, int end, OrderByComparator<Student> comparator) {
        return studentLocalService.searchStudentByKeyWords(groupId, keywords, start, end, comparator);
    }

    public long searchStudentsCountByKeywords(long groupId, String keywords) {
        return studentLocalService.searchStudentsCountByKeywords(groupId, keywords);
    }


}