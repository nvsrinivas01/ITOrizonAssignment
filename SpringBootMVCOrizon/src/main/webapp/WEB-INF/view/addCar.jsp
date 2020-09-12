<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Tag for Spring Form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<!-- Bootstrap CDN -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous" />

<!-- External CSS Link -->

<link rel="stylesheet" href="/css/formstyle.css" />

<title>AddCar</title>
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="display-4 mt-5 ml-5 mb-4"><u>Fill Car Detalis</u></h1>

				<div class="form-group">
					<table>
					<form:form action="addCarSuccess" modelAttribute="car">
						
						<form:hidden path="id"/>
					
							<tr>
								<td><form:label path="company">Company</form:label></td>
								<td><form:input path="company" class="form-control" /></td>
							</tr>

							<tr>
								<td><form:label path="model">Model</form:label></td>
								<td><form:input path="model" class="form-control" /></td>
							</tr>

							<tr>
								<td><form:label path="color">Color</form:label></td>
								<td><form:input path="color" class="form-control" /></td>
							</tr>

							<tr>
								<td><form:label path="date_of_purchase">Date Of Purchase</form:label></td>
								<td><form:input path="date_of_purchase" class="form-control" placeholder="Example: DD/MM/YYYY"/></td>
							</tr>

							<tr>
								<td><form:label path="price">Price</form:label></td>
								<td><form:input path="price" class="form-control" /></td>
							</tr>

							<tr>
								<td><form:label path="engine_capacity">Engine Capacity</form:label></td>
								<td><form:input path="engine_capacity" class="form-control" /></td>
							</tr>

							<tr>
								<td><form:label path="licence_plate_number">Licence Plate Number</form:label></td>
								<td><form:input path="licence_plate_number" class="form-control" /></td>
							</tr>

							<tr>
								<td><form:label path="seating_capacity">Seating Capacity</form:label></td>
								<td><form:input path="seating_capacity" class="form-control" /></td>
								</tr>

							<tr>
								<td><form:button type="submit" class="btn btn-primary">Submit</form:button></td>
								<td><form:button class="btn btn-primary" onclick="window.location.href='feature';return false;">Back</form:button></td>
							</tr>
						
					</form:form>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>




</html>