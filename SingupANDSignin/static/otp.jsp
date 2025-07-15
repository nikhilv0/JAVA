<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>OTP Verification</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: white;
            color: black;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-box {
            width: 100%;
            max-width: 420px;
            border: 1px solid black;
            border-radius: 10px;
            padding: 30px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        .form-title {
            font-weight: bold;
        }

        .form-control {
            height: 45px;
            font-size: 16px;
        }

        .btn-black {
            background-color: black;
            color: white;
            height: 45px;
            font-size: 16px;
        }

        .btn-black:hover {
            background-color: #222;
        }

        .form-links {
            font-size: 14px;
        }

        .form-links a {
            text-decoration: none;
        }

        .form-links a:hover {
            text-decoration: underline;
        }
       .otp-message {
            font-size: 16px;
            margin-bottom: 15px;
            font-weight: 500;
        }
    </style>
</head>
<body>
<div class="form-box text-center">
    <h4 class="form-title mb-4">Enter OTP</h4>
    ${mess}
    <form action="otp" method="post">
        <div class="mb-3 text-start">
            <input type="hidden" name="email" value="${dto.email}" />
            <label for="otp" class="form-label">One-Time Password (OTP)</label>
            <input type="text" class="form-control" id="otp" name="otp" placeholder="Enter 6-digit OTP" maxlength="6" required>
        </div>
        <div class="d-grid mb-3">
            <input type="submit" class="btn btn-black" value="signotp" name="otp1"></input>
        </div>
        <div class="form-links text-center">
            <a href="signIn.jsp">Back to Sign In</a> |
            <a href="index.jsp">Home</a>
        </div>
    </form>
</div>
</body>
</html>
