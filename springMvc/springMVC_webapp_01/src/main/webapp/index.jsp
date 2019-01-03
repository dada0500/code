<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>index.jsp</title>
<script src="js/jquery.min.js"></script>
<script>
    $(function(){
        $("#tt1").click(function(){
            // alert("点击了弹弹");
            var date = new Date();
            var d1 = date.toDateString();
            $.ajax({
                url:"test/ajax",
                data:'{"name":"张三","age":18,'+d1+'}',
                // data:{name:"张三",age:18,birthday:"2018-1-1"},
                type:"post",
                contentType:"application/json;charset=utf-8",
                dataType:"json",
                success:function(data){
                    alert(data);
                    alert(data.name);
                    alert(data.age);
                    alert(data.birthday);
                }
            });
        });

        $("#tt2").click(function(){
            // alert("点击了弹弹");
            var date = new Date();
            $.ajax({
                url:"test/ajaxUser",
                // data:'{"name":"张三","age":18}',
                data:{name:"张三",age:18,birthday:date},
                type:"post",
                contentType:"application/json;charset=utf-8",
                dataType:"json",
                success:function(data){
                    alert(data);
                    alert(data.name);
                    alert(data.age);
                    alert(data.birthday);
                }
            });
        });

        $("#tt3").click(function(){
            // alert("点击了弹弹");
            var date = new Date();
            $.ajax({
                url:"test/rUser",
                data:'{"name":"张三","age":18}',
                // data:{name:"张三",age:18,birthday:"2018-1-1"},
                type:"post",
                contentType:"application/json;charset=utf-8",
                dataType:"json",
                success:function(data){
                    alert(data);
                    alert(data.name);
                    alert(data.age);
                    alert(data.birthday);
                }
            });
        });
    })
</script>
<body>
<h2>Hello World!</h2>

<a href="hello" >入门程序</a>


<form method="get" action="/test/up" enctype="multipart/form-data">

    姓名: <input type="text" name="name"/><br />
    年龄: <input type="text" name="age" /><br />
    生日: <input type="text" name="birthday" /><br />
    <input type="file" name="file" />

    <input type="submit" value="提交" />
</form>

mvc:
<form method="post" action="/test/upmvc" enctype="multipart/form-data">
<%--
    姓名: <input type="text" name="name"/><br />
    年龄: <input type="text" name="age" /><br />
    生日: <input type="text" name="birthday" /><br />--%>
    <input type="file" name="mvcup" />

    <input type="submit" value="mvc提交" />
</form>
mvc2:
<form method="post" action="/test/upmvc2" enctype="multipart/form-data">
    <input type="file" name="mvcup" />

    <input type="submit" value="mvc提交" />
</form>

<button type="button" id="tt1" >弹弹1</button>
<button type="button" id="tt2" >弹弹2</button>
<button type="button" id="tt3" >弹弹3</button>

<br/>
img:
<img src="img/girl8.jpg" width="50px" height="50px" />
<br />

<br />
</body>
</html>
