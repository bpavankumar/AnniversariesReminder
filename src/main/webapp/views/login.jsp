<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="justify-content-center card">
                    <h2>Key-in the required details</h2>
                    <div class="card-body">
                        <form action="/home"  method="get">
							<table style="width: 50%">
								<tr>
									<td><label for="user_id">User ID:</label></td>
									<td><input type="text" name="user_id" class="form-control"/></td>
								</tr>
								<tr><td><br/></td></tr>
								<tr>
									<td><label for="password">Password:</label></td>
									<td><input type="password" name="password" class="form-control"/></td>
								</tr>
								<tr><td><br/></td></tr>
								<tr>
									<td><label for="role">Role:</label></td>
									<td>
										<select name="role" id="role">
											<option value="ADMIN">ADMIN</option>
											<option value="USER">USER</option>
										</select>
									</td>
								</tr>
								<tr><td><br/></td></tr>
								<tr>
									<td></td>
									<td><button type="submit" class="btn btn-primary">Submit</button></td>
								</tr>
							</table>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>