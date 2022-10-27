<%--
  Created by IntelliJ IDEA.
  User: Pavel
  Date: 27.10.2022
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>Information for all employees</h3>


<security:authorize access="hasRole('HR')">

    <input type="button" value="Salary"
           onclick="window.location.href = 'hr_info'">
</security:authorize>

<security:authorize access="hasRole('Manager')">
<input type="button" value="Performance"
       onclick="window.location.href = 'manager_info'">
</security:authorize>
</body>
</html>
