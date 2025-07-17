<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Reset Password</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: white;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .reset-box {
            border: 1px solid black;
            padding: 40px;
            border-radius: 10px;
            width: 350px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        .reset-box h2 {
            text-align: center;
            margin-bottom: 25px;
            font-size: 22px;
        }

        .reset-box label {
            font-weight: bold;
            display: block;
            margin-top: 15px;
            margin-bottom: 5px;
            font-size: 14px;
        }

        .reset-box input[type="password"],
        .reset-box input[type="email"] {
            width: 100%;
            padding: 10px;
            border-radius: 7px;
            border: 2px solid black;
            background-color: white;
            font-size: 16px;
            outline: none;
        }

        .submit-btn {
            width: 100%;
            background-color: black;
            color: white;
            font-weight: bold;
            padding: 12px;
            margin-top: 25px;
            border: none;
            border-radius: 7px;
            cursor: pointer;
            font-size: 16px;
        }

        .submit-btn:hover {
            background-color: #222;
        }

        .error-msg {
            color: red;
            font-size: 14px;
            text-align: center;
            margin-bottom: 10px;
        }

        .links {
            text-align: center;
            margin-top: 20px;
        }

        .links a {
            color: blue;
            text-decoration: none;
            font-size: 14px;
            margin: 0 5px;
        }

        .links a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="reset-box">
    <h2>Reset Password</h2>
    <div align="center" style="color:red">${mess}</div>
    <form action="reset" method="post">
        <label for="newPassword">New Password</label>
        <input type="password" id="newPassword" name="newPassword" required>

        <label for="confirmPassword">Confirm Password</label>
        <input type="password" id="confirmPassword" name="confirmPassword" required>

        <button type="submit" class="submit-btn">Reset Password</button>
    </form>

    <div class="links">
        <a href="signin.jsp">Back to Sign In</a> |
        <a href="home.jsp">Home</a>
    </div>
</div>
</body>
</html>
