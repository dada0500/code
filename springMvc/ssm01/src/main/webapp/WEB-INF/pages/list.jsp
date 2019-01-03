<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
所有账户:
<c:forEach items="${list}" var="account" >
      account
</c:forEach>
</body>
</html>
