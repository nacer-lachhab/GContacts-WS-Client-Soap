<%@page import="java.util.Iterator"%>
<%@page import="proxy.Contact"%>
<%@page import="java.util.List"%>
<%	List<Contact> listContacts = 
				(List<Contact>) request.getAttribute("listContacts");
	String nomContact =
				(String) request.getAttribute("nomContact");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
		<title>Contact with Name:</title>
	</head>
	<body>
		<div class="container" style="margin-top:5%;
								  margin-left: auto; 
								  padding-right:20%;
								  padding-left: 20%">
			<div class="panel panel-primary">
					  <div class="panel-heading">
					  		<h1 class="text-center">Rechercher Contact Par Nom:</h1>
					  </div>
					  <div class="panel-body">
					  		<%if(nomContact.equals("")){ %>
					  		<form action="wsContactsManager.do" method="post">
					  			<div class="text-center">
						  			<label  for="NomContact"
				  						class="control-label">
				  						Nom de Contact:
					  				</label>
					  			</div>
					  			<div class="text-center">
					  				<input style="text-align: center" 
					  					   id="NomContact"
					  					   type="text"
										   name="nomContact"
										   value=<%= nomContact %>>
								</div>
								<div class="text-center">
									<button style="margin-top: 2%"
											class="btn btn-info" 
						  					name="call"
						  					type="submit"
						  					value="search">
					  				lancer
					  				</button>
								</div>
					  		</form>
					  		<%} else if(!listContacts.isEmpty()){%>
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
					  		<% } %>	
					  </div>
			</div>
		</div>
	</body>
</html>