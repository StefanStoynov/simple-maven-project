<%--
  Created by IntelliJ IDEA.
  User: alfa
  Date: 16.01.22
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Yahoo from JSP</title>
</head>
<body>
<%--who will handle the form is in action attribute--%>
<form action="/spring-mvc/login" method="POST">
<p><font color="red">${errorMessage}</font></p>
<%--    input type="text" what will be the name ="username"--%>
Enter your username <input type="text" name="username"/> password <input type="password" name="password"/> <input type="submit" value="Login">
</form>
</body>
</html>
