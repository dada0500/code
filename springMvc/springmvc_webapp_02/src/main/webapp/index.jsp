<%@page contentType="text/html; charset=utf-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<%--
<a href="hello" >入门程序</a>
<a href="user/str?username=jj&name=kk" >str</a>
<a href="user/reg" >/reg</a>

<a href="user/pathVariable/apath" >/apath</a>
<form action="user/str" method="post" >
    姓名: <input type="text" name="name" value="呵呵" /><br />
    用户名: <input type="text" name="zs.name" value="用户" /><br />
    用户名: <input type="text" name="lie[0].name" value="熊大" /><br />
    年龄: <input type="text" name="lie[0].age"  value=20  /><br />
    用户名: <input type="text" name="kv['one'].name" value="熊二" /><br />
    年龄: <input type="text" name="kv['one'].age" value=15 /><br />

<input type="submit" value="提交" />
</form>--%>


<br />
<!-- SessionAttribute 注解的使用 -->
<a href="user/setSession">存入 SessionAttribute</a>
<hr/>
<a href="user/getSession">取出 SessionAttribute</a>
<hr/>
<a href="user/cleanSession">清除 SessionAttribute</a>

</body>
</html>
