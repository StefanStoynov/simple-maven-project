# simple-maven-project
simple Maven web project

Any servlet should extend HttpServlet
In the servlet we need to define what kind of methods we want to handle(GET, POST)

JSP - Java Server Pages - writes a dynamic content to web browser. At the end JSP is compiled as Java servlet
JSP are stored in webapp/WEB-INF/views

Getting a parameter from url/request is done by using String requestParamValue = request.getParameter("paramName");
Parameter form url is passed to JSP by adding it as attribute request.setAttribute("paramName", requestParamValue);

We can write a Java code into JSP by wrapping it with <% java code %> it is called scriplets. We can use the values
from scriplets it is called scriplet expression. This is not a best practise. Must be avoided at any cases!