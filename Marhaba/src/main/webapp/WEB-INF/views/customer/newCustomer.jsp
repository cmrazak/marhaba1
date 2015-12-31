<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">

		<div class="body">
			<form:form method="POST" modelAttribute="customer">

				<form:input type="hidden" path="id" id="id" />
				<table style="vertical-align: center;">
					<tr>
						<td>Customer Name</td>
						<td><form:input path="name" id="name" /></td>
					</tr>
					<tr>
						<td>Street/Locality</td>
						<td><form:input path="name" id="name" /></td>
					</tr>
					<tr>
						<td>Address</td>
						<td><form:input size="30" path="name" id="name" /></td>
					</tr>
					<tr>
						<td>Contact No</td>
						<td><form:input path="name" id="name" /></td>
					</tr>
					<tr>
						<td colspan="2" align="right"><c:choose>
								<c:when test="${edit}">
									<input type="submit" value="Update" />
								</c:when>
								<c:otherwise>
									<input type="submit" value="Register" />
								</c:otherwise>
							</c:choose></td>
					</tr>
				</table>

			</form:form>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
