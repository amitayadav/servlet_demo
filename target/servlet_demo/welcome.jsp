<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<body>
<%
if(session.getAttribute("username")==null){
    response.sendRedirect("signin.jsp");
}
%>
   <left>Welcome </left>
   <right><a href="videos.jsp">Videos </a> <a href="aboutus.jsp">AboutUs </a> <form action="Logout">
   <input type="submit" value="Logout">
   </form></right>
   <br>
   <form action="upload" method="post" enctype="multipart/form-data">
        <input type="file" name="file" multiple/>
        <input type="submit">
   </form>
</body>
</html>