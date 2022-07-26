<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Student</title>
</head>
<body>
    <%
     String name = (String) request.getAttribute("name");
     Integer rollnumber = (Integer) request.getAttribute("rollnumber");
    
     
    %>
    <h1>student name is <%= name%> </h1>
    
    <h1>student roll_number is <%= rollnumber%> </h1>
    
</body>
</html>