<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style>
        input,
        select {
            color: purple;
            width: 200px;
            height: 50px;
            margin: 2px;
            -moz-box-sizing: border-box;
            -webkit-box-sizing: border-box;
            box-sizing: border-box;
        }
          
        body {
            background-image: url('https://styledme.com/wp-content/uploads/2020/09/school-classroom-room-chalkboard-zoom-virtual-backgrounds-free-download-background.jpg');
        }
    </style>
</head>

<body>
<div align = "center">
    <h3  style="font-size:40px " > School Management System</h3>
    <input type="submit" name = "last" value="Log Out">
    
    <% if(request.getParameter("last")!= null){%>
         <jsp:forward page = "Servlet_6"></jsp:forward> <%} %>
</div>
   <br>
   <br>
   <form action = "" method = "post">
         <input type="submit" name = "adm" style='font-size: 15pt'  value="Admission Form"><br>
         <br>
         <input type="submit"  name = "mission" style='font-size: 15pt'  value="Mission & Vision"><br>
         <br>
         <input type="submit"  name = "data" style='font-size: 15pt' value="Teacher Data"><br>
         <br>
         <input type="submit"  name = "stud" style='font-size: 15pt' value="Student Data"><br>
         <br>
         <input type = "submit"  name = "class" style='font-size: 15pt'  value = "Classes"/><br>
         <br>
         <input type = "submit"  name = "sub" style='font-size: 15pt' value = "Subjects"/>
    </form>
    
    <% if(request.getParameter("adm")!= null){%>
        <jsp:forward page = "RegisterServlet"></jsp:forward> <%} %>
    
     <% if(request.getParameter("mission")!= null){%>
        <jsp:forward page = "Servlet1"></jsp:forward> <%} %>
    
     <% if(request.getParameter("data")!= null){%>
        <jsp:forward page = "Servlet2"></jsp:forward> <%} %>
    
     <% if(request.getParameter("stud")!= null){%>
         <jsp:forward page = "Servlet3"></jsp:forward> <%} %>
    
     <% if(request.getParameter("class")!= null){%>
         <jsp:forward page = "Servlet4"></jsp:forward> <%} %>
    
     <% if(request.getParameter("sub")!= null){%>
         <jsp:forward page = "Servlet5"></jsp:forward> <%} %>
         
      
    
    
       

</body>
</html>