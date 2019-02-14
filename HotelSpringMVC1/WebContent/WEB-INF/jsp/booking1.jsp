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
	<div>


		<h1>Booking Directory</h1>



		<form:form modelAttribute="customer" action="save.html" method="post">
			<div>
				<label for="cname">Customer Name</label>
				<div>
					<form:input path="customerName" id="cname" required="true" placeholder="Customer Name" />
				</div>
			</div>
			<div>
				<label for="hid">Hotel Id</label>
				<div>
					<form:input path="hotelId" id="hid" required="true" placeholder="Hotel Id" />
				</div>
			</div>
				<div>
				<label for="fromDate">From Date</label>
				<div>
					<form:input path="fromDate" id="fromDate" required="true" placeholder="From Date" />
				</div>
			</div>
			<div>
				<label for="toDate">To Date</label>
				<div>
				<form:input path="toDate" id="toDate" required="true" placeholder="To Date" />
				</div>
			</div>
		
			<div>
				<label for="noOfRooms">No Of Rooms</label>
				<div>
					<form:input path="noOfRooms" id="noOfRooms" required="true" placeholder="No of Rooms" />
				</div>
			</div>
			<div>
				<div>
					<button type="submit">Add</button>
				</div>
			</div>
		</form:form>
		<c:if test="${customerList ne null}">
			<div>
				
				${param.message}
			</div>
		</c:if>
		<h3>Current List of customers:</h3>
		<c:if test="${customerList ne null}">
			<table>
				<tr>
					<th>#</th>
					
					<th>Customer Name</th>
					<th>Hotel Id</th>
					<th>From Date</th>
					<th>To Date</th>
					
					<th>No of Rooms</th>
					
				</tr>
				<c:forEach items="${customerList}" var="customer">
					<tr>
			
						
						<th>${customer.id}</th>
						<th>${customer.customerName}</th>
						<th>${customer.hotelId}</th>
						<th>${customer.fromDate}</th>
						<th>${customer.toDate}</th>
						
						<th>${customer.noOfRooms}</th>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		</div>
		
</body>
</html>