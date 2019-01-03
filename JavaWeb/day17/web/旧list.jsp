<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <!--<span class="sr-only">Toggle navigation</span>-->
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">首页</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
<!--            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
                <li><a href="#">Link</a></li>
            </ul>-->
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/login.jsp">登录</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="container">
<center class="text-center h3">用户信息表</center>

    <div class="row" style="margin:5px">
        <div class="pull-left list-inline">
            <form class="form-inline">
                <div class="form-group">
                    <label for="username">姓名：</label>
                    <input type="text" class="form-control" name="username" id="username">
                    <!--<input type="text" class="form-control" name="username" id="username" placeholder="Jane Doe">-->
                </div>
                <div class="form-group">
                    <label for="address">籍贯：</label>
                    <input type="text" class="form-control" name="address" id="address">
                    <!--<input type="text" class="form-control" name="address" id="address" placeholder="example">-->
                </div>
                <div class="form-group">
                    <label for="email">邮箱：</label>
                    <input type="email" class="form-control" name="email" id="email">
                    <!--<input type="email" class="form-control" name="email" id="email" placeholder="example">-->
                </div>
                <button type="submit" class="btn btn-default">查询</button>
            </form>
        </div>
        <div class="pull-right list-inline">
            <a href="add.jsp" id="addBut" class="btn btn-primary">添加联系人</a>
            <a href="add.jsp" id="addBut" class="btn btn-primary">删除联系人</a>
        </div>
    </div>
    <table class="table table-bordered table-hover text-center">
    <thead class="text-center bg-success">
    <tr>
        <th>序号</th>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>籍贯</th>
        <th>QQ</th>
        <th>邮箱</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <%--<c:forEach var="user" items="${requestScope.uesrs}" varStatus="s" >--%>
    <c:forEach var="user" items="${users}" varStatus="s" >

        <tr>
            <td>${s.count}</td>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.gender}</td>
            <td>${user.address}</td>
            <td>${user.qq}</td>
            <td>${user.email}</td>
            <td>
                <a class="btn btn-default modify"  href="/update.html">修改</a>
                <a class="btn btn-default del" href="/userDelServlet">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
    <div>
        ${result}
    </div>
<div class="row text-center">
    <a href="add.jsp" id="addBut" class="btn btn-primary">添加联系人</a>
</div>
</div>
</body>
</html>