package com.liferay.cmars.student.web.portlet.command;

import com.liferay.cmars.student.model.Student;
import com.liferay.cmars.student.service.StudentService;
import com.liferay.cmars.student.web.constants.MVCCommandNames;
import com.liferay.cmars.student.web.constants.StudentWebPortletKeys;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + StudentWebPortletKeys.STUDENTWEB,
                "mvc.command.name=" + MVCCommandNames.ADD_STUDENT},
        service = MVCActionCommand.class)
public class AddStudentActionCommand extends BaseMVCActionCommand {
    private static final Log _log = LogFactoryUtil.getLog(AddStudentActionCommand.class);

    @Reference
    protected StudentService _studentService;

    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
        long userId = themeDisplay.getUserId();
        ServiceContext serviceContext = ServiceContextFactory.getInstance(Student.class.getName(), actionRequest);

        /*요청에서 매개변수를 가져옴*/
        long studentId = ParamUtil.getLong(actionRequest, "studentId", 0);
        _log.info("========================>>> get Param : studentId : " + studentId);

        String studentName = ParamUtil.getString(actionRequest, "studentName", StringPool.BLANK);
        _log.info("========================>>> get Param : studentName : " + studentName);

        String studentEmail = ParamUtil.getString(actionRequest, "studentEmail", StringPool.BLANK);
        _log.info("========================>>> get Param : studentEmail : " + studentEmail);

        String studentPhone = ParamUtil.getString(actionRequest, "studentPhone", StringPool.BLANK);
        _log.info("========================>>> get Param : studentPhone : " + studentPhone);

        String studentCode = ParamUtil.getString(actionRequest, "studentCode", StringPool.BLANK);
        _log.info("========================>>> get Param : studentCode : " + studentCode);

        String studentGender = ParamUtil.getString(actionRequest, "studentGender");
        _log.info("========================>>> get Param : studentGender : " + studentGender);

        String studentAddress = ParamUtil.getString(actionRequest, "studentAddress");
        _log.info("========================>>> get Param : studentAddress : " + studentAddress);
        /*
        Student addStudent(
                    long userId, // 현재 로그인한 사용자
                    String studentCode,
                    String studentName,
                    String studentEmail,
                    String studentPhone,
                    String studentGender,
                    String studentAddress,
                    ServiceContext serviceContext)
        */

        try {
            _studentService.addStudent(
                    userId,
                    studentCode,
                    studentName,
                    studentEmail,
                    studentPhone,
                    studentGender,
                    studentAddress,
                    serviceContext);
        } catch (PortalException portalException){
            portalException.printStackTrace();
            actionResponse.setProperty("mvcRenderCommandName", MVCCommandNames.ADD_STUDENT);
        }
    }
}
