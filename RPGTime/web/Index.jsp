<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Main CSS File -->
<link rel="stylesheet" type="text/css" href="css/style.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.css"
	media="screen" />

<title>Index</title>
</head>
<body>

	<ul id="nav">
		<li><a href="index.jsp">Index</a></li>
		<%
			session = request.getSession(false);
			if (session.getAttribute("user") != null) {
		%>
		<li><a href="#">Beiträge</a></li>
		<li><a href="#">Suche</a></li>
		<%
			}
			session = request.getSession(false);
			if(session.getAttribute("user")==null){	
		%>
		<li><a href="#">Login</a></li>
		<%
			}else{
		%>
		<li><a href="#">Logout</a></li>
		<%
		}
		%>
	</ul>

</body>
</html>
