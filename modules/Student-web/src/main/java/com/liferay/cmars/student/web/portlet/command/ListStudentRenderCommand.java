package com.liferay.cmars.student.web.portlet.command;

import com.liferay.cmars.student.model.Student;
import com.liferay.cmars.student.service.StudentService;
import com.liferay.cmars.student.web.constants.MVCCommandNames;
import com.liferay.cmars.student.web.constants.StudentWebPortletKeys;
import com.liferay.cmars.student.web.display.StudentListManagementToolbarDisplayContext;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.*;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.List;

/*
 * "mvc.command.name"이 두 번 선언되어 있지만, 서로 다른 값을 가지고 있습니다.
 * 첫 번째 선언은 루트 경로("/")로의 요청을 처리하도록 지정하고,
 * 두 번째 선언은 MVCCommandNames.VIEW_ASSIGNMENT 값에 해당하는 요청을 처리하도록 지정합니다.
 * 이렇게 선언하면, 이 컴포넌트는 두 가지 다른 명령어에 대한 요청을 처리할 수 있게 된다.
 * */
@Component(
        immediate = true,
        property = {
                "mvc.command.name=/",
                "mvc.command.name=" + MVCCommandNames.LIST_STUDENTS,
                "javax.portlet.name=" + StudentWebPortletKeys.STUDENTWEB
        },
        service = MVCRenderCommand.class)

public class ListStudentRenderCommand implements MVCRenderCommand {
    private static final Log _log = LogFactoryUtil.getLog(ListStudentRenderCommand.class);


    /*
     *            -- 서비스주입 받는 방법 : @Reference 애너테이션 사용 --
     * @Reference 애너테이션을 사용하여 ServiceBuilder 생성된 서비스를 호출하려면,
     *  컨트롤러 클래스에서 해당 서비스 인터페이스를 주입하면 됩니다.
     * 이렇게 하면 Liferay OSGi 프레임워크가 자동으로 해당 서비스 구현체를 찾아 인스턴스를 주입해 줍니다.
     * 이를 통해 서비스를 사용할 준비가 완료되며, 서비스 메서드를 호출하여 데이터를 가져오고 작업을 수행할 수 있습니다.
     */
    @Reference
    Portal _portal;

    @Reference
    StudentService _studentService;


    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        //---------------- 두가지 Method 정의하면 됨. --------------------------//
        addStudentAttributes(renderRequest);

        addStudentManagementToolbarAttributes(renderRequest, renderResponse);
        return "/list.jsp";
    }

    private void addStudentAttributes(RenderRequest renderRequest) {
        ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

        /* 페이징 처리를 위한 값 정의 */
        int currentPage = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_CUR_PARAM, SearchContainer.DEFAULT_CUR);
        int delta = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_DELTA_PARAM, SearchContainer.DEFAULT_DELTA);
        int start = ((currentPage > 0) ? (currentPage - 1) : 0) * delta;
        int end = start + delta;

        /* 정렬 칼럼, 타입 정하기 */
        String orderByCol = ParamUtil.getString(renderRequest, "orderByCol", "studentName");
        String orderByType = ParamUtil.getString(renderRequest, "orderByType", "asc");


        /* comparator <Student> 타입 생성 */
        OrderByComparator<Student> comparator = OrderByComparatorFactoryUtil.create("Student", orderByCol, true);

        /* 검색어 가져오기 */
        String keywords = ParamUtil.getString(renderRequest, "keywords");

        /* 서비스 호출히기 -> getStudentsByKeywords(long groupId, String keywords, int start, int end,OrderByComparator<Student> orderByComparator) */
        List<Student> studentList = _studentService.searchStudentByKeyWords(themeDisplay.getCompanyGroupId(), keywords, start, end, comparator);

        renderRequest.setAttribute("studentList", studentList);
        renderRequest.setAttribute("keywords", keywords);
        renderRequest.setAttribute("studentCount", _studentService.searchStudentsCountByKeywords(themeDisplay.getScopeGroupId(), keywords));


    }

    private void addStudentManagementToolbarAttributes(RenderRequest renderRequest, RenderResponse renderResponse) {
        LiferayPortletRequest liferayPortletRequest = _portal.getLiferayPortletRequest(renderRequest);
        LiferayPortletResponse liferayPortletResponse = _portal.getLiferayPortletResponse(renderResponse);

        StudentListManagementToolbarDisplayContext studentsManagementToolbarDisplayContext =
                new StudentListManagementToolbarDisplayContext(_portal.getHttpServletRequest(renderRequest), liferayPortletRequest, liferayPortletResponse);
        renderRequest.setAttribute("studentListManagementToolbarDisplayContext", studentsManagementToolbarDisplayContext);


    }


}
