<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Birthdays</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container"> 
            <div class="row"> 
                <h1>All Birthdays</h1>
            </div> 
            <table class="table table-striped table-bordered" >
                <thead class="table-dark">
					<tr>
						<th>Birthday ID</th>
						<th>Name</th>
						<th>Birthdate</th>
						<th>Relation</th>
					</tr>
                </thead>
                <tbody>
                    <c:forEach var="birthday" items="${birthdays}">
						<tr>
							<td>${birthday.birthdayId}</td>                    
							<td>${birthday.birthdayBaby}</td>
							<td>${birthday.birthDate}</td>
							<td>${birthday.relation}</td>
							<td>
								<a href="<c:url value='/home/birthdays/update/${birthday.birthdayId}'/>" class="btn btn-primary">Update</a>  
								<a href="<c:url value='/home/birthdays/delete/${birthday.birthdayId}' />" style="background-color: red" class="btn btn-primary">Delete</a>  
							</td>
						</tr>
					</c:forEach>
				</tbody> 
			</table>
        </div>
    </body>
</html>