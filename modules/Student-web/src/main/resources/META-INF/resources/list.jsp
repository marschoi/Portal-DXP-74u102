<%@ taglib prefix="liferay-ui" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/init.jsp" %>

<div style="background-color: aqua">
    <div>studentList :::: ${studentList}</div>
    <div>studentCount :::: ${studentCount}</div>
    <div>PortletURL :::: ${PortletURL}</div>
    <div>currentURL :::: ${currentURL}</div>
    <div>studentListManagementToolbarDisplayContext :::: ${studentListManagementToolbarDisplayContext}</div>
    <%--<div>studentListManagementToolbarDisplayContext.getDisplayStyle :::: ${studentListManagementToolbarDisplayContext.displayStyle}</div>--%>
</div>
<hr>

<div class="container-fluid-1280">
    <h1>

    </h1>
</div>


<a href="<portlet:renderURL windowState='normal' portletMode='view'>
<portlet:param name='jspPage' value='/edit.jsp'/>
</portlet:renderURL>">Edit Student</a>
