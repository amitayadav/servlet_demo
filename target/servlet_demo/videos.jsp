<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<!DOCTYPE html>
<html lang="en">
<body>
<%
if(session.getAttribute("username")==null){
    response.sendRedirect("signin.jsp");
}
%>
Browse videos
 <a href="aboutus.jsp">AboutUs </a>
   <form action="Logout">
   <input type="submit" value="Logout">
   </form>
</body>
</html>