<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<%
	response.setHeader("pragma", "no-cache");
	response.setHeader("Cache-control", "no-cache, no-store");
	response.setHeader("Expires", "0");
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Default tiles template</title>


<script src="<c:url value="/resources/theme/js/jquery-1.11.3.min.js" />"></script>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="<c:url value="/resources/theme/js/menu.js" />"></script>

<style type="text/css">
body {
	margin: 0px;
	padding: 0px;
	height: 100%;
	overflow: hidden;
}

.page {
	min-height: 100%;
	position: relative;
}

.header {
	padding: 10px;
	width: 100%;
	text-align: center;
	border-style: none;
	border-bottom: 1px solid silver;
}

.content {
	padding: 10px;
	padding-bottom: 20px; /* Height of the footer element */
	overflow: hidden;
	min-height: 400px
}

.menu {
	padding: 50px 10px 0px 10px;
	width: 200px;
	float: left;
	border: 1px solid maroon;
}

.body {
	margin: 0px 0px 0px 250px;
	border-left: 1px solid silver;
	min-height: 400px
}

.footer {
	clear: both;
	position: absolute;
	bottom: 0;
	left: 0;
	text-align: center;
	width: 100%;
	height: 20px;
	border-top: 1px solid silver;
}
</style>
</head>
<body>
	<div class="page">
		<tiles:insertAttribute name="header" />
		<div class="content" style="border-color: red;">
			<tiles:insertAttribute name="menu" />
			<div>
				
				<tiles:insertAttribute name="body" />
			</div>
		</div>
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>
