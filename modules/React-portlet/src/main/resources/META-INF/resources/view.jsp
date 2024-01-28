<%@ include file="/init.jsp" %>
<div style="background: #DDDDDD; height: 300px;">
    <div><h1>Hello!! React-Portlet</h1></div>
    <div id="<portlet:namespace />-root"></div>
    <aui:script require="<%= mainRequire %>">
        main.default('<portlet:namespace/>-root');
    </aui:script>
</div>
