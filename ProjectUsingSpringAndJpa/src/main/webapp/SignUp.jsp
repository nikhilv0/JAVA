<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container d-flex justify-content-center align-items-center vh-100">
    <div class="card shadow-lg p-4 rounded-4" style="max-width: 500px; width: 100%;">
        <h2 class="text-center mb-4">Sign Up</h2>

        <div class="mt-3">
            <p class="text-success">${message}</p>
            <p class="text-danger">${error}</p>
        </div>

        <form action="signUp" method="post" onsubmit="return validateForm()">
            <div class="mb-3">
                <label for="name" class="form-label">Full Name</label>
                <input type="text" class="form-control" id="name" name="fullName" value="${signUpDTO.fullName}" placeholder="Enter your full name"
                       required>
            </div>

            <div class="mb-3">
                <label for="email" class="form-label">Email address</label>
                <input type="email" class="form-control" id="email" name="email" value="${signUpDTO.email}"  placeholder="Enter your email"
                       required>
            </div>

            <div class="mb-3">
                <label for="phone" class="form-label">Phone Number</label>
                <input type="number" class="form-control" id="phone" name="phone" value="${signUpDTO.phone} placeholder="Enter your phone number"
                       required>
            </div>

            <div class="mb-3">
                <label class="form-label d-block">Gender</label>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="gender" id="male" value="MALE" required>
                    <label class="form-check-label" for="male">Male</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="gender" id="female" value="FEMALE">
                    <label class="form-check-label" for="female">Female</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="gender" id="other" value="OTHER">
                    <label class="form-check-label" for="other">Other</label>
                </div>
            </div>

            <div class="mb-3">
                <label for="age" class="form-label">Age</label>
                <input type="number" class="form-control" id="age" name="age" value="${signUpDTO.age} placeholder="Enter your age" min="1"
                       required>
            </div>

            <div class="mb-3">
                <label for="address" class="form-label">Address</label>
                <textarea class="form-control" id="address" name="address" rows="2" value="${signUpDTO.address} placeholder="Enter your address"
                          required></textarea>
            </div>

            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" id="password" name="password" value="${signUpDTO.password} placeholder="Enter password"
                       required>
            </div>

            <div class="mb-3">
                <label for="confirmPassword" class="form-label">Confirm Password</label>
                <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" value="${signUpDTO.confirmPassword}
                       placeholder="Confirm password" required>
            </div>

            <div class="d-grid">
                <button type="submit" class="btn btn-primary">Sign Up</button>
            </div>

        </form>
    </div>
</div>

<script>
    function validateForm() {
      let name = document.getElementById("name").value;
      let email = document.getElementById("email").value.trim();
<!--          let gmailPattern = /^[a-zA-Z0-9._%+-]+@gmail\.com$/;-->
      let gmailPattern = /^(?=.*[0-9])[a-zA-Z0-9._%+-]+@gmail\.com$/;
      let phone = document.getElementById("phone").value.trim();
      let age = document.getElementById("age").value;
      let password = document.getElementById("password").value.trim();
      let confirmPassword = document.getElementById("confirmPassword").value.trim();
      let strongPasswordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;

      if (name.length < 3) {
        alert("Name must be at least 3 characters long!");
        return false;
      }

      if (!gmailPattern.test(email)) {
        alert(`Invalid email: ${email}. It must be a Gmail address and at least one number .`);
        return false;
      }

      if (phone.length !== 10 || isNaN(phone)) {
        alert("Phone number must be exactly 10 digits!");
        return false;
      }

      if (age < 18 || age > 70) {
        alert("Age must be between 18 and 70!");
        return false;
      }

     if (!strongPasswordPattern.test(password)) {
        alert("Password must be at least 8 characters long, include uppercase, lowercase, number, and special character!");
        return false;
     }

      if (password !== confirmPassword) {
        alert("Passwords do not match!");
        return false;
      }

      return true;
    }
</script>
</body>
</html>
