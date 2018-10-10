<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%@ page isELIgnored="false" %>
   <form action="/again2/updateres" method="POST">
<table >
  <tr>
    <td>Emp id :</td>
    <td><input name="eid" value="${message.getEid()}" readonly="readonly" style="background: #dddddd;"></td>
  </tr>
  <tr>
    <td>Name :</td>
    <td><input name="ename" value="${message.getEname()}"></td>
  </tr>
  <tr>
    <td>Mobile</td>
    <td><input name="mobile" value="${message.getMobile()}"></td> 
  </tr>
  <tr>
    <td>Email</td>
    <td><input name="email" value="${message.getEmail()}"></td> 
  </tr>
  <tr>
    
      <td><input type="submit" value="Update"></td> 
  </tr>
</table>
           
            
            
        </form>