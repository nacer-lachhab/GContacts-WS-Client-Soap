<%@page import="proxy.Contact"%>
<%	Contact tempContact = 
				(Contact) request.getAttribute("tempContact");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
		<title>Add Contact To List:</title>
	</head>
	<body>
		<div class="container" style="margin-top:5%;
								  margin-left: auto; 
								  padding-right:20%;
								  padding-left: 20%">
			<div class="panel panel-primary">
				<%if(tempContact.getId()==0){ %>
				  <div class="panel-heading">
				  		<h1 class="text-center">Sauvegarder un Contact :</h1>
				  </div>
				  <%}else{ %>
					<div class="panel-heading">
				  		<h1 class="text-center">Modifier un Contact :</h1>
					</div>
					
				<% };//fin else %>
				  <div class="panel-body">
				  	<form action="wsContactsManager.do" method="post">
				  		<div class="text-center">
				  			<label  for="NomContact"
		  						class="control-label">
		  						Nom de Contact:
			  				</label>
				  		</div>
				  		<div>
					  		<input type="hidden"
							 	   name="contactId" 
							 	   value=<%= tempContact.getId() %> 
							 	   />
				  		</div>
			  			<div class="text-center">
			  				<input style="text-align: center" 
			  					   id="NomContact"
			  					   type="text"
								   name="nomContact" >
						</div>
				  		<div class="text-center">
				  			<label  for="MailConctact"
		  						class="control-label">
		  						Mail du Contact:
			  				</label>
			  			</div>
			  			<div class="text-center">
			  				<input style="text-align: center" 
			  					   id="MailConctact"
			  					   type="text"
								   name="mailContact">
						</div>
						<div class="text-center">
							<button style="margin-top: 2%"
									class="btn btn-info" 
				  					name="call"
				  					type="submit"
				  					value="save">
			  				sauvegarder
			  				</button>
						</div>
				  	</form>
				  </div>
				
			</div>
		</div>
	</body>
</html>