<%@ include file="/init.jsp" %>

<div style="background-color: aqua">
    <div>students :::: ${students}</div>
    <div>studentCount :::: ${studentCount}</div>
    <div>PortletURL :::: ${PortletURL}</div>
    <div>currentURL :::: ${currentURL}</div>
    <div>studentsManagementToolbarDisplayContext :::: ${studentsManagementToolbarDisplayContext}</div>
    <div>studentsManagementToolbarDisplayContext.getDisplayStyle :::: ${studentsManagementToolbarDisplayContext.displayStyle}</div>
</div>

<p>
    <b><liferay-ui:message key="studentweb.caption"/></b>
</p>
<h1 style="background: cornflowerblue; font-size: 20px; color: wheat; padding: 20px;">
    <liferay-ui:message key="studentweb.greeting"/>
</h1>