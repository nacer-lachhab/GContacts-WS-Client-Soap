<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<title>Contacts Management</title>
</head>
<body>
	<div class="container" style="margin-top:5%;
								  margin-left: auto; 
								  padding-right:20%;
								  padding-left: 20%">
		<div class="panel panel-primary">
				  <div class="panel-heading">
				  		<h1 class="text-center">Acceuil, Gestion des Contacts</h1>
				  </div>
				  <div class="panel-body">
				  		<form action="wsContactsManager.do" method="get">
				  			<h3>
				  			<button name="call"
				  					type="submit" 
				  					class="btn btn-primary" 
				  					value="getAll">
				  			Faire
				  			</button>
				  			Consulter les contacts dans votre liste.
				  			</h3>
				  			<h3>
				  			<button class="btn btn-info" 
				  					name="call"
				  					type="submit"
				  					value="search">
				  			Faire
				  			</button>
				  			Chercher un contact dans votre liste.
				  			</h3>
				  			<h3>
				  			<button class="btn btn-success"
				  					name="call"
				  					type="submit"
				  					value="save">
				  			Faire
				  			</button>
				  			Ajouter un contact a votre liste.
				  			</h3>
				  			<h3>
				  			<button class="btn btn-warning"
				  					name="call"
				  					type="submit" 
				  					value="edit">
				  			Faire
				  			</button>
				  			Modifier un contact dans votre liste.
				  			</h3>
				  			<h3>
				  			<button class="btn btn-danger" 
				  					name="call"
				  					type="submit"
				  					value="delete">
				  			Faire
				  			</button>
				  			Supprimer un contact de votre liste.
				  			</h3>
				  		</form>	
				  </div>
				  <div class="panel-footer">
				  	<div class="text-center">
				  		Bienvenue Sur Votre Annuaire Personnel de Contacts...
				  	</div>
				  </div>
		</div>
	</div>
</body>
</html>