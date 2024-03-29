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
				<a href="${contextPath}/customer/viewall">View All</a>	
			</div>

			<form:form action="edit" method="POST" modelAttribute="customer">

				<form:input type="hidden" path="id" id="id" />
				<table style="vertical-align: center;">
					<tr>
						<td>Customer Name</td>

						<td><form:input size="45" path="name" id="name" /></td>
					</tr>
					<tr>
						<td>Area/Locality</td>
						<td><form:input path="area" id="area" /></td>
					</tr>
					<tr>
						<td>Region</td>
						<td><form:select path="region">
								<form:options items="${regionList}" />
							</form:select>
					</tr>
					<tr>
						<td>Po Box No</td>
						<td><form:input size="30" path="poBox" id="po_box" /></td>
					</tr>
					<tr>
						<td>Contact No</td>
						<td><form:input path="phoneNumber" id="phone_number" /></td>
					</tr>
					<tr>
						<td colspan="2" align="right"><c:choose>
								<c:when test="${edit}">
									<input type="submit" value="Update1" />
								</c:when>
								<c:otherwise>
									<input type="submit" value="Save" />
								</c:otherwise>
							</c:choose></td>
					</tr>
				</table>
			<input type="hidden" value="${edit}" id="edit"/>
			</form:form>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>



