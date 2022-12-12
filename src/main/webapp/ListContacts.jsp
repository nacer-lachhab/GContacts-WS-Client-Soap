<%@page import="java.util.Iterator"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="proxy.Contact"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%	List<Contact> listContacts = 
				(List<Contact>) request.getAttribute("listContacts");%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
		<title>Contacts Management: List of Contacts</title>
	</head>
	<body>
		<div class="container" style="margin-top:5%;
								  margin-left: auto; 
								  padding-right:20%;
								  padding-left: 20%">
			<div class="panel panel-primary">
					  <div class="panel-heading">
					  		<h1 class="text-center">liste des Contacts</h1>
					  </div>
					  <div class="panel-body">
					  	<div class="panel panel-default">
							<div class="panel-heading">
								<h1 class="panel-title">Heading</h1>
							</div>
							<table class="table">
								<thead>
									<tr>
										<th>Contact Id :</th>
										<th>Contact nom :</th>
										<th>Contact mail :</th>
									</tr>
								</thead>
								<tbody>
								<%
								Iterator<Contact> iterator= listContacts.iterator();
								while(iterator.hasNext()){
									Contact c = iterator.next();
								%>
									<tr>
										<td><%= c.getId() %></td>
										<td><%= c.getNom() %></td>
										<td><%= c.getMail() %></td>
									</tr>
								<% }%>
								</tbody>
							</table>
					  	</div>
					  <div class="panel-footer">
					  	<div class="text-center">
					  		Bienvenue Sur Votre Annuaire Personnel de Contacts...
					  	</div>
					  </div>
				</div>
			</div>
		</div>
	</body>
</html>