<%@ page  contentType="text/html;charset=UTF-8"  pageEncoding="utf-8" language="java" buffer="8kb" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>登录</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <!--<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">-->

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="js/jquery-3.2.1.min.js"></script>

    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="js/bootstrap.js"></script>

    <style>
        #div_form{
            /*width:500px;
            margin: 200px auto;*/
            padding:100px;
            background: url("img/01.jpg") no-repeat center ;
            position:absolute;
            width: 100%;
            height: 100%;
        }
        #div_form form{
            background-color: #ffffff;
            width: 300px;
            padding:20px;
            /*margin-top: 100px;*/
            margin:auto;
        }
    </style>

    <script>
        window.onload = function () {
            // 1.获取图片对象
            var img = document.getElementById("checkCode_img");
            var a = document.getElementById("checkCode_a");

            // 2. 绑定单击事件，改变图片路径，获取不同图片
            function changeimg() {
                //加时间戳
                var date = new Date().getTime();
                img.src = "/day13_javaee8/checkCode?" + date;
                // img.src = "/day13_javaee8/Demo_ImgServlet?" + date;
            }


            a.onclick = changeimg;
        }
    </script>
</head>
<body>

<div id="div_form" class="container-fluid">
    <div class="row">
    <form action="/day13_javaee8/login" method="post" class="center-block">
        <div class="form-group">

<!--
          http://ntlias-stu.boxuegu.com/student/jdugeLogin?r_=1145059234194426.5

          GET /student/jdugeLogin?r_=1145059234194426.5 HTTP/1.1
            Host: ntlias-stu.boxuegu.com
            Connection: keep-alive
            Accept: application/json, text/plain, */*
            User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.67 Safari/537.36
            Referer: http://ntlias-stu.boxuegu.com/
            Accept-Encoding: gzip, deflate
            Accept-Language: zh-CN,zh;q=0.9,en;q=0.8
            Cookie: SESSION=a9e72942-2713-4abd-85c8-16b570114d4b-->


            <label for="username">用户名：</label>
            <input type="text" class="form-control"  name="username" id="username" placeholder="请输入用户名">
        </div>
        <div class="form-group">
            <label for="Password">密码：</label>
            <input type="password" class="form-control" name="password" id="Password" placeholder="请输入密码">
        </div>
        <div class="form-group">
            <label for="checkCode">验证码：</label>
            <input type="text" class="form-control" name="checkCode" id="checkCode" placeholder="请输入验证码">
            <!--<a src="javascript:void(0)" id="checkCode_a" class="btn"><img src="/day13_javaee8/Demo_ImgServlet" id="checkCode_img" />看不清 换个</a>-->
            <img src="/day13_javaee8/checkCode" id="checkCode_img" /><a src="javascript:void(0)" id="checkCode_a">看不清 换个</a>
        </div>
        <button type="submit" class="btn btn-default">登录</button>
        <span class="col-sm-3">
            <%= request.getSession ().getAttribute ("error") %>
        </span>
    </form>
    </div>
    <div class="row">
        <a href="/day13_javaee8/download?filename=美女图.jpg" class="btn" >下载</a>
    </div>
</div>
</body>
</html>