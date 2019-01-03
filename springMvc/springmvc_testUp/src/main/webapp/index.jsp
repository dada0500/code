<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
上传:
<form action="/file/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadFile"/>
    <input type="submit" />
</form>
上传:
<form action="/file/uploads" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadFiles"/>
    <input type="file" name="uploadFiles"/>
    <input type="file" name="uploadFiles"/>
    <input type="submit" />
</form>
上传3:

<form action="/file/uploado" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadFile"/>
    <input type="submit" />
</form>
</body>
</html>
