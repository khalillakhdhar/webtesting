<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Connexion</title>
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col">
      
    </div>
    <div class="col">
      <form action="AuthServlet" method="post" class="row g-3">
  <div class="col-auto">
    <label for="login" class="visually-hidden">login</label>
    <input type="text" required name="login"  class="form-control" id="login" placeholder="votre email ici">
  </div>
  <div class="col-auto">
    <label for="inputPassword2" class="visually-hidden">Password</label>
    <input type="password" required name="mdp" class="form-control" id="inputPassword2" placeholder="Password">
  </div>
  <div class="col-auto">
    <button type="submit" class="btn btn-primary mb-3">Se connecter</button>
    <br>
    <% 
    if(request.getAttribute("erreur")!=null)
    {
    String erreur=request.getAttribute("erreur").toString();
    %>
    <h3> <%=erreur %></h3>
    <% } %>
  </div>
</form>
    </div>
    <div class="col">
    </div>
  </div>
</div>

</body>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</html>