package com.liferay.cmars.student.web.portlet;

import com.liferay.cmars.student.web.constants.StudentWebPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author cmars
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=category.cmars",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=StudentWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + StudentWebPortletKeys.STUDENTWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class StudentWebPortlet extends MVCPortlet {
}
/*
	"com.liferay.portlet.instanceable=true": 이 설정은 포틀릿이 여러 번 인스턴스화 될 수 있음을 의미합니다.
	즉, 사용자는 한 페이지에 같은 포틀릿을 여러 번 추가할 수 있으며 각 인스턴스는 독립적으로 구성될 수 있습니다.
	이는 사용자가 같은 포틀릿을 다양한 설정이나 내용으로 여러 번 페이지에 추가하고자 할 때 유용합니다.

	"com.liferay.portlet.instanceable=false": 이 설정은 포틀릿이 단일 인스턴스만을 가질 수 있음을 의미합니다.
	페이지당 해당 포틀릿의 하나의 인스턴스만 추가할 수 있습니다.
	이는 포틀릿이 고유한 기능을 가지거나 페이지 내에서 단 한 번만 표시되어야 할 때 사용됩니다.
*/
