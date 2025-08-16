<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign In</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light d-flex align-items-center justify-content-center" style="height:100vh;">

<div class="card shadow-lg p-4" style="width: 350px; border-radius: 15px;">
    <h3 class="text-center mb-3">Sign In</h3>

    <div class="mt-3">
        <p class="text-success">${mess}</p>
        <p class="text-danger">${err}</p>
        <p class="text-danger">${invalids}</p>
    </div>

    <form action="signIn" method="post" onsubmit="return validateForm()">
        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input type="email" id="email" name="email" class="form-control" placeholder="Enter your email" required>
        </div>

        <div class="mb-3">
            <label  for="password" class="form-label">Password</label>
            <input type="password" id="password" name="password" class="form-control" placeholder="Enter your password" required>
        </div>

        <div class="d-grid">
            <button type="submit" class="btn btn-primary">Login</button>
        </div>
    </form>

</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<script>
    function validateForm(){
    let email = document.getElementById("email").value;
    let gmailPattern = /^(?=.*[0-9])[a-zA-Z0-9._%+-]+@gmail\.com$/;
    let password = document.getElementById("password").value;
    let strongPasswordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;

        if(!gmailPatter.test(email){
            alert(`Invalid email: ${email}. Enter existing mail`);
            return false;
        }

        if(!strongPasswordPattern.test(password)){
            alert("Password must be at least 8 characters long, include uppercase, lowercase, number, and special character!");
            return false;
        }
        return true;
    }
</script>
</body>
</html>
