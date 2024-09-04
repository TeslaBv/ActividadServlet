<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/login.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/styles.css">
</head>
<body>
	<jsp:include page="componentes/header.jsp"></jsp:include>


	<div class="container">
	    <div class="login-container">
	        <h1>Registrate</h1>
	        <form action="<%=request.getContextPath()%>/RegisterControlador" method="post">
	        	<label>Ingresa tu nombre: </label>
	            <input type="text" name="name" placeholder="Usuario" required>
	        	<label>Ingresa tu nombre de Usuario:</label>
	            <input type="text" name="username" placeholder="Usuario" required>
	            <label>Ingresa tu correo electronico:</label>
	            <input type="text" name="username" placeholder="example@example.com" required>
	            <label>Ingresa tu nombre de Contraseña: </label>
	            <input type="password" name="password" placeholder="Contraseña" required>
	            <button type="submit">Registrarte</button>
	            <c:if test="${not empty errorMessage}">
	                <p class="error">${errorMessage}</p>
	            </c:if>
	        </form>
	    </div>
    </div>
    <jsp:include page="componentes/footer.jsp"></jsp:include>
</body>
</html>