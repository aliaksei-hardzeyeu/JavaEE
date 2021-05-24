<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 23-May-21
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<h1>Aleshka is Testing JSP</h1>
<p>
   <%
       String name = request.getParameter("name");
   %>
    <%= "Helloushki " + name %>
</p>
</body>
</html>
