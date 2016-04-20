<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<head>
<script type="text/javascript">
	$(document).ready(function() {
		// alert("Hi");

		$("#name1").focus(function() {
			//alert("HI");
			if (this.value == "type the name of employee to search") {
				this.value = "";
				$(this).css('color', '#000000');
			}
		});

		$("#name1").blur(function() {

			if (this.value == "") {
				this.value = "type the name of employee to search";
				$(this).css('color', '#a9a9a9');
			}
		});
	});
</script>
</head>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<c:set var="contextPath" value="${pageContext.request.contextPath}" />
		<div class="body">
			<div>
				<a href="${contextPath}/customer/new"> New</a>
			</div>

			<table border="1">
				<tr>
					<td>Sl</td>
					<td>Customer Name</td>
					<td>Area/Locality</td>
					<td>Region</td>
					<td>PO Box</td>
					<td>Phone No</td>
					<td>Edit</td>
					<td>Delete</td>
				</tr>
				<c:forEach var="customerList" items="${customerList}">
					<tr>
						<td>1</td>
						<td><c:out value="${customerList.name}" /></td>
						<td><c:out value="${customerList.area}" /></td>
						<td><c:out value="${customerList.region}" /></td>
						<td><c:out value="${customerList.poBox}" /></td>
						<td><c:out value="${customerList.phoneNumber}" /></td>
						<td><a href="${contextPath}/customer/sigle?customerId=${customerList.id}">[..]</a></td>
						<td><a href="#${customerList.id}">[..]</a></td>
					</tr>
				</c:forEach>
			</table>

			
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>



