<%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 11月10日
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
login
<% System.out.println ("login.jsp执行。");  %>
<br />

request: <%= request %> ;
<br />
response: <%=response%>;
<br />
el request: ${requestScope};
<br />
el response: ${pageContext.response};
</body>
</html>
