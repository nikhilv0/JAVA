<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Forgot Password</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light d-flex align-items-center justify-content-center" style="height:100vh;">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">

        <a class="navbar-brand d-flex align-items-center" href="index.jsp">
            <img src="${pageContext.request.contextPath}/images/xworkz-logo.jpeg"
                 alt="Logo"
                 style="height:60px; width:auto; margin-right:10px;">
            <span style="font-size:22px; font-weight:bold;">MyWebsite</span>
        </a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>


        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="SignUp.jsp">SignUp</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="SignIn.jsp">SignIn</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="card shadow-lg p-4" style="width: 350px; border-radius: 15px;">
    <h3 class="text-center mb-3">Forgot Password</h3>
    <p class="text-muted text-center">Enter your email and we’ll send you a reset link.</p>

    <div class="mt-2">
        <p class="text-success"><%= request.getAttribute("msg") != null ? request.getAttribute("msg") : "" %></p>
        <p class="text-danger"><%= request.getAttribute("err") != null ? request.getAttribute("err") : "" %></p>
    </div>


    <form action="forgotPassword" method="post" onsubmit="return validateForget()">
        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input type="email" id="email" name="email" class="form-control" placeholder="Enter your email" required>
        </div>

        <div class="d-grid">
            <button type="submit" class="btn btn-primary">Send Reset Link</button>
        </div>
    </form>

    <div class="text-center mt-3">
        <a href="SignIn.jsp" class="text-decoration-none">Back to Sign In</a>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<script>
    function validateForget(){
        let email = document.getElementById("email").value;
        let gmailPattern = /^[a-zA-Z0-9._%+-]+@gmail\.com$/;

        if(!gmailPattern.test(email)){
            alert(`Invalid email: ${email}. Please enter a valid Gmail address.`);
            return false;
        }
        return true;
    }
</script>
</body>
</html>
