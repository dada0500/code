<%@ page import="com.heima.jsp.domain.UserBirthday" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 11月4日
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el_test01</title>
</head>
<body>

<%
    UserBirthday user = new UserBirthday (135,"张三",new Date ());
    request.setAttribute ("u",user);

    ArrayList<Object> list = new ArrayList<> ();
    list.add (1);
    request.setAttribute ("list",list);
%>

${requestScope.u} <br />
${list[22]}
${u.birthdayStr} <br />
</body>
</html>
