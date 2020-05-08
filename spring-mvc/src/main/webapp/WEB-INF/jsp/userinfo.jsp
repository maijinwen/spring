<%--
  Created by IntelliJ IDEA.
  User: 麦锦文
  Date: 2020/5/1
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单对象</title>
</head>
<body>
    <form action="handleForm" method="post">
        <table border="1px">
            <tr>
                <td>ID</td>
                <td><input type="number" name="id"></td>
<%--                <td><input type="number" name="id1"></td>--%>
            </tr>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>生日</td>
                <td><input type="date" name="birthday"></td>
            </tr>
            <tr>
                <td><input type="submit"></td>
            </tr>
        </table>
    </form>
</body>
</html>
