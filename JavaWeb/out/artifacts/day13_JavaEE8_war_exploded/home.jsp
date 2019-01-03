<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.io.UnsupportedEncodingException" %><%--
  Created by IntelliJ IDEA.
  User: lxw
  Date: 11月3日
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>loginTime</title>
</head>
<body>

<%
    Cookie[] cookies = request.getCookies ();
    if(cookies != null && cookies.length > 0){
        for (Cookie cookie : cookies) {
            String name = cookie.getName ();
            if("lastTime".equals(name)){
                // 获取cookie值
                String value = cookie.getValue ();
                // 显示上次登录时间
                // 解码value
                value = URLDecoder.decode (value, "utf-8");
//                System.out.println ("欢迎！上次登录时间：" + value);
                out.print ("欢迎！上次登录时间：" + value);
//                setCookieTime (cookie);

                // 获取当前时间的字符格式表示
                Date date = new Date ();
                SimpleDateFormat sdf = new SimpleDateFormat ("yyyy年MM月dd日 HH:mm:ss");
                String fdate = sdf.format (date);
                // cookie编码，解决乱码
                fdate = URLEncoder.encode (fdate, "utf-8");
                // 修改cookie值
                cookie.setValue (fdate);
                // 响应cookie
                response.addCookie (cookie);
                break;
            }
        }
    }else {
        out.print ("else");
        // 第一次登录
//        System.out.println ("第一次登录");
        out.println ("第一次登录");

        // 获取当前时间的字符格式表示
        Date date = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy年MM月dd日 HH:mm:ss");
        String fdate = sdf.format (date);
        // cookie编码，解决乱码
        fdate = URLEncoder.encode (fdate, "utf-8");
        // 修改cookie值
        response.addCookie (new Cookie ("lastTime",fdate));
    }
%>
</body>
</html>
<%--
<%!
    private void setCookieTime (Cookie cookie) throws UnsupportedEncodingException {
        // 获取当前时间的字符格式表示
        Date date = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy年MM月dd日 HH:mm:ss");
        String fdate = sdf.format (date);
        // cookie编码，解决乱码
        fdate = URLEncoder.encode (fdate, "utf-8");
        // 修改cookie值
        cookie.setValue (fdate);
    }
%>--%>
