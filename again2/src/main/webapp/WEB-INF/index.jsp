<%-- 
    Document   : index
    Created on : 12-Jul-2018, 10:37:10
    Author     : arahman9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   <form action="/again2/welcome" method="POST">
<table >
  <tr>
    <td>Emp id :</td>
    <td><input name="eid"></td>
  </tr>
  <tr>
    <td>Name :</td>
    <td><input name="ename"></td>
  </tr>
  <tr>
    <td>Mobile</td>
    <td><input name="mobile"></td> 
  </tr>
  <tr>
    <td>Email</td>
    <td><input name="email"></td> 
  </tr>
  <tr>
    
      <td><input type="submit" value="Submit"></td> 
  </tr>
</table>
         <br></br>   
    <a href="/again2/view">View Employees</a>         
            
            
        </form>
    </body>
</html>
