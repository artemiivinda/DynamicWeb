<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "ua.com.foxminded.db.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My JSP</title>
</head>
<body>
	<h1>Hello World! 2</h1>
	<br/>	
	<%
		for(String name : DatabaseFacade.getBooks()){
			out.println(name + "<br/>");
		}
	
		if(request.getParameter("input") != null){
//			DatabaseFacade.insert(request.getParameter("input"));
		}
		
		
		
	%>
	<form>
		<input type = "text">
		<input type = "submit">
	</form>
</body>
</html>