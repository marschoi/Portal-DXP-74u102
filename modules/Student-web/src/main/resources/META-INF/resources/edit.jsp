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
<%--<%@ include file="/META-INF/resources/init.jsp" %>--%>

<div style="background-color: aqua; border: solid 1px black; margin: 10px; padding: 10px;">
    <div>auther :::: ${auther}</div>
    <div>studentList :::: ${studentList}</div>
    <div>studentCounter :::: ${studentCounter}</div>
    <div>PortletURL :::: ${PortletURL}</div>
    <div>currentURL :::: ${currentURL}</div>
    <div>studentListManagementToolbarDisplayContext :::: ${studentListManagementToolbarDisplayContext}</div>
    <div>studentListManagementToolbarDisplayContext.getDisplayStyle :::: ${studentListManagementToolbarDisplayContext.displayStyle}</div>
</div>


<c:choose>
    <c:when test="${not empty student}">
        <portlet:actionURL var="studentActionURL" name="<%=MVCCommandNames.EDIT_STUDENT%>">
            <portlet:param name="redirect" value="${param.redirect}"/>
        </portlet:actionURL>
        <c:set var="editTitle" value="Edit Student"/>
    </c:when>
    <c:otherwise>
        <portlet:actionURL var="studentActionURL" name="<%=MVCCommandNames.ADD_STUDENT%>">
            <portlet:param name="redirect" value="${param.redirect}"/>
        </portlet:actionURL>
        <c:set var="editTitle" value="Add Student"/>
    </c:otherwise>
</c:choose>

<div class="container-fluid-1280 edit-student">

    <h2><lifery-ui:message key="${editTitle}"/></h2>
    <%--
    JSP 페이지에서 사용할 데이터 빈(bean)을 지정합니다. 여기서 ${student}는 이전에 정의된 student 객체를 나타냅니다.
    이 객체는 데이터를 페이지에 전달하고, 사용자 인터페이스 요소와 데이터를 바인딩하는 데 사용
    --%>
    <aui:model-context bean="${student}" model="${studentClass}"/>
    <aui:form action="${studentActionURL}" name="student-form" id="studentForm">
        <aui:fieldset>
            <aui:row>
                <aui:col width="50">
                    <aui:input name="studentName" label="Student Name" type="text">
                        <aui:validator name="required"/>
                    </aui:input>
                </aui:col>
                <aui:col width="50">
                    <aui:input name="studentPhone" label="Student Phone" type="text">
                        <aui:validator name="required"/>
                    </aui:input>
                </aui:col>
            </aui:row>
            <aui:row>
                <aui:col width="50">
                    <aui:input name="studentEmail" label="Student Email" type="text">
                        <aui:validator name="email"/>
                        <aui:validator name="required"/>
                    </aui:input>
                </aui:col>
                <aui:col width="50">
                    <aui:input name="studentCode" label="Student Code" type="text">
                    </aui:input>
                </aui:col>
            </aui:row>

            <%--<aui:row>
                <aui:col width="50">
                    <aui:input name="field5" label="Field 5" type="text" />
                </aui:col>
                <aui:col width="30">
                    <aui:input name="field4" label="Field 4" type="date" />
                </aui:col>
                <aui:col width="20">
                    &lt;%&ndash;<aui:input name="field5" label="Field 5" type="text" />
                    <aui:input name="field2" label="Field 2" type="checkbox" />
                    <aui:input name="field4" label="Field 4" type="date" />&ndash;%&gt;

                    <aui:input name="fieldGroup" label="Field 2 Option 1" type="radio" value="option1"/>
                    <aui:input name="fieldGroup" label="Field 2 Option 2" type="radio" value="option2"/>
                </aui:col>
            </aui:row>--%>
        </aui:fieldset>


        <%-- <aui:input name="studentId" field="studentId" type="hidden"/>--%>
        <%--
        field="studentId"는 이 입력 필드가 백엔드 모델의 studentId 속성과 연결됨
        Alloy UI 태그 라이브러리는 Liferay 개발에 있어 중요한 부분을 차지하며, Liferay에서 제공하는 다양한 기능과 쉽게 통합될 수 있도록 설계
        --%>
        <%--
        <!-- student fields -->
        <column name="studentCode" type="String"/>
        <column name="studentName" type="String"/>
        <column name="studentEmail" type="String"/>
        <column name="studentPhone" type="String"/>
        <column name="studentGender" type="String"/>
        <column name="studentAddress" type="String"/>
        --%>
        <%--  <div class="sheet">
              <div class="panel-group panel-group-flush">
                  <aui:input name="studentCode">

                  </aui:input>
                  <aui:input name="studentName">
                      <aui:validator name="required"/>
                  </aui:input>
                  <aui:input name="studentEmail">
                      <aui:validator name="required"/>
                  </aui:input>
                  <aui:input name="studentPhone">
                      <aui:validator name="required"/>
                  </aui:input>
                  <aui:input name="studentGender">
                  </aui:input>
                  <aui:input name="studentAddress">
                  </aui:input>
              </div>
          </div>--%>
        <aui:button-row>
            <aui:button type="submit" value="Submin"/>
            <aui:button type="cancel" value="Cancel"/>
        </aui:button-row>
    </aui:form>
</div>

<!--------------------------------------------------------------------->
<!--
aui는 Alloy UI 태그 라이브러리,
Alloy UI는 Liferay에서 제공하는 프론트엔드 프레임워크로, 웹 애플리케이션 개발을 위한 다양한 UI 구성 요소와 태그 라이브러리를 포함
# 풍부한 UI 구성 요소: Alloy UI는 폼, 테이블, 버튼, 모달, 탭 등과 같은 다양한 사용자 인터페이스 구성 요소를 제공합니다. 이러한 구성 요소는 웹 애플리케이션의 사용자 경험을 향상시키는 데 중요한 역할을 합니다.
# Liferay와의 통합: Alloy UI는 Liferay 플랫폼과 긴밀하게 통합되어 있어, Liferay에서 개발되는 웹 애플리케이션에 쉽게 적용할 수 있습니다. 이를 통해 개발자는 Liferay 플랫폼의 기능을 활용하면서도 사용자 친화적인 인터페이스를 구현할 수 있습니다.
# MVC 패턴 지원: Alloy UI 태그는 Model-View-Controller(MVC) 패턴을 지원하여, 프론트엔드와 백엔드 간의 명확한 분리를 촉진합니다. 이는 코드의 관리와 유지 보수를 용이하게 합니다.
# 확장성과 사용자 정의: 개발자는 Alloy UI의 기본 구성 요소를 사용자의 요구에 맞게 쉽게 확장하거나 수정할 수 있습니다.
# Alloy UI 태그 라이브러리는 주로 Liferay 포털의 JSP 페이지에서 사용되며, 이를 통해 개발자는 보다 효율적이고 빠르게 사용자 인터페이스를 구현

--->

