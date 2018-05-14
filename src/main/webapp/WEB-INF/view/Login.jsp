<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
		body {
    background: url(img/header.jpg) no-repeat center center fixed;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    background-size: cover;

}

.login {
  margin: 20px auto;
  width: 300px;
  padding: 30px 25px;

}

.login-input {
  width: 285px;
  height: 50px;
  margin-bottom: 25px;
  padding-left:10px;
  font-size: 15px;
  background: #fff;
  border: 1px solid #ccc;
  border-radius: 4px;
}
.login-input:focus {
    border-color:#6e8095;
    outline: none;
  }
.login-button {
  width: 100%;
  height: 50px;
  padding: 0;
  font-size: 20px;
  color: #fff;
  text-align: center;
  background: #f0776c;
  border: 0;
  border-radius: 5px;
  cursor: pointer; 
  outline:0;
}

.login-lost
{
  text-align:center;
  margin-bottom:0px;
}

.login-lost a
{
  color:white;
  text-decoration:none;
  font-size:13px;
}

	</style>

</head>

<body>
<form class="login" action="formulario.html" >
    <img src="img/imagen3.jpg" width="300" height="200">
     <h3 style="color: white">Usuario</h3>
    <input type="text" class="login-input" placeholder="angie@gmail.com" autofocus>
    <h3 style="color: white">Contrase�a</h3>
    <input type="password" class="login-input" placeholder="********">
    <input type="submit" value="Iniciar Sesi�n" class="login-button">
  <p class="login-lost"><a href="">Olvidaste tu contrase�a?</a></p>
  </form>
</body>
</html>