<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>管理员登录</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <!--<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">-->

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="js/jquery-3.2.1.min.js"></script>

    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="js/bootstrap.js"></script>

    <style type="text/css">
        td, th {
            text-align: center;
        }

        margin5p{
            margin:5px;
        }
        padding5p{
            padding:5px;
        }
    </style>

    <script>
        //切换验证码
        function refreshCode(){
            document.getElementById("vcode").src = "${pageContext.request.contextPath}/checkCode?"+new Date().getTime() ;
        }
    </script>
</head>
<body>
<%--<nav class="navbar navbar-default">--%>
    <%--<div class="container-fluid">--%>
        <%--<!-- Brand and toggle get grouped for better mobile display -->--%>
        <%--<div class="navbar-header">--%>
            <%--<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">--%>
                <%--<!--<span class="sr-only">Toggle navigation</span>-->--%>
                <%--<span class="icon-bar"></span>--%>
                <%--<span class="icon-bar"></span>--%>
                <%--<span class="icon-bar"></span>--%>
            <%--</button>--%>
            <%--<a class="navbar-brand" href="/">首页</a>--%>
        <%--</div>--%>

        <%--<!-- Collect the nav links, forms, and other content for toggling -->--%>
        <%--<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">--%>
            <%--<!--            <ul class="nav navbar-nav">--%>
                            <%--<li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>--%>
                            <%--<li><a href="#">Link</a></li>--%>
                        <%--</ul>-->--%>
            <%--<form class="navbar-form navbar-left" role="search">--%>
                <%--<div class="form-group">--%>
                    <%--<input type="text" class="form-control" placeholder="Search">--%>
                <%--</div>--%>
                <%--<button type="submit" class="btn btn-default">Submit</button>--%>
            <%--</form>--%>
            <%--<ul class="nav navbar-nav navbar-right">--%>
                <%--<li><a href="/login.jsp">登录</a></li>--%>
            <%--</ul>--%>
        <%--</div><!-- /.navbar-collapse -->--%>
    <%--</div><!-- /.container-fluid -->--%>
<%--</nav>--%>
<div class="container">
    <div class="row" style="margin:5px auto; width:400px;">
        <%--<form action="${pageContext.request.contextPath}/loginServlet" method="post">--%>
        <form action="./loginServlet" method="post">
            <div class="text-center h3">登录</div>
            <div>
                <label for="username">用户名：</label>
                <input type="text" class="form-control" name="username" id="username" placeholder="请输入用户名">
            </div>
            <div class="form-group">
                <label for="password">密码：</label>
                <input type="password" class="form-control" name="password" id="password" placeholder="请输入密码">
            </div>
            <div class="form-inline">
                <label for="code">验证码：</label>
                <input type="text" class="form-control" style="width: 120px;" name="code" id="code" placeholder="请输入验证码">
                <a href="javascript:refreshCode()"><img src="${pageContext.request.contextPath}/checkCode" title="看不清点击刷新" id="vcode"/></a>
            </div>
            <hr/>
            <div class="form-group" style="text-align: center;">
                <input class="btn btn btn-primary" type="submit" value="登录">
            </div>
        </form>

        <!-- 出错显示的信息框 -->
        <div class="alert alert-warning alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert" >
                <span>&times;</span>
            </button>
            <strong>${login_msg}</strong>
        </div>
    </div>
</div>
</body>
</html>