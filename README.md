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

#Spring MVC

DispatcherServlet -> Front Controller

/login -> Login Controller (Handler)

Views in Spring MVS are in /WEB-INF/views/login.jsp
We need to configure a View Resolver in todo-servlet.xml

Content of View Resolver is:
<bean
class="org.springframework.web.servlet.view.InternalResourceViewResolver">
<property name="prefix">
<value>/WEB-INF/views/</value>
</property>
<property name="suffix">
<value>.jsp</value>
</property>
</bean>

we use Resolver to add to url prefix and suffix and in the end we will call:
http://localhost:8080/spring-mvc/login
but Resolver will change it to
http://localhost:8080/spring-mvc/WEB-INF/views/login.jsp
login.jsp -> View

In Spring MVC parameters from request are past to the Views with ModelMap, which is a
parameter of POST method of LoginController