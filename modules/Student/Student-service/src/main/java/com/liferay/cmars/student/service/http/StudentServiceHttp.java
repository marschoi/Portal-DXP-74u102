/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.cmars.student.service.http;

import com.liferay.cmars.student.service.StudentServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>StudentServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StudentServiceHttp {

	public static com.liferay.cmars.student.model.Student addStudent(
			HttpPrincipal httpPrincipal, long userId, String studentCode,
			String studentName, String studentEmail, String studentPhone,
			String studentGender, String studentAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "addStudent",
				_addStudentParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, studentCode, studentName, studentEmail,
				studentPhone, studentGender, studentAddress, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.cmars.student.model.Student)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.cmars.student.model.Student updateStudent(
			HttpPrincipal httpPrincipal, long studentId, String studentCode,
			String studentName, String studentEmail, String studentPhone,
			String studentGender, String studentAddress,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "updateStudent",
				_updateStudentParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentId, studentCode, studentName, studentEmail,
				studentPhone, studentGender, studentAddress, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.cmars.student.model.Student)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.cmars.student.model.Student deleteStudent(
			HttpPrincipal httpPrincipal, long studentId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "deleteStudent",
				_deleteStudentParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentId, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.cmars.student.model.Student)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.cmars.student.model.Student getStudent(
			HttpPrincipal httpPrincipal, long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "getStudent",
				_getStudentParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.cmars.student.model.Student)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
		searchStudentByGroupId(HttpPrincipal httpPrincipal, long groupId) {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentByGroupId",
				_searchStudentByGroupIdParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
		searchStudentByGroupId(
			HttpPrincipal httpPrincipal, long groupId, int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentByGroupId",
				_searchStudentByGroupIdParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
		searchStudentByGroupId(
			HttpPrincipal httpPrincipal, long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.cmars.student.model.Student> comparator) {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentByGroupId",
				_searchStudentByGroupIdParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, start, end, comparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentCode(HttpPrincipal httpPrincipal, String studentCode)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentCode",
				_searchStudentCodeParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentCode);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentCode(
				HttpPrincipal httpPrincipal, String studentCode, int start,
				int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentCode",
				_searchStudentCodeParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentCode, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentCode(
				HttpPrincipal httpPrincipal, String studentCode, int start,
				int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentCode",
				_searchStudentCodeParameterTypes10);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentCode, start, end, comparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentName(HttpPrincipal httpPrincipal, String studentName)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentName",
				_searchStudentNameParameterTypes11);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentName);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentName(
				HttpPrincipal httpPrincipal, String studentName, int start,
				int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentName",
				_searchStudentNameParameterTypes12);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentName, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentName(
				HttpPrincipal httpPrincipal, String studentName, int start,
				int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentName",
				_searchStudentNameParameterTypes13);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentName, start, end, comparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentEmail(HttpPrincipal httpPrincipal, String studentEmail)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentEmail",
				_searchStudentEmailParameterTypes14);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentEmail);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentEmail(
				HttpPrincipal httpPrincipal, String studentEmail, int start,
				int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentEmail",
				_searchStudentEmailParameterTypes15);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentEmail, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentEmail(
				HttpPrincipal httpPrincipal, String studentEmail, int start,
				int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentEmail",
				_searchStudentEmailParameterTypes16);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentEmail, start, end, comparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentPhone(HttpPrincipal httpPrincipal, String studentPhone)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentPhone",
				_searchStudentPhoneParameterTypes17);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentPhone);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentPhone(
				HttpPrincipal httpPrincipal, String studentPhone, int start,
				int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentPhone",
				_searchStudentPhoneParameterTypes18);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentPhone, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentPhone(
				HttpPrincipal httpPrincipal, String studentPhone, int start,
				int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentPhone",
				_searchStudentPhoneParameterTypes19);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentPhone, start, end, comparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentGender(
				HttpPrincipal httpPrincipal, String studentGender)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentGender",
				_searchStudentGenderParameterTypes20);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentGender);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentGender(
				HttpPrincipal httpPrincipal, String studentGender, int start,
				int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentGender",
				_searchStudentGenderParameterTypes21);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentGender, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentGender(
				HttpPrincipal httpPrincipal, String studentGender, int start,
				int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentGender",
				_searchStudentGenderParameterTypes22);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentGender, start, end, comparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentAddress(
				HttpPrincipal httpPrincipal, String studentAddress)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentAddress",
				_searchStudentAddressParameterTypes23);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentAddress);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentAddress(
				HttpPrincipal httpPrincipal, String studentAddress, int start,
				int end)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentAddress",
				_searchStudentAddressParameterTypes24);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentAddress, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
			searchStudentAddress(
				HttpPrincipal httpPrincipal, String studentAddress, int start,
				int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.cmars.student.model.Student> comparator)
		throws com.liferay.cmars.student.exception.NoSuchStudentException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentAddress",
				_searchStudentAddressParameterTypes25);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentAddress, start, end, comparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.cmars.student.exception.
							NoSuchStudentException) {

					throw (com.liferay.cmars.student.exception.
						NoSuchStudentException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.cmars.student.model.Student>
		searchStudentByKeyWords(
			HttpPrincipal httpPrincipal, long groupId, String keywords,
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.cmars.student.model.Student> comparator) {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentByKeyWords",
				_searchStudentByKeyWordsParameterTypes26);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, keywords, start, end, comparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.cmars.student.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static long searchStudentsCountByKeywords(
		HttpPrincipal httpPrincipal, long groupId, String keywords) {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "searchStudentsCountByKeywords",
				_searchStudentsCountByKeywordsParameterTypes27);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, keywords);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Long)returnObj).longValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(StudentServiceHttp.class);

	private static final Class<?>[] _addStudentParameterTypes0 = new Class[] {
		long.class, String.class, String.class, String.class, String.class,
		String.class, String.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _updateStudentParameterTypes1 =
		new Class[] {
			long.class, String.class, String.class, String.class, String.class,
			String.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteStudentParameterTypes2 =
		new Class[] {
			long.class, com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _getStudentParameterTypes3 = new Class[] {
		long.class
	};
	private static final Class<?>[] _searchStudentByGroupIdParameterTypes5 =
		new Class[] {long.class};
	private static final Class<?>[] _searchStudentByGroupIdParameterTypes6 =
		new Class[] {long.class, int.class, int.class};
	private static final Class<?>[] _searchStudentByGroupIdParameterTypes7 =
		new Class[] {
			long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _searchStudentCodeParameterTypes8 =
		new Class[] {String.class};
	private static final Class<?>[] _searchStudentCodeParameterTypes9 =
		new Class[] {String.class, int.class, int.class};
	private static final Class<?>[] _searchStudentCodeParameterTypes10 =
		new Class[] {
			String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _searchStudentNameParameterTypes11 =
		new Class[] {String.class};
	private static final Class<?>[] _searchStudentNameParameterTypes12 =
		new Class[] {String.class, int.class, int.class};
	private static final Class<?>[] _searchStudentNameParameterTypes13 =
		new Class[] {
			String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _searchStudentEmailParameterTypes14 =
		new Class[] {String.class};
	private static final Class<?>[] _searchStudentEmailParameterTypes15 =
		new Class[] {String.class, int.class, int.class};
	private static final Class<?>[] _searchStudentEmailParameterTypes16 =
		new Class[] {
			String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _searchStudentPhoneParameterTypes17 =
		new Class[] {String.class};
	private static final Class<?>[] _searchStudentPhoneParameterTypes18 =
		new Class[] {String.class, int.class, int.class};
	private static final Class<?>[] _searchStudentPhoneParameterTypes19 =
		new Class[] {
			String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _searchStudentGenderParameterTypes20 =
		new Class[] {String.class};
	private static final Class<?>[] _searchStudentGenderParameterTypes21 =
		new Class[] {String.class, int.class, int.class};
	private static final Class<?>[] _searchStudentGenderParameterTypes22 =
		new Class[] {
			String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _searchStudentAddressParameterTypes23 =
		new Class[] {String.class};
	private static final Class<?>[] _searchStudentAddressParameterTypes24 =
		new Class[] {String.class, int.class, int.class};
	private static final Class<?>[] _searchStudentAddressParameterTypes25 =
		new Class[] {
			String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _searchStudentByKeyWordsParameterTypes26 =
		new Class[] {
			long.class, String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[]
		_searchStudentsCountByKeywordsParameterTypes27 = new Class[] {
			long.class, String.class
		};

}