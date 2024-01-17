<%--
  Created by IntelliJ IDEA.
  User: cmars
  Date: 2024-01-17
  Time: 오후 11:41
  To change this template use File | Settings | File Templates.
 Student add / edit action URL and set title.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/init.jsp" %>

<c:choose>
    <c:when test="${not empty student}">
        <portlet:actionURL var="studentActionURL" name="%MVCCommandName.EDIT.STUDENT%">
            <portlet:param name="redirect" value="${param.rediect}"/>
        </portlet:actionURL>


    </c:when>
</c:choose>
