<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Sign In</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

    <style>
        body {
            height: 100vh;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            font-family: 'Outfit', sans-serif;
            background: url('${pageContext.request.contextPath}/images/SignIn.jpg') no-repeat center;
            background-size: 1600px 900px;
        }
        .navbar { position: absolute; top: 0; width: 100%; z-index: 10; }
        .glass-card {
            width: 400px; padding: 40px; border-radius: 20px;
            background: rgba(0, 0, 0, 0.05); backdrop-filter: blur(10px);
            -webkit-backdrop-filter: blur(10px);
            border: 1px solid rgba(255, 255, 255, 0.3);
            box-shadow: 0 8px 32px rgba(0, 0, 0, 0.2);
            text-align: center; color: white; margin-top: 60px;
        }
        .glass-card h1 { font-size: 2.5rem; font-weight: bold; margin-bottom: 10px; }
        .glass-card h5 { font-weight: 300; margin-bottom: 25px; }
        .input-group .form-control,
        .input-group-text {
            background: rgba(255, 255, 255, 0.8); border: none;
            border-radius: 10px;
        }
        .btn-gradient {
            background: linear-gradient(to right, #6a11cb, #2575fc);
            border: none; border-radius: 12px; padding: 12px;
            color: white; font-weight: bold; transition: 0.3s;
        }
        .btn-gradient:hover { opacity: 0.9; }
        a { color: #d1d1f6; font-size: 0.9rem; text-decoration: none; }
        a:hover { text-decoration: underline; }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand d-flex align-items-center" href="index.jsp">
            <img src="${pageContext.request.contextPath}/images/xworkz-logo.jpeg"
                 alt="Logo"
                 style="height:60px; width:auto; margin-right:10px;">
            <span style="font-size:22px; font-weight:bold;">MyWebsite</span>
        </a>
    </div>
</nav>

<!-- Login Card -->
<div class="glass-card">
    <h1>WELCOME!</h1>
    <h5>User Login</h5>

    <div class="mt-3">
        <p class="text-success">${mess}</p>
        <p class="text-danger">${err}</p>
        <p class="text-danger">${invalids}</p>
    </div>

    <!-- Step 1: Show email form if OTP not requested -->
    <c:if test="${otpSent == null}">
        <form action="signIn" method="post" onsubmit="return validateEmail()">
            <div class="input-group mb-3">
                <span class="input-group-text"><i class="fa fa-user"></i></span>
                <input type="email" id="email" name="email" class="form-control" placeholder="Enter your email" required>
            </div>
            <button type="submit" class="btn-gradient w-100 mb-3">Get OTP</button>
        </form>
    </c:if>

    <!-- Step 2: Show OTP form if email already submitted -->
    <c:if test="${otpSent != null}">
        <form action="verifyOtp" method="post" onsubmit="return validateOtp()">
            <input type="hidden" name="email" value="${email}"/>
            <div class="input-group mb-3">
                <span class="input-group-text"><i class="fa fa-key"></i></span>
                <input type="text" id="otp" name="otp" class="form-control" placeholder="Enter your OTP" required>
            </div>
            <button type="submit" class="btn-gradient w-100">Verify OTP</button>
        </form>
    </c:if>

    <div class="mt-3">
        <a href="SignUp.jsp">I haven't got an account</a>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<script>
    function validateEmail() {
        let email = document.getElementById("email").value;
        let gmailPattern = /^[a-zA-Z0-9._%+-]+@gmail\.com$/;
        if (!gmailPattern.test(email)) {
            alert("Enter a valid Gmail address!");
            return false;
        }
        return true;
    }
    function validateOtp() {
        let otp = document.getElementById("otp").value;
        if (!/^\d{4,6}$/.test(otp)) {
            alert("OTP must be 4 to 6 digits!");
            return false;
        }
        return true;
    }
</script>

</body>
</html>
