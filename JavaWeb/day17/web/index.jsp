<%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 11月5日
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
  <title>Title</title>

  <!-- 新 Bootstrap 核心 CSS 文件 -->
  <link rel="stylesheet" href="css/bootstrap.min.css">

  <!-- 可选的Bootstrap主题文件（一般不用引入） -->
  <!--<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">-->

  <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
  <script src="js/jquery-3.2.1.min.js"></script>

  <!-- Include all compiled plugins (below), or include individual files as needed -->
  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="js/bootstrap.js"></script>
  </head>
  <body>
 <center>
    <a href="${pageContext.request.contextPath}/userListServlet" style="text-decoration: none; font-size: 33px">查询所有用户</a>
  </center>

  </body>
</html>
