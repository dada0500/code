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
    <link rel="stylesheet" href="css/my.css">

    <script>
        function delOne(uid) {
            if(confirm("确定删除?")){
                location = "${pageContext.request.contextPath}/userDelServlet?uid="+uid;
            }
        }
        function delChecks() {
            if (!confirm("确定删除选中吗？")) {
                return;
            }
            var check = document.getElementsByName("check");
            var a = new Array();
            for (var i = 0; i < check.length; i++) {
                if (check[i].checked) {
                    // url += ("&uid=" + check[i].value);
                    a.push(check[i].value);
                }
            }
            if (a.length > 1) {
                location = "${pageContext.request.contextPath}/userDelServlet?uid=" + a;
            }
        }

        window.onload = function () {
            var checks = document.getElementById("checks");
            checks.onclick = function () {
                var check = document.getElementsByName("check");
                for(var i = 0 ; i < check.length; i++){
                    check.item(i).checked = this.checked;
                }
            }
        }
    </script>
</head>
<body>
<div class="container">
    <div class="row text-center h3">用户信息表</div>
    <div class="row" style="margin:5px">
        <div class="pull-left list-inline">
            <form action="${pageContext.request.contextPath}/findUsersServlet" method="post" id="searchForm" class="form-inline">
                <div class="form-group">
                    <label for="name">姓名：</label>
                    <input type="text" class="form-control" name="name" id="name" value="${sessionScope.condition.name[0]}">
                    <!--<input type="text" class="form-control" name="username" id="username" placeholder="Jane Doe">-->
                </div>
                <div class="form-group">
                    <label for="age">年龄：</label>
                    <input type="text" class="form-control" name="age" id="age" value="${condition.age[0]}">
                    <!--<input type="text" class="form-control" name="username" id="username" placeholder="Jane Doe">-->
                </div>
                <div class="form-group">
                    <label for="address">籍贯：</label>
                    <input type="text" class="form-control" name="address" id="address" value="${sessionScope.condition.address[0]}">
                    <!--<input type="text" class="form-control" name="address" id="address" placeholder="example">-->
                </div>
                <div class="form-group">
                    <label for="email">邮箱：</label>
                    <input type="email" class="form-control" name="email" id="email" value="${condition.email[0]}">
                    <!--<input type="email" class="form-control" name="email" id="email" placeholder="example">-->
                </div>
                <button type="submit" class="btn btn-default">查询</button>
                <button type="reset" class="btn btn-default">清空</button>
            </form>
        </div>
        <div class="pull-right list-inline">
            <a href="add.jsp" id="addBut" class="btn btn-primary">添加联系人</a>
            <a href="javascript:delChecks();" id="addBut" class="btn btn-primary">删除联系人</a>
        </div>
    </div>
    <div class="row">
        <table class="table table-bordered table-hover text-center">
            <thead class="text-center bg-success">
            <tr>
                <th><input type="checkbox" name="checks" id="checks" /></th>
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
            <c:forEach var="user" items="${sessionScope.page.list}" varStatus="s" >

                <tr>
                    <td><input type="checkbox" name="check" value="${user.id}" /></td>
                    <td>${s.count}</td>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.age}</td>
                    <td>${user.gender}</td>
                    <td>${user.address}</td>
                    <td>${user.qq}</td>
                    <td>${user.email}</td>
                    <td>
                        <a class="btn btn-default modify"  href="${pageContext.request.contextPath}/findUserServlet?uid=${user.id}">修改</a>
                        <a class="btn btn-default del" href="javascript:delOne(${user.id});">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="row">
        <nav class="pull-left">
            <ul class="pagination">
                <li>
                    <a href="${pageContext.request.contextPath}/findUsersServlet?pageNum=${page.pageNum-1}&name=${condition.name[0]}&age=${condition.age[0]}&address=${condition.address[0]}&email=${condition.email[0]}" aria-label="Previous" name="changPage">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>


                <c:forEach begin="1" end="${page.pageCount}" var="i"  step="1" >
                    <c:if test="${page.pageNum != i}" >
                        <li>
                    </c:if>
                    <c:if test="${page.pageNum == i}" >
                        <li class="active">
                    </c:if>
                        <a href="${pageContext.request.contextPath}/findUsersServlet?pageNum=${i}&name=${condition.name[0]}&age=${condition.age[0]}&address=${condition.address[0]}&email=${condition.email[0]}"  name="changPage">${i}</a>
                    </li>
                </c:forEach>


                <li>
                    <a href="${pageContext.request.contextPath}/findUsersServlet?pageNum=${page.pageNum+1}&name=${condition.name[0]}&age=${condition.age[0]}&address=${condition.address[0]}&email=${condition.email[0]}" aria-label="Next" name="changPage">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
                <span  style="font-size: 25px;margin-left: 5px;">
                    共${sessionScope.page.userCount}条记录，共${sessionScope.page.pageCount}页
                </span>
            </ul>
        </nav>
    </div>
    <div>${result}</div>
</div>
</body>
</html>