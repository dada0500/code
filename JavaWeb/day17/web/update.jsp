<%@ page contentType="text/html;charset=utf-8" language="java" %>
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
            <a class="navbar-brand" href="./">首页</a>
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

<div class="container"  style="width: 400px;">
    <div class="row">
        <center><h3>修改联系人</h3></center>
    </div>
    <div class="row">
    <form action="${pageContext.request.contextPath}/userUpdateServlet" method="post">
        <div class="form-group">
                <label for="userid">编号：</label>
                <input type="text" class="form-control" readonly="readonly" name="id" id="id" value="${user.id}">
        </div>
        <div class="form-group">
                <label for="name">姓名：</label>
                <input type="text" class="form-control" name="name" id="name" value="${user.name}">
        </div>
        <div class="form-group">
            <label>性别：</label>
            <c:if test="${user.gender == '男'}">
                <input type="radio" name="gender" value="男" checked="checked" /> 男
                <input type="radio" name="gender" value="女" /> 女
            </c:if>
            <c:if test="${user.gender == '女'}">
                <input type="radio" name="gender" value="男" /> 男
                <input type="radio" name="gender" value="女" checked="checked"  /> 女
            </c:if>
        </div>
            <div class="form-group">
                <label for="userage">年龄</label>
                <input type="text" class="form-control" name="age" id="age"  value="${user.age}">
            </div>
            <div class="form-group">
                <label for="userage">籍贯：</label>
                <select class="form-control" name="address" id="address">
                <c:choose>
                    <c:when test="${user.address == '广东'}">
                        <option value="广东" selected="selected">广东</option>
                        <option value="广西">广西</option>
                        <option value="湖南">湖南</option>
                    </c:when>
                    <c:when test="${user.address == '广西'}">
                        <option value="广东">广东</option>
                        <option value="广西" selected="selected">广西</option>
                        <option value="湖南">湖南</option>
                    </c:when>
                    <c:when test="${user.address == '湖南'}">
                        <option value="广东">广东</option>
                        <option value="广西">广西</option>
                        <option value="湖南" selected="selected">湖南</option>
                    </c:when>
                    <c:otherwise>
                        <option value=""></option>
                        <option value="广东">广东</option>
                        <option value="广西">广西</option>
                        <option value="湖南">湖南</option>
                    </c:otherwise>
                </c:choose>
            </select>
            </div>
            <div class="form-group">
            <label for="qq">QQ：</label>
            <input type="text" class="form-control" name="qq" id="qq"  value="${user.qq}">
        </div>
        <div class="form-group">
            <label for="email">Email：</label>
            <input type="email" class="form-control" name="email" id="email" value="${user.email}">
        </div>
        <div>
            ${result}
        </div>
        <div class="form-group" style="text-align: center">
            <button type="submit" class="btn btn-primary">提交</button>
            <button type="reset" class="btn btn-default">重置</button>
            <button type="button" class="btn btn-default">返回</button>
        </div>

    </form>
    </div>
</div>
</body>
</html>