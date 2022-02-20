<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Hello from HTML</h1>
    <%= "<h1>Hello from JSP</h1>"%>
    
    <%
    for(int i = 0;i<5;i++){
    	out.print("i = " + i + "<br/>");
    }
    %>
    
    <form action = " ">
     Enter Name: <input type="text" name = "fname">
     <input type = "submit"  value="Click Me!">
    </form>
    
    <%
     if(request.getParameter("fname") != null){
    	 out.print("Hello" + request.getParameter("fname"));
     }
    %>
    
    
    <%@include file = "footer.html"%>

</body>
</html>