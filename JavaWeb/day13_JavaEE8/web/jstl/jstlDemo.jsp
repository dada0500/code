<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.util.Collections" %><%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 11月5日
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>案例</title>
</head>
<body>
<%--
需求：在request域中有一个存有User对象的List集合。
    需要使用jstl+el将list集合数据展示到jsp页面的表格table中
--%>

<%
    ArrayList<String> list = new ArrayList<> ();
    list.add ("aaa");
    list.add ("bbb");
    list.add ("ccc");

    request.setAttribute ("list",list);
%>

<table>
<c:forEach var="str" items="${list}" varStatus="n">
    <tr>
        <td>
            ${n.count}
        </td>
        <td>
            ${str}
        </td>
    </tr>
</c:forEach>
</table>


</body>
</html>
