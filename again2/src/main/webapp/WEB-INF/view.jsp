<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Spring</title>
</head>
<body>
<h2>Show Employees Details</h2>
<table border="1">
	<tr>
		<th>Employee ID</th>
        <th>Employee Name</th> 
        <th>Mobile</th>
         <th>Email</th>
         <th>Edit</th>
         <th>Delete</th>
	</tr>
        
 
        
        
        
	<c:forEach items="${Lists}" var="Lists" varStatus="status">
		<tr>
			<td>${Lists.eid}</td>
			<td>${Lists.ename}</td>
			<td>${Lists.mobile}</td>
			<td>${Lists.email}</td>
                        <td><a href="/again2/update?id=${Lists.eid}">Update</a></td>
                        <td><a href="/again2/delete">Delete</a></td>
		</tr>
	</c:forEach>
</table>	
<br/>
<input type="button" value="Back" onclick="javascript:history.back()"/>
</body>
</html>