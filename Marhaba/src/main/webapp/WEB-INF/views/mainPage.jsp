
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">

		<div class="body">
			<h1>Home page !</h1>
			<p align="right">Welcome! ${loggedInUser.firstName}</p>

			
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
