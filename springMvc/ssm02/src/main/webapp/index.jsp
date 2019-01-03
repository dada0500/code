<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="account/findAll">查询所有账户</a>

转账:
<form action="account/transfer">
    姓名a:<input type="text" name="a" />
    姓名b:<input type="text" name="b"/>
    金额:<input type="text" name="money"/>
    <input type="submit" />
</form>
</body>
</html>
