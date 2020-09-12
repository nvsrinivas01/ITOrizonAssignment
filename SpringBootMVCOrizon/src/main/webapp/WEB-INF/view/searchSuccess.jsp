<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous" />
<link rel="stylesheet" href="/css/stylesheet.css" />

<title>Search List</title>
</head>
<body style="background-color: lavender">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div>
					<h1 class="display-4 text-center mt-5">Searched Cars List</h1>
					<p class="text-center">**Table contains List of Cars and also
						its specifications</p>


					<table
						class="table table-hover text-center text-justify border rounded table-responsive mt-5">
						<thead>
							<tr class="text-justify text-lg-center">

								<th>Company</th>
								<th>Model</th>
								<th>Color</th>
								<th>Date of purchase</th>
								<th>Price</th>
								<th>Engine Capacity</th>
								<th>Licence Plate Number</th>
								<th>Seating Capacity</th>
								<th>Update Car</th>
								<th>Delete Car</th>
							</tr>
						</thead>
						<tbody>

							<c:forEach var="car" items="${car}">
							
							<c:url var="updateLink" value="updateForm">
							
							<c:param name="updateId" value="${car.id}"></c:param>
							
							</c:url>
							
							<c:url var="deleteLink" value="deleteForm">
							<c:param name="deleteId" value="${car.id}"></c:param>
							</c:url>
							


								<tr>
									<td>${car.company}</td>
									<td>${car.model}</td>
									<td>${car.color}</td>
									<td>${car.date_of_purchase}</td>
									<td>${car.price}</td>
									<td>${car.engine_capacity}</td>
									<td>${car.licence_plate_number}</td>
									<td>${car.seating_capacity}</td>
									<td>
										 <a href="${updateLink }"> <button class="btn btn-primary">Update</button></a>
									</td>
									 <td><a href="${deleteLink }"> <button class="btn btn-danger">Delete</button></a></td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
					<small class="text-left">**Click on Update/Delete button to Update/Delete specific Car</small><br /> <br>
						
						<a href="/feature"><input type="button" value="Back" class="btn btn-primary"/></a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>