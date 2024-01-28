package com.liferay.cmars.student.web.display;

import com.liferay.cmars.student.web.constants.MVCCommandNames;
import com.liferay.cmars.student.web.constants.StudentWebPortletKeys;
import com.liferay.frontend.taglib.clay.servlet.taglib.display.context.BaseManagementToolbarDisplayContext;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.*;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.*;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.PortletURL;
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

    /*
     * #1 Menu 새성
     * #2 Display Style Get
     * #3 Search Container 생성
     * #4 Search Container에 필요한 정보를 담아서 반환
     *
     * */


    public CreationMenu getCreationMenu() { /*CreationMenu은 사용자가 생성할 수 있는 항목들을 포함하는 메뉴*/

        return new CreationMenu() {   /*익명 클래스 사용*/
            private static final long serialVersionUID = -906284793948061213L; /* 객체가 직렬화와 역직렬화 과정에서 동일한 클래스로 인식되도록 하는데 사용*/

            {
                addDropdownItem(dropdownItem -> { /*람다 표현식*/
                    dropdownItem.setHref(liferayPortletResponse.createRenderURL(), /*setHref 메서드를 사용하여 링크를 설정*/
                            "mvcRenderCommandName",
                            MVCCommandNames.EDIT_STUDENT,
                            "redirect", currentURLObj.toString());
                    dropdownItem.setLabel(LanguageUtil.get(httpServletRequest, "Student 추가"));
                });
            }
        };
    }

    @Override
    public String getClearResultsURL() {
        return getSearchActionURL();
    }


    /*  get display style*/
    public String getDisplayStyle() {
        // 요청에서 "displayStyle" 파라미터의 값을 가져옵니다.
        String displayStyle = ParamUtil.getString(httpServletRequest, "displayStyle");

        // 로그 메시지를 보다 정보가 있는 형태로 기록합니다.
        _log.info("Current displayStyle value: " + displayStyle);

        // displayStyle이 null이거나 비어있는 경우, 기본값을 사용합니다.
        if (Validator.isNull(displayStyle)) {
            displayStyle = _portalPreferences.getValue(StudentWebPortletKeys.STUDENTWEB, "student-display-style", "descriptive");
            _log.debug("Using default displayStyle value: " + displayStyle);
        } else {
            // displayStyle 값이 있는 경우, _portalPreferences에 저장합니다.
            _portalPreferences.setValue(StudentWebPortletKeys.STUDENTWEB, "student-display-style", displayStyle);
            // HttpServletRequest.setAttribute(WebKeys.SINGLE_PAGE_APPLICATION_CLEAR_CACHE, Boolean.TRUE);
            /*객체는 서블릿 메서드(doGet, doPost 등)의 매개변수로 자동으로 전달*/
            request.setAttribute(WebKeys.SINGLE_PAGE_APPLICATION_CLEAR_CACHE, Boolean.TRUE);
            _log.debug("Updated displayStyle value in portal preferences: " + displayStyle);
            _log.info("===============================>>>> displayStyle : " + displayStyle);
        }

        return displayStyle;
    }

    /* Get Order By Col */
    public String getOrderByCol() {
        return ParamUtil.getString(httpServletRequest, "orderByCol", "studentName");
    }

    /* Get Order By Type */
    public String getOrderByType() {
        return ParamUtil.getString(httpServletRequest, "orderByType", "asc");
    }

    /* Override getSearchActionURL() */

    @Override
    public String getSearchActionURL() {
        PortletURL searchURL = liferayPortletResponse.createRenderURL();
        searchURL.setProperty("mvcRenderCommandName", MVCCommandNames.LIST_STUDENTS);

        String navigation = ParamUtil.getString(httpServletRequest, "navigation", "entries");
        searchURL.setProperty("navigation", navigation);
        searchURL.setProperty("orderByCol", getOrderByCol());
        searchURL.setProperty("orderByType", getOrderByType());

        return searchURL.toString();
    }

    public List<ViewTypeItem> getViewTypeItems() {
        PortletURL portletURL = liferayPortletResponse.createRenderURL();
        portletURL.setProperty("mvcRenderCommandName", MVCCommandNames.LIST_STUDENTS);

        int delta = ParamUtil.getInteger(httpServletRequest, SearchContainer.DEFAULT_DELTA_PARAM, 20);
        portletURL.setProperty("delta", String.valueOf(delta));

        String OrderByCol = ParamUtil.getString(httpServletRequest, "orderByCol", "studentName");
        String OrderByType = ParamUtil.getString(httpServletRequest, "orderByType", "asc");
        portletURL.setProperty("orderByCol", getOrderByCol());
        portletURL.setProperty("orderByType", getOrderByType());

        int cur = ParamUtil.getInteger(httpServletRequest, SearchContainer.DEFAULT_CUR_PARAM, 1);
        portletURL.setProperty("cur", String.valueOf(cur));

        return new ViewTypeItemList(portletURL, getDisplayStyle()) {
            private static final long serialVersionUID = 8832253963295390216L;

            {
                addListViewTypeItem();
                addTableViewTypeItem();
            }
        };
    }

    @Override
    protected List<DropdownItem> getOrderByDropdownItems() {
        try {
            return new DropdownItemList() {
                private static final long serialVersionUID = -1861125236414202911L;

                {
                    add(dropdownItem -> {
                        dropdownItem.setActive("studentTitle".equals(getOrderByCol()));
                        dropdownItem.setHref(_getCurrentSortingURL(), "orderByCol", "studentTitle");
                        dropdownItem.setLabel(LanguageUtil.get(httpServletRequest, "title"));
                    });
                    add(dropdownItem -> {
                        dropdownItem.setActive("createDate".equals(getOrderByCol()));
                        dropdownItem.setHref(_getCurrentSortingURL(), "orderByCol", "createDate");
                        dropdownItem.setLabel(LanguageUtil.get(httpServletRequest, "create-date"));
                    });
                }
            };  //DropdownItemList
        } catch (Exception e) {
            _log.error("Error occurred while getting current sorting URL", e);
            return Collections.emptyList();
        }
    }

    private PortletURL _getCurrentSortingURL() throws PortletException {
        PortletURL sortingURL = PortletURLUtil.clone(currentURLObj, liferayPortletResponse);
        _log.info("=============================>>> sortingURL " + sortingURL.toString());
        sortingURL.setProperty("mvcRenderCommandName", MVCCommandNames.LIST_STUDENTS);
        //reset current page
        sortingURL.setProperty(SearchContainer.DEFAULT_CUR_PARAM, "0");
        String keywords = ParamUtil.getString(httpServletRequest, "keywords");
        if (Validator.isNotNull(keywords)) {
            sortingURL.setProperty("keywords", keywords);
        }
        return sortingURL;
    }

}
