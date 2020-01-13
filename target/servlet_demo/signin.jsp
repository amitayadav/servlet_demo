<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="styling/sign_in.css" rel="stylesheet" type="text/css">
</head>
<body>
<form action="/login">
    <div class="imgcontainer">
        <img alt="Avatar" class="avatar" src="images/img_avatar2.jpeg">
    </div>

    <div class="container">
        <label for="uname"><b>Username</b></label>
        <input name="uname" placeholder="Enter Username" required type="text">

        <label for="psw"><b>Password</b></label>
        <input name="psw" placeholder="Enter Password" required type="password">

        <button type="submit">Login</button>
        <label>
            <input checked="checked" name="remember" type="checkbox"> Remember me
        </label>
    </div>
    <div class="container" style="background-color:#f1f1f1">
        <button class="cancelbtn" onclick="document.getElementById('id01').style.display='none'" type="button">Cancel
        </button>
        <span class="psw">Forgot <a href="#">password?</a></span>
    </div>
</form>
<script src="${pageContext.request.contextPath}/js/index.js" type="text/javascript"></script>
</body>
</html>