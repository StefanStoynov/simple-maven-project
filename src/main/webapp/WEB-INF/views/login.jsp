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
<%--use java code ->coled scriplet--%>
<%
    System.out.println("test");
    java.util.Date date = new java.util.Date();
%>
<div>
<%--how to pass a value of java code written inside JSP -> called scriplet expression--%>
    Current date is <%=date%>
</div>
<%--get the attribute value with name paramName--%>
  My first JSP ${paramName}
</body>
</html>
