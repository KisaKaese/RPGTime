<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Login</title>
<meta name="generator" content="Bootply" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">
</head>
<body>
	<!-- NAVBAR -->

	<nav class="navbar navbar-default navbar-inverse">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.jsp">RPGTime</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<%
				session = request.getSession(false);
				if (session.getAttribute("userID") != null) {
			%>
			<ul class="nav navbar-nav">
				<li class="active"><a href="postListing.action">Posts <span
						class="sr-only">(current)</span></a></li>
				<li><a href="characterListing.action">Charaktere</a></li>
			</ul>
			<%
				}
			%>
			<form class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Suche">
				</div>
				<button type="submit" class="btn btn-default">Suchen</button>
			</form>
			<%
				session = request.getSession(false);
				if (session.getAttribute("userID") != null) {
			%>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="logout.action">Logout (<s:property
							value="#session['user']" />)
				</a></li>
			</ul>
			<%
				} else {
			%>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="login.jsp">Login</a></li>
			</ul>
			<%
				}
			%>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>



	<!-- CONTENT -->


	<br>
	<br>
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h1 class="text-center">Login</h1>
				<h2 class="text-center">
					<s:property value="infoMessage" />
				</h2>
			</div>
			<div class="modal-body">
				<%
					session = request.getSession(false);
					if (session.getAttribute("userID") == null) {
				%>
				<s:form class="form col-md-12 center-block" action="login"
					method="post">
					<div class="form-group">
						<input name="username" type="text" class="form-control input-lg"
							placeholder="Benutzername">
					</div>
					<div class="form-group">
						<input name="password" type="password"
							class="form-control input-lg" placeholder="Passwort">
					</div>
					<div class="form-group">
						<button class="btn btn-primary btn-lg btn-block" type="submit">Sign
							In</button>
					</div>
				</s:form>
				<%
					} else {
				%>
				<div class="form-group">
					<h2 class="text-center">Du bist bereits eingeloggt</h2>

				</div>
				<%
					}
				%>
			</div>
			<div class="modal-footer"></div>
		</div>
	</div>
	<!-- script references -->
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>

</body>
</html>
