<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="styling/sign_up.css">
</head>
<body>
<form action="/signUp" method="post" style="border:1px solid #ccc">
    <div class="container">
        <h1>Sign Up</h1>
        <p>Please fill in this form to create an account.</p>
        <hr>
        <label for="email"><b>Email</b></label>
        <input name="email" placeholder="Enter Email" required type="text">

        <label for="psw"><b>Password</b></label>
        <input name="psw" placeholder="Enter Password" required type="password">

        <label for="psw-repeat"><b>Repeat Password</b></label>
        <input name="psw-repeat" placeholder="Repeat Password" required type="password">

        <label>
            <input checked="checked" name="remember" style="margin-bottom:15px" type="checkbox"> Remember me
        </label>

        <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

        <div class="clearfix">
            <button class="cancelbtn" onclick="document.getElementById('id01').style.display='none'" type="button">
                Cancel
            </button><button class="signupbtn" type="submit">Sign Up</button>
        </div>
    </div>
</form>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>
</body>
</html>