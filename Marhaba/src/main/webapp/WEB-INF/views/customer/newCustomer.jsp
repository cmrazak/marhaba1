<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<head>
<script type="text/javascript">
$(document).ready(function() {
	// alert("Hi");
	
	$("#name1").focus(function(){
		//alert("HI");
		if (this.value == "type the name of employee to search")
		{
		    this.value = "";
		    $(this).css('color','#000000');
		 }
		});

		$("#name1").blur(function(){

		        if (this.value == "")
		        {
		            this.value = "type the name of employee to search";
		            $(this).css('color','#a9a9a9');
		        }
		    });
});
</script>
</head>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">

		<div class="body">
			<form:form action="save" method="POST" modelAttribute="customer">

				<form:input type="hidden" path="id" id="id" />
				<table style="vertical-align: center;">
					<tr>
						<td>Customer Name</td>
						
						<td><form:input size="45"  path="name" id="name1" 
						value="${not empty customer.name? customer.name : 'type the name of employee to search'}"    
						/></td>
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



