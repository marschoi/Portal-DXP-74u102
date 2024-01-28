<%--<%@ taglib prefix="liferay-ui" uri="http://java.sun.com/jsp/jstl/fmt" %>--%>
<%@ include file="/init.jsp" %>

<div style="background-color: aqua">
    <div>studentList :::: ${studentList}</div>
    <div>auther :::: ${auther}</div>
    <div>studentCounter :::: ${studentCounter}</div>
    <div>PortletURL :::: ${PortletURL}</div>
    <div>currentURL :::: ${currentURL}</div>
    <div>studentListManagementToolbarDisplayContext :::: ${studentListManagementToolbarDisplayContext}</div>
    <div>studentListManagementToolbarDisplayContext.getDisplayStyle :::: ${studentListManagementToolbarDisplayContext.displayStyle}</div>
</div>
<hr>
<div>
    <h1>
        <lifery-ui:message key="studentweb.greeting"/>
    </h1>
</div>

<div class="container-fluid-1280">
    <clay:management-toolbar disabled="${studentCount eq 0}"
                             displayContext="${studentListManagementToolbarDisplayContext}"
                             itemsTotal="${studentCounter}"
                             searchContainerId="studentEnties"
                             selectable="false"/>

</div>
<hr>

<%--<script>
    if (window.jQuery) {
        // jQuery가 로드되었다면 버전을 표시
        alert("jQuery  Version : " + jQuery.fn.jquery);
    } else {
        // jQuery가 로드되지 않았다면 경고 메시지 표시
        alert("jQuery not load!! .");
    }
</script>--%>
<%--

<div style="background: aliceblue; padding: 10px">
    <div id="example">
        <div class="demo-section">
            <div>
                <h4>Basic Button</h4>
                <p>
                    <button id="primaryTextButton">Primary Button</button>
                    <button id="textButton">Button</button>
                </p>
            </div>

            <div>
                <h4>Disabled buttons</h4>
                <p>
                    <a id="primaryDisabledButton">Disabled Primary Button</a>
                    <a id="disabledButton">Disabled Button</a>
                </p>
            </div>

            <div>
                <h4>Buttons with icons</h4>
                <p>
                    <a id="iconTextButton">Filter</a>
                    <a id="kendoIconTextButton">Clear Filter</a>
                    <em id="iconButton"></em>
                </p>
            </div>
        </div>

        <script>
            $(document).ready(function () {
                $("#primaryTextButton").kendoButton({
                    themeColor: "primary"
                });

                $("#textButton").kendoButton();

                $("#primaryDisabledButton").kendoButton({
                    themeColor: "primary",
                    enable: false
                });

                $("#disabledButton").kendoButton({
                    enable: false
                });

                $("#iconTextButton").kendoButton({
                    icon: "filter"
                });

                $("#kendoIconTextButton").kendoButton({
                    icon: "filter-clear"
                });

                $("#iconButton").kendoButton({
                    icon: "arrow-rotate-cw"
                });
            });
        </script>

        <style>
            .demo-section p {
                margin: 0 0 30px;
                line-height: 50px;
            }

            .demo-section p .k-button {
                margin: 0 10px 0 0;
            }

            .k-button-solid-primary {
                min-width: 150px;
            }
        </style>
    </div>

</div>
--%>
