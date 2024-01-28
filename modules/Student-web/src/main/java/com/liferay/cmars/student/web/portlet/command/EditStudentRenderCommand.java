package com.liferay.cmars.student.web.portlet.command;

import com.liferay.cmars.student.exception.NoSuchStudentException;
import com.liferay.cmars.student.model.Student;
import com.liferay.cmars.student.service.StudentService;
import com.liferay.cmars.student.web.constants.MVCCommandNames;
import com.liferay.cmars.student.web.constants.StudentWebPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + StudentWebPortletKeys.STUDENTWEB,
                "mvc.command.name=" + MVCCommandNames.EDIT_STUDENT
        },
        service = MVCRenderCommand.class
)
public class EditStudentRenderCommand implements MVCRenderCommand {
    //logger
    private static final Log _log = LogFactoryUtil.getLog(EditStudentRenderCommand.class);

    // 서비스 호출
    @Reference
    StudentService _studentService;

    /**
     * @param renderRequest  the render request
     * @param renderResponse the render response
     * @return
     * @throws PortletException
     */
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

        Student student = null;
        long studentId = ParamUtil.getLong(renderRequest, "studentId");
        _log.info("studentId ================================>>> " + studentId);

        if (studentId > 0) {
            try {
                student = _studentService.getStudent(studentId);
                _log.info("student =============================>>>" + student.toString());
            } catch (NoSuchStudentException noSearchException) {
                noSearchException.printStackTrace();
            } catch (PortalException portalException) {
                throw new RuntimeException(portalException);
            }
        }

        ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
        PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();
        _log.info("portletDisplay===========================>>> " + portletDisplay.toString());

        portletDisplay.setShowBackIcon(true);
        String redirect = ParamUtil.getString(renderRequest, "redirect");
        portletDisplay.setURLBack(redirect);

        renderRequest.setAttribute("student", student);
        renderRequest.setAttribute("studentClass", Student.class);
        return "/edit.jsp";
    }
}
