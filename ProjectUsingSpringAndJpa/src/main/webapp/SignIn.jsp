<!DOCTYPE html>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Sign In</title>
    <!-- Bootstrap CSS -->
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

        /* Navbar stays on top */
        .navbar {
            position: absolute;
            top: 0;
            width: 100%;
            z-index: 10;
        }

        /* Glassmorphism Card */
        .glass-card {
            width: 400px;
            padding: 40px;
            border-radius: 20px;
            background: rgba(0, 0, 0, 0.05);
            backdrop-filter: blur(10px);
            -webkit-backdrop-filter: blur(10px);
            border: 1px solid rgba(255, 255, 255, 0.3);
            box-shadow: 0 8px 32px rgba(0, 0, 0, 0.2);
            text-align: center;
            color: white;
            margin-top: 60px; /* space below navbar */
        }

        .glass-card h1 {
            font-size: 2.5rem;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .glass-card h5 {
            font-weight: 300;
            margin-bottom: 25px;
        }

        .input-group .form-control {
            background: rgba(255, 255, 255, 0.8);
            border: none;
            border-radius: 10px;
            padding: 12px 15px;
        }

        .input-group-text {
            background: rgba(255, 255, 255, 0.8);
            border: none;
            border-radius: 10px 0 0 10px;
        }

        .btn-gradient {
            background: linear-gradient(to right, #6a11cb, #2575fc);
            border: none;
            border-radius: 12px;
            padding: 12px;
            color: white;
            font-weight: bold;
            transition: 0.3s;
        }

        .btn-gradient:hover {
            opacity: 0.9;
        }

        a {
            color: #d1d1f6;
            font-size: 0.9rem;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
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

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <div class="navbar-nav">
                <div class="nav-item">
                    <a class="nav-link" href="SignUp.jsp">SignUp</a>
                </div>
            </div>
        </div>
    </div>
</nav>

<!-- Login Card -->
<div class="glass-card">
    <h1>WELCOME!</h1>
    <h5>user login</h5>

    <div class="mt-3">
        <p class="text-success">${mess}</p>
        <p class="text-danger">${err}</p>
        <p class="text-danger">${invalids}</p>
    </div>

    <form action="signIn" method="post" onsubmit="return validateForm()">
        <div class="input-group mb-3">
            <span class="input-group-text"><i class="fa fa-user"></i></span>
            <input type="email" id="email" name="email" class="form-control" placeholder="Enter your email" required>
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text"><i class="fa fa-lock"></i></span>
            <input type="password" id="password" name="password" class="form-control" placeholder="Enter your password" required>
        </div>

        <div class="d-flex justify-content-between align-items-center mb-3">
            <div class="form-check">
                <input type="checkbox" class="form-check-input" id="remember">
                <label class="form-check-label" for="remember">Remember me</label>
            </div>
            <a href="Forgot.jsp">Forgot Password?</a>
        </div>

        <button type="submit" class="btn-gradient w-100">Let's Go!</button>

        <div class="mt-3">
            <a href="SignUp.jsp">I haven't got an account</a>
        </div>
    </form>
</div>

<!-- Bootstrap + JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<script>
    function validateForm() {
        let email = document.getElementById("email").value;
        let gmailPattern = /^(?=.*[0-9])[a-zA-Z0-9._%+-]+@gmail\.com$/;
        let password = document.getElementById("password").value;
        let strongPasswordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;

        if (!gmailPattern.test(email)) {
            alert(`Invalid email: ${email}. Enter existing mail`);
            return false;
        }

        if (!strongPasswordPattern.test(password)) {
            alert("Password must be at least 8 characters long, include uppercase, lowercase, number, and special character!");
            return false;
        }
        return true;
    }
</script>
</body>
</html>
