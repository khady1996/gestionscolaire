<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Profil</title>
</head>
<body>
	<h1>Vous êtes sur votre page de profil</h1>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Gestion Etudiants</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#"
					id="navbarDropdownMenuLink" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> Menu étudiant </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
						<a class="dropdown-item" href="#">Lister l'ensemble des étudiants de l'école</a> 
						<a class="dropdown-item" href="lireEtudiant.jsp">Lire les informations d'un étudiant</a> 
						<a class="dropdown-item" href="supprimerEtudiant.jsp">Supprimer un étudiant</a> 
						<a class="dropdown-item" href="modifierEtudiant.jsp">Modifier une des informations sur l'étudiant</a> 
						<a class="dropdown-item" href="creerEtudiant.jsp">Créer un étudiant</a> 
						<a class="dropdown-item" href="suivreCours.jsp">Associer un cours à un étudiant</a>
					</div></li>
				<li class="nav-item active" style="padding-right: 10px"><a
					class="nav-link" href="login.jsp">Déconnexion <span
						class="sr-only">(current)</span></a></li>
			</ul>
		</div>
	</nav>
	
	<table class="table table-striped table-dark">
		<thead>
			<tr>
				<!-- <th scope="col">#</th> -->
				<th scope="col">Nom</th>
				<th scope="col">Prenom</th>
				<th scope="col">Email</th>
				<th scope="col">Téléphone</th>
				<th scope="col">Date de naissance</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${etudiantList}" var="etudiant">
				<tr>
					
					<td>${etudiant.nom}</td>
					<td>${etudiant.prenom}</td>
					<td>${etudiant.email}</td>
					<td>${etudiant.telephone}</td>
					<td>${etudiant.date_naissance}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
