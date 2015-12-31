<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Home</title>
<style type="text/css">
.centerTabel {
	margin: 0px auto;
}
.error {
		color: #ff0000;
	}

</style>
</head>

<body>


		<h1 align="center">Marhaba Wedding Organizing</h1>
		<h1 align="center">QScheduler</h1>

	
	<form:form action="login" method="POST"
		commandName="userCredential">

		<table class="centerTabel">
			<tr>
				<td>Username</td>
				<td><input type="text" name="userId" id="userId" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password"  name="password" id="userId" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit"
					value=" LogIn" /></td>
			</tr>
		</table>



		<div style="position: relative">
			<p
				style="position: fixed; bottom: 0; width: 100%; text-align: center">
				The time on the server is ${serverTime}.</p>

		</div>

	</form:form>
</body>
</html>
