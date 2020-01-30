<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"   "http://www.w3.org/TR/html4/loose.dtd">
<html>
       
<head>
       
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
<title>JSP Page</title>   
</head>
   
<body>
	                   
	<form method="post" action="connection">
		           
		<fieldset>
			               
			<legend>Connection</legend>
			                               <label for="nom"> Nom <span
				class="requis">*</span></label>                <input type="text" id="nom"
				name="nom" />                <br />                               
			<label for="email"> mot de passe <span class="requis">*</span></label> 
			              <input type="text" id="password" name="password" />   
			            <br />                    
		</fieldset>
		                                <input type="submit"
			value="Connection" class="sansLabel" />       
	</form>
	   
</body>
</html>