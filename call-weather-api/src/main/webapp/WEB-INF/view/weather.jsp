<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<form action="weather/search" method="post">
		
		City : <input type="text" name="city">
		<input type="submit" value="go">	
		
		<br><br>
		
			<hr>
		
			<p>Weather Info for ${city}</p> 	
		
			<p style="color:green"> Temperature : </p>
			
			${weatherInfo.getWeatherInfoMain().getTemp() }	
		
	</form>

</body>
</html>