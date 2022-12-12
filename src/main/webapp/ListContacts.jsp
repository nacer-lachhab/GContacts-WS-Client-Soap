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
					  		<h1 class="text-center">Gestionnaire des Contacts</h1>
					  </div>
					  <div class="panel-body">
					  	<div class="panel panel-default">
							<div class="panel-heading">
								<h1 class="panel-title">Listes des Contacts:</h1>
							</div>
							<table class="table">
								<thead>
									<tr>
										<th>Contact Id :</th>
										<th>Contact nom :</th>
										<th>Contact mail :</th>
										<th>Delete / Edit</th>
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
										<td>
											<form action="wsContactsManager.do" method="post">
												<span>
													<button class="btn btn-danger"
															type="submit" 
															name="doAction" 
															value="doDelete">
														<svg xmlns="http://www.w3.org/2000/svg" 
															 width="16" 
															 height="16" 
															 fill="currentColor" 
															 class="bi bi-trash3" 
															 viewBox="0 0 16 16">
													  		<path d="M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z"/>
														</svg>
														<input type="hidden"
														 	   name="contactId" 
														 	   value=<%= c.getId() %> 
														 	   />
														<input type="hidden"
														 	   name="contactNom" 
														 	   value=<%= c.getNom() %> 
														 	   />
														<input type="hidden"
														 	   name="contactMail" 
														 	   value=<%= c.getMail() %> 
														 	   />
													</button>
													<button class="btn btn-warning"
															type="submit" 
															name="doAction"
															value="doEdit">
														<svg xmlns="http://www.w3.org/2000/svg"
														 	 width="16" 
														 	 height="16" 
														 	 fill="currentColor" 
														 	 class="bi bi-pencil-square" 
														 	 viewBox="0 0 16 16">
														  <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
														  <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
														</svg>
														<input type="hidden"
														 	   name="contactId" 
														 	   value=<%= c.getId() %> 
														 	   />
														<input type="hidden"
														 	   name="contactNom" 
														 	   value=<%= c.getNom() %> 
														 	   />
														<input type="hidden"
														 	   name="contactMail" 
														 	   value=<%= c.getMail() %> 
														 	   />
													</button>
												</span>
											</form>
										</td>
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