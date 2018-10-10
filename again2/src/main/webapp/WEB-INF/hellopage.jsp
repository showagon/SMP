<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%@ page isELIgnored="false" %>
    <h1></h1>
    
    
  <table border="1">
  <tr>
    <th>Employee ID</th>
    <th>Employee Name</th> 
    <th>Mobile</th>
    <th>Email</th>
  </tr>
  <tr>
    <td>${employee1.getEid()}</td>
    <td>${employee1.getEname()}</td> 
    <td>${employee1.getMobile()}</td>
    <td>${employee1.getEmail()}</td>
  </tr>
  
</table>
    
    
</body>
</html>