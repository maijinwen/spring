<%--
  Created by IntelliJ IDEA.
  User: 麦锦文
  Date: 2020/5/1
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form action="fileupload" method="post" enctype="multipart/form-data">
        <table border="1px">
            <tr>
                <td>作者：</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>文件上传</td>
                <td><input type="file" name="file"></td>
            </tr>
            <tr>
                <td><input type="submit"></td>
            </tr>
        </table>
    </form>
</body>
</html>
