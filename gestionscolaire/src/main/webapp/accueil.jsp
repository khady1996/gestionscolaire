<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import= "eu.ensup.gestionscolaire.domaine.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste �tudiants</title>
</head>
<body>
	<% Gestionnaire g = (Gestionnaire) session.getAttribute("gestionnaire"); %>
	
           Voici la liste des �tudiants :
           <br><br><br>
    <c:forEach items="${etudiantList}" var="etudiant">
    <form method="post" action="listEtudiants">
    <td> Nom : ${etudiant.nom}</td><br>
      <td>Prenom :${etudiant.prenom}</td><br>
      <td>Email : ${etudiant.email}</td>    <br>
      <td>Adresse : ${etudiant.adresse}</td><br>
      <td> T�l�phone :${etudiant.telephone}</td><br>
      <input type="submit" value="Afficher" class="sansLabel" />
        <input type="submit" value="Modifier" class="sansLabel" />
        <input type="submit" value="Lier a un cours" class="sansLabel" />
       <input type="submit" value="Supprimer" class="sansLabel" />
       <br><br>
    </form>
    </c:forEach>
</body>
</html>