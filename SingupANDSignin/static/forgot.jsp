<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Forgot Credentials</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: white;
            color: black;
        }
        .form-box {
            max-width: 400px;
            margin: 60px auto;
            padding: 30px;
            border: 1px solid black;
            border-radius: 10px;
        }
        .btn-dark {
            background-color: black;
            color: white;
        }
        .form-text-link {
            font-size: 14px;
        }
        .forgot{
             text-align: center;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="form-box shadow-sm">
        <h4 class="text-center mb-4">Recover Account</h4>
        <form action="Forgot" method="post">
            <div align="center" style="color:red">${message}</div>
            <div class="mb-3">
                <label for="emailOrUserId" class="form-label">Email or User ID</label>
                <input type="text" class="form-control" id="emailOrUserId" name="emailOrUserId" required>
            </div>
            <div class="d-grid mb-3">
                <button type="submit" class="btn btn-dark">Recover</button>
            </div>
            <div class="text-center form-text-link">
                <a href="signIn.jsp">Back to Sign In </a> |
                <a href="index.jsp">Home</a>
            </div>
        </form>
    </div>
</div>
<div class="forgot">
    <h6>${value}</h6>
    <h6>${dto.userId}</h6>
    <h6>${dto.email}</h6>
    <h6>${dto.password}</h6>
</div>

</body>
</html>
