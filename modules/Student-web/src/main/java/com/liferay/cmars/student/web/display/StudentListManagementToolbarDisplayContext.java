package com.liferay.cmars.student.web.display;

import com.liferay.frontend.taglib.clay.servlet.taglib.display.context.BaseManagementToolbarDisplayContext;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.*;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.http.HttpServletRequest;

public class StudentListManagementToolbarDisplayContext extends BaseManagementToolbarDisplayContext {
    private static final Log _log = LogFactoryUtil.getLog(StudentListManagementToolbarDisplayContext.class);

    /* 변수 선언 */
    private final PortalPreferences _portalPreferences;
    private final ThemeDisplay _themeDisplay;


    public StudentListManagementToolbarDisplayContext(HttpServletRequest httpServletRequest,
                                                      LiferayPortletRequest liferayPortletRequest,
                                                      LiferayPortletResponse liferayPortletResponse) {
        super(httpServletRequest, liferayPortletRequest, liferayPortletResponse);

        _portalPreferences = PortletPreferencesFactoryUtil.getPortalPreferences(liferayPortletRequest);
        _themeDisplay = (ThemeDisplay) httpServletRequest.getAttribute(WebKeys.THEME_DISPLAY);

    }
}
