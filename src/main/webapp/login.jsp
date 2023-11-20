<%--
  Created by IntelliJ IDEA.
  User: jeissonchacon
  Date: 20/11/23
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Bank App</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
    <div>
        <label>User</label> <input type="text" value="<c:out value='${user.user}' />" class="form-control" name="user">
        <label>Password</label> <input type="text" value="<c:out value='${user.password}' />" class="form-control" name="password">
        <button type="submit" class="btn btn-success">Login</button>
    </div>
</body>
</html>
