<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>gestion des enfants</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

</head>
<body>
<div class="container">
  <div class="row">
    <div class="col">
      
    </div>
    <div class="col">
      <form action="" method="post" class="row g-3">
  <div class="col-auto">
    <label for="nom" class="visually-hidden">Nom</label>
    <input type="text" name="nom"  class="form-control" id="nom" placeholder="votre nom ici">
  </div>
  <div class="col-auto">
    <label for="classe" class="visually-hidden">classe</label>
    <input type="text" name="classe" class="form-control" id="classe" placeholder="classe">
  </div>
  <div class="col-auto">
    <label for="classe" class="visually-hidden">Note précedente</label>
    <input type="number" name="note" class="form-control" id="note" placeholder="note précédente">
  </div>
  <div class="col-auto">
    <button type="submit" class="btn btn-primary mb-3">Ajouter</button>
  </div>
</form>
    </div>
    <div class="col">
    </div>
  </div>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

</html>