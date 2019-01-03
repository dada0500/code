<%@ page import="static java.lang.System.out" %><%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 11月1日
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%!
    private void sbut (){
      int y = 6;
      out.print ("sbut");
    }
  %>

  <%
    System.out.println ("控制台输出");
    sbut();
    int z = 6;
  %>
  day13_JavaEE8    $END$

  </body>
</html>
