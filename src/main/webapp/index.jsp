<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Verificador Geometrico </title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">  
</head>
<body>
<div class= "container" style="
    background-color:#704d87;
    outline: 3px dotted #050251;
    ">
    <h1 style=" color:white;" >  Verificador Geometrico</h1>
     <h3 style=" color:white;">Olá, para que a verificação de um "tipo" de triângulo favor digite  um valor em cada um dos campos abaixo </h3>
     <h3 style=" color:white;">Caso sejam preenchidos apenas 2 campos, a aplicação vai verificar a area de um <strong>Quadrado/Retangulo</strong></h3>
     
  <form  name ="Verificador" action="ServletVerificador" method="post">
  <label style=" color:white; " for="valor1">1º Valor:</label><br>
  <input type="number"  name="valor1"><br>
  <label  style=" color:white; " for="valor2">2º Valor:</label><br>
  <input type="number"  name="valor2"><br>
  <label style=" color:white; " for="valor3">3º Valor:</label><br>
  <input type="number" name="valor3"><br>
  <div style="margin-top: 29px;">
   <button type="reset" class="btn btn-secondary">Apagar</button>
  <button type="submit" class="btn btn-danger">Calcular</button>
  </div>
  
</form>
   
</div>
</body>
</html>