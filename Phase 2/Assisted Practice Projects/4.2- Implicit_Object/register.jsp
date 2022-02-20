<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action = "" method = "post">
         Enter Name: <input type="text" name="fname">
         Enter Age: <input type="text" name="age">
         Enter Email: <input type="text" name="email">
         Enter Password: <input type="password" name="password">
         <input type = "submit" name = "register" value = "Register Me.."/>
    </form>
    
    
    <% if(request.getParameter("register")!= null){ %>
        <jsp:useBean id = "user" class="com.to.User" scope = "request"></jsp:useBean>
        <jsp:setProperty property = "*" name = "user"/>
        <jsp:forward page = "RegisterServlet"></jsp:forward>
    <%} %>

</body>
</html>