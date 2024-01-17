/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.liferay.cmars.student.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author CMARS [cmars@triangles.co.kr]
 */
public class NoSuchStudentException extends NoSuchModelException {

	public NoSuchStudentException() {
	}

	public NoSuchStudentException(String msg) {
		super(msg);
	}

	public NoSuchStudentException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchStudentException(Throwable throwable) {
		super(throwable);
	}

}