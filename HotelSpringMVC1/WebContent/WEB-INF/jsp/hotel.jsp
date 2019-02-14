<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${hotelList ne null}">
			<table>
				<tr>
					<th>#</th>
					<th>Hotel Id</th>
					<th>Hotel Name</th>
					<th>Hotel Rating</th>
					<th>Rate</th>
					<th>Available Rooms</th>
					
				</tr>
				<c:forEach items="${hotelList}" var="hotel">
					<tr>
						<th></th>
						<th>${hotel.hotelId}</th>
						<!--  <th>${movie.movieName}</th> -->
						   <th><a href="hello.html?hname= ${hotel.hotelName}" >${hotel.hotelName}</a></th>	
						<!-- <th><a href="<c:url value="hello/${movie.movieName}" />" >${movie.movieName}</a></th>  -->
						<th>${hotel.hotelRating}</th>
						<th>${hotel.rate}</th>
						<th>${hotel.availableRooms}</th>
						
					</tr>
				</c:forEach>
			</table>
		</c:if>

</body>
</html>